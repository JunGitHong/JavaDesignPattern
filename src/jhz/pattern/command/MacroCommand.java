package jhz.pattern.command;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��12�� ����3:03:50
 */
public interface MacroCommand extends ICommand {
	
	public void add(ICommand cmd);
	
	public void remove(ICommand cmd);
}
