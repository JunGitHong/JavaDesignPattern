package jhz.pattern.iterator;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��13�� ����3:38:43
 */
public class Test {

	public static void main(String[] args) {
		Object[] objArray = new Object[]{"a","b","c","d","e","f"};
		//�����ۺ϶���
		Aggregate agg = new ConcreteAggregate(objArray);
		//�����ۺ϶��������
		Iterator iterator = agg.createIterator();
		while(!iterator.isDone()){
			Object obj = iterator.currentItem();
			System.out.println(obj.toString());
			iterator.next();
		}

	}

}
