package jhz.pattern.memento.historyonself;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午2:23:21
 */
public class Originator {
	
	public String state;
	
	public void changeState(String state)
	{
		this.state = state;
		System.out.println("改变状态为："+state);
	}
	
	public Memento createMemento()
	{
		return new Memento(this);
	}
	
	public void restoreMemento(IMemento memento){
        Memento m = (Memento)memento;
        changeState(m.state);
    }	
	
	private class Memento implements IMemento{
        
        private String state;
        /**
         * 构造方法
         */
        private Memento(Originator o){
            this.state = o.state;
        }
        private String getState() {
            return state;
        }
        
    }

}
