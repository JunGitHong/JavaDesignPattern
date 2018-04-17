package jhz.pattern.responsibility;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����3:16:18
 */
public class GeneralManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String result = "";
		if(fee >= 5000){
			if("zhj".equals(user)){
				result = "�ܾ���ͬ��"+user+"����"+fee;
			}else{
				result = "�Բ����ܾ���ܾ����������룡";
			}
		}else{
			result = this.getSuccessor().handleFeeRequest(user, fee);
		}
		return result;
	}

}
