#!/bin/bash

name="mounika"
age=24

echo "name is $name  & age is $age"
unset age
echo "name is $name & age is $age"
country="India"
echo "$country"
readonly country
country="America"
