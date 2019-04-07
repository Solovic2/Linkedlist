package com.company;

public class MySpecialLinkedListUtils {
    public  int count=0;
    public static double[]summary (linkedListNode head){
        LinkedListNode i =head;
        public  int sum;
        public  double average;
        public  int madienl;
        public  int max=0;
        public  int min=0;
        if(i!=null){
            max=i.value;
            min=max;
        }
        while(i!=null){
            if(i.value>max){
                max=i.value;
            }

            if(min>i.value){
                min=i.value;
            }
            sum+=i.value;
            i=i.next;
            count++;
        }
        average=sum/count;
      int [] Ar= new int [4];
      Ar[0]=sum;
      Ar[1]=max;
      Ar[2]=min;
      Ar[3]=average;
       return Ar;
    }

    int []a =new int[count];
    public static LinkedListNode reverse (linkedListNode head){
        linkedListNode i = head;
        linkedListNode j = i.next;
        linkedListNode temp;
        while(i!=null || j!=null){
            temp=j.next;
            i=j;
            j=temp;
        }
        head.next=null;
        head=i;
        i.next=null;

         /*public int c=0;
        while(i!=null){
            a[c++]=i.value;
            i=i.next;
        }
        for(int j=0;j<c/2;j++){
            public int temp =a[j];
            a[j]=a[c-j-1];
            a[c-j-1]=temp;
        }
        linkedListNode i = head;
        puclic int d=0;
        while(i!=null){
            i.value=a[d++];
            i=i.next;
        }*/  return head;
    }
    public static boolean palandrom (linkedListNode head){
        linkedListNode i = head;
        public int d=0;
        for(int j=0;j<count/2;j++){
            if(a[j]=a[count-j-1]){
                d++;
            }
        }
        if(d==count/2){
            return true;
        }else {
            return false;
        }
    }
    public static LinkedListNode insertion(linkedListNode head){

    }
    public static LinkedListNode evenIndexedElement (LinkedListNode head){
        linkedListNode i = head;
        linkedListNode j = i.next;
        while(i!=null || j!=null ){
            i.next=j.next;
            i=i.next;
            if(i!=null)
                j=i.next;
        }
        return LinkedListNode;
    }
    public static LinkedListNode removeCentralNode(LinkedListNode head){
        linkedListNode i = head;
        linkedListNode j=i;
        if(count%2==0){
            for(int counter=0;counter<count/2 - 2;counter++){
                i=i.next;
                j=i.next;
            }
            i.next=j.next;
            j.next=null;
        }else if(count %2!=0){
            for(int counter=0;counter<count/2 - 1;counter++){
                i=i.next;
                j=i.next;
            }
            i.next=j.next;
            j.next=null;

         } return head;
    }
    public static LinkedListNode insertionSort(LinkedListNode head){
        linkedListNode i = head;
        linkedListNode j = i.next;
        linkedListNode temp;
        for(int f=0;f<count;f++){
            while(i!=null || j!=null){
                if(i.value>j.value){
                    temp=j.next;
                    j.next=i;
                    i.next=temp;
                    j=i.next;
                }else {
                    i=i.next;
                    j=j.next;

                }
            }
        }
        return head;
     }
}
