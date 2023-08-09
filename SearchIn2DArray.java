class SearchIn2DArray{

    static int search(int[][]arr,int target){
        for(int i=0;i<arr.length;i++){
           for(int j=0 ; j<arr[i].length;j++){
              if(arr[i][j]==target){
                  return arr[i][j];
              }
           }
        }
        return -1;
    }

    static int search2(int[][]arr,int target){
        for(int[] row : arr){
           for(int ele : row){
              if(ele==target){
                  return ele;
              }
           }
        }
        return -1;
    }

    static int maxNo(int[][]arr){
     int max=Integer.MIN_VALUE;
        for(int[]row:arr){
         for(int ele : row){
            if(ele>max){
               max=ele;
            }
         }
     }
     return max;
    }

    public static void main(String args[]){
     int[][]arr={{1,2,3},{4,10,6},{7,8,9}};
     System.out.println(maxNo(arr));
    }
}