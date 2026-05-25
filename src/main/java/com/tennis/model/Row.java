package com.tennis.model;

import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Row",namespace = "urn:schemas-microsoft-com:office:excel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Row {
	
	@XmlElement(name = "Cell",namespace = "urn:schemas-microsoft-com:office:spreadsheet")
	private List<Cell> Cell;

	public List<Cell> getCell() {
		return Cell;
	}

	public void setCell(List<Cell> cell) {
		Cell = cell;
	}

	@Override
	public String toString() {
		return "Row [Cell=" + Cell + "]";
	}
	
}

