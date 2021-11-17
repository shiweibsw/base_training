package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/17-13:41
 * @Email shiweibsw@gmail.com
 * 作为一位web开发者， 懂得怎样去规划一个页面的尺寸是很重要的。 现给定一个具体的矩形页面面积，你的任务是设计一个长度为 L 和宽度为 W 且满足以下要求的矩形的页面。要求：
 * <p>
 * 1. 你设计的矩形页面必须等于给定的目标面积。
 * <p>
 * 2. 宽度 W 不应大于长度 L，换言之，要求 L >= W 。
 * <p>
 * 3. 长度 L 和宽度 W 之间的差距应当尽可能小。
 * 你需要按顺序输出你设计的页面的长度 L 和宽度 W。
 * <p>
 */
class leetcode_492 {

    public int[] constructRectangle(int area) {
        //W的平方肯定小于area，从area的平方根开始向下寻找即可。
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        return new int[]{area / w, w};


//        if(area<=3){
//            return new int[]{area,1};
//        }
//        int L=area/2;
//        int max=0;
//        int c=100000000;
//        boolean solider=false;
//        while(L>=2){
//            if(area%L==0){
//                solider=true;
//                int abs=Math.abs(L-area/L);
//                if(abs<c){
//                    c=abs;
//                    max=L;
//                }else{
//                    break;
//                }
//            }
//            L--;
//        }
//        if (solider){
//            return new int[]{max,area/max};
//        }else{
//            return new int[]{area,1};
//        }

    }

}
