package com.reportservice.reportbuilder;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.reportservice.domain.ReportAttributes;
import com.reportservice.domain.ReportColumn;

import ar.com.fdvs.dj.domain.DynamicReport;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;

@Component
public abstract class ReportBuilder implements IReportBuilder {

	DataSource dataSource;
	
	protected List<ReportColumn> reportColumns;
	
	protected FastReportBuilder fastReportBuilder;

	//Create an instance of the FastReportBuilder
	public abstract void instantiate();
	
	//Specify the report columns
	public abstract void setReportColumns(List<ReportColumn> reportColumns);
	
	public abstract void setTitle(String title);
	
	public abstract void setSubTitle(String subtitle);
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public DynamicReport buildReport(ReportAttributes reportAttributes) throws Exception {
		
		instantiate();
		setReportColumns(reportAttributes.getReportColumns());
		setTitle(reportAttributes.getTitle());
		setSubTitle(reportAttributes.getSubTitle());
		return fastReportBuilder.build();
	}
	
}
