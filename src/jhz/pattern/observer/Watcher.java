package jhz.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����3:19:38
 */
public class Watcher implements Observer {
	
	public Watcher(Observable o){
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		 System.out.println("״̬�����ı䣺" + ((Watched)o).getData());
	}

}
