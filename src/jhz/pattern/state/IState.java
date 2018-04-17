package jhz.pattern.state;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午3:43:09
 */
public interface IState {
	/**
    * 状态对应的处理
    */
   public void handle(String sampleParameter);
}
