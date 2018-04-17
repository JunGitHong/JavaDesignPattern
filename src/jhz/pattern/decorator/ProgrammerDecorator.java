package jhz.pattern.decorator;
/**
 * װ����
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����10:43:56
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
