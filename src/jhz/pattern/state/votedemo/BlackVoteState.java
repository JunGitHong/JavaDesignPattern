package jhz.pattern.state.votedemo;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午4:03:01
 */
public class BlackVoteState implements IVoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
	}

}
