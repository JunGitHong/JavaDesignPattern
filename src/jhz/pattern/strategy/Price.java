package jhz.pattern.strategy;
/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��16�� ����4:43:39
 */
public class Price {
	//����һ������Ĳ��Զ���
    private MemberStrategy strategy;
    /**
     * ���캯��������һ������Ĳ��Զ���
     * @param strategy    ����Ĳ��Զ���
     */
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }
    
    /**
     * ����ͼ��ļ۸�
     * @param booksPrice    ͼ���ԭ��
     * @return    ��������ۺ�ļ۸�
     */
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}
