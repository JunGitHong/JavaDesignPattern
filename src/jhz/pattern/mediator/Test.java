package jhz.pattern.mediator;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午4:33:26
 */
public class Test {

	public static void main(String[] args) {
		testMediator();
	}
	
//	public static void testNoMediator(){
//		AbstractColleague collA = new ColleagueA();
//		AbstractColleague collB = new ColleagueB();
//		
//		collA.setNumber(100,collB);
//		System.out.println("A number="+collA.getNumber());
//		System.out.println("B number="+collB.getNumber());
//		
//		System.out.println("========================================");
//		
//		collB.setNumber(300,collA);
//		System.out.println("A number="+collA.getNumber());
//		System.out.println("B number="+collB.getNumber());
//	}
	
	public static void testMediator()
	{
		AbstractColleague collA = new ColleagueA();
		AbstractColleague collB = new ColleagueB();
		AbstractMediator mediator = new ConcreteMediator(collA, collB);
		
		collA.setNumber(100,mediator);
		System.out.println("A number="+collA.getNumber());
		System.out.println("B number="+collB.getNumber());
		
		System.out.println("========================================");
		
		collB.setNumber(300,mediator);
		System.out.println("A number="+collA.getNumber());
		System.out.println("B number="+collB.getNumber());
	}

}
