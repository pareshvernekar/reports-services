package com.reportservice.domain;

import java.util.List;

public final class ReportAttributes {

	List<ReportColumn> reportColumns;
	
	String title;
	
	String subTitle;
	
	boolean printBackGroundOnOddRows;
	
	boolean useFullPageWidth;

	
	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public boolean isPrintBackGroundOnOddRows() {
		return printBackGroundOnOddRows;
	}

	public void setPrintBackGroundOnOddRows(boolean printBackGroundOnOddRows) {
		this.printBackGroundOnOddRows = printBackGroundOnOddRows;
	}

	public boolean isUseFullPageWidth() {
		return useFullPageWidth;
	}

	public void setUseFullPageWidth(boolean useFullPageWidth) {
		this.useFullPageWidth = useFullPageWidth;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ReportColumn> getReportColumns() {
		return reportColumns;
	}

	public void setReportColumns(List<ReportColumn> reportColumns) {
		this.reportColumns = reportColumns;
	}
	
}
