package jhz.pattern.mediator;
/**
 * 具体中介者（实现中介类）
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午4:28:21
 */
public class ConcreteMediator extends AbstractMediator {

	public ConcreteMediator(AbstractColleague collA, AbstractColleague collB) {
		super(collA, collB);
	}

	@Override
	public void AaffectB() {
		int number = collA.getNumber();
		collB.setNumber(number*100);
	}

	@Override
	public void BaffectA() {
		int number = collB.getNumber();
		collA.setNumber(number/100);
	}

}
