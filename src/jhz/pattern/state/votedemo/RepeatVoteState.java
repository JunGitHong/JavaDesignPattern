package jhz.pattern.state.votedemo;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:01:58
 */
public class RepeatVoteState implements IVoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//�ظ�ͶƱ����ʱ��������
        System.out.println("�벻Ҫ�ظ�ͶƱ");
	}

}
