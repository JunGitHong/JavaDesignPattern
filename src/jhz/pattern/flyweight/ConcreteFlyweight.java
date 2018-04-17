package jhz.pattern.flyweight;
/**
 * 具体享元角色
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午1:35:02
 */
public class ConcreteFlyweight implements IFlyweight {
	private String intrinsicState = null;
	
	public ConcreteFlyweight(String intrinsicState){
		this.intrinsicState = intrinsicState;
	}
	
	@Override
	public void call(String state) {
		// TODO Auto-generated method stub
		System.out.println("intrinsicState state:"+this.intrinsicState);
		System.out.println("state:"+state);
	}

}
