package jhz.pattern.observer.pull;
/**
 * ���������ɫ��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����2:54:37
 */
public class ConcreteSubject extends Subject {
	
	 private String state;
	    
    public String getState() {
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("����״̬Ϊ��" + state);
        //״̬�����ı䣬֪ͨ�����۲���
        this.notifyObservers();
    }

}
