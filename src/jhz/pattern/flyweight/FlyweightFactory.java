package jhz.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午1:37:43
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
