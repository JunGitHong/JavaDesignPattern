package jhz.pattern.flyweight;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午1:46:05
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory factory = new FlyweightFactory();
		IFlyweight flyweight = factory.factory("a");
		flyweight.call("1");
		IFlyweight flyweight2 = factory.factory("b");
		flyweight2.call("2");
		IFlyweight flyweight3 = factory.factory("a");
		flyweight3.call("3");
		
		System.out.println(flyweight==flyweight3);
	}

}
