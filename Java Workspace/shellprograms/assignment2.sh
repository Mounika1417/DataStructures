#!/bin/bash
evenodd()
{
  num=$1
    if(($number%2==0))
      then
          echo "$number is Even"
    else
         echo "$number is odd"
    fi
}
while true
  do
    read -p "Enter the number(press 0 to exit): " number
    if [[ $number -eq 0 ]]
       then
       echo "EXIT!"
       break
    fi
    evenodd $number
done
