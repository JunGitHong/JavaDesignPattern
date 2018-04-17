package jhz.pattern.proxy;
/**
 * 代理对象
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午2:42:38
 */
public class ProxyCompany implements ICarCompany {
	
	public CarCompany carCompany = new CarCompany();

	@Override
	public void SellCar() {
		// TODO Auto-generated method stub
		System.out.println("代理开始销售");
		carCompany.SellCar();
		System.out.println("代理售后");
	}

}
