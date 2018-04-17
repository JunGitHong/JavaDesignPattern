package jhz.pattern.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午1:54:47
 */
public class CompositeFlyweightFactory {
	Map<String,IFlyweight> map = new HashMap<String,IFlyweight>();
	
	public IFlyweight factory(List<String> stateList){
		ConcreteCompositeFlyweight flyweight = new ConcreteCompositeFlyweight();
		for(String state : stateList){
			flyweight.add(state, new ConcreteFlyweight(state));
		}
		return flyweight;
	}
	
	public IFlyweight factory(String state){
		IFlyweight flyweight = map.get(state);
		if(flyweight == null){
			flyweight = new ConcreteFlyweight(state);
			map.put(state, flyweight);
		}
		return flyweight;
	}
}
