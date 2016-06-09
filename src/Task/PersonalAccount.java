package Task;

public class PersonalAccount extends Account {
public PersonalAccount(int sum) {
		super(sum);
		// TODO Auto-generated constructor stub
	}
public PersonalAccount(int sum, String name, String egn) {
	super(sum);
	this.name = name;
	this.egn = egn;
}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEgn() {
		return egn;
	}
	public void setEgn(String egn) {
		this.egn = egn;
	}
private String name;
private String egn;
}
