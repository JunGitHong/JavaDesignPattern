package jhz.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��12�� ����3:05:34
 */
public class MacroAudioCommand implements MacroCommand {
	List<ICommand> cmdList = new ArrayList<ICommand>();

	@Override
	public void execute() {
		for(ICommand cmd : cmdList){
			cmd.execute();
		}
	}

	@Override
	public void add(ICommand cmd) {
		cmdList.add(cmd);
	}

	@Override
	public void remove(ICommand cmd) {
		cmdList.remove(cmd);
	}

}
