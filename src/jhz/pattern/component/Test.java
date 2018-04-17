package jhz.pattern.component;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午3:26:43
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketBranch rootBranch = new MarketBranch("总店");  
        MarketBranch qhdBranch = new MarketBranch("分店");  
        MarketJoin hgqJoin = new MarketJoin("分店一加盟店");  
        MarketJoin btlJoin = new MarketJoin("分店二加盟店");  
          
        qhdBranch.add(hgqJoin);  
        qhdBranch.add(btlJoin);  
        rootBranch.add(qhdBranch);  
        rootBranch.pay();
	}

}
