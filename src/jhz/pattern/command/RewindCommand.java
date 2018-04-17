package jhz.pattern.command;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月12日 下午1:59:04
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
