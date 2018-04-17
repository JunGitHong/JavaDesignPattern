package jhz.pattern.memento;
/**
 * �����˽�ɫ��
 * �����˽�ɫ����һ���´����ı���¼�����Լ����ڲ�״̬�洢������
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����11:40:37
 */
public class Originator {
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("��ǰ״̬��"+state);
	}

	public Memento createMemento()
	{
		return new Memento(state);
	}
	
	public void restoreMemento(Memento memento){
		this.state = memento.getState();
	}
}
