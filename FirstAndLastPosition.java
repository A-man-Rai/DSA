import java.util.Arrays;
class FirstAndLastPosition{
    static int binarySearch(int[]arr,int target,boolean searchRange){
     int start=0;
     int end=arr.length-1;
     int ans=-1;
     while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            ans=mid;
            if(searchRange){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }  
        else if(arr[mid]<target){
               start=mid+1;
        }
        else{
            end=mid-1;
        }
     }
     return ans;
    }

    static int[] find(int[]arr,int target){
       int[]ans={-1,-1};
       ans[0]=binarySearch(arr,target,true);
       ans[1]=binarySearch(arr,target,false);
       return ans;
    }
    public static void main(String args[]){
    int[]arr={1,1,1,7,7,7,8};
    System.out.println(Arrays.toString(find(arr,7)));

    }
}