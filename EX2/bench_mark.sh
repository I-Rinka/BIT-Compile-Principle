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

for value in {1..10}
do
  a=$(( $a+ $(average_time './src/Matrix_Multiply.out 1000') ))
  
done

echo $(($a/10)).$(($a%10))

