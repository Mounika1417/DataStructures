#!/bin/bash

num1=2
num2=3
result=$num1+$num2
echo "result of add $result"

addresult=$(($num1+$num2))
echo "result of add is $addresult"
result1=$num1-$num2

echo "result of sub $result1"

subresult=$(($num1-$num2))
echo "result of sub is $subresult"
echo "enter 2 numbers"
read n1
read n2
mul=$(($n1*$n2))
echo "result of mul is $mul"

