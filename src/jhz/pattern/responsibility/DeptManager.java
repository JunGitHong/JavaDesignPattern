package jhz.pattern.responsibility;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����3:15:32
 */
public class DeptManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String result = "";
		if(fee < 5000){
			if("zhj".equals(user)){
				result = "���ž���ͬ��"+user+"����"+fee;
			}else{
				result = "�Բ��𣬲��ž���ܾ����������룡";
			}
		}else{
			result = this.getSuccessor().handleFeeRequest(user, fee);
		}
		return result;
	}

}
