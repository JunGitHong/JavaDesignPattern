package jhz.pattern.mediator;
/**
 * 抽象同事
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午4:16:01
 */
public abstract class AbstractColleague {
	protected int number;
	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber()
	{
		return this.number;
	}
	
	//未使用中介者模式
//	public abstract void setNumber(int number,AbstractColleague coll);
	
	public abstract void setNumber(int number,AbstractMediator md);
}
