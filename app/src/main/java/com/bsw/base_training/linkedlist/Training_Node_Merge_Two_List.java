package com.bsw.base_training.linkedlist;

/**
 * 单链表有序链表合并
 *
 * @Author shiwei
 * @Date 2020/11/6-16:46
 * @Email shiweibsw@gmail.com
 */
class Training_Node_Merge_Two_List {

    public static Node mergeTwoLists(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }

    private Node mergeTwoLists26(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }


    private Node mergeTwoLists25(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;

    }


    private Node mergeTwoLists1(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }

    private Node MergeTwoLists2(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }


    private Node mergeTwoLists3(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;


    }

    private Node mergeTwoLists4(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }


    private Node mergeTwoLists5(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }


    private Node mergeTwoLists6(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }

    private Node mergeTwoLists7(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }

    private Node mergeTwoLists8(Node l1, Node l2) {
        Node soldier = new Node(0, null);
        Node p = soldier;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return soldier.next;
    }

    private Node mergeTwoList9(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;

    }

    private Node mergeTwoLists10(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node mergeTwoList11(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node mergeTwoLists12(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node mergeTwoLists13(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node mergeTwoLists14(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node MergeTwoLists15(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node mergeTwoList16(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data > l2.data) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }


    private Node mergeTwoLists17(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return solider.next;
    }

    private Node mergeTwoLists18(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }


    private Node mergeTwoLists19(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }


    private Node mergerTwoList20(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data > l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node mergerTwoList21(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data > l2.data) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }

        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }


    private Node mergeTwoList22(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data > l2.data) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node mergeTwoList23(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data > l2.data) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }

    private Node mergeTwoList24(Node l1, Node l2) {
        Node solier = new Node(0, null);
        Node p = solier;
        while (l1 != null && l2 != null) {
            if (l1.data > l2.data) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solier.next;
    }


    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    public static void printAll(Node list) {
        Node p = list;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

}
