class CeilingFloor{
    static int ceiling(int[]arr,int target){
       int start=0;
       int end=arr.length-1;
       if(target>arr[end]){
          return -1;
       }
       while(start<=end){
         int mid=start+(end-start)/2;
         if(arr[mid]==target){
            return arr[mid];
        }
        else if(arr[mid]<target){
           start=mid+1;
          }
         else{
            end=mid-1;
         }
       }
       return arr[start];
    }

    static int floor(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target<arr[start]){
            return -1;
         }
        while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]==target){
              return arr[mid];
          }
          else if(arr[mid]<target){
            start=mid+1;
           }
          else{
             end=mid-1;
          }
        }
        return arr[end];
     }
    public static void main(String args[]){
      int[]arr={1,5,8,10,15,20};
      System.out.println(ceiling(arr,100));
    }
}