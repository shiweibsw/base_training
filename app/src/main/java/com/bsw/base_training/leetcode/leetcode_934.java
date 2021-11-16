package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shiwei
 * @Date 2021/10/14-17:16
 * @Email shiweibsw@gmail.com
 */
class leetcode_934 {
    public int shortestBridge(int[][] grid) {
        int res = 0;
        List<Point> lands = new ArrayList<Point>();
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    if (j - 1 >= 0) {
                        if (grid[i][j - 1] == 1) {
                            continue;
                        }
                    }
                    if (i - 1 >= 0) {
                        if (grid[i - 1][j] == 1) {
                            continue;
                        }
                    }
                    if (j + 1 < n) {
                        if (grid[i][j + 1] == 1) {
                            continue;
                        }
                    }
                    if (i + 1 < m) {
                        if (grid[i + 1][j] == 1) {
                            continue;
                        }
                    }
                    //这是一个孤立点
                    lands.add(new Point(i, j));
                }
            }
        }
        if (lands.size() == 2) {
            res = Math.max(Math.abs(lands.get(0).x - lands.get(1).x), Math.abs(lands.get(0).y - lands.get(1).y));
        } else {
            //寻找最近的组织把
            res = getDis(grid, m, n, lands.get(0).x, lands.get(0).y);
        }
        return res;
    }

    private int getDis(int[][] grid, int m, int n, int i, int j) {
        int range = 1;
        while (true) {
            if (j - range >= 0) {
                if (grid[i][j - range] == 1) {
                    break;
                }
            }
            if (j - range >= 0 && i - range >= 0) {
                if (grid[i - range][j - range] == 1) {
                    break;
                }
            }
            if (i - range >= 0) {
                if (grid[i - range][j] == 1) {
                    break;
                }
            }
            if (i - range >= 0 && j + range < n) {
                if (grid[i - range][j + range] == 1) {
                    break;
                }
            }
            if (j + range < n) {
                if (grid[i][j + range] == 1) {
                    break;
                }
            }
            if (j + range < n && i + range < m) {
                if (grid[i + range][j + range] == 1) {
                    break;
                }
            }
            if (i + range < m) {
                if (grid[i + range][j] == 1) {
                    break;
                }
            }
            if (i + range < m && j - range >= 0) {
                if (grid[i + range][j - range] == 1) {
                    break;
                }
            }
            range++;
        }
        return range;
    }

    class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
