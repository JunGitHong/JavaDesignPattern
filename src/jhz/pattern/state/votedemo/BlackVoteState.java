package jhz.pattern.state.votedemo;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:03:01
 */
public class BlackVoteState implements IVoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//��¼�������У���ֹ��¼ϵͳ
        System.out.println("���������������ֹ��¼��ʹ�ñ�ϵͳ");
	}

}
