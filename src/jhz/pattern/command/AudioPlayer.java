package jhz.pattern.command;
/**
 * 接收者
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月12日 上午11:49:04
 */
public class AudioPlayer {
	public void play()
	{
		System.out.println("播放");
	}
	
	public void rewind()
	{
		System.out.println("倒带");
	}
	
	public void stop(){
		System.out.println("停止");
	}
}
