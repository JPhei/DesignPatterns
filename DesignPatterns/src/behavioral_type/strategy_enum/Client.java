package behavioral_type.strategy_enum;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		String symbol = "-"; 
		
		if(symbol.equals("+")){
			  Calculator.ADD.exe(a, b);
			  System.out.println(Calculator.ADD.exe(a, b));
		}else if(symbol.equals("-")){
			  Calculator.SUB.exe(a, b);
			  System.out.println(Calculator.SUB.exe(a, b));
		}

		
	}

}
