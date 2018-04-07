package problem1.scala


object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val seq = nums zipWithIndex

        seq filter {
            case (n1, i1) =>
                seq exists {
                    case (n2, i2) =>
                        n1 + n2 == target && i1 != i2
                }
        } map (_._2)
    }
}
