#!/bin/bash

title="运行1000*1000矩阵乘法的时间"


# cpp

echo C++ $title
echo $(/bin/time -f   "%e秒" ./C/bin/Matrix_Multiply.out > /dev/null)

# java

echo Java $title
cd ./Java/bin
echo $(/bin/time -f "%e秒" java Matrix_Multiply > /dev/null)
cd - > /dev/null

# haskell
echo Haskell $title
echo $(/bin/time -f "%e秒" runghc ./Haskell/src/Matrix_Multiply.hs > /dev/null)

# python
echo Python $title
echo $(/bin/time -f "%e秒" python3 ./Python/src/Matrix_Multiply.py > /dev/null)


average_time()
{
start_time=$(date +%s%N)
for value in {1..10}
do
  eval $1
done
end_time=$(date +%s%N) 

echo 平均时间:$((($end_time - $start_time)/10000))毫秒

}

echo 循环10次求平均时间:

echo C++:
average_time './C/bin/Matrix_Multiply.out > /dev/null'

echo Java:
cd ./Java/bin
average_time 'java Matrix_Multiply > /dev/null'
cd - > /dev/null

echo Haskell:
average_time 'runghc ./Haskell/src/Matrix_Multiply.hs > /dev/null'

echo Python:
average_time 'python3 ./Python/src/Matrix_Multiply.py > /dev/null'
