package com.bsw.base_training.leetcode;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * @Author shiwei
 * @Date 2020/11/23-16:02
 * @Email shiweibsw@gmail.com
 */
class leetcode_136 {
    //1 任何数和 0 做异或运算，结果仍然是原来的数，即 a \oplus 0=aa⊕0=a。
    //2 任何数和其自身做异或运算，结果是 0，即 a \oplus a=0a⊕a=0。
    //3 异或运算满足交换律和结合律，即 a \oplus b \oplus a=b \oplus a \oplus a=b \oplus (a \oplus a)=b \oplus0=ba⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int x : nums) {
            single ^= x;
        }
        return single;
    }
}
