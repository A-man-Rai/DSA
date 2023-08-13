class Stack{
    private int[]arr;
    private int size;
    private int index=0;
    Stack(int size){
        arr=new int[size];
    }
     public void push(int n){
        size++;
        if(index==arr.length){
           resize();
        }
        arr[index++]=n;
     }

     public void resize(){
        int[]temp=new int[arr.length*2];
        int i=0;
        while(i<arr.length){
         temp[i]=arr[i];
         i++;
        }
        arr=temp;
     }

     public void pop(){
       size--;
       System.out.println(arr[--index]);
     }

    public int getSize(){
        return size;
    }
    public static void main(String agrs[]){
    Stack stack=new Stack(4);
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.push(4);
     stack.push(4);
     System.out.println(stack.getSize());
    }
}