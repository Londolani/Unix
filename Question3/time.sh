#!/bin/bash
start=$(date +%s.%N)

javac Looptest.java 
java Looptest 

duration=$(echo "$(date +%s.%N) - $start" | bc)
time=`printf "%.2f seconds" $duration`

echo "Script Execution Time: $time"

