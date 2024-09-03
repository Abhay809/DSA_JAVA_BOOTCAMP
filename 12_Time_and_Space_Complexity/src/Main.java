// Time complexity != Time taken
// Time complexity : It is a function that gives us the relationship about how the time will grow as the input grows

// Big oh notation
// word definition: ex : O(N)
// N means : size of array grows as input grows
// O means: The graph that you have is upper bound
// time complexity will never exceed more then O(N^3)
// it will never exceed N^3
// O(N^3), this is the upper bound, our algorithm will never exceed this

// Big Omega Notation
// this is opposite of big oh notation
// omega(N^3), this means it will take at least N^3 time
// this is the lower bound, it will never be less than this

// Theta notation
// what if an algorithm has lower bound and upper bound as N^2
// then introduced theta notation
// 0 < theta notation < infinite
// Both upper bound and lower bound is = N^2

// little o Notation
// this is also gives me upper bound, but not strict upper bound, it's a loose upper bound
// difference b/w big oh and little oh is in notes

// little omega notation
// it will give lower bound but not strict


// Space Complexity or Auxiliary space
// It is the extra space or temporary space taken by a algorithm
// space complexity : the input that you are taken of size n  +  the extra space that the algorithm is using
// ex : Take an input of array of size n and do something with it
// so, the space complexity will be the input that you are taking of size n + the extra space that algorithm is using
// space complexity is : Input space + auxiliary space
// space complexity is constant because no new array is created

// Recursive Algorithm
// In recursive algorithm the height of the recursive tree is space complexity
// Space complexity = Height of the tree ( PATH )

// Anything is constant can be written as O(1)
// O((2k+c)*1) = O(1)
// Akra bazi formula
// for an array of size n, merge sort time complexity will be O(NlogN).

// Formula for nth fibonacci number
// ((Math.pow(((1+root(5)) / 2 ), n) - Math.pow(((1+root(5)) / 2 ), n)) / root (5))
// whole code in recursion fibonacci numbers



