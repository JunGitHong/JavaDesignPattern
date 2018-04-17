package jhz.pattern.decorator;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 上午11:23:35
 */
public class GoProgrammerDecorator extends ProgrammerDecorator {

	public GoProgrammerDecorator(IProgrammer programmer) {
		super(programmer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useSkill() {
		// TODO Auto-generated method stub
		super.useSkill();
		goSkill();
	}
	
	private void goSkill(){
		System.out.println("我会go了。");
	}

}
