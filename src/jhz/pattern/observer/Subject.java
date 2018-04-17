package jhz.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * �����ɫ��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����2:45:40
 */
public abstract class Subject {
	private List<IObserver> objServerList = new ArrayList<IObserver>();
	
	public void attach(IObserver observer){
		objServerList.add(observer);
		System.out.println("attach a observer!");
	}
	
	public void detach(IObserver observer){
		objServerList.remove(observer);
		System.out.println("detach a observer!");
	}
	
	public void notifyObservers(String state){
		for(IObserver obs : objServerList){
			obs.update(state);
		}
	}
}
