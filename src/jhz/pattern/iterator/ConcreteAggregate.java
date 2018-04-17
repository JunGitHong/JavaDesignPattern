package jhz.pattern.iterator;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��13�� ����3:29:21
 */
public class ConcreteAggregate extends Aggregate {
	
	private Object[] objArray = null;
	
	public ConcreteAggregate(Object[] objArray){
		this.objArray = objArray;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	public Object getElement(int size){
		if(size < objArray.length){
			return objArray[size];
		}
		return null;
	}
	
	public int size(){
		return objArray.length;
	}

}
