class RBS{
   static int pivot(int[]arr){
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

   static int binarySearch(int[]arr,int target,int s,int e){
    int start=s;
    int end=e;
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
        return -1;
   } 

   static int search(int[]arr,int target){
    int pivot=pivot(arr);
     int ans= binarySearch(arr,target,0,pivot);
     if(ans!=-1){
         return ans;
     }
      return binarySearch(arr,target,pivot+1,arr.length-1);
   }
    public static void main(String[] args) {
         int[]arr={3,4,5,6,7,0,1,2};
       //  System.out.println(search(arr,8));
        int[]arr2={1,2,3,4,5,6};
        System.out.println(pivot(arr2));
    }
}