package jhz.pattern.strategy;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:42:42
 */
public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("�����м���Ա���ۿ�Ϊ10%");
        return booksPrice * 0.9;
	}

}
