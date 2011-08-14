package lu.albert.d20character;

import lu.albert.d20character.api.Weapon;

public class WeaponImpl implements Weapon {

	private String name;
	private String damage;
	private String critical;
	private int range;
	private DamageType damageType;
	private String notes;
	private String ammunitionType;
	private int ammunition;
	private int weight;
	private WeaponClass weaponClass;
	private Type type;

	public WeaponImpl(String name, String damage,
			String critical, int range, DamageType damageType, int weight, WeaponClass clazz, Type type) {
		this.name = name;
		this.damage = damage;
		this.critical = critical;
		this.range = range;
		this.damageType = damageType;
		this.weight = weight;
		this.weaponClass = clazz;
		this.type = type;
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
	public DamageType getDamageType() {
		return damageType;
	}

	@Override
	public void setDamageType(DamageType type) {
		this.damageType = type;
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

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public WeaponClass getWeaponClass() {
		return this.weaponClass;
	}

	@Override
	public void setWeaponClass(WeaponClass clazz) {
		this.weaponClass = clazz;
	}

	@Override
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public Type getType() {
		return this.type;
	}

}
