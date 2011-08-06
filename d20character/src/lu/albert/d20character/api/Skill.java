package lu.albert.d20character.api;

public interface Skill {

	String getName();

	void setName(String name);

	Character.Ability getKeyAbility();

	void setKeyAbility(Character.Ability keyAbility);

	int getRanks();

	void setRanks(int ranks);

	int getMiscModifier();

	void setMiscModifier(int miscModifier);

}
