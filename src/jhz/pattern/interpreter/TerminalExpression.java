package jhz.pattern.interpreter;
/**
 * �ս�����ʽ
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��13�� ����2:37:36
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
