package jhz.pattern.state.votedemo;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:03:55
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
