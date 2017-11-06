fun multiplesOfThree(): Int {
    return 1.rangeTo(1000).filter{it%3==0 || it%5==0}.reduce(Int::plus)
}