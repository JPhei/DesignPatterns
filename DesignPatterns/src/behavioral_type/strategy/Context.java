package behavioral_type.strategy;

//��װ��ɫ
public class Context {
	//�������
	private IStrategy strategy =null;
	//���캯�����þ���Ĳ���
	public Context(IStrategy _strategy){
		this.strategy = _strategy;
	}
	//��װ��Ĳ��Է��������þ�����Ե�ִ�з���
	public void operateStrategy(){
		this.strategy.operate();
	}
	
}
