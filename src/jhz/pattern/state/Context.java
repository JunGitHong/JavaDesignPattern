package jhz.pattern.state;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����3:41:36
 */
public class Context {
	
	private IState state;
	
	public void setState(IState state){
		this.state = state;
	}
	
	public void request(String sampleParameter) {
        //ת��state������
        state.handle(sampleParameter);
    }

}
