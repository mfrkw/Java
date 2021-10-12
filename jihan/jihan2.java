//最後に入力されたコマンドライン引数:　購入された商品の値段
//それ以外：　投入された硬貨

class jihan2 {
	public static void main (String[] args) {
	  
	  int NumberOfSheets = args.length - 1;  //投入されたコインの数
	  int coinChk = 0;           //チェック対象のコインの金額 一個一個取り出したコインを入れておく
	  int amountSum = 0;         //チェック済みの投入した合計金額
	  int price = Integer.parseInt(args[args.length - 1]);  //購入した商品の値段 コマンドライン引数最後の要素
	  int change = 0;            //おつり
	  
	  for (int i = 0; i < NumberOfSheets ; i ++){
	  	
	  	coinChk = Integer.parseInt(args[i]);    // args[i]と書くことでlengthから順番にコインを持ってくる
	  	
	  	if(coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500){
	  		amountSum += coinChk;
	  		
	  	}else if(coinChk == 1 || coinChk == 5){
	  		
	  		System.out.println("警告:" + coinChk + "円玉は使えません" );
	  		
	  	}else{
	  		
	  		System.out.println("警告:" + coinChk + "は硬貨として適切な値ではありません");
	  	}
	  }
	 
	  
	  change = amountSum - price;     //おつりの金額
	  
	  System.out.println( change + "円のおつりです。ありがとうございました。");
	  
	 
	}
}
