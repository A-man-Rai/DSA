import java.util.Arrays;
class CoinChangeProblem{
    public static void getNumber(int[]coins,int amount){
    Arrays.sort(coins);
    int index=coins.length-1;
    while(true){
     int coin=coins[index];
     if(amount==0 ){
        break;
      } 
     if(coin<=amount){
        int nos=amount/coin;
       System.out.println(coin+" REQUIRED = "+nos);
       amount=amount-(coin*nos);
     }
     else{
        index--;
     }
    }
     
    }

    public static void main(String args[]){
    int[]coins={1,2,5,10,20,50,100,1000};
    int amount =3799;
    System.out.println(" AVAILABLE COINS "+Arrays.toString(coins));
    System.out.println(" AMOUNT "+amount); 
    getNumber(coins,amount);   
}
}