package jhz.pattern.prototype;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����2:11:42
 */
public class Test {
	
	private Monkey monkey = new Monkey();
	    
    public void TestClone(){
        //��¡��ʥ����
        Monkey copyMonkey = (Monkey)monkey.clone();
        System.out.println("��ʥ����������ǣ�" + monkey.getBirthDate());
        System.out.println("��¡�Ĵ�ʥ�������ǣ�" + monkey.getBirthDate());
        System.out.println("��ʥ�������¡�Ĵ�ʥ�Ƿ�Ϊͬһ������ " + (monkey == copyMonkey));
        System.out.println("��ʥ������еĽ𹿰� �� ��¡�Ĵ�ʥ���еĽ𹿰��Ƿ�Ϊͬһ������ " + (monkey.getStaff() == copyMonkey.getStaff()));
    }
    
    public void TestDeepClone() throws Exception{
        //��¡��ʥ����
        Monkey copyMonkey = (Monkey)monkey.deepClone();
        System.out.println("��ʥ����������ǣ�" + monkey.getBirthDate());
        System.out.println("��¡�Ĵ�ʥ�������ǣ�" + monkey.getBirthDate());
        System.out.println("��ʥ�������¡�Ĵ�ʥ�Ƿ�Ϊͬһ������ " + (monkey == copyMonkey));
        System.out.println("��ʥ������еĽ𹿰� �� ��¡�Ĵ�ʥ���еĽ𹿰��Ƿ�Ϊͬһ������ " + (monkey.getStaff() == copyMonkey.getStaff()));
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
