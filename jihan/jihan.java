class jihan {
	public static void main (String[] args) {
	  
	  int amount = args.length;  //投入されたコインの数
	  int coinChk = 0;           //チェック対象のコインの金額 一個一個取り出したコインを入れておく
	  int amountSum = 0;         //チェック済みの投入した合計金額
	  
	  
	  for (int i = 0; i < amount ; i ++){
	  	
	  	coinChk = Integer.parseInt(args[i]);    // args[i]と書くことでlengthから順番にコインを持ってくる
	  	
	  	if(coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500){
	  		amountSum += coinChk;
	  		
	  	}else if(coinChk == 1 || coinChk == 5){
	  		
	  		System.out.println("警告:" + coinChk + "円玉は使えません" );
	  		
	  	}else{
	  		
	  		System.out.println("警告:" + coinChk + "は硬貨として適切な値ではありません");
	  	}
	  }
	  
	  System.out.println("ただいまの投入金額は" + amountSum + "円です");
	}
}
