package jhz.pattern.observer;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����3:23:14
 */
public class WatcherTest {
	
	public static void main(String[] args) {
		//�������۲��߶���
        Watched watched = new Watched();
        //�����۲��߶��󣬲������۲��߶���Ǽ�
        Watcher watcher = new Watcher(watched);
        //�����۲���״̬��ֵ
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");
	}

}
