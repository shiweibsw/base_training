package com.bsw.base_training.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author shiwei
 * @Date 2021/7/7-16:42
 * @Email shiweibsw@gmail.com
 */
public class CoinTest {

    private static long[] rewards = {1, 2, 5, 10};

    public static void get(long totalReward, ArrayList<Long> result) {
//        if (totalReward == 0) {
//            System.out.println(result);
//            return;
//        } else if (totalReward < 0) {
//            return;
//        } else {
//            for (int i = 0; i < rewards.length; i++) {
//                ArrayList<Long> newResult = (ArrayList<Long>) result.clone();
//                newResult.add(rewards[i]);
//                get(totalReward - rewards[i], newResult);
//            }
//        }


        if (totalReward == 10) {
            System.out.println(result);
            return;
        } else if (totalReward > 10) {
            return;
        } else {
            for (int i = 0; i < rewards.length; i++) {
                ArrayList<Long> newResult = (ArrayList<Long>) result.clone();
                newResult.add(rewards[i]);
                get(totalReward + rewards[i], newResult);
            }
        }

    }


    public static void getResult(int num, ArrayList<Integer> result) {

    }
}
