package jhz.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午3:19:38
 */
public class Watcher implements Observer {
	
	public Watcher(Observable o){
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		 System.out.println("状态发生改变：" + ((Watched)o).getData());
	}

}
