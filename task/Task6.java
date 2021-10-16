public class Task6{
  public static void main (String[] args){
    
    int [] moneyList = {121902, 8302, 55100};  // ３つの口座残高
    
    for (int i = 0; i < moneyList.length; i++){
      
      System.out.println(moneyList[i]);
    }
    
    for (int bank : moneyList){
      System.out.println(bank);        //拡張for文でかくとこうなる。 
    }
  }
}