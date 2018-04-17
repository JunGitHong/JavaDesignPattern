package jhz.pattern.command;
/**
 * 具体命令角色类
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月12日 下午1:55:47
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
