package jhz.pattern.adapter;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午2:42:36
 */
public class Test {
	
	private static void testClassAdapter(){
		Target target = new ClassAdapter();
		target.needoperator();
	}
	
	private static void testObjectAdapter(){
		Target target = new ObjectAdapter(new Adaptee());
		target.needoperator();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testClassAdapter();
		System.out.println("==========================");
		testObjectAdapter();
	}

}
