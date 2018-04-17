package jhz.pattern.state;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����3:46:46
 */
public class Test {

	public static void main(String[] args) {
		Context context = new Context();
		IState a = new ConcreteStateA();
		IState b = new ConcreteStateB();
		context.setState(b);
		context.request("testing");
	}

}
