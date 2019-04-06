package com.company;

public class LinkedListNode {
    public int value;
    public LinkedListNode next=null;

    public static LinkedListNode getnext(){
        return LinkedListNode.next ;
    }
    public static int getvalue(){
        return LinkedListNode.value ;
    }
}
