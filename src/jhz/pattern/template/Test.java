package jhz.pattern.template;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��17�� ����10:44:48
 */
public class Test {

	public static void main(String[] args) {
		Account account = new MoneyMarketAccount();
        System.out.println("�����г��˺ŵ���Ϣ����Ϊ��" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("�����˺ŵ���Ϣ����Ϊ��" + account.calculateInterest());
	}

}
