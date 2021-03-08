#!/bin/bash

#得到一次程序运行的时间(ms)，输入：命令行的字符串
average_time()
{
start_time=$(date +%s%N)
eval $1 > /dev/null
end_time=$(date +%s%N) 

echo $((($end_time - $start_time)/10000))
# return $((($end_time - $start_time)/10000))使用echo代替return来返回值

}

a=0

time_run_10()
{
for value in {1..10}
do
  a=$(( $a+ $(average_time './main.out 1000') ))
done
# echo $a
echo $(($a/10)).$(($a%10))
}


compile_command='./src/Matrix_Multiply.c ./src/Matrix_Operation.c -o main.out'


echo "GCC O0:"
gcc $compile_command -O0
echo $(time_run_10)ms
echo ""

echo "GCC O1:"
gcc $compile_command -O1
echo $(time_run_10)ms
echo ""

echo "GCC O2:"
gcc $compile_command -O2
echo $(time_run_10)ms
echo ""

echo "GCC O3:"
gcc $compile_command -O3
echo $(time_run_10)ms
echo ""

echo "LLVM O0:"
clang $compile_command -O0
echo $(time_run_10)ms
echo ""

echo "LLVM O1:"
clang $compile_command -O1
echo $(time_run_10)ms
echo ""

echo "LLVM O2:"
clang $compile_command -O2
echo $(time_run_10)ms
echo ""

echo "LLVM O3:"
clang $compile_command -O3
echo $(time_run_10)ms
echo ""
