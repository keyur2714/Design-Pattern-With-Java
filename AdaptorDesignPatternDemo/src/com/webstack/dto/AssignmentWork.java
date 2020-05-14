package com.webstack.dto;

public class AssignmentWork {

	private Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void writeAssignments(String line) {
		pen.write(line);
	}

}
