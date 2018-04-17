package jhz.pattern.command;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月12日 下午3:03:50
 */
public interface MacroCommand extends ICommand {
	
	public void add(ICommand cmd);
	
	public void remove(ICommand cmd);
}
