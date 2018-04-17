package jhz.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ����
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����1:37:43
 */
public class FlyweightFactory {
	Map<String,IFlyweight> map = new HashMap<String, IFlyweight>();
	
	public IFlyweight factory(String state){
		IFlyweight flyweight = map.get(state);
		if(flyweight==null){
			flyweight = new ConcreteFlyweight(state);
			map.put(state, flyweight);
		}
		return flyweight;
	}
	
}
