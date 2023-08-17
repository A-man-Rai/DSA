class BinaryTreeArray{
   private int[]arr;
   private int lastUsedIndex;
   public BinaryTreeArray(int size){
       this.arr=new int[size+1];
        this.lastUsedIndex=0;
        System.out.println("TREE OF SIZE "+size+" CREATED");
   }

   public void insertInTree(int value){
    lastUsedIndex++;
    if(!isFull()){
        arr[lastUsedIndex]=value;
        System.out.println("SUCCESSFULLY INSERTED");
    }else{
     System.out.println("TREE IS FULL");
     }
}
   

   public boolean isFull(){
   if(lastUsedIndex==arr.length){
       return true;
   }else{
    return false;
   }
   }

   public void preOrder(int i){
    if(i>lastUsedIndex){
       return;
    }
    System.out.print(arr[i]+" ");
    preOrder(2*i);
    preOrder(2*i+1);
   }

   public void inOrder(int i){
    if(i>lastUsedIndex){
        return;
     }
     inOrder(2*i);
     System.out.print(arr[i]+" ");
     inOrder(2*i+1);
   }

   public void postOrder(int i){
    if(i>lastUsedIndex){
        return;
     }
     postOrder(2*i);
     postOrder(2*i+1);
     System.out.print(arr[i]+" ");
   }

   public void levelOrder(){
    for(int i=1;i<=lastUsedIndex;i++){
       System.out.print(arr[i]+" ");
    }    
   }

   public void tarversal(){
    preOrder(1);
    System.out.println();
    inOrder(1);
    System.out.println();
    postOrder(1);
    System.out.println();
    levelOrder();
   }

   public void delete(int value){
    for(int i=1;i<=lastUsedIndex;i++){
        if(arr[i]==value){
         arr[i]=arr[lastUsedIndex];
         lastUsedIndex--;
         System.out.println("SUCCESSFULLY DELTED")
         return;
        }
    }
    System.out.println("NODE DOES NOT EXIST IN TREE");
   }


   public static void main(String args[]){
    BinaryTreeArray tree=new BinaryTreeArray(7);
    int[]arr={1,2,3,4,5,6,7};
    for(int e : arr){
       tree.insertInTree(e);
    }
    tree.tarversal();
    tree.delete(3);
    System.out.println();
    tree.tarversal();
    }
}