#!/bin/bash
#function definition
greet()
{
echo "Hello"
}
#fuction call
#just call name of the funcyion
greet

#function with parameter

sum()
{
a=$1
b=$2
result=$(($a+$b))
echo "result of sum : $result"
}
sum 14 17
