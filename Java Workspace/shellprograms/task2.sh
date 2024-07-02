#!/bin/bash

display()
{
  directory=$1
  if [  -d $directory] ]
   then
    echo "correct path $directory"
    for file in "$directory/*"
    do
     if [ -e $file ]
      then
       echo "$file"
     fi
   done
  else
     echo "directory found"
 fi
}

display "/home/rps/"
