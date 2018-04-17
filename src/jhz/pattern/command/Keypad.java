package jhz.pattern.command;
/**
 * 请求者角色
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月12日 下午2:06:52
 */
public class Keypad {
	ICommand playCmd;
	ICommand rewindCmd;
	ICommand stopCmd;
	
	public void setPlayCmd(ICommand playCmd) {
		this.playCmd = playCmd;
	}
	public void setRewindCmd(ICommand rewindCmd) {
		this.rewindCmd = rewindCmd;
	}
	public void setStopCmd(ICommand stopCmd) {
		this.stopCmd = stopCmd;
	}
	
	public void play(){
		playCmd.execute();
	}
	
	public void rewind(){
		rewindCmd.execute();
	}
	
	public void stop(){
		stopCmd.execute();
	}
}
