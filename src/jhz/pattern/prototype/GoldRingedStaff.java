package jhz.pattern.prototype;

import java.io.Serializable;

/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午2:06:37
 */
public class GoldRingedStaff implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float height = 100.0f;
    private float diameter = 10.0f;
    /**
     * 增长行为，每次调用长度和半径增加一倍
     */
    public void grow(){
        this.diameter *= 2;
        this.height *= 2;
    }
    /**
     * 缩小行为，每次调用长度和半径减少一半
     */
    public void shrink(){
        this.diameter /= 2;
        this.height /= 2;
    }

}
