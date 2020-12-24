package com.bsw.base_training.leetcode;

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * <p>
 * 例如，
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 示例 1:
 * <p>
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 * <p>
 * 输入: "ZY"
 * 输出: 701
 *
 * @Author shiwei
 * @Date 2020/12/24-14:22
 * @Email shiweibsw@gmail.com
 */
class leetcode_171 {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int x = c - 'A' + 1;
            res = res * 26 + x;
        }
        return res;
    }
    public int addDigits(int num) {
        int res=num;
        int n=0;
        while(true){
            n=res;
            res=0;
            while(n!=0){
                int x=n%2;
                res+=x;
                n/=10;
            }
            if(res<9){
                return res;
            }
        }
    }
}
