package jhz.pattern.state.votedemo;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����3:58:45
 */
public interface IVoteState {
	 /**
     * ����״̬��Ӧ����Ϊ
     * @param user    ͶƱ��
     * @param voteItem    ͶƱ��
     * @param voteManager    ͶƱ�����ģ�������ʵ��״̬��Ӧ�Ĺ��ܴ����ʱ��
     *                         ���Իص������ĵ�����
     */
    public void vote(String user,String voteItem,VoteManager voteManager);
}
