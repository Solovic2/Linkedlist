/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package redgfsdghsd;

/**
 *
 * @author Momen
 */
public class MySpecialLinkedListUtils {
    public LinkedListNode head=null;
       int count=0;
    public  double[]summary (LinkedListNode head){
        LinkedListNode i =head;
          int sum=0;
          double average;
          int madien;
          int max=0;
          int min=0;
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
      double  [] Ar= new double [4];
      Ar[0]=sum;
      Ar[1]=max;
      Ar[2]=min;
      Ar[3]=average;
       return Ar;
    }

    int []a =new int[count];


    public  LinkedListNode reverse (LinkedListNode head){
        LinkedListNode i = head;
        LinkedListNode j = i.next;
        LinkedListNode temp;
        while(i!=null || j!=null){
            temp=j.next;
            i=j;
            j=temp;
        }
        head.next=null;
        head=i;
        i.next=null;

        return head;
    }
    public  boolean palandrom (LinkedListNode head){
        LinkedListNode i = head;
         int c=0;
        while(i!=null){
            a[c++]=i.value;
            i=i.next;
        }
         int d=0;
        for(int j=0;j<count/2;j++){
            if(a[j]==a[count-j-1]){
                d++;
            }
        }
        if(d==count/2){
            return true;
        }else {
            return false;
        }
    }

    public static LinkedListNode evenIndexedElement (LinkedListNode head){
        LinkedListNode i = head;
        LinkedListNode j = i.next;
        while(i!=null || j!=null ){
            i.next=j.next;
            i=i.next;
            if(i!=null)
                j=i.next;
        }
        return head;
    }
    public  LinkedListNode removeCentralNode(LinkedListNode head){
        LinkedListNode i = head;
        LinkedListNode j=i;
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
    public  LinkedListNode insertionSort(LinkedListNode head){
        LinkedListNode i = head;
        LinkedListNode j = i.next;
        LinkedListNode temp;
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
