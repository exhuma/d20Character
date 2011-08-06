package lu.albert.d20character;

import lu.albert.d20character.api.ProtectiveItem;

public class ProtectiveItemImpl implements ProtectiveItem {

	private String name;
	private String type;
	private int armorClassBonus;
	private int maxDexterity;
	private int checkPenalty;
	private int spellFailure;
	private int maxSpeed;
	private int weight;
	private String specialProperties;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int getArmorClassBonus() {
		return armorClassBonus;
	}

	@Override
	public void setArmorClassBonus(int armorClassBonus) {
		this.armorClassBonus = armorClassBonus;
	}

	@Override
	public int getMaxDexterity() {
		return maxDexterity;
	}

	@Override
	public void setMaxDexterity(int maxDexterity) {
		this.maxDexterity = maxDexterity;
	}

	@Override
	public int getCheckPenalty() {
		return checkPenalty;
	}

	@Override
	public void setCheckPenalty(int checkPenalty) {
		this.checkPenalty = checkPenalty;
	}

	@Override
	public int getSpellFailure() {
		return spellFailure;
	}

	@Override
	public void setSpellFailure(int spellFailure) {
		this.spellFailure = spellFailure;
	}

	@Override
	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
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
	public String getSpecialProperties() {
		return specialProperties;
	}

	@Override
	public void setSpecialProperties(String specialProperties) {
		this.specialProperties = specialProperties;
	}

}
