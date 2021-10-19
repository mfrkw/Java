public class Task10{
  public static void main (String[] args){

    String title = "こんにちは";
    String address = "888@gmail";
    String text = "お元気ですか？お返事待っています";

    email(title, address, text);

  }
  public static void email(String title, String address, String text){

    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);

  }
}