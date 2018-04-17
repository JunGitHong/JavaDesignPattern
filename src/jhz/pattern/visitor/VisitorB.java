package jhz.pattern.visitor;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��17�� ����11:24:35
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
