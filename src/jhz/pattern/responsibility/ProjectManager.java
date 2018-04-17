package jhz.pattern.responsibility;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 下午3:14:14
 */
public class ProjectManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String result = "";
		if(fee < 1000){
			if("zhj".equals(user)){
				result = "项目经理：同意"+user+"申请"+fee;
			}else{
				result = "对不起，项目经理拒绝了您的申请！";
			}
		}else{
			result = this.getSuccessor().handleFeeRequest(user, fee);
		}
		return result;
	}

}
