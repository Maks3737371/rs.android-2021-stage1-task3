package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return if (number < 3) return null
        else calculate(number.pow(), number - 1)?.toTypedArray()
    }
    private fun calculate (number: Int, index: Int): ArrayList<Int>?{
        for(i in index downTo 1){
            val remained = number - i.pow()
            if(remained == 0) return arrayListOf(i)
            if(remained < 0) return null
            var element = remained.sqrt()
            if(element >= i) element = i-1
            val result = calculate(remained, element)
            if(result !=null){
                result.add(i)
                return result
            }
        }
        return null
    }
    private fun Int.pow() = this * this
    private fun Int.sqrt() = kotlin.math.sqrt(this.toDouble()).toInt()
}


