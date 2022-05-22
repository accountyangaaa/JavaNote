package doubleLinkedList;

import java.util.Map;

/**
 * @program: JavaSE
 * @description: 双向链表
 * @author: Mrs.Yang
 * @create: 2022-04-27 19:58
 **/
class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}
public class MyLinkedList {

    public ListNode head;//指向双向链表的头结点
    public ListNode last;//指向的是尾巴结点

    //得到单链表的长度
    public int size(){
        ListNode cur = head;
        int len = 0;
        while (cur != null){
            len++;
            cur = cur.next;
        }
        return len;
    }
    public void display(){
        ListNode cur = head;
        while (cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = head;
        while (cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
            last = node;
            return;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
            last = node;
            return;
        }else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    public ListNode searchIndex(int index){
        ListNode cur = head;
        while (index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode cur = searchIndex(index);
        if (index < 0 || index > size()){
            System.out.println("插入位置不合理！");
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
        while (cur.next != null){
            node.next = cur.prev.next;
            cur.prev.next = node;
            node.prev = cur.prev;
            cur.prev = node;
        }

        System.out.println("插入成功");
        return;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //注意问题：当只有一个节点时，删除会导致空指针异常
        ListNode cur = head;
        while (cur !=null){
            if (cur.val == key){
                if (cur == head){
                    head = head.next;
                    if (head != null){
                        head.prev = null;
                    }else {//只有一个结点时
                        last = null;
                    }

                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null){
                        //删除中间位置
                        cur.next.prev = cur.prev;
                    }else {
                        last = last.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
        System.out.println("未找到该结点！");
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        //注意问题：当只有一个节点时，删除会导致空指针异常
        ListNode cur = head;
        while (cur !=null){
            if (cur.val == key){
                if (cur == head){
                    head = head.next;
                    if (head != null){
                        head.prev = null;
                    }else {//只有一个结点时
                        last = null;
                    }

                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null){
                        //删除中间位置
                        cur.next.prev = cur.prev;
                    }else {
                        last = last.prev;
                    }
                }
                //return;
            }
            cur = cur.next;
        }
        System.out.println("未找到该结点！");;
    }

    //查看引用是否被释放 jps jmap -histo:live xxxx > c:\\bit.txt
    public void clear(){
        ListNode curNext = head.next;
        while (head != null){
            head.prev = null;
            head.next = null;
            head = curNext;
        }
        last = null;
    }



    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(5);
        /*myLinkedList.addFirst(6);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(2);*/
        /*myLinkedList.display();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(12));*/

      // myLinkedList.addIndex(4,99);

        //myLinkedList.addLast(34);
        /*myLinkedList.display();
        System.out.println("==========");
        myLinkedList.removeAllKey(5);*/

        myLinkedList.display();
    }
}
