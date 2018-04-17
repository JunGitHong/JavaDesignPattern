package jhz.pattern.iterator;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午3:38:43
 */
public class Test {

	public static void main(String[] args) {
		Object[] objArray = new Object[]{"a","b","c","d","e","f"};
		//创建聚合对象
		Aggregate agg = new ConcreteAggregate(objArray);
		//创建聚合对象迭代器
		Iterator iterator = agg.createIterator();
		while(!iterator.isDone()){
			Object obj = iterator.currentItem();
			System.out.println(obj.toString());
			iterator.next();
		}

	}

}
