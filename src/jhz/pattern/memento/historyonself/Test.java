package jhz.pattern.memento.historyonself;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����2:27:04
 */
public class Test {

	public static void main(String[] args) {
		Originator o = new Originator();
        //�޸�״̬
        o.changeState("state 0");
        //��������¼
        IMemento memento = o.createMemento();
        //�޸�״̬
        o.changeState("state 1");
        //���ձ���¼�ָ������״̬
        o.restoreMemento(memento);
	}

}
