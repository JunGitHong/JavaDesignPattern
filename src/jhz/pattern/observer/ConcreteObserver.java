package jhz.pattern.observer;
/**
 * 具体观察者角色类
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午2:46:54
 */
public class ConcreteObserver implements IObserver {
	
	/**
	 * 观察者状态
	 */
	private String observerState;

	@Override
	public void update(String state) {
		this.observerState = state;
		System.out.println("状态为："+observerState);
	}

}
