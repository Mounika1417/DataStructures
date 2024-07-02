#!/bin/bash

countlines()
{
  filename=$1
  if [ -e $filename ]
    then
        echo "file present"
    lines=$(wc -l < "$filename")

   echo "number of lines present in file $lines"
  else
    echo "no file present"
 fi
}
countlines "function2.sh"
