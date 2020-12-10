package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2020/12/10-14:30
 * @Email shiweibsw@gmail.com
 */
class Others {
    /**
     * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
     * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
     * 你可以假设字符串中只包含大小写英文字母（a至z）。
     *
     * @param S
     * @return
     */
    public String compressString(String S) {
        if (S.length() == 1 || S.length() == 0) return S;
        StringBuffer ans = new StringBuffer();
        ans.append(S.charAt(0));
        char[] s = S.toCharArray();
        int c = 1;
        for (int i = 1; i < s.length; i++) {
            int end = ans.length() - 1;
            if (ans.charAt(end) != s[i]) {
                ans.append(c);
                ans.append(s[i]);
                c = 1;
            } else {
                c++;
            }
        }
        ans.append(c);
        return ans.length() < S.length() ? ans.toString() : S;
    }

}
