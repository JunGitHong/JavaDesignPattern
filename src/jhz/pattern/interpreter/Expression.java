package jhz.pattern.interpreter;
/**
 * 抽象表达式角色
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午2:34:25
 */
public interface Expression {
	 public boolean interpret(String context);
}
