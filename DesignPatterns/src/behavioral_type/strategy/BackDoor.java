package behavioral_type.strategy;

public class BackDoor implements IStrategy{
	public void operate(){
		System.out.println("执行具体策略： BackDoor");
	}
}
