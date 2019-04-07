package com.company;

public class MySpecialLinkedListUtils {
    public  int count=0;
    public static double[]summary (linkedListNode head){
        LinkedListNode i =head;
        public  int sum;
        public  double average;
        public  int madien;
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
      double  [] Ar= new double [4];
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

        return head;
    }
    public static boolean palandrom (linkedListNode head){
        linkedListNode i = head;
        public int c=0;
        while(i!=null){
            a[c++]=i.value;
            i=i.next;
        }
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

    public static LinkedListNode evenIndexedElement (LinkedListNode head){
        linkedListNode i = head;
        linkedListNode j = i.next;
        while(i!=null || j!=null ){
            i.next=j.next;
            i=i.next;
            if(i!=null)
                j=i.next;
        }
        return head;
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
    public static LinkedListNode Mergesort(LinkedListNode head){
        linkedListNode f = head;
        void merge(int a[], int l, int m, int r){
            int n1 = m - l + 1;
            int n2 = r - m;
            int [] L = new int [n1];
            int [] R = new int [n2];
            for (int i=0; i<n1; ++i) {
                L[i] = a[l + i];
            }
            for (int j=0; j<n2; ++j){
                R[j] = a[m + 1+ j];
            }

            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                   a[k] = L[i];
                    i++;
                }
                else {
                    a[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                a[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                a[k] = R[j];
                j++;
                k++;
            }
        }
        void sort(int a[], int l, int r){
            if (l < r)
            {
                int m = (l+r)/2;
                sort(a, l, m);
                sort(a , m+1, r);

                merge(a, l, m, r);
            }
        }

        linkedListNode f = head;
        puclic int d=0;
        while(f!=null){
            f.value=a[d++];
            f=f.next;
        }
       return head;
    }
}
