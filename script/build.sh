#!/bin/bash

cd ../source

while read -r f; do

  javac $f -d ../bin

done < <(find . -mindepth 1 -maxdepth 1 -type f -name "*.java")

cd ../