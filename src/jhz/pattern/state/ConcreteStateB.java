package jhz.pattern.state;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午3:45:41
 */
public class ConcreteStateB implements IState {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("B handle:"+sampleParameter);
	}

}
