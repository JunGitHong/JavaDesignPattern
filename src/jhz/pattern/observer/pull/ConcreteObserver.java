package jhz.pattern.observer.pull;
/**
 * ����۲��߽�ɫ��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����2:46:54
 */
public class ConcreteObserver implements IObserver {
	
	/**
	 * �۲���״̬
	 */
	private String observerState;

	@Override
	public void update(Subject subject) {
		this.observerState = ((ConcreteSubject)subject).getState();
		System.out.println("�۲���״̬Ϊ��"+observerState);
	}

}
