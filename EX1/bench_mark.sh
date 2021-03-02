#!/bin/bash

title="运行1500*1500矩阵乘法的时间"

# haskell
echo Haskell $title
run_time=$(/bin/time -f "%e s" runghc ./Haskell/src/Matrix_Multiply.hs > /dev/null)


