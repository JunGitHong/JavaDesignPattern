package jhz.pattern.memento;
/**
 * 发起人角色类
 * 发起人角色利用一个新创建的备忘录对象将自己的内部状态存储起来。
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 上午11:40:37
 */
public class Originator {
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态："+state);
	}

	public Memento createMemento()
	{
		return new Memento(state);
	}
	
	public void restoreMemento(Memento memento){
		this.state = memento.getState();
	}
}
