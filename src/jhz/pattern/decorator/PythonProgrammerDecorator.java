package jhz.pattern.decorator;
/**
 * ����װ����
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����10:54:54
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
		System.out.println("����java,�һ���python�ˡ�");
	}
	
	

}
