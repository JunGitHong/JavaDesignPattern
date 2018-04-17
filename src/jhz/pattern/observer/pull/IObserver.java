package jhz.pattern.observer.pull;
/**
 * 抽象观察者角色类
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午2:46:04
 */
public interface IObserver {
	public void update(Subject subject);
}
