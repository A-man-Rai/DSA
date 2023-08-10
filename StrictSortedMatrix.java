class StrictSortedMatrix{
    static int search(int[][]arr,int target){
       int row=0;
       int col=arr.length-1;
       while(row<arr.length && col>=0){
        if(arr[row][col]==target){
           return arr[row][col];
        }
        else if(arr[row][col]<target){
             row++;
        }
        else{
            col--;
         }
       }
       return -1;
    }
    public static void main(String args[]){
     int[][]arr={{1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
                 {13,14,15,16}};
    System.out.println(search(arr,13));
    }
}