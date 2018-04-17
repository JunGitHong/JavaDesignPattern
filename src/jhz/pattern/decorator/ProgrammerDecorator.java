package jhz.pattern.decorator;
/**
 * 装饰者
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 上午10:43:56
 */
public abstract class ProgrammerDecorator implements IProgrammer {
	
	public IProgrammer programmer;
	
	public ProgrammerDecorator(IProgrammer programmer)
	{
		this.programmer = programmer;
	}

	@Override
	public void useSkill() {
		// TODO Auto-generated method stub
		programmer.useSkill();
	}

}
