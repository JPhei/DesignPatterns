package behavioral_type.strategy;

public class Client {

	/**
	 * @param args
	 * 高层模块
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明场景类（即封装角色类）
		Context context =null;
		//构造函数声明具体策略，执行封装后的方法
		context = new Context(new BackDoor());
		context.operateStrategy();
		
		context = new Context(new GrivenGreenLight());
		context.operateStrategy();
		
		context = new Context(new BlockEnemy());
		context.operateStrategy();
		
	}

}
