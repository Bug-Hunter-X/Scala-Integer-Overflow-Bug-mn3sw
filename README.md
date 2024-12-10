# Scala Integer Overflow Bug

This repository demonstrates an integer overflow bug in Scala and its solution.

## Bug Description
The `MyClass.scala` file contains a simple class with a method that adds two integers. The issue is that it fails to handle potential integer overflows that could occur if the two added integers exceed the maximum value an `Int` can hold.

## Solution
The `MyClassSolution.scala` file provides a solution using `BigInt` to prevent overflow.

## Usage
1. Clone this repository.
2. Compile and run either file using a Scala compiler (e.g., scalac).