package jhz.pattern.strategy;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午4:42:10
 */
public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于初级会员的没有折扣");
        return booksPrice;
	}

}
