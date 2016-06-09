package Task;

public class CoorporativeAccount extends Account {
public CoorporativeAccount(int sum) {
		super(sum);
		// TODO Auto-generated constructor stub
	}
public CoorporativeAccount(int sum, String nameComp, String bulStat) {
	super(sum);
	this.nameComp = nameComp;
	this.bulStat = bulStat;
}
public String getNameComp() {
	return nameComp;
}
public void setNameComp(String nameComp) {
	this.nameComp = nameComp;
}
public String getBulStat() {
	return bulStat;
}
public void setBulStat(String bulStat) {
	this.bulStat = bulStat;
}
private String nameComp;
private String bulStat;
}
