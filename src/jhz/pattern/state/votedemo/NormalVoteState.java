package jhz.pattern.state.votedemo;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:01:19
 */
public class NormalVoteState implements IVoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//����ͶƱ����¼��ͶƱ��¼��
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("��ϲͶƱ�ɹ�");
	}

}
