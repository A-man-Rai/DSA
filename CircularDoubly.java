class CircularDoubly{
    Node head;
    Node tail;
    int size;
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
         this.val=val;
        }
    }

    public void addFirst(int val){
       Node node=new Node(val);
       size++;
       if(head==null){
           head=node;
           tail=node;
           head.prev=node;
           head.next=node;
           return;
       }
       node.next=head;
       head.prev=node;
       head=node;
       tail.next=head;
       head.prev=tail;
    }

    public void addLast(int val){
        Node node=new Node(val);
        if(head==null){
        addFirst(val);
        return;
        }
        size++;
        tail.next=node;
        node.prev=tail;
        tail=node;
        tail.next=head;
        head.prev=tail;

    }

    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=head){
           temp=temp.next;
        }
        size--;
        tail=temp;
        tail.next=head;
        head.prev=tail;
    }

    public void print(){
    Node temp=head;
    do{
        System.out.print(temp.val+"->");
        temp=temp.next;
    }
    while(temp!=head);
    System.out.println("HEAD");
    }

    public void deleteFirst(){
        Node temp=head;
        while(temp.next!=head){
           temp=temp.next;
        }
        size--;
        head=head.next;
        head.prev=temp;
        tail=temp;
        tail.next=head;
    }
   
    public void deleteLast2(){//O(1)
        size--;
      Node temp=tail.prev;
      temp.next=head;
      head.prev=temp;
      tail=temp;
    }

    public void deleteFirst2(){//O(1)
         size--;
        head=head.next;
        head.prev=tail;
        tail.next=head;
    }

    public void reverse(){
        Node temp=tail;
        do{
          System.out.print(temp.val+"<=");
         temp=temp.prev;
        }while(temp!=tail);
    }

    public static void main(String args[]){
    CircularDoubly list=new CircularDoubly();
    list.addFirst(10);
    list.addFirst(9);
    list.addFirst(8);
    list.addFirst(7);
    list.addLast(11);
    list.addLast(12);
    //list.deleteLast2();
    //list.deleteFirst2();
   // list.deleteFirst2();
    //list.deleteFirst2();
    list.print();
    list.reverse();
    }
}