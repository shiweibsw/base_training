package com.bsw.base_training.search;

/**
 * 二分查找
 *
 * @Author shiwei
 * @Date 2020/11/12-15:11
 * @Email shiweibsw@gmail.com
 */
public class Training_Search_bsearch {

    /**
     * 最简单的二分查找（无重复元素）
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    private int bsearch00(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch100(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    private int bsearch90(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bsearch80(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

    private int bsearch10(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bsearch20(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bsearch30(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch40(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bsearch50(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bsearch60(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bsearch70(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    /**
     * 查找第一个值等于给定值的元素
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int bsearch01(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) return mid;
                else high = mid - 1;
            }
        }

        return -1;
    }

    private int bsearch91(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }


    private int bsearch81(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch71(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch11(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) return mid;
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    private int bsearch21(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch31(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch41(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch51(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] < value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    private int bsearch61(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] < value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }


    /**
     * 查找最后一个值等于给定值的元素
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int bsearch02(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if ((mid == n - 1 || a[mid + 1] != value)) return mid;
                else low = mid + 1;
            }
        }

        return -1;
    }

    private int bsearch72(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || a[mid + 1] != value) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    public int bsearch12(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || a[mid + 1] != value) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }//022-2388136

    public int bsearch22(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || a[mid + 1] != value) return mid;
                else low = mid + 1;
            }

        }
        return -1;
    }

    public int bsearch32(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || a[mid + 1] != value) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    private int beasrch42(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == a.length - 1 || a[mid + 1] > value) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    private int beasrch52(int[] a, int value) {
        int low = 0;
        int higt = a.length;
        while (low <= higt) {
            int mid = low + ((higt - low) >> 1);
            if (a[mid] > value) {
                higt = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == a.length - 1 || a[mid + 1] > value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    private int bsearch62(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == a.length - 1 || a[mid + 1] > value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }


    /**
     * 查找第一个大于等于给定值的元素
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int bsearch03(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public int bsearch73(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) >> 1;
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;


    }


    public int bsearch63(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int bsearch13(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int bsearch23(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bearch33(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bsearch43(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int bsearch53(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                if (mid == 0 || a[mid - 1] < value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    /**
     * 查找最后一个小于等于给定值的元素
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int bsearch04(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == n - 1 || a[mid + 1] > value) return mid;
                else low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int bsearch64(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] <= value) {
                if (mid == n - 1 || a[mid + 1] > value) return mid;
                else low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int bsearch14(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == n - 1 || a[mid + 1] > value) return mid;
                else low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int bsearch24(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == n - 1 || a[mid + 1] > value) return mid;
                else low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int bearch34(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == a.length - 1 || a[mid + 1] > value) return mid;
                else low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch44(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == a.length - 1 || a[mid + 1] > value) return mid;
                else low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int bsearch54(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if ((mid == a.length - 1) || a[mid + 1] > value) return mid;
                else low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }
}
