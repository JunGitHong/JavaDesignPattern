package jhz.pattern.decorator;
/**
 * 具体装饰者
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 上午10:54:54
 */
public class PythonProgrammerDecorator extends ProgrammerDecorator {

	public PythonProgrammerDecorator(IProgrammer programmer) {
		super(programmer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useSkill() {
//		// TODO Auto-generated method stub
		super.useSkill();
		pythonSkill();
	}
	
	private void pythonSkill(){
		System.out.println("除了java,我还会python了。");
	}
	
	

}
