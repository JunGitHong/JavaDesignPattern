package jhz.pattern.strategy;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:41:38
 */
public interface MemberStrategy {
	 /**
     * ����ͼ��ļ۸�
     * @param booksPrice    ͼ���ԭ��
     * @return    ��������ۺ�ļ۸�
     */
    public double calcPrice(double booksPrice);
}
