package jhz.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月12日 下午3:05:34
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
