package jhz.pattern.decorator;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 上午10:59:56
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
