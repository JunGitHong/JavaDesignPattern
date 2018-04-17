package jhz.pattern.visitor;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��17�� ����11:27:27
 */
public class Test {

	public static void main(String[] args) {
		//����һ���ṹ����
        ObjectStructure os = new ObjectStructure();
        //���ṹ����һ���ڵ�
        os.add(new NodeA());
        //���ṹ����һ���ڵ�
        os.add(new NodeB());
        //����һ��������
        IVisitor visitor = new VisitorA();
        os.action(visitor);
	}

}
