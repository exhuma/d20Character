package lu.albert.d20character;

import lu.albert.d20character.api.Skill;
import lu.albert.d20character.api.Character;

public class SkillImpl implements Skill {

	private String name;
	private Character.Ability keyAbility;
	private int ranks;
	private int miscModifier;
	private boolean untrained;
	private int penaltyMultiplier;

	/**
	 * Public constructor
	 * 
	 * @param name
	 *            The skill name
	 * @param ability
	 *            The key ability for this skill
	 * @param untrained
	 *            Whether this skill can be used untrained
	 * @param penaltyMultiplier
	 *            Multiply AC penalty this often (usually 0 or 1. 2 for 'swim')
	 */
	public SkillImpl(String name, Character.Ability ability, boolean untrained,
			int penaltyMultiplier) {
		this.name = name;
		this.keyAbility = ability;
		this.untrained = untrained;
		this.penaltyMultiplier = penaltyMultiplier;
		this.ranks = 0;
		this.miscModifier = 0;
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
	public Character.Ability getKeyAbility() {
		return keyAbility;
	}

	@Override
	public void setKeyAbility(Character.Ability keyAbility) {
		this.keyAbility = keyAbility;
	}

	@Override
	public int getRanks() {
		return ranks;
	}

	@Override
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}

	@Override
	public int getMiscModifier() {
		return miscModifier;
	}

	@Override
	public void setMiscModifier(int miscModifier) {
		this.miscModifier = miscModifier;
	}

	@Override
	public boolean isUntrained() {
		return untrained;
	}

	@Override
	public void setUntrained(boolean untrained) {
		this.untrained = untrained;
	}

	@Override
	public int getPenaltyMultiplier() {
		return penaltyMultiplier;
	}

	@Override
	public void setPenaltyMultiplier(int penaltyMultiplier) {
		this.penaltyMultiplier = penaltyMultiplier;
	}

}
