package jhz.pattern.visitor;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午11:21:28
 */
public class NodeA extends Node {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
	/**
     * NodeA特有的方法
     */
    public String operationA(){
        return "NodeA";
    }

}
