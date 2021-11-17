package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/17-15:12
 * @Email shiweibsw@gmail.com
 * 给你一个整数数组 nums，请你返回该数组中恰有四个因数的这些整数的各因数之和。
 * <p>
 * 如果数组中不存在满足题意的整数，则返回 0 。
 */
class leetcode_1390 {

    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for (int n : nums) {
            int size = 2;
            int sum = n + 1;
            int sqrt = (int) Math.sqrt(n);
            int curr = 2;
            while (curr <= sqrt) {
                if (n % curr == 0) {
                    if (curr != n / curr) {
                        sum += n / curr;
                        size++;
                    }
                    sum += curr;
                    size++;
                }
                curr++;
            }
            if (size == 4) {
                res += sum;
            }
        }
        return res;
    }


//    public int sumFourDivisors(int[] nums) {
//        int res = 0;
//        for (int n : nums) {
//            Set<Integer> tmp = getSize(n);
//            if (tmp.size() == 4) {
//                Iterator it = tmp.iterator();
//                while (it.hasNext()) {
//                    res += (int) it.next();
//                }
//            }
//        }
//        return res;
//    }
//
//    private Set<Integer> getSize(int num) {
//        Set<Integer> res = new HashSet<Integer>();
//        res.add(1);
//        res.add(num);
//        int sqrt = (int) Math.sqrt(num);
//        int curr = 2;
//        while (curr <= sqrt) {
//            if (num % curr == 0) {
//                res.add(curr);
//                res.add(num / curr);
//            }
//            curr++;
//        }
//        return res;
//    }
}
