package jhz.pattern.visitor;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��17�� ����11:19:34
 */
public abstract class Node {
	/**
     * ���ܲ���
     */
    public abstract void accept(IVisitor visitor);
}
