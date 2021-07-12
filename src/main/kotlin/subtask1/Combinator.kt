package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val posters = array[0].toLong()
        val colors  = array[1].toLong()
        var k = 0L
        var calcPosters = 0L

        while (calcPosters < posters) {
            if ( ++k == colors )
                return null
            calcPosters = factorial(colors) / (factorial(k) * (factorial(colors - k)))
        }
        return k.toInt()
    }
    private fun factorial(num: Long): Long {
        var result = 1L
        for (i in 2..num) result *= i
        return result
    }
}

