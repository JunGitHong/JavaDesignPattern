package jhz.pattern.component;
/**
 * 加盟店
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午3:18:52
 */
public class MarketJoin extends Market {
	
	public MarketJoin(String name){
		this.name = name;
	}

	@Override
	public void add(Market c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Market c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println(name+"消费");
	}

}
