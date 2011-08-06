package lu.albert.d20character.api;

public interface ProtectiveItem {
	
	String getName();

	void setName(String name);

	String getType();

	void setType(String type);

	int getArmorClassBonus();

	void setArmorClassBonus(int armorClassBonus);

	int getMaxDexterity();

	void setMaxDexterity(int maxDexterity);

	int getCheckPenalty();

	void setCheckPenalty(int checkPenalty);

	int getSpellFailure();

	void setSpellFailure(int spellFailure);

	int getWeight();

	void setWeight(int weight);

	String getSpecialProperties();

	void setSpecialProperties(String specialProperties);

}
