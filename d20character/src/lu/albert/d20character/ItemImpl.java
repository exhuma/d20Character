package lu.albert.d20character;

import lu.albert.d20character.api.Item;

public class ItemImpl implements Item {

	private String name;
	private int weight;

	public ItemImpl(String name, int weight) {
		this.name = name;
		this.weight = weight;
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
	public int getWeight() {
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
