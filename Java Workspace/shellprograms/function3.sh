#!/bin/bash

sum()
{
echo "inside the sum function"
return 10
}

sum
result=$?
echo "result is $result"
echo "function arguments...."
greet1()
{
a=$1
b=$2
c=$@

echo "a $a b $b c $c"
}
greet1 1
greet1 1 2
greet1 1 2 3 4
