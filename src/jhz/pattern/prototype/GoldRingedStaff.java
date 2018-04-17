package jhz.pattern.prototype;

import java.io.Serializable;

/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����2:06:37
 */
public class GoldRingedStaff implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float height = 100.0f;
    private float diameter = 10.0f;
    /**
     * ������Ϊ��ÿ�ε��ó��ȺͰ뾶����һ��
     */
    public void grow(){
        this.diameter *= 2;
        this.height *= 2;
    }
    /**
     * ��С��Ϊ��ÿ�ε��ó��ȺͰ뾶����һ��
     */
    public void shrink(){
        this.diameter /= 2;
        this.height /= 2;
    }

}
