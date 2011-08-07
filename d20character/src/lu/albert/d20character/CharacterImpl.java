package lu.albert.d20character;

import java.util.ArrayList;
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
	private int tmpHitPoints;
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
	private String conditionalArcaneSpellFailure;

	private List<SpellLevel> spellLevels;

	private List<Spell> spells;

	private static List<Integer[]> LOADS = new ArrayList<Integer[]>();

	static {
		LOADS.add(new Integer[] { 0, 3, 4, 6, 7, 10 });
		LOADS.add(new Integer[] { 0, 6, 7, 13, 14, 20 });
		LOADS.add(new Integer[] { 0, 10, 11, 20, 21, 30 });
		LOADS.add(new Integer[] { 0, 13, 14, 26, 27, 40 });
		LOADS.add(new Integer[] { 0, 16, 17, 33, 34, 50 });
		LOADS.add(new Integer[] { 0, 20, 21, 40, 41, 60 });
		LOADS.add(new Integer[] { 0, 23, 24, 46, 47, 70 });
		LOADS.add(new Integer[] { 0, 26, 27, 53, 54, 80 });
		LOADS.add(new Integer[] { 0, 30, 31, 60, 61, 90 });
		LOADS.add(new Integer[] { 0, 33, 34, 66, 67, 100 });
		LOADS.add(new Integer[] { 0, 38, 39, 76, 77, 115 });
		LOADS.add(new Integer[] { 0, 43, 44, 86, 87, 130 });
		LOADS.add(new Integer[] { 0, 50, 51, 100, 101, 150 });
		LOADS.add(new Integer[] { 0, 58, 59, 116, 117, 175 });
		LOADS.add(new Integer[] { 0, 66, 67, 133, 134, 200 });
		LOADS.add(new Integer[] { 0, 76, 77, 153, 154, 230 });
		LOADS.add(new Integer[] { 0, 86, 87, 173, 174, 260 });
		LOADS.add(new Integer[] { 0, 100, 101, 200, 201, 300 });
		LOADS.add(new Integer[] { 0, 116, 117, 233, 234, 350 });
		LOADS.add(new Integer[] { 0, 133, 134, 266, 267, 400 });
		LOADS.add(new Integer[] { 0, 153, 154, 306, 307, 460 });
		LOADS.add(new Integer[] { 0, 173, 174, 346, 347, 520 });
		LOADS.add(new Integer[] { 0, 200, 201, 400, 401, 600 });
		LOADS.add(new Integer[] { 0, 233, 234, 466, 467, 700 });
		LOADS.add(new Integer[] { 0, 266, 267, 533, 534, 800 });
		LOADS.add(new Integer[] { 0, 306, 307, 613, 614, 920 });
		LOADS.add(new Integer[] { 0, 346, 347, 693, 694, 1040 });
		LOADS.add(new Integer[] { 0, 400, 401, 800, 801, 1200 });
		LOADS.add(new Integer[] { 0, 466, 467, 933, 934, 1400 });
	}

	/**
	 * Return a modifier for an integer value
	 * 
	 * @param value
	 *            The input value
	 * @return The modifier
	 */
	private int modifier(int value) {
		return (int) Math.floor((value - 10) / 2f);
	}

	/**
	 * Default no-args constructor
	 */
	public CharacterImpl() {
		this.size = Size.Medium;
		this.classes = new ArrayList<String>();
		this.weapons = new ArrayList<Weapon>();
		this.armor = new ArrayList<ProtectiveItem>();

		this.skills = new ArrayList<Skill>();
		this.skills
				.add(new SkillImpl("Appraise", Ability.Intelligence, true, 0));
		this.skills.add(new SkillImpl("Balance", Ability.Dexterity, true, 1));
		this.skills.add(new SkillImpl("Bluff", Ability.Charisma, true, 0));
		this.skills.add(new SkillImpl("Climb", Ability.Strength, true, 1));
		this.skills.add(new SkillImpl("Concentraion", Ability.Constitution,
				true, 0));
		this.skills.add(new SkillImpl("Craft ____", Ability.Intelligence, true,
				0));
		this.skills.add(new SkillImpl("Decipher Script", Ability.Intelligence,
				false, 0));
		this.skills.add(new SkillImpl("Diplomacy", Ability.Charisma, true, 0));
		this.skills.add(new SkillImpl("Disable Device", Ability.Intelligence,
				false, 0));
		this.skills.add(new SkillImpl("Disguise", Ability.Charisma, true, 0));
		this.skills.add(new SkillImpl("Escape artist", Ability.Dexterity, true,
				1));
		this.skills
				.add(new SkillImpl("Forgery", Ability.Intelligence, true, 0));
		this.skills.add(new SkillImpl("Gather information", Ability.Charisma,
				true, 0));
		this.skills.add(new SkillImpl("Handle animal", Ability.Charisma, false,
				0));
		this.skills.add(new SkillImpl("Heal", Ability.Wisdom, true, 0));
		this.skills.add(new SkillImpl("Hide", Ability.Dexterity, true, 1));
		this.skills.add(new SkillImpl("Intimidate", Ability.Charisma, true, 0));
		this.skills.add(new SkillImpl("Jump", Ability.Strength, true, 1));
		this.skills.add(new SkillImpl("Knowledge ____", Ability.Intelligence,
				false, 0));
		this.skills.add(new SkillImpl("Listen", Ability.Wisdom, true, 0));
		this.skills.add(new SkillImpl("Move silently", Ability.Dexterity, true,
				1));
		this.skills
				.add(new SkillImpl("Open lock", Ability.Dexterity, false, 0));
		this.skills.add(new SkillImpl("Perform ____", Ability.Charisma, false,
				0));
		this.skills.add(new SkillImpl("Profession ___", Ability.Wisdom, false,
				0));
		this.skills.add(new SkillImpl("Ride", Ability.Dexterity, true, 0));
		this.skills.add(new SkillImpl("Search", Ability.Intelligence, true, 0));
		this.skills.add(new SkillImpl("Sense motive", Ability.Wisdom, true, 0));
		this.skills.add(new SkillImpl("Sleight of hand", Ability.Dexterity,
				false, 1));
		this.skills.add(new SkillImpl("Spellcraft", Ability.Intelligence,
				false, 0));
		this.skills.add(new SkillImpl("Spot", Ability.Wisdom, true, 0));
		this.skills.add(new SkillImpl("Survival", Ability.Wisdom, true, 0));
		this.skills.add(new SkillImpl("Swim", Ability.Strength, true, 2));
		this.skills.add(new SkillImpl("Tumble", Ability.Dexterity, false, 1));
		this.skills.add(new SkillImpl("Use magic device", Ability.Charisma,
				false, 0));
		this.skills.add(new SkillImpl("Use rope", Ability.Dexterity, true, 0));

		this.possessions = new ArrayList<Item>();
		this.feats = new ArrayList<String>();
		this.specialAbilitites = new ArrayList<String>();
		this.languages = new ArrayList<String>();
		this.spellLevels = new ArrayList<SpellLevel>();
		this.spells = new ArrayList<Spell>();

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
		return getAbilityScore(Ability.Strength);
	}

	@Override
	public void setStrength(int strength) {
		setAbilityScore(Ability.Strength, strength);
	}

	@Override
	public int getDexterity() {
		return dexterity;
	}

	@Override
	public void setDexterity(int dexterity) {
		setAbilityScore(Ability.Dexterity, dexterity);
	}

	@Override
	public int getConstitution() {
		return constitution;
	}

	@Override
	public void setConstitution(int constitution) {
		setAbilityScore(Ability.Constitution, constitution);
	}

	@Override
	public int getIntelligence() {
		return intelligence;
	}

	@Override
	public void setIntelligence(int intelligence) {
		setAbilityScore(Ability.Intelligence, intelligence);
	}

	@Override
	public int getWisdom() {
		return wisdom;
	}

	@Override
	public void setWisdom(int wisdom) {
		setAbilityScore(Ability.Wisdom, wisdom);
	}

	@Override
	public int getCharisma() {
		return charisma;
	}

	@Override
	public void setCharisma(int charisma) {
		setAbilityScore(Ability.Charisma, charisma);
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
		int output = 0;
		for (ProtectiveItem armor : this.armor) {
			output = Math.max(output, armor.getSpellFailure());
		}
		return output;
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
		return this.hitPoints - this.damage + this.tmpHitPoints;
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
	public void removeAllDamage() {
		this.damage = 0;
	}

	@Override
	public void removeAllDamage(DamageType type) {
		switch (type) {
		default:
		case Lethal:
			this.removeAllDamage();
			break;
		case Nonlethal:
			this.nonlethalDamage = 0;
			break;
		}
	}

	@Override
	public int getAbilityScore(Ability ability) {
		switch (ability) {
		case Charisma:
			return this.charisma;
		case Constitution:
			return this.constitution;
		case Dexterity:
			return this.dexterity;
		case Intelligence:
			return this.intelligence;
		case Strength:
			return this.strength;
		case Wisdom:
			return this.wisdom;
		default:
			throw new IllegalArgumentException(
					"Invalid ability passed to the getModifier method!");
		}
	}

	@Override
	public void setAbilityScore(Ability ability, int value) {
		switch (ability) {
		case Charisma:
			this.charisma = value;
			;
			break;
		case Constitution:
			this.constitution = value;
			break;
		case Dexterity:
			this.dexterity = value;
			break;
		case Intelligence:
			this.intelligence = value;
			break;
		case Strength:
			this.strength = value;
			break;
		case Wisdom:
			this.wisdom = value;
			break;
		default:
			throw new IllegalArgumentException(
					"Invalid ability passed to the getModifier method!");
		}
	}

	@Override
	public int getAbilityModifier(Ability ability) {
		switch (ability) {
		case Charisma:
			return this.modifier(this.charisma);
		case Constitution:
			return this.modifier(this.constitution);
		case Dexterity:
			return this.modifier(this.dexterity);
		case Intelligence:
			return this.modifier(this.intelligence);
		case Strength:
			return this.modifier(this.strength);
		case Wisdom:
			return this.modifier(this.wisdom);
		default:
			throw new IllegalArgumentException(
					"Invalid ability passed to the getModifier method!");
		}
	}

	@Override
	public int getTotalArmorClass() {
		int totalAC = 10;

		// Add AC for protective items
		for (ProtectiveItem item : this.armor) {
			totalAC += item.getArmorClassBonus();
		}

		totalAC += this.getAbilityModifier(Ability.Dexterity);

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

	@Override
	public int getSkillModifier(Skill skill) {
		int modifier = this.getAbilityModifier(skill.getKeyAbility())
				+ skill.getRanks() + skill.getMiscModifier();

		int maxDex = 999;

		// apply armor based penalties
		for (ProtectiveItem armor : this.getArmor()) {
			modifier += armor.getCheckPenalty() * skill.getPenaltyMultiplier();
			maxDex = Math.min(maxDex, armor.getMaxDexterity());
		}

		if (skill.getKeyAbility() == Ability.Dexterity && modifier > maxDex) {
			return maxDex;
		}

		return modifier;
	}

	@Override
	public List<Integer> getLoad(Load load) {
		Integer[] loadInfo = LOADS.get(strength - 1);
		List<Integer> out = new ArrayList<Integer>();
		switch (load) {
		case Light:
			out.add(loadInfo[0]);
			out.add(loadInfo[1]);
			break;
		case Medium:
			out.add(loadInfo[2]);
			out.add(loadInfo[3]);
			break;
		case Heavy:
			out.add(loadInfo[4]);
			out.add(loadInfo[5]);
			break;
		}
		return out;
	}

	@Override
	public int getTotalWeight() {
		int total = 0;
		for (ProtectiveItem armor : this.armor) {
			total += armor.getWeight();
		}
		for (Item item : this.possessions) {
			total += item.getWeight();
		}
		for (Weapon weapon : this.weapons) {
			total += weapon.getWeight();
		}
		return total;
	}

	@Override
	public int getInitiative() {
		return getAbilityModifier(Ability.Dexterity) + miscInitiative;
	}

	@Override
	public int getFlatFootedAC() {
		return this.getTotalArmorClass()
				- getAbilityModifier(Ability.Dexterity);
	}

	@Override
	public int getTouchAC() {
		int totalAC = this.getTotalArmorClass();
		for (ProtectiveItem armor : this.armor) {
			if (!"deflection".equalsIgnoreCase(armor.getType())) {
				totalAC -= armor.getArmorClassBonus();
			}
		}
		return totalAC;
	}

	@Override
	public int getTmpHitpoints() {
		return tmpHitPoints;
	}

	@Override
	public void setTmpHitpoints(int value) {
		this.tmpHitPoints = value;
	}

	@Override
	public void addTmpHp(int value) {
		this.tmpHitPoints += value;
	}

	@Override
	public void removeTmpHp(int value) {
		this.tmpHitPoints -= value;
		if (tmpHitPoints < 0) {
			this.tmpHitPoints = 0;
		}
	}

	@Override
	public void removeAllTmpHp() {
		this.tmpHitPoints = 0;
	}

	@Override
	public int getFortitudeSave() {
		return baseFortitudeSave + getAbilityModifier(Ability.Constitution)
				+ magicFortitudeSave + miscFortitudeSave + tmpFortitudeSave;
	}

	@Override
	public int getReflexSave() {
		return baseReflexSave + getAbilityModifier(Ability.Dexterity)
				+ magicReflexSave + miscReflexSave + tmpReflexSave;
	}

	@Override
	public int getWillSave() {
		return baseWillSave + getAbilityModifier(Ability.Wisdom)
				+ magicWillSave + miscWillSave + tmpWillSave;
	}

}
