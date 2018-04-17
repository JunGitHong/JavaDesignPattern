package jhz.pattern.observer.pull;
/**
 * 具体主题角色类
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午2:54:37
 */
public class ConcreteSubject extends Subject {
	
	 private String state;
	    
    public String getState() {
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("主题状态为：" + state);
        //状态发生改变，通知各个观察者
        this.notifyObservers();
    }

}
