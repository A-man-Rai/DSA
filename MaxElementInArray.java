import java.util.Arrays;
class MaxElementInArray{
    static int findMax(int[]arr){
     int max=arr[0];
     for(int ele:arr){
        if(ele>max){
            max=ele;
        }
     }
     return max;
    }

    static int findMaxRange(int[]arr,int start,int end){
     int max=arr[start];
     for(int i=start; i<=end ; i++){
       if(arr[i]>max){
           max=arr[i];
       }
     }
     
     return max;
    }

    static void swap(int[]arr){
      for(int i=0;i<arr.length/2;i++){
       int temp=arr[i];
       arr[i]=arr[arr.length-1-i];
       arr[arr.length-1-i]=temp;
      }
      System.out.println(Arrays.toString(arr));
    }

    static void swap2(int arr[]){
    int start=0;
    int end=arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]){
        int[]arr={10,9,12,15,5,13};
        System.out.println(findMax(arr));
        System.out.println(findMaxRange(arr,1,3));
       
        swap(arr);
        swap2(arr);
        System.out.println(Arrays.toString(arr));
       
    }
}