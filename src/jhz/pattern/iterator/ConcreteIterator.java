package jhz.pattern.iterator;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午3:33:01
 */
public class ConcreteIterator implements Iterator {
	
	private ConcreteAggregate agg;
	
	private int index = 0;
	
	private int size = 0;
	
	public ConcreteIterator(ConcreteAggregate agg){
		this.agg = agg;
		this.size = agg.size();
		this.index = 0;
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		index = 0;
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		if(index < size){
			index++;
		}
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return (index == size);
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return agg.getElement(index);
	}

}
