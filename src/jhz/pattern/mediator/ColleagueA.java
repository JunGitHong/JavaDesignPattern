package jhz.pattern.mediator;
/**
 * ͬ��A
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��13�� ����4:19:12
 */
public class ColleagueA extends AbstractColleague {

//	@Override
//	public void setNumber(int number, AbstractColleague coll) {
//		this.number = number;
//		coll.setNumber(number*100);
//	}
	
	@Override
	public void setNumber(int number, AbstractMediator md) {
		this.number = number;
		md.AaffectB();
	}

}
