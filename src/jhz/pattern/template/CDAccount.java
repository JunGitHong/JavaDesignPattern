package jhz.pattern.template;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午10:44:16
 */
public class CDAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		return "Certificate of Deposite";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.06;
	}

}
