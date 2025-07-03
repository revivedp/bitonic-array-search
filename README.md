# bitonic-array-search
A Java solution to the _Bitonic Array Search_ problem.

Time Complexity: O(log n)

_BITONIC ARRAY SEARCH_

An array is bitonic if it is comprised of an increasing sequence of integers followed immediately by a decreasing sequence of integers.

Example: [1, 2, 3, 4, 3, 2, 1]

Write a code that can tell if a number X exists in the array.

SOLUTION:

Create a method to find the _Peak value_ in the bitonic array using a binary search. Then define the main method bitonicSearch receiving an _array_ and a _target value_ as arguments. First, write a method to search between the _first value_ and the _Peak value_ of the array, return -1 if the target is not found. Lastly, write a method to search between the _next value of the Peak value_ and the _last value_ of the array, return -1 if the target is not found. 
