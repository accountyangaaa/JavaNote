package LinkedList;

/**
 * @program: JavaSE
 * @description: 链表
 * @author: Mrs.Yang
 * @create: 2022-04-24 16:55
 **/
//ListNode 代表一个节点
/*class ListNode {
    public int val;
    public ListNode next;//存储下一个结点的地址

    public ListNode(int val){
        this.val = val;
    }
}*/
public class MyLinkedList {

    public ListNode head;//链表的头引用

    public void createList(){
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(23);
        ListNode listNode3 = new ListNode(34);
        ListNode listNode4 = new ListNode(45);
        ListNode listNode5 = new ListNode(56);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        this.head = listNode1;
    }

    public void display(){
        //
        ListNode cur = this.head;
        while (cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 从指定头节点开始进行打印
     * @param newHead
     */
    public void display2(ListNode newHead){
        //this.head.next != null;
        ListNode cur = newHead;
        while (cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找关键字key是否在单链表中
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur !=null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //头插法
    public void addFirst(int data){
        ListNode node =new ListNode(data);
        //绑定位置的时候一定要先绑定后面，不然找不到了
        node.next = this.head;
        head = node;

        /*if (this.head == null){
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }*/
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        //判断链表是否为空
        if (this.head == null){
            head = node;
            return;
        }
        ListNode cur = this.head;
        //找尾结点
        while (cur.next != null){
            cur = cur.next;
        }
        //cur.next == null;
        cur.next = node;
    }

    //找到index-1的位置
    public ListNode findIndex(int index){
        ListNode cur = this.head;
        while (index-1 != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if (index < 0 || index > size()){
            System.out.println("插入位置不合法");
            return;
        }
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == size()){
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = findIndex(index);
        node.next = cur.next;
        cur.next = node;
    }

    /**
     * 找到 要删除的关键字的前驱
     * @param key
     * @return
     */
    public ListNode searchPrev(int key){
        ListNode cur = this.head;
        while (cur.next != null){
            if (cur.next.val == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    /**
     * 删除第一次出现关键字为key的节点
     * @param key
     */
    public void remove(int key){
        if (this.head == null){
            System.out.println("单链表为空！");
            return;
        }
        if (this.head.val == key){
            this.head = head.next;
            return;
        }
        //找key的前驱结点
        ListNode cur = searchPrev(key);
        if (cur == null){
            System.out.println("没有你要删除的结点！");
            return;
        }
        //找到cur
        ListNode del = cur.next;
        cur.next = del.next;
    }
    //删除所有值为key的节点
    public ListNode removeAllKey(int key){
        if (head == null){
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur !=null){
            if (cur.val == key){
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //最后处理头结点
        if (head.val == key){
            head = head.next;
        }
        return head;
    }


    public void clear(){
        //粗暴做法
        //this.head == null;
        //最好一个一个释放
        while (head != null){
            ListNode curNext = head.next;
            head.next = null;
            head = curNext;
        }
    }

    //给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
    public ListNode reverseList(){
        ListNode prev = null;
        ListNode cur = head;

        if (head == null){
            return null;
        }
        while (cur != null){
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    // 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode() {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    // 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第一个中间结点。
    public ListNode middleNode1() {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if (fast == null){
                return slow;
            }
            slow = slow.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode FindKthToTail(int k) {
        /*if (k < 0 || k>size()){
            return null;
        }*/
        if (k < 0 || head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k-1 != 0 ) {
            fast = fast.next;
            //此时可以不用k>size()
            if (fast == null){
                return null;
            }
            k--;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     *现有一链表的头指针 ListNode* pHead，给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，
     * 且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
     * @param x
     * @return
     */
    public ListNode partition(int x) {
        // write code here
        ListNode bs = null;//before start
        ListNode be = null;//before end
        ListNode as = null;//after start
        ListNode ae = null;//after end
        ListNode cur = head;

        while (cur != null){
            if (cur.val < x){
                //第一次放入
                if (bs == null){
                    bs = cur;
                    be = cur;
                }else {//不是第一次
                    be.next = cur;
                    be = be.next;
                }
            }else  {//第一次放入
                if (as == null){
                    as = cur;
                    ae = cur;
                }else {//不是第一次
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //预防第一段为空
        if (bs == null){
            return as;
        }
        be.next = as;
        //预防第二段当中的数据，最后一个结点不是空的
        if (as != null){
            ae.next = null;
        }
        return bs;
    }

    /**
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
     * 例如，链表 1->2->3->3->4->4->5  处理后为 1->2->5
     * 1. 重复的元素，不止一个 2. 重复的元素，一定是紧挨在一起的
     * @param
     * @return
     */
    public ListNode deleteDuplication() {
        ListNode newHead = new ListNode(-1);//虚拟节点
        ListNode tmp = newHead;
        ListNode cur = head;
        while (cur !=null){
            if (cur.next != null && cur.val == cur.next.val){
                while (cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                //多走一步
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        //防止最后一个结点的值也是重复的
        tmp.next = null;
        return newHead.next;
    }

    /**困难！
     * 对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
     * 给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
     * 测试样例：
     * 1->2->2->1
     * 返回：true
     * @param A
     * @return
     */
    public boolean chkPalindrome(ListNode A) {
        // write code here
        //找中间结点
        if(head == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow走到了中间位置-》翻转
        ListNode cur = slow.next;
        while (cur != null){//当cur为空的时候代表翻转完了
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //翻转完成
        //判断回文
        while (head != slow){
            if (slow.val != head.val){
                return false;
            }
            //偶数
            if (head.next == slow){
                return true;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    /**
     * 给你一个链表的头节点 head ，判断链表中是否有环。
     *
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
     * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
     * 注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
     *
     * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/linked-list-cycle
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param
     * @return
     */
    public boolean hasCycle() {
        if (head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return false;
        }
        return true;
    }

    public void createLoop(){
        ListNode cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = head.next.next;
    }

    /**
     * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }

        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;//相遇点即入口点

    }
}
