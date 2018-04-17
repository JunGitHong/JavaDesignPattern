package jhz.pattern.interpreter;
/**
 * ���ս�����ʽ
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��13�� ����2:40:39
 */
public class OrExpression implements Expression {
	
	private Expression exp1 = null;
	private Expression exp2 = null;
	
	public OrExpression(Expression exp1,Expression exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public boolean interpret(String context) {
		return exp1.interpret(context) || exp2.interpret(context);
	}

}
