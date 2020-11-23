package com.bsw.base_training.leetcode;

import java.util.Stack;

/**
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：S = "ab#c", T = "ad#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “ac”。
 * 示例 2：
 *
 * 输入：S = "ab##", T = "c#d#"
 * 输出：true
 * 解释：S 和 T 都会变成 “”。
 * 示例 3：
 *
 * 输入：S = "a##c", T = "#a#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “c”。
 * 示例 4：
 *
 * 输入：S = "a#c", T = "b"
 * 输出：false
 * 解释：S 会变成 “c”，但 T 仍然是 “b”。
 *
 * @Author shiwei
 * @Date 2020/11/23-11:07
 * @Email shiweibsw@gmail.com
 */
public class leetcode_844 {
    public static boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        int sc = 0;
        int tc = 0;
        String sr = "";
        String tr = "";
        while (i >= 0) {
            if (S.charAt(i) == '#') {
                sc++;
            } else {
                if (sc > 0) {
                    sc--;
                    i--;
                    continue;
                } else {
                    sr += S.charAt(i);
                }
            }
            i--;
        }
        while (j >= 0) {

            if (T.charAt(j) == '#') {
                tc++;
            } else {
                if (tc > 0) {
                    tc--;
                    j--;
                    continue;
                } else {
                    tr += T.charAt(j);
                }
            }
            j--;

        }
        System.out.println("S = " + sr + ", T = " + tr);
        return sr.equals(tr);


//        Stack<Character> stack1 = new Stack<>();
//        Stack<Character> stack2 = new Stack<>();
//        for (int i = 0; i < S.length(); i++) {
//            if (S.charAt(i) == '#') {
//                if (!stack1.isEmpty()){
//                    stack1.pop();
//                }
//            } else {
//                stack1.push(S.charAt(i));
//            }
//        }
//        for (int i = 0; i < T.length(); i++) {
//            if (T.charAt(i) == '#') {
//                if (!stack2.isEmpty()){
//                    stack2.pop();
//                }
//            } else {
//                stack2.push(T.charAt(i));
//            }
//        }
//        while (!stack1.isEmpty() && !stack2.isEmpty()) {
//            if (stack1.pop() != stack2.pop()) {
//                return false;
//            }
//        }
//        return stack1.isEmpty() && stack2.isEmpty();
    }
}
