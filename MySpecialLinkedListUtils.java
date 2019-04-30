/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eg.edu.alexu.csd.datastructure.linkedlist;


/**
 *
 * @author Momen
 */
public class MySpecialLinkedListUtils {
	
public LinkedListNode head=null;
    
 public double[]summary (LinkedListNode head){
     LinkedListNode i =head;
     LinkedListNode s =head;
       double sum=0;
       double average;
       double meane=0;
       int max=0;
       int min=0;
       double  [] Ar= new double [5];
       int count=0;
       while(s!=null) {
    	   count++;
    	   s=s.next;
       }
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
     }
     average=sum/count;
     if((count%2)!=0){
         i=head;
         for(int x=0;x<count/2;x++){
             i=i.next;
         }
         meane=i.value;
     }else if (count%2==0){
         i=head;
         LinkedListNode j;
         for(int x=0;x<(count-1)/2;x++){
             i=i.next;
         }
         j=i.next;
         meane=(i.value+j.value)/2.0;
     }
   Ar[0]=sum;
   Ar[1]=average;
   Ar[2]=meane;
   Ar[3]=max;
   Ar[4]=min;
    return Ar;
 }


 public  LinkedListNode reverse (LinkedListNode head){
     LinkedListNode i = head;
     LinkedListNode prev = null;
     LinkedListNode  next1= null;

     while (i != null) { 
         next1 = i.next; 
         i.next = prev; 
         prev = i; 
         i = next1; 
     } 
     head = prev; 
     return head;
 }
 public  boolean palandrom (LinkedListNode head){
	 LinkedListNode s=head;
     int count=0;
     while(s!=null) {
  	   count++;
  	   s=s.next;
     }
	 int []a =new int[count];
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
     while(i!=null && j!=null ){
     
     
         i.next=j.next;
         i=i.next;
        
         if(i!=null)
             j=i.next;
     }
     return head;
          
 }

public  LinkedListNode removeCentralNode(LinkedListNode head){
	LinkedListNode s=head;
    int count=0;
    while(s!=null) {
 	   count++;
 	   s=s.next;
    }
     LinkedListNode i = head;
     LinkedListNode j=i.next;
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
	 LinkedListNode i=head,temp=head.next;
     while(temp != null){
         i=head;
         while (i.next != temp){
             if(i.value>temp.value){
                 int temp1=temp.value;
                 temp.value=i.value;
                 i.value=temp1;
             }else{
                 i=i.next;
             }
         }
         temp=temp.next;
     }
     return head;
 }
 //to test solution 
 public void printL(LinkedListNode shead){
     LinkedListNode i=shead;
     while (i != null){
         System.out.print(i.value);
         i=i.next;
     }
     System.out.println();
 }
 public void add (int x,int index){
     LinkedListNode newnode =new LinkedListNode();
     newnode.value=x;
     if (index==0){
         newnode.next=head;
         head=newnode;
     }
     else{
         LinkedListNode i=head;
         for(int j=0;j<index-1;j++){
             i=i.next;
         }
         newnode.next=i.next;
         i.next=newnode;
     }
 }

 public  LinkedListNode gethead(){
     return head;
 }

}

