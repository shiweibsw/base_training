package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/17-13:05
 * @Email shiweibsw@gmail.com
 */
class leetcode_717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;



//        int len = bits.length;
//        if (len <= 1) {
//            return true;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int b : bits) {
//            sb.append(b + "");
//        }
//        String s = sb.toString().replace("11", "");
//        sb = new StringBuilder(s);
//        if (sb.length() >= 2) {
//            if ((sb.charAt(sb.length() - 2) == '1')) {
//                return false;
//            } else {
//                return true;
//            }
//        } else {
//            return true;
//        }
    }
}
