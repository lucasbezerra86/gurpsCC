package entities;

public class Attributes extends Data {
	
	private int st = 10;
	private int stPoints;
	private int dx = 10;
	private int dxPoints;
	private int iq = 10;
	private int iqPoints;
	private int ht = 10;
	private int htPoints;
	private int hp = st;
	private int hpPoints;
	private int will = iq;
	private int willPoints;
	private int per = iq;
	private int perPoints;
	private int fat = ht;
	private int fatPoints;
	private int basicLift = st*2;
	private double basicSpeed = (ht+dx)/4;
	private int basicSpeedPoints;
	private int basicMove = (ht+dx)/4;
	private int basicMovePoints;
	private int encumbrance = basicLift;
	private int dodge = basicMove;
	private int reaction;
	private int unspentPoints;
	
	
	public void settingUnspentPoints() {
		this.unspentPoints = getPointTotal() - (stPoints + dxPoints + iqPoints + htPoints + hpPoints + willPoints + perPoints + fatPoints + basicSpeedPoints + basicMovePoints);
	}
	
	public int getSt() {
		return st;
	}
	public void setSt(int st) {
		this.st = st;
	}
	public int getStPoints() {
		return stPoints;
	}
	public void setStPoints(int stPoints) {
		this.stPoints = stPoints;
	}
	public int getDx() {
		return dx;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}
	public int getDxPoints() {
		return dxPoints;
	}
	public void setDxPoints(int dxPoints) {
		this.dxPoints = dxPoints;
	}
	public int getIq() {
		return iq;
	}
	public void setIq(int iq) {
		this.iq = iq;
	}
	public int getIqPoints() {
		return iqPoints;
	}
	public void setIqPoints(int iqPoints) {
		this.iqPoints = iqPoints;
	}
	public int getHt() {
		return ht;
	}
	public void setHt(int ht) {
		this.ht = ht;
	}
	public int getHtPoints() {
		return htPoints;
	}
	public void setHtPoints(int htPoints) {
		this.htPoints = htPoints;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHpPoints() {
		return hpPoints;
	}
	public void setHpPoints(int hpPoints) {
		this.hpPoints = hpPoints;
	}
	public int getWill() {
		return will;
	}
	public void setWill(int will) {
		this.will = will;
	}
	public int getWillPoints() {
		return willPoints;
	}
	public void setWillPoints(int willPoints) {
		this.willPoints = willPoints;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public int getPerPoints() {
		return perPoints;
	}
	public void setPerPoints(int perPoints) {
		this.perPoints = perPoints;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getFatPoints() {
		return fatPoints;
	}
	public void setFatPoints(int fatPoints) {
		this.fatPoints = fatPoints;
	}
	public int getBasicLift() {
		return basicLift;
	}
	public void setBasicLift(int basicLift) {
		this.basicLift = basicLift;
	}
	public double getBasicSpeed() {
		return basicSpeed;
	}
	public void setBasicSpeed(double basicSpeed) {
		this.basicSpeed = basicSpeed;
	}
	public int getBasicSpeedPoints() {
		return basicSpeedPoints;
	}
	public void setBasicSpeedPoints(int basicSpeedPoints) {
		this.basicSpeedPoints = basicSpeedPoints;
	}
	public int getBasicMove() {
		return basicMove;
	}
	public void setBasicMove(int basicMove) {
		this.basicMove = basicMove;
	}
	public int getBasicMovePoints() {
		return basicMovePoints;
	}
	public void setBasicMovePoints(int basicMovePoints) {
		this.basicMovePoints = basicMovePoints;
	}
	public int getEncumbrance() {
		return encumbrance;
	}
	public void setEncumbrance(int encumbrance) {
		this.encumbrance = encumbrance;
	}
	public int getDodge() {
		return dodge;
	}
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	public int getReaction() {
		return reaction;
	}
	public void setReaction(int reaction) {
		this.reaction = reaction;
	}
	public int getUnspentPoints() {
		return unspentPoints;
	}
	public void setUnspentPoints(int unspentPoints) {
		this.unspentPoints = unspentPoints;
	}
	
	
	
	
	

}
