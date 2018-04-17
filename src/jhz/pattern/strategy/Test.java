package jhz.pattern.strategy;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:44:17
 */
public class Test {

	public static void main(String[] args) {
		MemberStrategy strategy = new IntermediateMemberStrategy();
//		strategy = new AdvancedMemberStrategy();
		Price price = new Price(strategy);
		double p = price.quote(100);
		System.out.println(p);
	}

}
