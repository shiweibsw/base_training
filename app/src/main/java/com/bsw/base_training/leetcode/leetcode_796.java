package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/17-10:45
 * @Email shiweibsw@gmail.com
 */
class leetcode_796 {
    public boolean rotateString(String s, String goal) {
//解法一
        return s.length() == goal.length() && (s + s).contains(goal);


//解法二
//        int l1 = s.length();
//        int l2 = goal.length();
//        int current = 0;
//        if (l1 != l2) {
//            return false;
//        }
//        StringBuilder sb = new StringBuilder(s);
//        while (current <= l2) {
//            if (s.toString().equals(goal)) {
//                return true;
//            } else {
//                sb.append(sb.charAt(0));
//                sb.deleteCharAt(0);
//                current++;
//            }
//        }
//        return false;
    }
}
