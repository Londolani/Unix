#!/bin/bash
# Script to do numeric comparisons
echo Enter X:
read x
echo Enter Y:
read y
if [ $x -gt $y ]
    then
        echo "X is greater than Y"
fi
# Second comparison
if [ $x -lt $y ]
    then
        echo "Y is greater than X"
fi
if [ $x -eq $y ] 
    then
        echo "X is equal to Y "
fi
