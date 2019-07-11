package Models;

public class Card {

	private int Value;
	private String faceSuite;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(int value, String faceSuite) {
		super();
		Value = value;
		this.faceSuite = faceSuite;
	}
	public int getValue() {
		return Value;
	}
	public void setValue(int value) {
		Value = value;
	}
	public String getFaceSuite() {
		return faceSuite;
	}
	public void setFaceSuite(String faceSuite) {
		this.faceSuite = faceSuite;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Value;
		result = prime * result + ((faceSuite == null) ? 0 : faceSuite.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (Value != other.Value)
			return false;
		if (faceSuite == null) {
			if (other.faceSuite != null)
				return false;
		} else if (!faceSuite.equals(other.faceSuite))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cards [Value=" + Value + ", faceSuite=" + faceSuite + "]";
	}
	
	
	
	
	
}
