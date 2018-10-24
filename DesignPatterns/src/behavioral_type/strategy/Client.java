package behavioral_type.strategy;

public class Client {

	/**
	 * @param args
	 * �߲�ģ��
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������ࣨ����װ��ɫ�ࣩ
		Context context =null;
		//���캯������������ԣ�ִ�з�װ��ķ���
		context = new Context(new BackDoor());
		context.operateStrategy();
		
		context = new Context(new GrivenGreenLight());
		context.operateStrategy();
		
		context = new Context(new BlockEnemy());
		context.operateStrategy();
		
	}

}
