package jhz.pattern.component;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����3:26:43
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketBranch rootBranch = new MarketBranch("�ܵ�");  
        MarketBranch qhdBranch = new MarketBranch("�ֵ�");  
        MarketJoin hgqJoin = new MarketJoin("�ֵ�һ���˵�");  
        MarketJoin btlJoin = new MarketJoin("�ֵ�����˵�");  
          
        qhdBranch.add(hgqJoin);  
        qhdBranch.add(btlJoin);  
        rootBranch.add(qhdBranch);  
        rootBranch.pay();
	}

}
