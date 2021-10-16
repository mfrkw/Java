public class Task7{
  public static void main (String[] args){
    
    int [] numbers = {3, 4, 9};
    
    System.out.println("1行の数字を入力してください");
    
    int input = new java.util.Scanner(System.in).nextInt();
    
    for(int i = 0; i < numbers.length; i++){
      if(input == numbers[i]){
        System.out.println("アタリ！");
      break;
      }
    }
    
    // for(int n : numbers){          拡張for文の書き方
    //   if(input == n)
    //   System.out.println("アタリ！");
    // }
    
  }
}