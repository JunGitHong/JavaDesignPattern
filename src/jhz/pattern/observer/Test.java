package jhz.pattern.observer;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����2:58:33
 */
public class Test {

	public static void main(String[] args) {
		ConcreteSubject sub = new ConcreteSubject();
		IObserver observer = new ConcreteObserver();
		sub.attach(observer);
		sub.change("����״̬");
		
	}

}
