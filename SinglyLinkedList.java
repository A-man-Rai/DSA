class SinglyLinkedList{
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        int val;
        Node next;
        Node(int n){
         this.val=n;
        }
        Node(int n,Node next){
            this.val=n;
            this.next=next;
           }
    }
    public void addFirst(int n){
      Node node=new Node(n);
      if(head==null){
         head=node;
         tail=node;
         size=1;
         return;
      }  
      node.next=head;
      head=node;
      size++;
    }

    public void addLast(int n){
     Node node=new Node(n);
     if(head==null){
          addFirst(n);
     }
     tail.next=node;
      tail=node;
      size++;
    }

    public void print(){
       Node temp=head;
       if(temp==null){
          System.out.println("LIST IS EMPTY");
          return;
       }
       while(temp!=null){
         System.out.print(temp.val+" ");
         temp=temp.next;
       }
       System.out.println();
    }

    public int size(){
        return size;
    }

    public void reverse(){
        Node first=head;
        Node second=head.next;
        while(second.next!=null){
           Node third=second.next;
           second.next=first;
           first=second;
           second=third;
        }
        second.next=first;
        head.next=null;
         tail=head;
        head=second;
    }
    
    public void last(int n){
        Node node=new Node(n);
        Node temp=head;
        while(temp.next!=null){
           temp=temp.next;
        }
        temp.next=node;
        tail=node;
        size++;
    }
   
    public boolean searchByValue(int val){
        Node temp=head;
        while(temp!=null){
          if(temp.val==val){
              System.out.println("NODE FOUND");
              return true;
          }
          temp=temp.next;
        }
        System.out.println("NODE NOT FOUND");
        return false;
    }

    public void insertAt(int index,int val){
        Node temp=head;
        Node node=new Node(val);
        int i=1;
        while(i<index){
           temp=temp.next;
           i++;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }


   public void deleteFirst(){
      size--;
      head=head.next;
   }

   public void deleteLast(){
    Node temp=head;
    while(temp.next!=tail){
        temp=temp.next;
    }
    size--;
    temp.next=null;
     tail=temp; 
  }
  
  public void deleteAll(){
    head=null;
    tail=null;
    size=0;
    System.out.println("DELETED LINKEDLIST");
  }

  public void deleteByIndex(int index){
   if(index==0){
    deleteFirst();
    return;
   }
   if(index>=size){
      deleteLast();
      return;
   }
   Node temp=head;
   int i=1;
   while(i<index){
      temp=temp.next;
      i++;
   }
   temp.next=temp.next.next;
   size--;
  }

    public static void main(String args[]){
     SinglyLinkedList list=new SinglyLinkedList();
     list.addFirst(1);
     list.addFirst(2);
     list.addFirst(3);
     list.addFirst(4);
     list.addLast(0);
     list.addLast(-1);
     list.last(-2);
     list.insertAt(3,10);
     list.deleteFirst();
     list.deleteLast();
     list.deleteByIndex(2);
     list.print();
     list.reverse();
     list.print();
     list.searchByValue(4);
    list.deleteAll();
    list.print();
     System.out.println(list.size());


    }

}