package lu.albert.d20character;

import lu.albert.d20character.api.Skill;
import lu.albert.d20character.api.Character;

public class SkillImpl implements Skill {

	private String name;
	private Character.Ability keyAbility;
	private int ranks;
	private int miscModifier;

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

}
