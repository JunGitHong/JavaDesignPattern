package jhz.pattern.mediator;
/**
 * 同事A
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午4:19:12
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
