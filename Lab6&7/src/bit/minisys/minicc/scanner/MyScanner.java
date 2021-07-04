package bit.minisys.minicc.scanner;

import java.util.ArrayList;
import java.util.HashSet;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import org.antlr.v4.runtime.dfa.DFAState;


enum DFA_STATE {
    DFA_STATE_INITIAL,
    DFA_STATE_ID_0,
    DFA_STATE_ID_1,
    DFA_STATE_KB_O,
    DFA_STATE_KB_C,
    DFA_STATE_P_O,
    DFA_STATE_P_C,
    DFA_STATE_ADD_0,
    DFA_STATE_ADD_1,
    DFA_STATE_SM,


    //state_pre_str can be replaced when implements in code
    state_char_start,
    state_char_single,
    state_char_fin,
    state_char_escape,
    state_char_hexdecimal,
    state_char_octa_digit,
    state_pre_str_8,
    state_str,
    state_str_escape,
    state_str_fin,
    state_str_hexdecimal,
    state_str_octa_digit,
    state_multiple_char,

    DFA_STATE_UNKNW

}

public class MyScanner implements IMiniCCScanner {

    private int lIndex = 0;
    private int cIndex = 0;

    private ArrayList<String> srcLines;

    private HashSet<String> keywordSet;

    private HashSet<String> operatorSet;

    private void multipleOperatorAdd() {
        this.operatorSet = new HashSet<String>();

        this.operatorSet.add("++");
        this.operatorSet.add("+");
        this.operatorSet.add("--");
        this.operatorSet.add("-");
        this.operatorSet.add("<<");
        this.operatorSet.add("<");
        this.operatorSet.add(">>");
        this.operatorSet.add(">");
        this.operatorSet.add(">=");
        this.operatorSet.add("<=");
        this.operatorSet.add("=");
        this.operatorSet.add("==");
        this.operatorSet.add("!=");
        this.operatorSet.add("!");
        this.operatorSet.add("&&");
        this.operatorSet.add("&");
        this.operatorSet.add("||");
        this.operatorSet.add("|");
        this.operatorSet.add("*=");
        this.operatorSet.add("*");
        this.operatorSet.add("/=");
        this.operatorSet.add("/");
        this.operatorSet.add("%=");
        this.operatorSet.add("%");
        this.operatorSet.add("+=");
        this.operatorSet.add("-=");
        this.operatorSet.add("<<=");
        this.operatorSet.add(">>=");
        this.operatorSet.add("<:");
        this.operatorSet.add(":>");
        this.operatorSet.add("%>");
        this.operatorSet.add("<%");
        this.operatorSet.add(":");
        this.operatorSet.add("%:");
        this.operatorSet.add("^");
        this.operatorSet.add("^=");
        this.operatorSet.add("|=");
        this.operatorSet.add("&=");
        this.operatorSet.add("#");
        this.operatorSet.add("##");
        this.operatorSet.add("->");
    }

    //todo: add key words here!
    public MyScanner() {
        this.multipleOperatorAdd();

        this.keywordSet = new HashSet<String>();
        this.keywordSet.add("auto");
        this.keywordSet.add("break");
        this.keywordSet.add("case");
        this.keywordSet.add("char");
        this.keywordSet.add("const");
        this.keywordSet.add("continue");
        this.keywordSet.add("default");
        this.keywordSet.add("do");
        this.keywordSet.add("double");
        this.keywordSet.add("else");
        this.keywordSet.add("enum");
        this.keywordSet.add("extern");
        this.keywordSet.add("float");
        this.keywordSet.add("for");
        this.keywordSet.add("goto");

        this.keywordSet.add("∗");
        this.keywordSet.add("if");
        this.keywordSet.add("inline");
        this.keywordSet.add("int");
        this.keywordSet.add("long");
        this.keywordSet.add("register");
        this.keywordSet.add("restrict");
        this.keywordSet.add("return");
        this.keywordSet.add("short");
        this.keywordSet.add("signed");
        this.keywordSet.add("sizeof");
        this.keywordSet.add("static");
        this.keywordSet.add("struct");
        this.keywordSet.add("switch");
        this.keywordSet.add("typedef");
        this.keywordSet.add("union");

        this.keywordSet.add("unsigned");
        this.keywordSet.add("void");
        this.keywordSet.add("volatile");
        this.keywordSet.add("while");
        this.keywordSet.add("_Alignas");
        this.keywordSet.add("_Alignof");
        this.keywordSet.add("_Atomic");
        this.keywordSet.add("_Bool");
        this.keywordSet.add("_Complex");
        this.keywordSet.add("_Generic");
        this.keywordSet.add("_Imaginary");
        this.keywordSet.add("_Noreturn");
        this.keywordSet.add("_Static_assert");
        this.keywordSet.add("_Thread_local");
    }

    //todo:constant DFA
    private int analyzeConstType(String lexme) {
        int state = 0;

        //todo:how can a identifier get the + and -

        for (int i = 0; i < lexme.length(); i++) {
            char c = lexme.charAt(i);
            //todo:fix bugs of decimal interger
            switch (state) {
                case 0:
                    if (c == '0') {
                        state = 1;
                    } else if (c >= '1' && c <= '9') {
                        state = 2;
                    } else if (c == '.') {
                        state = 5;
                    } else state = -1;
                    break;
                case 1:
                    if (c == 'u' || c == 'U') {
                        state = 11;
                    } else if (c == 'l' || c == 'L') {
                        state = 9;
                    } else if (c == 'x' || c == 'X') {
                        state = 3;
                    } else if (c >= '0' && c <= '7') {
                        state = 4;
                    } else if (c == '.') {
                        state = 5;
                    } else state = -1;
                    break;
                case 2:
                    if (c >= '0' && c <= '9') {
                        state = 2;
                    } else if (c == 'u' || c == 'U') {
                        state = 11;
                    } else if (c == 'l' || c == 'L') {
                        state = 9;
                    } else if (c == '.') {
                        state = 5;
                    } else state = -1;
                    break;
                case 3:
                    if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {
                        state = 14;
                    } else if (c == '.') {
                        state = 16;
                    } else state = -1;
                    break;
                case 4:
                    if (c >= '0' && c <= '7') {
                        state = 4;
                    } else if (c == 'u' || c == 'U') {
                        state = 11;
                    } else if (c == 'l' || c == 'L') {
                        state = 9;
                    } else state = -1;
                    break;
                case 5:
                    if (c >= '0' && c <= '9') {
                        state = 6;
                    } else state = -1;
                case 6:
                    if (c >= '0' && c <= '9') {
                        state = 6;
                    } else if (c == 'e' || c == 'E') {
                        state = 7;
                    } else if (c == 'f' || c == 'F' || c == 'l' || c == 'L') {
                        state = 15;
                    } else state = -1;
                    break;
                case 7:
                    if (c >= '0' && c <= '9') {
                        state = 6;
                    } else if (c == '-' || c == '+') {
                        state = 8;
                    } else state = -1;
                    break;
                case 8:
                    if (c >= '0' && c <= '9') {
                        state = 6;
                    } else state = -1;
                    break;
                case 9:
                    if (c == 'u' || c == 'U') {
                        state = 12;
                    } else if (c == 'l' || c == 'L') {
                        state = 10;
                    } else state = -1;
                    break;
                case 10:
                    if (c == 'u' || c == 'U') {
                        state = 13;
                    } else state = -1;
                    break;
                case 11:
                    if (c == 'l' || c == 'L') {
                        state = 12;
                    } else state = -1;
                    break;
                case 12:
                    if (c == 'l' || c == 'L') {
                        state = 13;
                    } else state = -1;
                    break;
                case 13:
                    state = -1;
                    break;
                case 14:
                    if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {
                        state = 14;
                    } else if (c == 'u' || c == 'U') {
                        state = 11;
                    } else if (c == 'l' || c == 'L') {
                        state = 9;
                    } else if (c == 'p' || c == 'P') {
                        state = 18;
                    } else if (c == '.') {
                        state = 16;
                    } else state = -1;
                    break;
                case 15:
                    state = -1;
                    break;
                case 16:
                    if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {
                        state = 17;
                    } else state = -1;
                    break;
                case 17:
                    if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {
                        state = 17;
                    } else if (c == 'p' || c == 'P') {
                        state = 18;
                    } else state = -1;
                    break;
                case 18:
                    if (c == '-' || c == '+') {
                        state = 19;
                    } else if (c >= '0' && c <= '9') {
                        state = 20;
                    } else state = -1;
                    break;
                case 19:
                    if (c >= '0' && c <= '9') {
                        state = 20;
                    } else state = -1;
                    break;
                case 20:
                    if (c >= '0' && c <= '9') {
                        state = 20;
                    }
                    if (c == 'f' || c == 'F' || c == 'l' || c == 'L') {
                        state = 15;
                    } else state = -1;
                    break;
                default:
                    break;
            }
        }
        if (state == 5 || state == 6 || state == 15 || state == 20 || state == 18) {
            //note:if state==5 but some times it could not be the end point, such as only . present, so I choose to test whether there are num or alphabet exists
            if (state == 5 && lexme.length() == 1) {
                return -1;
            }
            return 1;
        } else if (state == 1 || state == 2 || state == 4 || (state >= 9 && state <= 14)) {
            return 0;
        } else
            return -1;
    }

    char getNextChar() {
        char c = Character.MAX_VALUE;
        while (true) {
            if (lIndex < this.srcLines.size()) {
                String line = this.srcLines.get(lIndex);
                if (cIndex <= line.length()) {
                    //todo:add comment support
                    if (cIndex == line.length()) {

                        c = '\n';
                    } else
                        c = line.charAt(cIndex);

                    cIndex++;
                    break;
                } else {
                    lIndex++;
                    cIndex = 0;
                }
            } else {
                break;
            }
        }
        if (c == '\u001a') {
            c = Character.MAX_VALUE;
        }
        return c;
    }

    private boolean isAlpha(char c) {
        return Character.isAlphabetic(c);
    }

    private boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    private boolean isAlphaOrDigit(char c) {
        return Character.isLetterOrDigit(c);
    }

    private boolean isMultipleOperatorChar(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '=' || c == '<' || c == '>' || c == '&' || c == '|' || c == '#' || c == '%' || c == ':' || c == '!'|| c == '^') {
            return true;
        }
        return false;
    }

    private String genToken(int num, String lexme, String type) {
        return genToken(num, lexme, type, this.cIndex - 1, this.lIndex);
    }

    private String genToken2(int num, String lexme, String type) {
        return genToken(num, lexme, type, this.cIndex - 2, this.lIndex);
    }

    //token:[@9,41:42='10',<IntegerConstant>,5:2]
    //[@token_number,start:end='word',<type>,line_number:col_num(ignore start up white pace)]
    private String genToken(int num, String lexme, String type, int cIndex, int lIndex) {
        String strToken = "";

        strToken += "[@" + num + "," + (cIndex - lexme.length() + 1) + ":" + cIndex;
        strToken += "='" + lexme + "',<" + type + ">," + (lIndex + 1) + ":" + (cIndex - lexme.length() + 1) + "]\n";

        return strToken;
    }

    private boolean isSchar(char c) {
        if (c == '\"' || c == '\\' || c == '\n') {
            return false;
        }
        return true;
    }

    private boolean isCchar(char c) {
        if (c == '\'' || c == '\\' || c == '\n') {
            return false;
        }
        return true;
    }


    @Override
    public String run(String iFile) throws Exception {

        System.out.println("Scanning...");
        String strTokens = "";
        int iTknNum = 0;

        this.srcLines = MiniCCUtil.readFile(iFile);

        DFA_STATE state = DFA_STATE.DFA_STATE_INITIAL;        //FA state
        String lexme = "";        //token lexme
        char c = ' ';        //next char
        boolean keep = false;    //keep current char
        boolean end = false;

        boolean is_state_str_pre = false; //use this to implement the L u U at the beginning of string and char easily

        while (!end) {                //scanning loop
            if (!keep) {
                c = getNextChar();
            }

            keep = false;


            switch (state) {
                case DFA_STATE_INITIAL:
                    lexme = "";
                    //comment ignore
                    //todo: modify getNextChar to support comment removal
                    if (c == '/') {
                        if (getNextChar() == '/') {
                            while (getNextChar() != '\n') ;
                            continue;
                        } else {
                            cIndex--;
                        }
                    }

                    //todo: add number support
                    if (isAlphaOrDigit(c) || c == '.' || c == '_') {
                        //remember!
                        if (c == 'L' || c == 'u' || c == 'U') {
                            is_state_str_pre = true;
                        }

                        state = DFA_STATE.DFA_STATE_ID_0;


                        lexme = lexme + c;
                    }
                    //TODO: add string support
                    else if (c == '\'') {
                        state = DFA_STATE.state_char_start;
                        lexme += c;
                    } else if (c == '\"') {
                        state = DFA_STATE.state_str;
                        lexme += c;
                    }

                    else if (isMultipleOperatorChar(c)) {
                        lexme += c;
                        state = DFA_STATE.state_multiple_char;
                    } else if (c == '{') {
                        strTokens += genToken(iTknNum, "{", "'{'");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (c == '?') {
                        strTokens += genToken(iTknNum, "?", "'?'");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (c == '[') {
                        strTokens += genToken(iTknNum, "[", "'['");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (c == ']') {
                        strTokens += genToken(iTknNum, "]", "']'");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (c == '}') {
                        strTokens += genToken(iTknNum, "}", "'}'");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (c == '(') {
                        strTokens += genToken(iTknNum, "(", "'('");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (c == ')') {
                        strTokens += genToken(iTknNum, ")", "')'");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (c == ';') {
                        strTokens += genToken(iTknNum, ";", "';'");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (c == ',') {
                        strTokens += genToken(iTknNum, ",", "','");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else if (Character.isSpace(c)) {

                    } else if (c == Character.MAX_VALUE) {
                        cIndex = 5;
                        strTokens += genToken(iTknNum, "<EOF>", "EOF");
                        end = true;
                    }
                    //todo: support operator

                    break;
                case DFA_STATE_ADD_0:
                    if (c == '+') {
                        //TODO:++
                        strTokens += genToken2(iTknNum, "++", "'++'");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                    } else {
                        strTokens += genToken2(iTknNum, "+", "'+'");
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                        keep = true;//keep will preserve previous character
                    }
                    state = DFA_STATE.DFA_STATE_INITIAL;
                    break;
                case DFA_STATE_ID_0:
                    if ((c == '\"' || c == '\'' || c == '8') && is_state_str_pre) {
                        //using this \" or \' to judge string or char!
                        lexme = lexme + c;
                        if (c == '\"') {
                            state = DFA_STATE.state_str;
                        } else if (c == '\'') {
                            state = DFA_STATE.state_char_start;

                        } else if (c == '8') {
                            state = DFA_STATE.state_pre_str_8;
                        } else state = DFA_STATE.DFA_STATE_UNKNW;
                        is_state_str_pre = false;
                    } else if (isAlphaOrDigit(c) || c == '.' || c == '_') {
                        lexme = lexme + c;
                        if (c == 'e' || c == 'E' || c == 'p' || c == 'P') {
                            if (lexme.charAt(0) == '.' || (lexme.charAt(0) >= '0' && lexme.charAt(0) <= '9')) {
                                char tempc = getNextChar();
                                if (tempc == '+' || tempc == '-') {
                                    lexme += tempc;
                                } else cIndex--;
                            }
                        }

                    } else {
                        if (this.keywordSet.contains(lexme)) {
                            //key word have done here
                            strTokens += genToken2(iTknNum, lexme, "'" + lexme + "'");
                        } else {
                            //and the whole char have stored in the lexme, just scan it and indentify whether this is string/const
                            //number can be done here but string cannot
                            //0:int 1:float -1:no

                            if (lexme.length() > 0) {
                                int ans = -1;
                                if (lexme.charAt(0) == '.' || (lexme.charAt(0) >= '0' && lexme.charAt(0) <= '9')) {
                                    ans = this.analyzeConstType(lexme);
                                }
                                if (ans == 0) {
                                    strTokens += genToken2(iTknNum, lexme, "IntegerConstant");

                                } else if (ans == 1) {
                                    strTokens += genToken2(iTknNum, lexme, "FloatingConstant");
//todo:analyze identifier
                                } else {
                                    while (
                                            lexme.contains(".")
                                    ) {
                                        strTokens += genToken2(iTknNum, lexme.substring(0, lexme.indexOf(".")), "Identifier");
                                        lexme = lexme.substring(lexme.indexOf(".")+1, lexme.length());
                                        strTokens += genToken2(iTknNum, ".", "'.'");
                                    }
                                    strTokens += genToken2(iTknNum, lexme, "Identifier");
                                }
                            }
                        }
                        iTknNum++;
                        state = DFA_STATE.DFA_STATE_INITIAL;
                        keep = true;
                    }

                    break;
                case state_multiple_char:
                    if (isMultipleOperatorChar(c)) {
                        lexme += c;
                    } else {
                        if (this.operatorSet.contains(lexme)) {
                            //key word have done here
                            strTokens += genToken2(iTknNum, lexme, "'" + lexme + "'");

                            iTknNum++;
                        }
                        state = DFA_STATE.DFA_STATE_INITIAL;
                        keep = true;
                        break;
                    }

                    break;

                case state_char_start:
                    if (isCchar(c)) {
                        lexme += c;
                        state = DFA_STATE.state_char_single;
                    } else if (c == '\\') {
                        lexme += c;
                        state = DFA_STATE.state_char_escape;
                    } else state = DFA_STATE.DFA_STATE_UNKNW;
                    break;
                case state_char_single:
                    if (c == '\'') {
                        //actually it is fin, but fin will go to the initial
                        lexme += c;
                        state = DFA_STATE.state_char_fin;
                    } else {
                        state = DFA_STATE.DFA_STATE_UNKNW;
                    }
                    break;
                case state_char_escape:
                    lexme += c;
                    if (c == '\'' || c == '\"' || c == '?' || c == '\\' || c == 'a' || c == 'b' || c == 'f' || c == 'n' || c == 'r' || c == 't' || c == 'v') {
                        state = DFA_STATE.state_char_single;
                    } else if (c >= '0' && c <= '7') {
                        state = DFA_STATE.state_char_octa_digit;
                    } else if (c == 'x') {
                        state = DFA_STATE.state_char_hexdecimal;
                    } else {
                        state = DFA_STATE.DFA_STATE_UNKNW;
                    }
                    break;

                case state_char_octa_digit:
                    lexme += c;
                    if (c >= '0' && c <= '7') {

                    } else if (c == '\'') {
                        state = DFA_STATE.state_char_fin;
                    } else state = DFA_STATE.DFA_STATE_UNKNW;
                    break;

                case state_char_hexdecimal:
                    lexme += c;
                    if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {
//todo:some other time may analyze \'
                    } else {
                        state = DFA_STATE.state_char_fin;
                    }
                    break;

                case state_char_fin:

                    strTokens += genToken(iTknNum, lexme, "CharacterConstant");

                    //the generic operation when every thing is done
                    iTknNum++;
                    state = DFA_STATE.DFA_STATE_INITIAL;
                    keep = true;
                    break;

                case state_pre_str_8:
                    lexme += c;
                    if (c == '\"') {
                        state = DFA_STATE.state_str;
                    } else state = DFA_STATE.DFA_STATE_UNKNW;
                    break;

                case state_str:
                    lexme += c;
                    if (isSchar(c)) {

                    } else if (c == '\\') {
                        state = DFA_STATE.state_str_escape;
                    } else if (c == '\"') {
                        state = DFA_STATE.state_str_fin;
                    } else state = DFA_STATE.DFA_STATE_UNKNW;
                    break;
                case state_str_escape:
                    lexme += c;
                    if (c == '\'' || c == '\"' || c == '?' || c == '\\' || c == 'a' || c == 'b' || c == 'f' || c == 'n' || c == 'r' || c == 't' || c == 'v') {
                        state = DFA_STATE.state_str;
                    } else if (c >= '0' && c <= '7') {
                        state = DFA_STATE.state_str_octa_digit;
                    } else if (c == 'x') {
                        state = DFA_STATE.state_str_hexdecimal;
                    } else
                        state = DFA_STATE.DFA_STATE_UNKNW;
                    break;
                case state_str_octa_digit:
                    lexme += c;
                    if (c >= '0' && c <= '7') {

                    } else if (isSchar(c)) {
                        state = DFA_STATE.state_str;
                    } else if (c == '\"') {
                        state = DFA_STATE.state_str_fin;
                    } else state = DFA_STATE.DFA_STATE_UNKNW;
                    break;
                case state_str_hexdecimal:
                    lexme += c;
                    if (isSchar(c)) {
                        state = DFA_STATE.state_str;
                    } else if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {

                    } else state = DFA_STATE.state_str_fin;

                    break;
                case state_str_fin:
                    strTokens += genToken(iTknNum, lexme, "StringLiteral");

                    //the generic operation when every thing is done
                    iTknNum++;
                    state = DFA_STATE.DFA_STATE_INITIAL;
                    keep = true;
                    break;
                //Error process
                default:
                    System.out.println("[ERROR]Scanner:line " + lIndex + ", column=" + cIndex + ", unreachable state!");
                    break;
            }
        }


        String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT;
        MiniCCUtil.createAndWriteFile(oFile, strTokens);

        return oFile;
    }

}
