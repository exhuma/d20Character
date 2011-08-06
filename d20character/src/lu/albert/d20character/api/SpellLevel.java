package lu.albert.d20character.api;

public interface SpellLevel {

	public abstract void setBonusSpells(int bonusSpells);

	public abstract int getBonusSpells();

	public abstract void setSpellsPerDay(int spellsPerDay);

	public abstract int getSpellsPerDay();

	public abstract void setDifficultyClass(int difficultyClass);

	public abstract int getDifficultyClass();

	public abstract void setKnownSpells(int knownSpells);

	public abstract int getKnownSpells();

	public abstract void setLevel(int level);

	public abstract int getLevel();

}
