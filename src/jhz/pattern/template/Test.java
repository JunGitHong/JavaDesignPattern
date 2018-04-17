package jhz.pattern.template;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午10:44:48
 */
public class Test {

	public static void main(String[] args) {
		Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
	}

}
