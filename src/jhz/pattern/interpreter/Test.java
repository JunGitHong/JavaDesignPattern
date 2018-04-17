package jhz.pattern.interpreter;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午2:49:47
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String context = "BF";
		
		Expression andExp = new AndExpression(new TerminalExpression("A"), new TerminalExpression("B"));
		System.out.println("A and B:"+andExp.interpret(context));
		
		Expression orExp = new OrExpression(new TerminalExpression("B"), new TerminalExpression("C"));
		System.out.println("B or C:"+orExp.interpret(context));
		
	}

}
