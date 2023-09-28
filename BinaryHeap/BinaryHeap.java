class BinaryHeap{
    int[]arr;
    int index=1;
    public BinaryHeap(int size){
      this.arr=new int[size+1];
    }

    public void insert(int data){
    if(index==arr.length){
        System.out.println("TREE IS FULL");
        return;
    }   
     heapifyTopToBottom(index,data);
     index++;
    }
    
    public void heapifyTopToBottom(int index, int data){
    arr[index]=data;
     while(arr[index]<arr[index/2]){
       int temp=arr[index];
       arr[index]=arr[index/2];
       arr[index/2]=temp;
       index=index/2;
     }
    }

    public int delete(){
        int root=arr[1];
        index=index-1;
        arr[1]=arr[index];
        arr[index]=0;
        heapifyBottomToTop(index-1);
        return root;
    }
  
    public void heapSort(){
        while(arr[1]!=0){
           System.out.print(delete()+" ");
        }
    }

    public void heapifyBottomToTop(int index){
      
    }

    public void print(){
        System.out.println(java.util.Arrays.toString(arr));
    }
  

    public static void main(String[] args) {
      BinaryHeap heap=new BinaryHeap(5);
      heap.insert(10);  
      heap.insert(5); 
      heap.insert(4);
      heap.insert(3);
      heap.insert(2);
      heap.print();
      heap.heapSort(); 
  
    }
}