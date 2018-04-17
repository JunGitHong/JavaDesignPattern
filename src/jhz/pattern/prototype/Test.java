package jhz.pattern.prototype;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午2:11:42
 */
public class Test {
	
	private Monkey monkey = new Monkey();
	    
    public void TestClone(){
        //克隆大圣本尊
        Monkey copyMonkey = (Monkey)monkey.clone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthDate());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
    }
    
    public void TestDeepClone() throws Exception{
        //克隆大圣本尊
        Monkey copyMonkey = (Monkey)monkey.deepClone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthDate());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
    }
	    
	public static void main(String[] args) {
		try{
			new Test().TestClone();
			System.out.println("==========================================================");
			new Test().TestDeepClone();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
