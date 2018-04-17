package jhz.pattern.mediator;
/**
 * 抽象中介者
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午4:24:20
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
