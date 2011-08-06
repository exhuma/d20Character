package lu.albert.d20character;

import lu.albert.d20character.api.Spell;

public class SpellImpl implements Spell {

	private String name;
	private int level;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public void setLevel(int level) {
		this.level = level;
	}

}
