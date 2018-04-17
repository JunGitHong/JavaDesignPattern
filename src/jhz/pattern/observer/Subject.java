package jhz.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题角色类
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午2:45:40
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
