package jhz.pattern.strategy;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午4:44:17
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
