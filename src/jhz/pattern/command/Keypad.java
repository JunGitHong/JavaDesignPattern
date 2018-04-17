package jhz.pattern.command;
/**
 * �����߽�ɫ
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��12�� ����2:06:52
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
