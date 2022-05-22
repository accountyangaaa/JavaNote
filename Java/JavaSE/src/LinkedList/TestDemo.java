package LinkedList;

/**
 * @program: JavaSE
 * @description: 测试链表
 * @author: Mrs.Yang
 * @create: 2022-04-24 17:30
 **/
public class TestDemo {

    //将两个升序链表合并为一个新的 升序 链表并返回。
    // 新链表是通过拼接给定的两个链表的所有节点组成的。
    public static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        //虚拟节点
        ListNode newHead = new ListNode(-1);

        ListNode tmp = newHead;
        while (headA != null && headB != null){
            if (headA.val < headB.val){
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if (headA != null){
            tmp.next = headA;
        }
        if (headB != null){
            tmp.next = headB;
        }
        return newHead.next;
    }

    public static void creatCut(ListNode headA, ListNode headB){
        headA.next.next = headB.next.next;
    }
    /**
     * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
     * 如果两个链表不存在相交节点，返回 null 。
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null){
            return null;
        }

        ListNode pl = headA;
        ListNode ps = headB;
        int lenA = 0;
        int lenB = 0;

        while (pl != null){
            lenA++;
            pl = pl.next;
        }
        //pl == null
        pl = headA;

        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        //ps == null
        ps = headB;

        int len = lenA-lenB;
        if (len < 0){
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //1. pl永远指向了最长的链表  ps永远指向了最短的链表 2、求到了差值len步

        //pl 走差值len步
        while (len!=0){
            pl = pl.next;
            len--;
        }
        //同时走 直到相遇
        while (pl != ps){
            pl = pl.next;
            ps = ps.next;
        }
        return pl;
    }

    public static void main1(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(12);
        myLinkedList.addLast(23);
        myLinkedList.addLast(34);
        myLinkedList.addLast(45);
        myLinkedList.addLast(56);
        //myLinkedList.createLoop();
        System.out.println(myLinkedList.hasCycle());
    }
    public static void main2(String[] args) {
        MyLinkedList myLinkedList1 = new MyLinkedList();
        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList1.addLast(5);
        myLinkedList1.addFirst(1);
        myLinkedList1.addFirst(23);
        myLinkedList1.addFirst(23);
        myLinkedList1.addFirst(12);

        myLinkedList2.addFirst(2);
        myLinkedList2.addFirst(3);
        myLinkedList2.addFirst(4);
        myLinkedList2.addFirst(4);

        //creatCut(myLinkedList1.head, myLinkedList2.head);
        //不相交，会返回空指针，空指针异常，用try...catch捕获
        try {
            ListNode ret = getIntersectionNode(myLinkedList1.head, myLinkedList2.head);
            System.out.println(ret.val);
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("没有相交的结点！");
        }


        /*myLinkedList1.display();
        ListNode ret2 = myLinkedList1.deleteDuplication();
        myLinkedList1.display2(ret2);

        ListNode ret = myLinkedList1.partition(12);
        myLinkedList1.display2(ret);

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addFirst(30);
        myLinkedList2.addFirst(24);
        myLinkedList2.addFirst(13);

        ListNode ret1 = mergeTwoLists(myLinkedList1.head,myLinkedList2.head);
        myLinkedList1.display2(ret1);*/

    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        /*myLinkedList.createList();
        myLinkedList.display();*/
        /*boolean flag = myLinkedList.contains(56);
        System.out.println(flag);
        System.out.println(myLinkedList.size());*/
        myLinkedList.addFirst(24);
        myLinkedList.addFirst(34);
        myLinkedList.addFirst(23);
        myLinkedList.addFirst(31);
        myLinkedList.addFirst(56);
        myLinkedList.addFirst(78);

        myLinkedList.display();
        ListNode ret = myLinkedList.FindKthToTail(3);
        System.out.println(ret.val);

        /*myLinkedList.display();
        ListNode ret = myLinkedList.middleNode();
        myLinkedList.display2(ret);
        ListNode ret1 = myLinkedList.middleNode1();
        myLinkedList.display2(ret1);*/

        /*myLinkedList.display();
        ListNode ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/

        /*myLinkedList.clear();
        System.out.println("ffafsf");

        myLinkedList.display();
        System.out.println("删除");
        myLinkedList.removeAllKey(23);
        myLinkedList.display();
*/

        /*System.out.println("删除");
        myLinkedList.remove(55);
        myLinkedList.display();*/

        myLinkedList.addLast(24);
        myLinkedList.display();
        myLinkedList.addIndex(12,99);
        myLinkedList.display();

    }
}
