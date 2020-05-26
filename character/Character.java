package character;

import java.io.Serializable;

public class Character implements Serializable {
	private String name;
	private int hp;
	private int def;
	private int atk;
	private int cri;
	private int gold;
	boolean isDedad;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNmae() {
		return this.name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	public int getDef() {
		return this.def;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getAtk() {
		return this.atk;
	}
	public void setCri(int cri) {
		this.cri = cri;
	}
	
	public int getCri() {
		return this.cri;
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public int getGodl() {
		return this.gold;
	}

}