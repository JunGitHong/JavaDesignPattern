package jhz.pattern.mediator;
/**
 * �����н���
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��13�� ����4:24:20
 */
public abstract class AbstractMediator {
	
	protected AbstractColleague collA;
	protected AbstractColleague collB;	
	
	public AbstractMediator(AbstractColleague collA,AbstractColleague collB){
		this.collA = collA;
		this.collB = collB;
	}
	
	public abstract void AaffectB();  
	public abstract void BaffectA();  

}
