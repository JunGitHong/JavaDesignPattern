package jhz.pattern.visitor;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��17�� ����11:22:29
 */
public class NodeB extends Node {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
	 /**
     * NodeB���еķ���
     */
    public String operationB(){
        return "NodeB";
    }

}
