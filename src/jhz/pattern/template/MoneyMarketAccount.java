package jhz.pattern.template;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午10:43:20
 */
public class MoneyMarketAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		return "Money Market";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.045;
	}

}
