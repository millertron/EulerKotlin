/*
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers
and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers
and the square of the sum.
 */
fun sumSquareDifference() :Int {
    return square((Array(101, {it}).reduce(Int::plus))) - Array(101, {square(it)}).reduce(Int::plus)
}

//TODO: I can't believe there's no simple power operator like x^2
fun square(target:Int) :Int {
    return target*target
}