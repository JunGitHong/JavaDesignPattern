package jhz.pattern.strategy;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午4:43:08
 */
public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		 System.out.println("对于高级会员的折扣为20%");
	     return booksPrice * 0.8;
	}

}
