package jhz.pattern.observer;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午3:23:14
 */
public class WatcherTest {
	
	public static void main(String[] args) {
		//创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Watcher watcher = new Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");
	}

}
