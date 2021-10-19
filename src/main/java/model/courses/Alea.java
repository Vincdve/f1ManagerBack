package model.courses;

public enum Alea {

	Soleil(1), Pluie(2), Accident(3), Panne(4), RAS(5);

	private int option;

	private Alea(int option) {
		this.option = option;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}
	
	
	
}
