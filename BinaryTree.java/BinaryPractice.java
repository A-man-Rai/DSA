import java.util.LinkedList;
import java.util.Queue;
class BinaryPractice{
    Node root;
    class Node{
        int val;
        int height;
        Node left;
        Node right;
        Node(int val){
          this.val=val;
        }
    }
    static int i=-1;
    public Node createTree(Node root,int[]arr){
        i++;
        if(arr[i]==-1){
          return null;
        }
        if(root==null){
         Node node=new Node(arr[i]);
         root=node;
        }
       root.left=createTree(root.left,arr);
       root.right=createTree(root.right,arr);
       return root;
    }

    public void createTree(int[]arr){
      root=createTree(root,arr);
    }


    public void insertInTree(int val){
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        Node node=new Node(val);
        while(!q.isEmpty()){
         Node temp=q.remove();
        if(temp.left==null){
           temp.left=node;
           return;
        }
        else if(temp.right==null){
          temp.right=node;
          return;
        }
        else{
            q.add(temp.left);
            q.add(temp.right);
         }
        }
    }

    public void levelOrder(Node root){
      Queue<Node> q=new LinkedList<Node>();
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
       Node temp=q.remove();
       if(temp!=null){
        System.out.print(temp.val+" ");
        if(temp.left!=null){
            q.add(temp.left);
         }
         if(temp.right!=null){
          q.add(temp.right);
         }
       }
       else{
         System.out.println();
         if(!q.isEmpty()){
            q.add(null);
        }
      }
    }
}

    public void levelOrder(){
        levelOrder(root);
    }

    public Node getDeepestNode(){
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        Node temp=null;
        while(!q.isEmpty()){
          temp=q.remove();
          if(temp.left!=null){
              q.add(temp.left);
           }
           if(temp.right!=null){
            q.add(temp.right);
           }
        }
        return temp;
    }
    
   public void delete(){
    Queue<Node> q=new LinkedList<Node>();
    q.add(root);
    Node prev,curr=null;
    while(!q.isEmpty()){
       prev=curr;
        curr=q.remove();
        if(curr.left==null){
          prev.right=null;
          return;
        }
        else if(curr.right==null){
            curr.left=null;
            return;
        }
        else{
            q.add(curr.left);
            q.add(curr.right);
        }
    }
   }
   
    public void deleteNode(int target){
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.remove();
            if(temp.val==target){
                Node deepNode=getDeepestNode();
                temp.val=deepNode.val;
                delete();
                return;
            }
          if(temp.left!=null){
              q.add(temp.left);
           }
           if(temp.right!=null){
            q.add(temp.right);
           }
        }  

    }

    public static void main(String[] args) {
        BinaryPractice tree=new BinaryPractice();
       int[] arr={1,2,4,-1,-1,5,-1,-1,3,9,-1,-1,6,-1,-1};
        tree.createTree(arr);
        tree.levelOrder();
        tree.deleteNode(2);
        tree.levelOrder();


    }
}