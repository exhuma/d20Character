package lu.albert.d20character;

import lu.albert.d20character.api.Weapon;

public class WeaponImpl implements Weapon {

	private int attackBonus;
	private String damage;
	private String critical;
	private int range;
	private DamageType type;
	private String notes;
	private String ammunitionType;
	private int ammunition;

	@Override
	public int getAttackBonus() {
		return attackBonus;
	}

	@Override
	public void setAttackBonus(int attackBonus) {
		this.attackBonus = attackBonus;
	}

	@Override
	public String getDamage() {
		return damage;
	}

	@Override
	public void setDamage(String damage) {
		this.damage = damage;
	}

	@Override
	public String getCritical() {
		return critical;
	}

	@Override
	public void setCritical(String critical) {
		this.critical = critical;
	}

	@Override
	public int getRange() {
		return range;
	}

	@Override
	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public DamageType getType() {
		return type;
	}

	@Override
	public void setType(DamageType type) {
		this.type = type;
	}

	@Override
	public String getNotes() {
		return notes;
	}

	@Override
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String getAmmunitionType() {
		return ammunitionType;
	}

	@Override
	public void setAmmunitionType(String ammunitionType) {
		this.ammunitionType = ammunitionType;
	}

	@Override
	public int getAmmunition() {
		return ammunition;
	}

	@Override
	public void setAmmunition(int ammunition) {
		this.ammunition = ammunition;
	}

}
