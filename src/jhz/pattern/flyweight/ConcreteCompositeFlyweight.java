package jhz.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����1:52:17
 */
public class ConcreteCompositeFlyweight implements IFlyweight {
	Map<String,IFlyweight> map = new HashMap<String, IFlyweight>();
	
	public void add(String state,IFlyweight flyweight){
		map.put(state, flyweight);
	}

	@Override
	public void call(String state) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteCompositeFlyweight : "+ state);
	}

}
