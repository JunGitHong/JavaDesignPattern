package jhz.pattern.visitor;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午11:22:29
 */
public class NodeB extends Node {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
	 /**
     * NodeB特有的方法
     */
    public String operationB(){
        return "NodeB";
    }

}
