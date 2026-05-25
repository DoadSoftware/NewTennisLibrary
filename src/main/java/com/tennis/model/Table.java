package com.tennis.model;

import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Table", namespace = "urn:schemas-microsoft-com:office:excel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Table {
	
	@XmlElement(name = "Row",namespace = "urn:schemas-microsoft-com:office:spreadsheet")
	private List<Row> Row;

	public List<Row> getRow() {
		return Row;
	}

	public void setRow(List<Row> row) {
		Row = row;
	}

}

