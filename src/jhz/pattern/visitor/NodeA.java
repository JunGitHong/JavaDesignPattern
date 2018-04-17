package jhz.pattern.visitor;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��17�� ����11:21:28
 */
public class NodeA extends Node {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
	/**
     * NodeA���еķ���
     */
    public String operationA(){
        return "NodeA";
    }

}
