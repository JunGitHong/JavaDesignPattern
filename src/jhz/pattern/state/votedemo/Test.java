package jhz.pattern.state.votedemo;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午4:03:55
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
	}

}
