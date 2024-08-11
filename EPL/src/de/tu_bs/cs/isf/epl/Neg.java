package de.tu_bs.cs.isf.epl;

public /*addable, removable*/ class Neg {
	de.tu_bs.cs.isf.epl.Exp expr;

	public Neg(Exp expr) {
		this.expr = expr;
	}

	public void print() {
		System.out.print("- ");
		expr.print();
	}
}