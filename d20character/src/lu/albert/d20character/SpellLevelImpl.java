package lu.albert.d20character;

import lu.albert.d20character.api.SpellLevel;

public class SpellLevelImpl implements SpellLevel {

	private int level;
	private int knownSpells;
	private int difficultyClass;
	private int spellsPerDay;
	private int bonusSpells;

	public SpellLevelImpl(int level, int knownSpells, int difficultyClass,
			int spellsPerDay, int bonusSpells) {
		this.level = level;
		this.knownSpells = knownSpells;
		this.difficultyClass = difficultyClass;
		this.spellsPerDay = spellsPerDay;
		this.bonusSpells = bonusSpells;
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public int getKnownSpells() {
		return knownSpells;
	}

	@Override
	public void setKnownSpells(int knownSpells) {
		this.knownSpells = knownSpells;
	}

	@Override
	public int getDifficultyClass() {
		return difficultyClass;
	}

	@Override
	public void setDifficultyClass(int difficultyClass) {
		this.difficultyClass = difficultyClass;
	}

	@Override
	public int getSpellsPerDay() {
		return spellsPerDay;
	}

	@Override
	public void setSpellsPerDay(int spellsPerDay) {
		this.spellsPerDay = spellsPerDay;
	}

	@Override
	public int getBonusSpells() {
		return bonusSpells;
	}

	@Override
	public void setBonusSpells(int bonusSpells) {
		this.bonusSpells = bonusSpells;
	}

}
