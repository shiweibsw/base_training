package com.bsw.base_training.leetcode;

/**
 * 不使用任何内建的哈希表库设计一个哈希映射
 * <p>
 * 具体地说，你的设计应该包含以下的功能
 * <p>
 * put(key, value)：向哈希映射中插入(键,值)的数值对。如果键对应的值已经存在，更新这个值。
 * get(key)：返回给定的键所对应的值，如果映射中不包含这个键，返回-1。
 * remove(key)：如果映射中存在这个键，删除这个数值对。
 * <p>
 * 示例：
 * <p>
 * MyHashMap hashMap = new MyHashMap();
 * hashMap.put(1, 1);          
 * hashMap.put(2, 2);        
 * hashMap.get(1);            // 返回 1
 * hashMap.get(3);            // 返回 -1 (未找到)
 * hashMap.put(2, 1);         // 更新已有的值
 * hashMap.get(2);            // 返回 1
 * hashMap.remove(2);         // 删除键为2的数据
 * hashMap.get(2);            // 返回 -1 (未找到)
 * <p>
 * 注意：
 * <p>
 * 所有的值都在 [0, 1000000]的范围内。
 * 操作的总数目在[1, 10000]范围内。
 * 不要使用内建的哈希库。
 *
 * @Author shiwei
 * @Date 2020/11/23-15:28
 * @Email shiweibsw@gmail.com
 */
class leetcode_706 {
    private int[] data = new int[10];

    /**
     * Initialize your data structure here.
     */
    public leetcode_706() {
        initData(0);
    }

    private void initData(int start) {
        for (int i = start; i < data.length; i++) {
            data[i] = -1;
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        if (key >= data.length) {
            int[] t = new int[key * 2];
            int l = data.length;
            System.arraycopy(data, 0, t, 0, l);
            data = t;
            initData(l);
        }
        data[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        if (key < data.length) {
            return data[key];
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        if (key < data.length) {
            data[key] = -1;
        }
    }
}
