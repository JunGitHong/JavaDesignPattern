package jhz.pattern.interpreter;
/**
 * 终结符表达式
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午2:37:36
 */
public class TerminalExpression implements Expression {
	
	public String data;
	
	public TerminalExpression(String data){
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		if(context.contains(data)){
			return true;
		}
		return false;
	}
	
	
	
}
