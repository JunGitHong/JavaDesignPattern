package jhz.pattern.state;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����3:45:41
 */
public class ConcreteStateB implements IState {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("B handle:"+sampleParameter);
	}

}
