package jhz.pattern.observer;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午2:58:33
 */
public class Test {

	public static void main(String[] args) {
		ConcreteSubject sub = new ConcreteSubject();
		IObserver observer = new ConcreteObserver();
		sub.attach(observer);
		sub.change("测试状态");
		
	}

}
