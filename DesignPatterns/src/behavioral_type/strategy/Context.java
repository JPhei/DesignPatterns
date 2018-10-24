package behavioral_type.strategy;

//封装角色
public class Context {
	//抽象策略
	private IStrategy strategy =null;
	//构造函数设置具体的策略
	public Context(IStrategy _strategy){
		this.strategy = _strategy;
	}
	//封装后的策略方法，调用具体策略的执行方法
	public void operateStrategy(){
		this.strategy.operate();
	}
	
}
