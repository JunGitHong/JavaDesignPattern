package jhz.pattern.iterator;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午3:29:21
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
