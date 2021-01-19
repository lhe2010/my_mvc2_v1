// 2021-01-18 23:00-23:17
package _01_login.dto;

public class MemberDTO {
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String email;
	private String field;	// 지원분야(web-publishing, front-end, web-debeloper)
	private String skill;	// 기술능력(html,css,javascript,java,jsp,spring)
	private String major;	// 전공(컴공/전기공/기공/산공)
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + ", email=" + email
				+ ", field=" + field + ", skill=" + skill + ", major=" + major + "]";
	}
	
}
