package jhz.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午2:01:55
 */
public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> compositeState = new ArrayList<String>();
        compositeState.add("a");
        compositeState.add("b");
        compositeState.add("c");
        compositeState.add("a");
        compositeState.add("b");
        
        CompositeFlyweightFactory flyFactory = new CompositeFlyweightFactory();
        IFlyweight compositeFly1 = flyFactory.factory(compositeState);
        IFlyweight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.call("Composite Call");
        
        System.out.println("---------------------------------");        
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));
        
        String state = "a";
        IFlyweight fly1 = flyFactory.factory(state);
        IFlyweight fly2 = flyFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
	}

}
