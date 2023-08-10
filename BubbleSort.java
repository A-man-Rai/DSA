import java.util.Arrays;
class BubbleSort{
    static void sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-1-i;j++){
             if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
           }
        }

    }
    public static void main(String args[]){
      int[]arr={3,5,7,8,10,1,3,0,1};
     sort(arr);
     System.out.println(Arrays.toString(arr));
    }
}