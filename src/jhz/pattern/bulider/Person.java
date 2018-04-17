package jhz.pattern.bulider;
/**
 * 产品（Product）角色：产品便是建造中的复杂对象。一般来说，一个系统中会有多于一个的产品类，而且这些产品类并不一定有共同的接口，而完全可以是不相关联的。
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午1:16:06
 */
public class Person {
	private String head;
	private String body;
	private String foot;
	
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFoot() {
		return foot;
	}
	public void setFoot(String foot) {
		this.foot = foot;
	}
}
