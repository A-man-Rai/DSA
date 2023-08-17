import java.util.Queue;
import java.util.LinkedList;
class BinaryTree{
    Node root;
    int index=-1;
    class Node{
      int val;
      Node left;
      Node right;
      int height;
      Node(int val){
          this.val=val;
        }
     }
    
    public Node createTree(int[]arr){
        index++;
        if(arr[index]==-1){
           return null;
        }
        Node newNode=new Node(arr[index]);
        if(root==null){
           root=newNode;
        }
        newNode.left=createTree(arr);
        newNode.right=createTree(arr);
        return newNode;
     }

     public void preorederTraversal(Node root){
        if(root==null){

             return;
            }          
        System.out.print(root.val+" ");
           preorederTraversal(root.left);
           preorederTraversal( root.right);
        
     }
     
    public void preOrder(){
      if(root==null){
         System.out.println("TREE DOES NOT EXIST");

             return;
            }   
        preorederTraversal(root);
        System.out.println();
    }

   public void inorderTraversal(Node root){
   if(root==null){
      return;
   }
   inorderTraversal(root.left);
   System.out.print(root.val+" ");
   inorderTraversal(root.right);
   }
  
   public void inOrder(){
      inorderTraversal(root);
   }


   public void postOrderTraversal(Node root){
      if(root==null){
         return;
      }
      postOrderTraversal(root.left);
      postOrderTraversal(root.right);
      System.out.print(root.val+" ");
   }
   
   public void postOrder(){
      postOrderTraversal(root);
   }


   public void levelOrder(){
      if(root==null) {
       System.out.println("TREE DOES NOT EXIST");
       return;
      }
   Queue<Node> queue=new LinkedList<Node>();
   queue.add(root);
   queue.add(null);
   while(!queue.isEmpty()){
   Node temp=queue.remove();
   if(temp==null){
     
      if(!queue.isEmpty()){
         queue.add(null);
      }
      else{
         break;
      }
      System.out.println();
   }
   else{
      System.out.print(temp.val+" ");
      if(temp.left!=null){
         queue.add(temp.left);
      }
      if(temp.right!=null){
          queue.add(temp.right);
      }
   }
   }
   System.out.println();
   }


   public void searchInTree(int target){
      Queue<Node> q=new LinkedList<Node>();
      q.add(root);
      while(!q.isEmpty()){
       Node temp=q.remove();
       if(temp.val==target){
         System.out.println(target+" FOUND IN TREE");
         return; 
      }else{
         if(temp.left!=null){
           q.add(temp.left);
         }
         if(temp.right!=null){
           q.add(temp.right);
         }
      }
      }
      System.out.println("VALUE DOES NOT EXIST IN TREE");
   }

   public void insertInTree(int val){
      Node node=new Node(val);
      if(root==null){
       root=node;
       return;
      }
  Queue<Node> q=new LinkedList<Node>();
  q.add(root);
   while(!q.isEmpty()){
    Node temp=q.remove();
    if(temp.left!=null){
       q.add(temp.left);
    }else{
      temp.left=node;
      return;
    }

    if(temp.right!=null){
      q.add(temp.right);
    }else{
      temp.right=node;
      return;
    }
   }   
}

public Node findDeepestNode(){
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

public Node searchNode(int target){
   Queue<Node> q=new LinkedList<Node>();
   q.add(root);
   Node temp=null;
   while(!q.isEmpty()){
     temp=q.remove();
     if(temp.val==target){
        return temp;
     }
          if(temp.left!=null){
         q.add(temp.left);
     }
     if(temp.right!=null){
       q.add(temp.right);
     }
   }
   return null;
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
      if(curr.right==null){
         curr.left=null;
         return;
      }
      q.add(curr.left);
      q.add(curr.right);     
   }
}
public void deleteNode(int target){
  Node temp=searchNode(target);
  if(temp!=null){
    Node deepNode=findDeepestNode();
    temp.val=deepNode.val;
     delete();
  }else{
   System.out.println("NODE IS NOT AVAILABLE IN TREE");
  }
}

public void deleteTree(){
  root=null;
  System.out.println("TREE  HAS BEEN DELETED");
}


public int countNodesInTree(Node root){
    if(root==null){
       return 0;
    }
    int left=countNodesInTree(root.left);
    int right=countNodesInTree(root.right);
    return left+right+1;
} 

public int countNodes(){
   return countNodesInTree(root);
}

public int sumNodesInTree(Node root){
   if(root==null){
      return 0;
   }
   int left=sumNodesInTree(root.left);
   int right=sumNodesInTree(root.right);
   return left+right+root.val;
}

public int sumNodes(){
   return sumNodesInTree(root);
}


public int heightOfTree(Node root){
 if(root==null){
   return 0;
 }
 int left=heightOfTree(root.left);
 int right=heightOfTree(root.right);

 return Math.max(left,right)+1;
}

public int heightOfTree(){
   return heightOfTree(root);
}

    public static void main(String[] args){
    BinaryTree tree=new BinaryTree();
   // int[]arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
   //tree.createTree(arr);
   int[]arr={1,2,3,4,5,9,6,7};
   for(int e: arr){
      tree.insertInTree(e);
   }
   
    tree.preOrder();
    //tree.inOrder();
    //tree.postOrder();
   // tree.insertInTree(9);
    tree.levelOrder();
    tree.preOrder();
    System.out.println(tree.countNodes());
    System.out.println(tree.sumNodes());
    System.out.println(tree.heightOfTree());
   // tree.searchInTree(10);
  //tree.deleteNode(4);
  //tree.delete();
 // tree.deleteTree();
  //tree.preOrder();
   //tree.levelOrder();


}
}