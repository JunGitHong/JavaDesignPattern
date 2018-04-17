package jhz.pattern.state;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午3:41:36
 */
public class Context {
	
	private IState state;
	
	public void setState(IState state){
		this.state = state;
	}
	
	public void request(String sampleParameter) {
        //转调state来处理
        state.handle(sampleParameter);
    }

}
