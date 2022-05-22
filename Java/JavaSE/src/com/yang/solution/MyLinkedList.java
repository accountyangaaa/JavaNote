package com.yang.solution;



/**
 * @program: JavaSE
 * @description: 单链表面试题
 * @author: Mrs.Yang
 * @create: 2022-05-05 10:41
 **/
public class MyLinkedList {

    /**
     * 203. 移除链表元素
     * 给你一个链表的头节点 head 和一个整数 val ，
     * 请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val){

        if (head == null){
            return null;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null){
            if (cur.val == val){
                prev.next = cur.next;
            }else {
                prev = cur;
            }
            cur = cur.next;
        }

        //最后处理头结点
        if (head.val == val){
            head = head.next;
        }

        return head;
    }

    public ListNode removeElements1(ListNode head, int val){
        //先处理头结点
        while(head !=null && head.val == val){
            head = head.next;
        }

        if (head == null){
            return null;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null){
            if (cur.val == val){
                prev.next = cur.next;
            }else {
                prev = cur;
            }
            cur = cur.next;
        }

        return head;
    }

    /**
     * 876. 链表的中间结点
     * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
     * 如果有两个中间结点，则返回第二个中间结点。
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第一个中间结点。

    /**
     * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
     * 如果有两个中间结点，则返回第一个中间结点。
     * @param head
     * @return
     */
    public ListNode middleNode1(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if (fast == null){//链表节点为偶数个
                return slow;
            }
            slow = slow.next;
        }
        return slow;
    }
}

