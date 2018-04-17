package jhz.pattern.adapter;
/**
 * 对象适配器模式
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午2:38:01
 */
public class ObjectAdapter implements Target{
	
	public Adaptee adaptee;
	
	public ObjectAdapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	@Override
	public void needoperator() {
		System.out.println("特殊操作！");		
	}
	
	public void operator(){
		adaptee.operator();
	}

}
