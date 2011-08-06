package lu.albert.d20character;

import java.util.List;

import lu.albert.d20character.api.Character;
import lu.albert.d20character.api.Item;
import lu.albert.d20character.api.ProtectiveItem;
import lu.albert.d20character.api.Skill;
import lu.albert.d20character.api.Spell;
import lu.albert.d20character.api.SpellLevel;
import lu.albert.d20character.api.Weapon;

public class CharacterImpl implements Character {

	private String name;

	/* Classes added each level. Implicitly defines character level */
	private List<String> classes;

	private Size size = Size.Medium;
	private int height;
	private int age;
	private Gender gender;

	private String playerName;
	private String race;
	private Alignment alignment;
	private String deity;
	private int weight;
	private String eyes;
	private String hair;
	private String skin;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	private int tmpStrength;
	private int tmpDexterity;
	private int tmpConstitution;
	private int tmpIntelligence;
	private int tmpWisdom;
	private int tmpCharisma;

	private int hitPoints;
	private int damage;
	private int nonlethalDamage;
	private int speed;
	private int naturalArmor;
	private int miscArmor;
	private String damageReduction;

	private int miscInitiative;

	private int baseFortitudeSave;
	private int baseWillSave;
	private int baseReflexSave;
	private int miscFortitudeSave;
	private int miscWillSave;
	private int miscReflexSave;
	private int magicFortitudeSave;
	private int magicWillSave;
	private int magicReflexSave;
	private int tmpFortitudeSave;
	private int tmpWillSave;
	private int tmpReflexSave;
	private String conditionalSavingThrows;

	private int baseAttackBonus;
	private int spellResistance;

	private int miscGrappleModifier;

	private List<Weapon> weapons;
	private List<ProtectiveItem> armor;
	private List<Skill> skills;

	private String campaignName;
	private int experience;

	private List<Item> possessions;

	private int copperPieces;
	private int silverPieces;
	private int goldPieces;
	private int platinumPieces;

	private List<String> feats;
	private List<String> specialAbilitites;
	private List<String> languages;

	private int spellSave;
	private int arcaneSpellFailure;
	private String conditionalArcaneSpellFailure;

	private List<SpellLevel> spellLevels;

	private List<Spell> spells;

	/**
	 * Return a modifier for an integer value
	 * 
	 * @param value
	 *            The input value
	 * @return The modifier
	 */
	private int modifier(int value) {
		return (int) Math.floor((value - 10) / 2);
	}
	
	/**
	 * Default no-args constructor
	 */
	public CharacterImpl() {
		this.size = Size.Medium;
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
	public List<String> getClasses() {
		return classes;
	}

	@Override
	public void setClasses(List<String> classes) {
		this.classes = classes;
	}

	@Override
	public Size getSize() {
		return size;
	}

	@Override
	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Gender getGender() {
		return gender;
	}

	@Override
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String getPlayerName() {
		return playerName;
	}

	@Override
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String getRace() {
		return race;
	}

	@Override
	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public Alignment getAlignment() {
		return alignment;
	}

	@Override
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	@Override
	public String getDeity() {
		return deity;
	}

	@Override
	public void setDeity(String deity) {
		this.deity = deity;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String getEyes() {
		return eyes;
	}

	@Override
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	@Override
	public String getHair() {
		return hair;
	}

	@Override
	public void setHair(String hair) {
		this.hair = hair;
	}

	@Override
	public String getSkin() {
		return skin;
	}

	@Override
	public void setSkin(String skin) {
		this.skin = skin;
	}

	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public int getDexterity() {
		return dexterity;
	}

	@Override
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	@Override
	public int getConstitution() {
		return constitution;
	}

	@Override
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	@Override
	public int getIntelligence() {
		return intelligence;
	}

	@Override
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	@Override
	public int getWisdom() {
		return wisdom;
	}

	@Override
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	@Override
	public int getCharisma() {
		return charisma;
	}

	@Override
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	@Override
	public int getTmpStrength() {
		return tmpStrength;
	}

	@Override
	public void setTmpStrength(int tmpStrength) {
		this.tmpStrength = tmpStrength;
	}

	@Override
	public int getTmpDexterity() {
		return tmpDexterity;
	}

	@Override
	public void setTmpDexterity(int tmpDexterity) {
		this.tmpDexterity = tmpDexterity;
	}

	@Override
	public int getTmpConstitution() {
		return tmpConstitution;
	}

	@Override
	public void setTmpConstitution(int tmpConstitution) {
		this.tmpConstitution = tmpConstitution;
	}

	@Override
	public int getTmpIntelligence() {
		return tmpIntelligence;
	}

	@Override
	public void setTmpIntelligence(int tmpIntelligence) {
		this.tmpIntelligence = tmpIntelligence;
	}

	@Override
	public int getTmpWisdom() {
		return tmpWisdom;
	}

	@Override
	public void setTmpWisdom(int tmpWisdom) {
		this.tmpWisdom = tmpWisdom;
	}

	@Override
	public int getTmpCharisma() {
		return tmpCharisma;
	}

	@Override
	public void setTmpCharisma(int tmpCharisma) {
		this.tmpCharisma = tmpCharisma;
	}

	@Override
	public int getHitPoints() {
		return hitPoints;
	}

	@Override
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	@Override
	public int getDamage() {
		return damage;
	}

	@Override
	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public int getNonlethalDamage() {
		return nonlethalDamage;
	}

	@Override
	public void setNonlethalDamage(int nonlethalDamage) {
		this.nonlethalDamage = nonlethalDamage;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int getNaturalArmor() {
		return naturalArmor;
	}

	@Override
	public void setNaturalArmor(int naturalArmor) {
		this.naturalArmor = naturalArmor;
	}

	@Override
	public int getMiscArmor() {
		return miscArmor;
	}

	@Override
	public void setMiscArmor(int miscArmor) {
		this.miscArmor = miscArmor;
	}

	@Override
	public String getDamageReduction() {
		return damageReduction;
	}

	@Override
	public void setDamageReduction(String damageReduction) {
		this.damageReduction = damageReduction;
	}

	@Override
	public int getMiscInitiative() {
		return miscInitiative;
	}

	@Override
	public void setMiscInitiative(int miscInitiative) {
		this.miscInitiative = miscInitiative;
	}

	@Override
	public int getBaseFortitudeSave() {
		return baseFortitudeSave;
	}

	@Override
	public void setBaseFortitudeSave(int baseFortitudeSave) {
		this.baseFortitudeSave = baseFortitudeSave;
	}

	@Override
	public int getBaseWillSave() {
		return baseWillSave;
	}

	@Override
	public void setBaseWillSave(int baseWillSave) {
		this.baseWillSave = baseWillSave;
	}

	@Override
	public int getBaseReflexSave() {
		return baseReflexSave;
	}

	@Override
	public void setBaseReflexSave(int baseReflexSave) {
		this.baseReflexSave = baseReflexSave;
	}

	@Override
	public int getMiscFortitudeSave() {
		return miscFortitudeSave;
	}

	@Override
	public void setMiscFortitudeSave(int miscFortitudeSave) {
		this.miscFortitudeSave = miscFortitudeSave;
	}

	@Override
	public int getMiscWillSave() {
		return miscWillSave;
	}

	@Override
	public void setMiscWillSave(int miscWillSave) {
		this.miscWillSave = miscWillSave;
	}

	@Override
	public int getMiscReflexSave() {
		return miscReflexSave;
	}

	@Override
	public void setMiscReflexSave(int miscReflexSave) {
		this.miscReflexSave = miscReflexSave;
	}

	@Override
	public int getMagicFortitudeSave() {
		return magicFortitudeSave;
	}

	@Override
	public void setMagicFortitudeSave(int magicFortitudeSave) {
		this.magicFortitudeSave = magicFortitudeSave;
	}

	@Override
	public int getMagicWillSave() {
		return magicWillSave;
	}

	@Override
	public void setMagicWillSave(int magicWillSave) {
		this.magicWillSave = magicWillSave;
	}

	@Override
	public int getMagicReflexSave() {
		return magicReflexSave;
	}

	@Override
	public void setMagicReflexSave(int magicReflexSave) {
		this.magicReflexSave = magicReflexSave;
	}

	@Override
	public int getTmpFortitudeSave() {
		return tmpFortitudeSave;
	}

	@Override
	public void setTmpFortitudeSave(int tmpFortitudeSave) {
		this.tmpFortitudeSave = tmpFortitudeSave;
	}

	@Override
	public int getTmpWillSave() {
		return tmpWillSave;
	}

	@Override
	public void setTmpWillSave(int tmpWillSave) {
		this.tmpWillSave = tmpWillSave;
	}

	@Override
	public int getTmpReflexSave() {
		return tmpReflexSave;
	}

	@Override
	public void setTmpReflexSave(int tmpReflexSave) {
		this.tmpReflexSave = tmpReflexSave;
	}

	@Override
	public String getConditionalSavingThrows() {
		return conditionalSavingThrows;
	}

	@Override
	public void setConditionalSavingThrows(String conditionalSavingThrows) {
		this.conditionalSavingThrows = conditionalSavingThrows;
	}

	@Override
	public int getBaseAttackBonus() {
		return baseAttackBonus;
	}

	@Override
	public void setBaseAttackBonus(int baseAttackBonus) {
		this.baseAttackBonus = baseAttackBonus;
	}

	@Override
	public int getSpellResistance() {
		return spellResistance;
	}

	@Override
	public void setSpellResistance(int spellResistance) {
		this.spellResistance = spellResistance;
	}

	@Override
	public int getMiscGrappleModifier() {
		return miscGrappleModifier;
	}

	@Override
	public void setMiscGrappleModifier(int miscGrappleModifier) {
		this.miscGrappleModifier = miscGrappleModifier;
	}

	@Override
	public List<Weapon> getWeapons() {
		return weapons;
	}

	@Override
	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	@Override
	public List<ProtectiveItem> getArmor() {
		return armor;
	}

	@Override
	public void setArmor(List<ProtectiveItem> armor) {
		this.armor = armor;
	}

	@Override
	public List<Skill> getSkills() {
		return skills;
	}

	@Override
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	@Override
	public String getCampaignName() {
		return campaignName;
	}

	@Override
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	@Override
	public int getExperience() {
		return experience;
	}

	@Override
	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public List<Item> getPossessions() {
		return possessions;
	}

	@Override
	public void setPossessions(List<Item> possessions) {
		this.possessions = possessions;
	}

	@Override
	public int getCopperPieces() {
		return copperPieces;
	}

	@Override
	public void setCopperPieces(int copperPieces) {
		this.copperPieces = copperPieces;
	}

	@Override
	public int getSilverPieces() {
		return silverPieces;
	}

	@Override
	public void setSilverPieces(int silverPieces) {
		this.silverPieces = silverPieces;
	}

	@Override
	public int getGoldPieces() {
		return goldPieces;
	}

	@Override
	public void setGoldPieces(int goldPieces) {
		this.goldPieces = goldPieces;
	}

	@Override
	public int getPlatinumPieces() {
		return platinumPieces;
	}

	@Override
	public void setPlatinumPieces(int platinumPieces) {
		this.platinumPieces = platinumPieces;
	}

	@Override
	public List<String> getFeats() {
		return feats;
	}

	@Override
	public void setFeats(List<String> feats) {
		this.feats = feats;
	}

	@Override
	public List<String> getSpecialAbilitites() {
		return specialAbilitites;
	}

	@Override
	public void setSpecialAbilitites(List<String> specialAbilitites) {
		this.specialAbilitites = specialAbilitites;
	}

	@Override
	public List<String> getLanguages() {
		return languages;
	}

	@Override
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@Override
	public int getSpellSave() {
		return spellSave;
	}

	@Override
	public void setSpellSave(int spellSave) {
		this.spellSave = spellSave;
	}

	@Override
	public int getArcaneSpellFailure() {
		return arcaneSpellFailure;
	}

	@Override
	public void setArcaneSpellFailure(int arcaneSpellFailure) {
		this.arcaneSpellFailure = arcaneSpellFailure;
	}

	@Override
	public String getConditionalArcaneSpellFailure() {
		return conditionalArcaneSpellFailure;
	}

	@Override
	public void setConditionalArcaneSpellFailure(
			String conditionalArcaneSpellFailure) {
		this.conditionalArcaneSpellFailure = conditionalArcaneSpellFailure;
	}

	@Override
	public List<SpellLevel> getSpellLevels() {
		return spellLevels;
	}

	@Override
	public void setSpellLevels(List<SpellLevel> spellLevels) {
		this.spellLevels = spellLevels;
	}

	@Override
	public List<Spell> getSpells() {
		return spells;
	}

	@Override
	public void setSpells(List<Spell> spells) {
		this.spells = spells;
	}

	@Override
	public int getCurrentHitpoints() {
		return this.hitPoints - this.damage;
	}

	@Override
	public void addDamage(int damage) {
		this.damage += damage;
	}

	@Override
	public void addDamage(int damage, DamageType type) {
		switch (type) {
		default:
		case Lethal:
			this.addDamage(damage);
			break;
		case Nonlethal:
			this.nonlethalDamage += damage;
			break;
		}
	}

	@Override
	public void removeDamage(int damage) {
		this.damage -= damage;
		if (this.damage < 0) {
			this.damage = 0;
		}
	}

	@Override
	public void removeDamage(int damage, DamageType type) {
		switch (type) {
		default:
		case Lethal:
			this.removeDamage(damage);
			break;
		case Nonlethal:
			this.nonlethalDamage -= damage;
			if (this.nonlethalDamage < 0) {
				this.nonlethalDamage = 0;
			}
			break;
		}
	}

	@Override
	public int getModifier(Ability ability) {
		switch (ability) {
		case Charisma:
			return this.modifier(this.getCharisma());
		case Constitution:
			return this.modifier(this.getConstitution());
		case Dexterity:
			return this.modifier(this.getDexterity());
		case Intelligence:
			return this.modifier(this.getIntelligence());
		case Strength:
			return this.modifier(this.getStrength());
		case Wisdom:
			return this.modifier(this.getWisdom());
		default:
			throw new IllegalArgumentException("Invalid ability passed to the getModifier method!");
		}
	}

	@Override
	public int getTotalArmorClass() {
		int totalAC = 10;

		// Add AC for protective items
		for (ProtectiveItem item : this.armor) {
			totalAC += item.getArmorClassBonus();
		}

		totalAC += this.getModifier(Ability.Dexterity);

		totalAC += this.getNaturalArmor();

		totalAC += this.getMiscArmor();

		// size modifiers
		switch (this.size) {
		case Fine:
			totalAC += 8;
			break;
		case Diminutive:
			totalAC += 4;
			break;
		case Tiny:
			totalAC += 2;
		case Small:
			totalAC += 1;
			break;
		case Medium:
			// nothing to do
			break;
		case Large:
			totalAC -= 1;
			break;
		case Huge:
			totalAC -= 2;
			break;
		case Gargantuan:
			totalAC -= 4;
			break;
		case Collossal:
			totalAC -= 8;
			break;
		}
		return totalAC;
	}

}
