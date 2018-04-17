package jhz.pattern.visitor;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��17�� ����11:19:06
 */
public interface IVisitor {
	/**
     * ��Ӧ��NodeA�ķ��ʲ���
     */
    public void visit(NodeA node);
    /**
     * ��Ӧ��NodeB�ķ��ʲ���
     */
    public void visit(NodeB node);
}
