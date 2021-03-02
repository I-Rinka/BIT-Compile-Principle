#!/bin/bash
start_time=$(date +%s%N)
$@ > /dev/null || echo 进程出现错误
end_time=$(date +%s%N)

echo 程序运行了:$(($(($end_time - $start_time))/1000)) μs


#while true
#do
#	echo $(date +%s%N)
#done

