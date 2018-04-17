package jhz.pattern.responsibility;
/**
 * ��������
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��2�� ����3:10:54
 */
public abstract class Handler {
	/**
     * ������һ����������Ķ���
     */
    protected Handler successor = null;
    /**
     * ȡֵ����
     */
    public Handler getSuccessor() {
        return successor;
    }
    /**
     * ������һ����������Ķ���
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    /**
     * ����۲ͷ��õ�����
     * @param user    ������
     * @param fee    �����Ǯ��
     * @return        �ɹ���ʧ�ܵľ���֪ͨ
     */
    public abstract String handleFeeRequest(String user , double fee);
}
