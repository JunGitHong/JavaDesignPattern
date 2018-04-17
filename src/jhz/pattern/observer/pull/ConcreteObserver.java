package jhz.pattern.observer.pull;
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
	public void update(Subject subject) {
		this.observerState = ((ConcreteSubject)subject).getState();
		System.out.println("观察者状态为："+observerState);
	}

}
