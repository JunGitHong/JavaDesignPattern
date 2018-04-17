package jhz.pattern.command;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��12�� ����1:59:22
 */
public class StopCommand implements ICommand {
	
	AudioPlayer audioPlayer;
	
	public StopCommand(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	@Override
	public void execute() {
		audioPlayer.stop();
	}

}