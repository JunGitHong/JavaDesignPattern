package jhz.pattern.strategy;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:42:10
 */
public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("���ڳ�����Ա��û���ۿ�");
        return booksPrice;
	}

}
