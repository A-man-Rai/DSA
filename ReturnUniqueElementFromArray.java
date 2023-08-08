class ReturnUniqueElementFromArray{
    
    static int uniqueElement(int[]arr){
      int unique=0;
        for(int e : arr){
          unique ^= e;
        }
      return unique;
    }

    public static void main(String args[]){
        int arr[]={10,20,10,20,30,1,30,40,50,50,40};
        System.out.println(uniqueElement(arr));
    }
}