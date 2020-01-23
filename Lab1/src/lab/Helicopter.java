package lab;

public class Helicopter {
	private int maxLiftingWeight;
	private String name;
	private int maxHeight;
	private int weight;
	private int numberOfBlade;
	static int numberOfHelicopter;
	protected int numberOfSeats;
	protected String ñountryOfOrigin;

	public int getMaxLiftingWeight() {
		return maxLiftingWeight;
	}

	public void setMaxLiftingWeight(int maxLiftingWeight) {
		this.maxLiftingWeight = maxLiftingWeight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNumberOfBlade() {
		return numberOfBlade;
	}

	public void setNumberOfBlade(int numberOfBlade) {
		this.numberOfBlade = numberOfBlade;
	}

	public Helicopter() {
		this(0, "0", 0, 0, 0, 0, "0");
	}

	public Helicopter(int maxLiftingWeight, String name, int maxHeight, int weight) {
		this(maxLiftingWeight, name, maxHeight, weight, 0, 0, "0");
	}

	public Helicopter(int maxLiftingWeight, String name, int maxHeight, int weight, int numberOfBlade,
			int numberOfSeats, String ñountryOfOrigin) {
		super();
		this.maxLiftingWeight = maxLiftingWeight;
		this.name = name;
		this.maxHeight = maxHeight;
		this.weight = weight;
		this.numberOfBlade = numberOfBlade;
		this.numberOfSeats = numberOfSeats;
		this.ñountryOfOrigin = ñountryOfOrigin;
		numberOfHelicopter++;
	}

	@Override
	public String toString() {
		return "Helicopter [maxLiftingWeight=" + maxLiftingWeight + ", name=" + name + ", maxHeight=" + maxHeight
				+ ", weight=" + weight + ", numberOfBlade=" + numberOfBlade + ", numberOfSeats=" + numberOfSeats
				+ ", ñountryOfOrigin=" + ñountryOfOrigin + ", getMaxLiftingWeight()=" + getMaxLiftingWeight()
				+ ", getName()=" + getName() + ", getMaxHeight()=" + getMaxHeight() + ", getWeight()=" + getWeight()
				+ ", getNumberOfBlade()=" + getNumberOfBlade() + "]";
	}

	public static String printStaticNumberOfHelicopter() {
		return "static numberOfHelicopter=" + numberOfHelicopter;
	}

	public String printNumberOfHelicopter() {
		return "numberOfHelicopter=" + numberOfHelicopter;
	}

	public void resetValues(int maxLiftingWeight, String name, int maxHeight, int weight, int numberOfBlade,
			int numberOfSeats, String ñountryOfOrigin) {
		this.maxLiftingWeight = maxLiftingWeight;
		this.name = name;
		this.maxHeight = maxHeight;
		this.weight = weight;
		this.numberOfBlade = numberOfBlade;
		this.numberOfSeats = numberOfSeats;
		this.ñountryOfOrigin = ñountryOfOrigin;
	}
}