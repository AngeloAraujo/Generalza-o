package Ambiente;

public class Ambiente {

	private float area;

	public Ambiente () {
		
	}
	public Ambiente(float area) {
		setArea(area);
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		if (area>0)
			this.area = area;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ambiente Área=");
		builder.append(area);
		builder.append(", ");
		builder.append(super.toString());
		builder.append(".");
		return builder.toString();
	}
	
	
}
