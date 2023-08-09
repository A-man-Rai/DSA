class MountainArray{
    static int peak(int[]arr){
      int start=0;
      int end=arr.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            return mid;
            }
          else if(arr[mid]>arr[mid-1]){
             start=mid;
          }
          else{
            end=mid;
          }
    }
    return -1;
}

  static int searchInMountainArray(int[]arr,int target){
      int start=0;
      int end=peak(arr);
      while(start<=end){
        int mid=start+(end-start)/2;
       if(arr[mid]==target){
          return arr[mid];
       }
       else if(arr[mid]>target){
           end=mid-1;
       }
       else{
        start=mid+1;
       }
      }
      start=end;
      end=arr.length-1;
      while(start<=end){
        int mid=start+(end-start)/2;
       if(arr[mid]==target){
          return arr[mid];
       }
       else if(arr[mid]>target){
        start=mid+1;
       }
       else{
        
        end=mid-1;
       }
      }
      return -1;
      
  }
    public static void main(String args[]){
    int[]arr={10,20,30,40,30,20,3,2,1};
    System.out.println(searchInMountainArray(arr,50));
    }
}