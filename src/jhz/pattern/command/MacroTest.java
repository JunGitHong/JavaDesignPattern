package jhz.pattern.command;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��12�� ����3:08:10
 */
public class MacroTest {
	
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		ICommand playCmd = new PlayCommand(audioPlayer);
		ICommand rewindCmd = new RewindCommand(audioPlayer);
		ICommand stopCmd = new StopCommand(audioPlayer);
		
		MacroCommand macroCmd = new MacroAudioCommand();
		macroCmd.add(playCmd);
		macroCmd.add(rewindCmd);
		macroCmd.add(stopCmd);
		
		macroCmd.execute();
	}
	
}
