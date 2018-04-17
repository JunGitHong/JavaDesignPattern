package jhz.pattern.memento;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����11:48:15
 */
public class Test {

	public static void main(String[] args) {
		Originator o = new Originator();
        Caretaker c = new Caretaker();
        //�ı为���˶����״̬
        o.setState("On");
        //��������¼���󣬲��������˶����״̬��������
        c.saveMemento(o.createMemento());
        //�޸ķ����˵�״̬
        o.setState("Off");
        //�ָ������˶����״̬
        o.restoreMemento(c.retrieveMemento());
        
        System.out.println(o.getState());

	}

}
