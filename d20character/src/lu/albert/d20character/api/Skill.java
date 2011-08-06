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

	public abstract void setUntrained(boolean untrained);

	public abstract boolean isUntrained();

	public abstract void setPenaltyMultiplier(int penaltyMultiplier);

	public abstract int getPenaltyMultiplier();

}
