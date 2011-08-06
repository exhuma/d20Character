package lu.albert.d20character.api;

public interface Weapon {

	static enum DamageType {
		Slashing,
		Piercing,
		Bludgeoning
	}

	void setAmmunition(int ammunition);

	int getAmmunition();

	void setAmmunitionType(String ammunitionType);

	String getAmmunitionType();

	void setNotes(String notes);

	String getNotes();

	void setType(DamageType type);

	DamageType getType();

	void setRange(int range);

	int getRange();

	void setCritical(String critical);

	String getCritical();

	void setDamage(String damage);

	String getDamage();

	void setAttackBonus(int attackBonus);

	int getAttackBonus();
	
}
