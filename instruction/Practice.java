public class Practice {
  public static void main (String [] args){
    
    System.out.println("ようこそ占い館へ");
    System.out.println("あなたの名前を入力してください");
    
    String name = new java.util.Scanner(System.in).nextLine();
    
    System.out.println("あなたの年齢を入力してください");
    
    String ageString = new java.util.Scanner(System.in).nextLine();
    
    
    int age = Integer.parseInt(ageString);
    
    int fortune = new java.util.Random().nextInt(4);   // nextInt(90)で指定することで　0<90の数値をランダムに取る
    
    fortune++; // 15行だと0<4しか取れないから
    
    
    System.out.println("占いの結果が出ました！");
    
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
    
    System.out.println("1:大吉 2:中吉 3:吉 4:凶");
    
  }
}
