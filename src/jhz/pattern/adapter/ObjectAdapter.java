package jhz.pattern.adapter;
/**
 * ����������ģʽ
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����2:38:01
 */
public class ObjectAdapter implements Target{
	
	public Adaptee adaptee;
	
	public ObjectAdapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	@Override
	public void needoperator() {
		System.out.println("���������");		
	}
	
	public void operator(){
		adaptee.operator();
	}

}
