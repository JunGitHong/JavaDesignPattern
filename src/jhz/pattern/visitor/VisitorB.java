package jhz.pattern.visitor;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午11:24:35
 */
public class VisitorB implements IVisitor {

	@Override
	public void visit(NodeA node) {
		System.out.println(node.operationA());
	}

	@Override
	public void visit(NodeB node) {
		System.out.println(node.operationB());
	}

}
