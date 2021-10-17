public class Task8{
  public static void main (String[] args){
    
    add(100, 20);  //100はaddメソッドのintx,20はintyに代入される
    add(200, 50);  //200はintx 50はintyに代入される
    
  }
  
 
  public static void add (int x, int y){
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
    
}