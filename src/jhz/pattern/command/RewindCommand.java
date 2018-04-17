package jhz.pattern.command;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��12�� ����1:59:04
 */
public class RewindCommand implements ICommand {
	
	AudioPlayer audioPlayer;
	
	public RewindCommand(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	@Override
	public void execute() {
		audioPlayer.rewind();
	}

}
