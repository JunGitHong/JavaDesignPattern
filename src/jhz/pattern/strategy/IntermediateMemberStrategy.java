package jhz.pattern.strategy;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午4:42:42
 */
public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
	}

}
