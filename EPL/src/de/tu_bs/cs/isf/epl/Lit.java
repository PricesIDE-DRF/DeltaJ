package de.tu_bs.cs.isf.epl;

public /*addable*/ class Lit implements Exp {
	private /*modifiable*/ int value;

	public Lit(int value) {
		this.value = value;
	}
	
	public /*modifiable*/ void print() {
		System.out.print(value);
	}
}