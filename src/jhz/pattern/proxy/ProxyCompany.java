package jhz.pattern.proxy;
/**
 * �������
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����2:42:38
 */
public class ProxyCompany implements ICarCompany {
	
	public CarCompany carCompany = new CarCompany();

	@Override
	public void SellCar() {
		// TODO Auto-generated method stub
		System.out.println("����ʼ����");
		carCompany.SellCar();
		System.out.println("�����ۺ�");
	}

}
