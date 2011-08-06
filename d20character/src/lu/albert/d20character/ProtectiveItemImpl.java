package lu.albert.d20character;

import lu.albert.d20character.api.ProtectiveItem;

public class ProtectiveItemImpl implements ProtectiveItem {

	private String name;
	private String type;
	private int armorClassBonus;
	private int maxDexterity;
	private int checkPenalty;
	private int spellFailure;
	private int weight;
	private String specialProperties;

	/**
	 * Public constructor
	 * @param name The visible name on the form
	 * @param armorClassBonus The AC bonus
	 * @param maxDexterity The max dex modifier
	 * @param checkPenalty The check penalty (must be negative)
	 * @param spellFailure Arcane spell failure
	 */
	public ProtectiveItemImpl(String name, int armorClassBonus,
			int maxDexterity, int checkPenalty, int spellFailure) {
		super();
		this.name = name;
		this.armorClassBonus = armorClassBonus;
		this.maxDexterity = maxDexterity;
		this.setCheckPenalty(checkPenalty);
		this.spellFailure = spellFailure;
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
		if (checkPenalty > 0) {
			throw new IllegalArgumentException(
					"Armor check penalty must be negative!");
		}
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
