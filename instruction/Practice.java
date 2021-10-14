public class Practice {
  public static void main (String [] args){
    
    System.out.println("貴方の名前を入力して下さい");
    
    String name = new java.util.Scanner(System.in).nextLine();
    
    int r = new java.util.Random().nextInt(90);   // nextInt(90)で指定することで　0<90の数値をランダムに取る
    
    System.out.println("ようこそ" + name + "さん" + "貴方は" + r + "歳ですね？");
    
  }
}
