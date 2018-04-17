package jhz.pattern.memento.historyonself;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����2:23:21
 */
public class Originator {
	
	public String state;
	
	public void changeState(String state)
	{
		this.state = state;
		System.out.println("�ı�״̬Ϊ��"+state);
	}
	
	public Memento createMemento()
	{
		return new Memento(this);
	}
	
	public void restoreMemento(IMemento memento){
        Memento m = (Memento)memento;
        changeState(m.state);
    }	
	
	private class Memento implements IMemento{
        
        private String state;
        /**
         * ���췽��
         */
        private Memento(Originator o){
            this.state = o.state;
        }
        private String getState() {
            return state;
        }
        
    }

}
