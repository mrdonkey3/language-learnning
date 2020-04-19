/**
 * <p>文件描述：<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/11/26 18:39<p>
 * <p>更改时间：2019/11/26 18:39<p>
 * <p>版本号：1<p>
 *
 */
class Test {
    companion object {
        @ExperimentalStdlibApi
        @JvmField
        var arr = arrayListOf("0", "1", "2", "0", "1", "1")

        @ExperimentalStdlibApi
        @JvmStatic
        fun main(vararg args: String) {
            arr.firstOrNull { it=="0" }?.plus("9")?.println()
            val sortedByDescending = arr.sortedByDescending { it }
            sortedByDescending.filter { it == "0" }.println()
            val map = arr.withIndex().filter { it.value == "1" }.map { it.index }
            map.println()
            arr.withIndex().map { it.index }.toMutableList().apply { removeAll(map) }.println()
            val min: Double = (3L + 3L / 2.0)
            min.println()
//            var k = (1 + 4 + 16 + 64).toShort() //2^6+2^4+2^2+2^0  1010101  85  int 是32位

//            1111111111111111111111111 0101011
//              0000000000000000000000000 1010101

//            11111111111111111111111111111110
//            val s: Short = -85
//            Integer.toBinaryString(s.toInt()).println()
//            val zeros = s.toInt().countLeadingZeroBits()
//            zeros.println()
//            val s2 = s.toInt()
//            var shl = s2.shl(zeros)
//            Integer.toBinaryString(shl).println()
//            val count = 32 - zeros
//            count.println()
//            for (i in 0 until count) {
//                var p = if (shl.countLeadingZeroBits() == 0) 1 else 0
//                p.println()
//                shl = shl.shl(1)
//                Integer.toBinaryString(shl).println()
//            }
//            arr.also { 1.println() }
//                    .forEach {
//                        2.println()
//                    }.also {
//                        3.println()
//
//                    }


        }
    }
}