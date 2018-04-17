package jhz.pattern.observer;

import java.util.Observable;

/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����3:19:03
 */
public class Watched extends Observable {
	
	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		if(!this.data.equals(data)){
			this.data = data;
			setChanged();
		}
		notifyObservers();
	}

}
