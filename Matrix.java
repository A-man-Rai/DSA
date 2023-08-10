class Matrix{
    static int search(int[][]arr,int target){
    int row=0;
    int col=arr.length-1;
    while(row<arr.length && col>=0){
        if(arr[row][col]==target){
           return arr[row][col];
        }
        else if(arr[row][col]>target){
           col--;
        }
        else{
          row++;
        }
      }
      return -1;
    } 
    public static void main(String args[]){
     int[][]arr={{10,20,30,40},
                 {11,25,35,45},
                 {28,29,37,49},
                 {33,34,38,50}};
     System.out.println(search(arr,50));
    }
}