package behavioral_type.strategy_enum;

/*
 * �Ӽ���������
 * a+b����a-b
 * ����ö����ʵ��
 */
public enum Calculator {
	ADD("+"){
		public int exe(int a ,int b){
			return a+b;
		}
		
	},
	SUB("-"){
		public int exe(int a ,int b){
			return a-b;
		}
		
	};
	
	String value = "";
	
	private Calculator(String _value){
		this.value = _value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public abstract int exe(int a ,int b);
		
	 
}
