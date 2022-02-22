package com.bsw.base_training.leetcode;

/**
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * <p>
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * <p>
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * <p>
 * 示例：
 * <p>
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 * <p>
 * 提示：
 * <p>
 * 1 <= S.length <= 20000
 * S 仅由小写英文字母组成。
 */
class leetcode_1047 {

    public String removeDuplicates(String s) {
        // Stack<Character> stack=new Stack();
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(stack.isEmpty()||stack.peek()!=c){
        //         stack.push(c);
        //     }else{
        //         while(!stack.isEmpty()&&stack.peek()==c){
        //             stack.pop();
        //         }
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // while(!stack.isEmpty()){
        //     sb.append(stack.pop());
        // }
        // return sb.reverse().toString();

        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();


    }
}
