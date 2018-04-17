package jhz.pattern.memento.historyonself;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午2:27:04
 */
public class Test {

	public static void main(String[] args) {
		Originator o = new Originator();
        //修改状态
        o.changeState("state 0");
        //创建备忘录
        IMemento memento = o.createMemento();
        //修改状态
        o.changeState("state 1");
        //按照备忘录恢复对象的状态
        o.restoreMemento(memento);
	}

}
