package com.bsw.base_training.tree;

/**
 * @Author shiwei
 * @Date 2020/11/30-18:15
 * @Email shiweibsw@gmail.com
 */
class Trie {
    private TrieNode root = new TrieNode('/');

    public void insert(char[] text) {
        TrieNode p = root;
        for (int i = 0; i < text.length; i++) {
            int index = text[i] - 'a';
            if (p.children[index] == null) {
                TrieNode newNode = new TrieNode(text[i]);
                p.children[index] = newNode;
            }
            p = p.children[index];
        }
        p.isEndingChar = true;
    }

    public boolean find(char[] pattern) {
        TrieNode p = root;
        for (int i = 0; i < pattern.length; i++) {
            int index = pattern[i] - 'a';
            if (p.children[index] == null) {
                return false;
            }
            p = p.children[index];
        }
        if (!p.isEndingChar) return false;// 不能完全匹配，只是前缀
        return true;
    }


    public class TrieNode {
        public char data;
        public TrieNode[] children = new TrieNode[26];//假设只有a-z这26个小写字母
        public boolean isEndingChar = false;

        public TrieNode(char data) {
            this.data = data;
        }
    }
}
