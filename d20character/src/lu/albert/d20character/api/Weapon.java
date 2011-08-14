package lu.albert.d20character.api;

public interface Weapon {

	static enum DamageType {
		Slashing, Piercing, Bludgeoning
	}

	static enum WeaponClass {
		Simple, Martial, Exotic
	}

	static enum Type {
		Melee, Ranged
	}

	void setAmmunition(int ammunition);

	int getAmmunition();

	void setAmmunitionType(String ammunitionType);

	String getAmmunitionType();

	void setNotes(String notes);

	String getNotes();

	void setDamageType(DamageType type);

	DamageType getDamageType();

	void setRange(int range);

	int getRange();

	void setCritical(String critical);

	String getCritical();

	void setDamage(String damage);

	String getDamage();

	void setWeight(int weight);

	int getWeight();

	void setName(String name);

	String getName();

	WeaponClass getWeaponClass();

	void setWeaponClass(WeaponClass clazz);

	Type getType();
	
	void setType(Type type);

}
