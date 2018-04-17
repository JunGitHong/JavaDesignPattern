package jhz.pattern.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 分店
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午3:18:08
 */
public class MarketBranch extends Market {
	
	//加盟店列表
	List<Market> marketList = new ArrayList<Market>();
	
	public MarketBranch(String name){
		this.name = name;
	}

	@Override
	public void add(Market c) {
		// TODO Auto-generated method stub
		marketList.add(c);
	}

	@Override
	public void remove(Market c) {
		// TODO Auto-generated method stub
		marketList.remove(c);
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println(name+"消费");
		for(Market market : marketList){
			market.pay();
		}
	}

}
