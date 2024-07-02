#!/bin/bash

sum()
{
a=$1
b=$2
result=$(($a+$b))
echo "Result : $result"
}

read -p "enter 1st parameter" arg1
read -p "enter 2nd parameter" arg2

sum $arg1 $arg2


#function with return type

sub()
{
a=$1
b=$2

result=$(($a-$b))
return $result
}
sub 10 5
res=$?
echo "result $res"
