import java.util.Arrays;
class SelectionSort{
    static int select(int[]arr,int end){
     int ans=0;
      for(int i=0;i<=end;i++){
      if(arr[ans]<arr[i]){
          ans=i;
      }    
      }
      return ans;
    }

    static void sort(int[]arr){
     for(int i=0;i<arr.length-1;i++){
       int index=select(arr,arr.length-1-i);
       int temp=arr[index];
       arr[index]=arr[arr.length-1-i];
       arr[arr.length-i-1]=temp;
     }
    }
   public static void main(String args[]){
    int[]arr={4,5,7,8,10,1,3,0,2,6};
    sort(arr);
    System.out.println(Arrays.toString(arr));
   }
}