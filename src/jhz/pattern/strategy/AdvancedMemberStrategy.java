package jhz.pattern.strategy;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:43:08
 */
public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		 System.out.println("���ڸ߼���Ա���ۿ�Ϊ20%");
	     return booksPrice * 0.8;
	}

}
