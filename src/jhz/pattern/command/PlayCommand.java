package jhz.pattern.command;
/**
 * ���������ɫ��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��12�� ����1:55:47
 */
public class PlayCommand implements ICommand {
	
	AudioPlayer audioPlayer;
	
	public PlayCommand(AudioPlayer audioPlayer){
		this.audioPlayer = audioPlayer;
	}

	@Override
	public void execute() {
		audioPlayer.play();
	}

}
