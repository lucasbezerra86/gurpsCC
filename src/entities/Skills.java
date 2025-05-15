package entities;

public class Skills extends Attributes {
	private String skillName;
	private double skillPoints;
	private int nh;
	private int parry;
	private int block;
	
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public double getSkillPoints() {
		return skillPoints;
	}
	public void setSkillPoints(double skillPoints) {
		this.skillPoints = skillPoints;
	}
	public int getNh() {
		return nh;
	}
	public void setNh(int nh) {
		this.nh = nh;
	}
	public int getParry() {
		return parry;
	}
	public void setParry(int parry) {
		this.parry = parry;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	
	
	

}
