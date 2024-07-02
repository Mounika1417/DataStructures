#!/bin/bash
#initialize the array elements
fruits=("Apple" "mango" "banana")
#printinng the array elements using index
echo "${fruits[0]}"
echo "${fruits[1]}"
#Array length
echo "${fruits[@]}"
echo "${#fruits[@]}"

for fruit in "${fruits[@]}"
  do
   echo "elements are $fruit"
  done
