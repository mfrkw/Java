public class Do_while {
	public static void main(String[] args) {
	    
	    int temp = Integer.parseInt(args[0]);
	    
	    for(int i = 0; i < temp; i ++){
	      if (i == 25){
	        break;
	      }
	        System.out.println("現在" + temp + "度です");
	        System.out.println("温度を一度下げました");
	    }
	    
	    System.out.println("25度に設定しました");
	    
	   // do {
	   //     temp = Integer.parseInt(args[0]);
	   //     System.out.println("温度を一度下げました");
	   // }while(temp == 25);
	    
	   // System.out.println("25度に設定しました");
		  
	}
}

/*先にブロックを１回は実行する為　２５度以下でも　一度は下がる */