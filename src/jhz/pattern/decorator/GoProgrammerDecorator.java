package jhz.pattern.decorator;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����11:23:35
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
		System.out.println("�һ�go�ˡ�");
	}

}
