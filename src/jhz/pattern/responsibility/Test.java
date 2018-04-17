package jhz.pattern.responsibility;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午3:24:11
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler pHandler = new ProjectManager();
		Handler dHandler = new DeptManager();
		Handler gHandler = new GeneralManager();
		
		pHandler.setSuccessor(dHandler);
		dHandler.setSuccessor(gHandler);
		
		String result = pHandler.handleFeeRequest("zhj", 800);
		System.out.println("A:"+result);
		result = pHandler.handleFeeRequest("zhj", 2000);
		System.out.println("B:"+result);
		result = pHandler.handleFeeRequest("zhj", 6000);
		System.out.println("C:"+result);
//		
		System.out.println("---------------------------------------------");
		
		result = pHandler.handleFeeRequest("zhj1", 800);
		System.out.println("D:"+result);
		result = pHandler.handleFeeRequest("zhj2", 2000);
		System.out.println("E:"+result);
		result = pHandler.handleFeeRequest("zhj3", 6000);
		System.out.println("F:"+result);
		
	}

}
