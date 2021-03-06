package lu.albert.d20character.api;

import java.util.List;

public interface Character {

	static enum Ability {
		Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma
	}

	static enum Gender {
		Male, Female
	}

	static enum Size {
		Fine, Diminutive, Tiny, Small, Medium, Large, Huge, Gargantuan, Collossal
	}

	static enum Alignment {
		LawfulEvil, LawfulNeutral, LawfulGood, NeutreEvil, TrueNeutral, NeutralGood, ChaoticEvil, ChaoticNeutral, ChaoticGood
	}

	static enum DamageType {
		Lethal, Nonlethal
	}

	static enum Load {
		Light, Medium, Heavy
	}

	String getName();

	void setName(String name);

	List<String> getClasses();

	void setClasses(List<String> classes);

	Size getSize();

	void setSize(Size size);

	int getHeight();

	void setHeight(int height);

	int getAge();

	void setAge(int age);

	Gender getGender();

	void setGender(Gender gender);

	String getPlayerName();

	void setPlayerName(String playerName);

	String getRace();

	void setRace(String race);

	Alignment getAlignment();

	void setAlignment(Alignment alignment);

	String getDeity();

	void setDeity(String deity);

	int getWeight();

	void setWeight(int weight);

	String getEyes();

	void setEyes(String eyes);

	String getHair();

	void setHair(String hair);

	String getSkin();

	void setSkin(String skin);

	int getStrength();

	void setStrength(int strength);

	int getDexterity();

	void setDexterity(int dexterity);

	int getConstitution();

	void setConstitution(int constitution);

	int getIntelligence();

	void setIntelligence(int intelligence);

	int getWisdom();

	void setWisdom(int wisdom);

	int getCharisma();

	void setCharisma(int charisma);

	int getTmpStrength();

	void setTmpStrength(int tmpStrength);

	int getTmpDexterity();

	void setTmpDexterity(int tmpDexterity);

	int getTmpConstitution();

	void setTmpConstitution(int tmpConstitution);

	int getTmpIntelligence();

	void setTmpIntelligence(int tmpIntelligence);

	int getTmpWisdom();

	void setTmpWisdom(int tmpWisdom);

	int getTmpCharisma();

	void setTmpCharisma(int tmpCharisma);

	int getHitPoints();

	void setHitPoints(int hitPoints);

	int getDamage();

	void setDamage(int damage);

	int getNonlethalDamage();

	void setNonlethalDamage(int nonlethalDamage);

	int getSpeed();

	void setSpeed(int speed);

	int getNaturalArmor();

	void setNaturalArmor(int naturalArmor);

	int getMiscArmor();

	void setMiscArmor(int miscArmor);

	String getDamageReduction();

	void setDamageReduction(String damageReduction);

	int getMiscInitiative();

	void setMiscInitiative(int miscInitiative);

	int getBaseFortitudeSave();

	void setBaseFortitudeSave(int baseFortitudeSave);

	int getBaseWillSave();

	void setBaseWillSave(int baseWillSave);

	int getBaseReflexSave();

	void setBaseReflexSave(int baseReflexSave);

	int getMiscFortitudeSave();

	void setMiscFortitudeSave(int miscFortitudeSave);

	int getMiscWillSave();

	void setMiscWillSave(int miscWillSave);

	int getMiscReflexSave();

	void setMiscReflexSave(int miscReflexSave);

	int getMagicFortitudeSave();

	void setMagicFortitudeSave(int magicFortitudeSave);

	int getMagicWillSave();

	void setMagicWillSave(int magicWillSave);

	int getMagicReflexSave();

	void setMagicReflexSave(int magicReflexSave);

	int getTmpFortitudeSave();

	void setTmpFortitudeSave(int tmpFortitudeSave);

	int getTmpWillSave();

	void setTmpWillSave(int tmpWillSave);

	int getTmpReflexSave();

	void setTmpReflexSave(int tmpReflexSave);

	String getConditionalSavingThrows();

	void setConditionalSavingThrows(String conditionalSavingThrows);

	int getBaseAttackBonus();

	void setBaseAttackBonus(int baseAttackBonus);

	int getSpellResistance();

	void setSpellResistance(int spellResistance);

	int getMiscGrappleModifier();

	void setMiscGrappleModifier(int miscGrappleModifier);

	List<Weapon> getWeapons();

	void setWeapons(List<Weapon> weapons);

	List<ProtectiveItem> getArmor();

	void setArmor(List<ProtectiveItem> armor);

	List<Skill> getSkills();

	void setSkills(List<Skill> skills);

	String getCampaignName();

	void setCampaignName(String campaignName);

	int getExperience();

	void setExperience(int experience);

	List<Item> getPossessions();

	void setPossessions(List<Item> possessions);

	int getCopperPieces();

	void setCopperPieces(int copperPieces);

	int getSilverPieces();

	void setSilverPieces(int silverPieces);

	int getGoldPieces();

	void setGoldPieces(int goldPieces);

	int getPlatinumPieces();

	void setPlatinumPieces(int platinumPieces);

	List<String> getFeats();

	void setFeats(List<String> feats);

	List<String> getSpecialAbilitites();

	void setSpecialAbilitites(List<String> specialAbilitites);

	List<String> getLanguages();

	void setLanguages(List<String> languages);

	int getSpellSave();

	void setSpellSave(int spellSave);

	int getArcaneSpellFailure();

	String getConditionalArcaneSpellFailure();

	void setConditionalArcaneSpellFailure(String conditionalArcaneSpellFailure);

	List<Spell> getSpells();

	void setSpells(List<Spell> spells);

	void setSpellLevels(List<SpellLevel> spellLevels);

	List<SpellLevel> getSpellLevels();

	/**
	 * Calculate the current hitpoints including temporary HP, damage, ...
	 * 
	 * @return the current HP value
	 */
	int getCurrentHitpoints();

	/**
	 * Add lethal damage to the character
	 * 
	 * @param damage
	 *            Damage point to add
	 */
	void addDamage(int damage);

	/**
	 * Add either lethal or non-lethal damage to the character
	 * 
	 * @param damage
	 *            The value to add
	 * @param type
	 *            the damage type
	 */
	void addDamage(int damage, DamageType type);

	/**
	 * Remove (heal) lethal damage from the character
	 * 
	 * @param damage
	 *            the value to remove
	 */
	void removeDamage(int damage);

	/**
	 * Remove (heal) lethal or non-lethal damage from the character
	 * 
	 * @param damage
	 *            the value to remove
	 * @param type
	 *            the damage type
	 */
	void removeDamage(int damage, DamageType type);

	/**
	 * Returns the current total armor class
	 * 
	 * @return
	 */
	int getTotalArmorClass();

	/**
	 * Returns the modifier for the given ability
	 * 
	 * @param ability
	 *            The ability
	 * @return
	 */
	int getAbilityModifier(Ability ability);

	/**
	 * Returns the modifier for the given ability (including temporary score)
	 * 
	 * @param ability
	 *            The ability
	 * @return
	 */
	int getTmpAbilityModifier(Ability ability);

	/**
	 * Returns the current skill modifier for this character
	 * 
	 * @param skill
	 *            The skill
	 * @return The modifier
	 */
	int getSkillModifier(Skill skill);

	/**
	 * Return the named ability score
	 * 
	 * @param ability
	 *            The ability
	 * @return The score
	 */
	int getAbilityScore(Ability ability);

	/**
	 * Return the named temporary ability score
	 * 
	 * @param ability
	 *            The ability
	 * @return The score
	 */
	int getTmpAbilityScore(Ability ability);

	/**
	 * Sets the named ability score
	 * 
	 * @param ability
	 *            The ability
	 * @param value
	 *            the new value
	 */
	void setAbilityScore(Ability ability, int value);

	/**
	 * Sets the named temporary ability score modifier
	 * 
	 * @param ability
	 *            The ability
	 * @param value
	 *            the new value
	 */
	void setTmpAbilityScore(Ability ability, int value);

	/**
	 * How much can the character carry?
	 * 
	 * @param load
	 *            The load type
	 * @return A min/max value for loads
	 */
	List<Integer> getLoad(Load load);

	/**
	 * Returns the total weight carried
	 * 
	 * @return
	 */
	int getTotalWeight();

	/**
	 * The initiative
	 * 
	 * @return
	 */
	int getInitiative();

	/**
	 * Flat footed armor class (AC without bonus granted by dexterity)
	 * 
	 * @return
	 */
	int getFlatFootedAC();

	/**
	 * Touch armor class (AC without bonus granted by armor)
	 * 
	 * @return
	 */
	int getTouchAC();

	/**
	 * The temporary hitpoints
	 * 
	 * @return
	 */
	int getTmpHitpoints();

	/**
	 * Sets the temp. hitpoints
	 * 
	 * @param value
	 */
	void setTmpHitpoints(int value);

	/**
	 * Remove (heal) all lethal damage from the character
	 */
	void removeAllDamage();

	/**
	 * Remove (heal) all lethal or non-lethal damage from the character
	 * 
	 * @param type
	 *            the damage type
	 */
	void removeAllDamage(DamageType type);

	/**
	 * Adds temporary hitpoints
	 * 
	 * @param value
	 */
	void addTmpHp(int value);

	/**
	 * Removes temporary hitpoints
	 * 
	 * @param value
	 */
	void removeTmpHp(int value);

	/**
	 * Resets temporary hitpoints to 0
	 */
	void removeAllTmpHp();

	int getFortitudeSave();

	int getReflexSave();

	int getWillSave();

	/**
	 * Returns the attack bonus while wielding a specific weapon
	 * 
	 * @param weapon
	 *            The weapon
	 * @return the Attack bonus
	 */
	int getAttackBonus(Weapon weapon);

	/**
	 * Return a modifier for an arbitrary value
	 * 
	 * @param score
	 *            The ability score
	 * @return the modifier
	 */
	int getAbilityModifier(int score);

}
