class StackDoubly{
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        Node(int val){
           this.val=val;
        }
    }

    public void push(int val){
      Node node=new Node(val);
      size++;
        if(head==null){
        head=node;
        tail=node;
        return;
      }
      node.prev=tail;
      tail.next=node;
      tail=node;
    }

    public void pop(){
        if(head==null){
          System.out.println("STACK IS EMPTY");
          return;
        }
        if(size==1){
         System.out.println("POPED VALUE: "+tail.val);
         head=null;  
         tail=null;
         size--;
         return;    
        }
        size--;
        Node temp=tail.prev;
        temp.next=null;
        System.out.println("POPED VALUE: "+tail.val);
        tail=temp;
    }

    public int peek(){
        if(head==null){
            System.out.println("STACK IS EMPTY");
            return -1;
          }
        return tail.val;  

    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        StackDoubly stack=new StackDoubly();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        //stack.pop();
       // stack.pop();
        //stack.pop();
        //stack.pop();
       // stack.pop();
        System.out.println(stack.peek());   
        System.out.println(stack.getSize());      
    }
}