package jhz.pattern.memento;
/**
 * �����˽�ɫ��
 * �����˽�ɫ���𱣴汸��¼���󣬵��ǴӲ��޸ģ��������鿴������¼��������ݡ�
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����11:46:34
 */
public class Caretaker {
	
	private Memento memento;

	/**
     * ����¼��ȡֵ����
     */
    public Memento retrieveMemento(){
        return this.memento;
    }
    /**
     * ����¼�ĸ�ֵ����
     */
    public void saveMemento(Memento memento){
        this.memento = memento;
    }
	
	
}
