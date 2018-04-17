package jhz.pattern.responsibility;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����3:14:14
 */
public class ProjectManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String result = "";
		if(fee < 1000){
			if("zhj".equals(user)){
				result = "��Ŀ����ͬ��"+user+"����"+fee;
			}else{
				result = "�Բ�����Ŀ����ܾ����������룡";
			}
		}else{
			result = this.getSuccessor().handleFeeRequest(user, fee);
		}
		return result;
	}

}
