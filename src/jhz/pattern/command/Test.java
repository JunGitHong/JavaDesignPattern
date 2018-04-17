package jhz.pattern.command;
/**
 * �ͻ���ɫ��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��12�� ����2:21:11
 */
public class Test {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		ICommand playCmd = new PlayCommand(audioPlayer);
		ICommand rewindCmd = new RewindCommand(audioPlayer);
		ICommand stopCmd = new StopCommand(audioPlayer);
		
		Keypad keypad = new Keypad();
		keypad.setPlayCmd(playCmd);
		keypad.setRewindCmd(rewindCmd);
		keypad.setStopCmd(stopCmd);
		
		keypad.play();
		keypad.rewind();
		keypad.stop();
		
	}

}
