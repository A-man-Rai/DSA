import java.util.Arrays;
class CyclicSort{
    static void sort(int[]arr){
    int i=0;
    while(i<arr.length){
      if(arr[i]!=i+1){
        int temp=arr[i];
        int index=arr[i]-1;
        arr[i]=arr[index];
        arr[index]=temp;
        }
        else{
            i++;
        }
       
    }
}
    public static void main(String args[]){
    int[]arr={3,7,5,6,2,1,8,4};
    sort(arr);
    System.out.println(Arrays.toString(arr));
    }
}