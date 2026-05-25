package com.tennis.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Workbook", namespace = "urn:schemas-microsoft-com:office:spreadsheet")
@XmlAccessorType(XmlAccessType.FIELD)
public class WorkBook {
	
	@XmlElement(name = "Worksheet",namespace = "urn:schemas-microsoft-com:office:spreadsheet")
	private Worksheet Worksheet;

	public Worksheet getWorksheet() {
		return Worksheet;
	}

	public void setWorksheet(Worksheet worksheet) {
		Worksheet = worksheet;
	}

}

