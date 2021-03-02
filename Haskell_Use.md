# Hakell的使用

"一切皆函数调用！"

本文参照：

https://www.jdon.com/idea/haskell.html

https://blog.csdn.net/weiyuefei/article/details/80395316

https://www.w3cschool.cn/hsriti/y2biqozt.html

https://rwh.readthedocs.io/en/latest/chp/2.html


## 基本语法

### 语句块

语句块需要用分号隔开，如果在交互式终端，则需要在一行内把大括号和所有语句输入完毕。

```haskell
do  {  putStr  "2 + 2 = " ;  print  ( 2  +  2 )  }

```

### I/O

输出：

```haskell
print 5 --输出任意类型的值
putStr "hello world" --输出字符串，不单独换行
putStrLn "hello world" --输出一行字符串

```

输入：使用`getLine`获得一行字符串，或者使用`readLn`获得单个元素，组合例子如下：

```haskell
do  { n  <-  readLn ;  print  (n ^ 2 )  } --终端会让你输入一个数字，然后进行n^2的操作

do  { n  <-  getLine ;  putStrLn n  } --终端会让你输入一个字符串，然后再原样打印
```

### 符号

```txt
 +  -  *  /  ^    -- 加、減、乘、除、指數
 mod              -- 取餘數
 $                -- 也是表示函數作用的, 但它的優先級最低, 而且作用次序是從右向左的
 ++               -- 兩個List的連接
 .                 -- 函數的複合
 && ||  ==  /=     -- 與、或、等於、不等於
 <=  >=  <  >      -- 小於等於、大於等於、小於、大於
 : //  =  @        -- 一個元素連接List、
 ->               -- 函數類型描述，運算符左邊為參數類型，右邊為結果類型。為右结合。例如：addThree :: Int -> Int -> Int -> Int 
 =>               -- 運算符的左邊表示一個類型變量（通常為單個小寫字母）屬於一個類型類（Typeclass），相當於C++語言的模板參數類型
 ..               -- List的Range限定
 ::               -- 函數/表達式的類型特徵，左側為函數/表達式，右側為類型
 <-             -- List comprehension 的條件限定
 !!             -- 取List的第某個元素，based 0
```


### 类型

haskell是弱类型，但是也可以强制声明使用某种类型。

比如以Int或者Double分别输出5，注意，类型声明使用::与变量连接：

```haskell
5  ::  Int
5  ::  Double
```

#### 种类

`Interger`也是一种整形，只不过可以无限大，但是效率比`Int`低

类型总是用大写开头，变量总是以小写声明。

`String`类型相当于`[Char]`

### 变量

使用let声明变量

```haskell
let n=5::Double
```

### 控制流程

haskell使用`if then`结构，`if`和`then`之间填写逻辑表达式，`then`到`;`语句结束前写操作。

```haskell
do{ x<- readLn ; if x == 4 then putStrLn "You're right!"; else if x==5 || x==3 then putStrLn "You are close to anwser!" ; else putStrLn "You're wrong!"}
```

### 函数使用

使用函数时，无需添加括号。

Haskell的所有函数都是并行的。

### 函数定义

`函数名 传入形参 = 函数操作的内容`

```haskell
main = do {putLn "Hello "}
```

甚至可以使用`let`定义函数

`let 函数 n = if n==0 then print 20 else print 30`


#### 给函数加上类型

`函数名::传入类型->返回类型`

如果传入的形参有多个，则是：

`函数名::传入类型1->传入类型2->传入类型3..->返回类型`

#### Haskell的函数模式匹配

在没有控制流的情况下，让一个Haskell函数判断一个数是否等于7：

```haskell
lucky :: (Integral a) => a -> String   
lucky 7 = "LUCKY NUMBER SEVEN!"   
lucky x = "Sorry, you're out of luck, pal!"  
```

### 常用基本函数

## 常用操作

载入自定义的函数：

```ghci
:l 函数文件.hs
```

检查变量的类型：

```ghci
:t 已声明变量
```

编译源文件:

```shell
ghc ./haskell.hs -o ./输出.out
```
不进入ghci直接将haskell当脚本执行：

```shell
runghc ./haskell.hs
```
