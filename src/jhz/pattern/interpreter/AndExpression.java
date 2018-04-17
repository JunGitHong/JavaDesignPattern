package jhz.pattern.interpreter;
/**
 * 非终结符表达式
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午2:41:01
 */
public class AndExpression implements Expression {
	
	private Expression exp1 = null;
	private Expression exp2 = null;
	
	public AndExpression(Expression exp1,Expression exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return exp1.interpret(context) && exp2.interpret(context);
	}

}
