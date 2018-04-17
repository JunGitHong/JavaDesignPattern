package jhz.pattern.proxy;
/**
 * 目标对象（被代理）
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午2:38:37
 */
public class CarCompany implements ICarCompany{

	@Override
	public void SellCar() {
		// TODO Auto-generated method stub
		System.out.println("销售汽车");
	}

}
