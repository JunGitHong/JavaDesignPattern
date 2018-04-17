package jhz.pattern.state;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午3:46:46
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
