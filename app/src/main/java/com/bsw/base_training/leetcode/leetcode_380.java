package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author shiwei
 * @Date 2021/2/4-15:28
 * @Email shiweibsw@gmail.com
 */
class leetcode_380 {
    private Map<Integer, Integer> map = new HashMap();
    private Random dom = new Random();
    private int index = 1;

    /**
     * Initialize your data structure here.
     */
    public leetcode_380() {

    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        map.put(val, val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (map.get(val) != null) {
            map.remove(val);
            return true;
        }
        return false;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        return map.get(keys[dom.nextInt(keys.length)]);
    }
}
