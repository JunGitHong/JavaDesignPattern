package jhz.pattern.component;

import java.util.ArrayList;
import java.util.List;

/**
 * �ֵ�
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����3:18:08
 */
public class MarketBranch extends Market {
	
	//���˵��б�
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
		System.out.println(name+"����");
		for(Market market : marketList){
			market.pay();
		}
	}

}
