package jhz.pattern.mediator;
/**
 * ����ͬ��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��13�� ����4:16:01
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
	
	//δʹ���н���ģʽ
//	public abstract void setNumber(int number,AbstractColleague coll);
	
	public abstract void setNumber(int number,AbstractMediator md);
}
