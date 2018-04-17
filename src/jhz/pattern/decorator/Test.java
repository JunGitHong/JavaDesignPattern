package jhz.pattern.decorator;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����10:59:56
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProgrammer programmer = new Programmer();
		
		IProgrammer programmerPy = new PythonProgrammerDecorator(programmer);
		
		IProgrammer programmerGo = new GoProgrammerDecorator(programmerPy);
		
		programmerGo.useSkill();
	}

}
