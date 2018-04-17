package jhz.pattern.state.votedemo;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月16日 下午4:01:58
 */
public class RepeatVoteState implements IVoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//重复投票，暂时不做处理
        System.out.println("请不要重复投票");
	}

}
