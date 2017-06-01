package com.reportservice.reportbuilder;

import com.reportservice.domain.ReportAttributes;

import ar.com.fdvs.dj.domain.DynamicReport;

public interface IReportBuilder {

	public DynamicReport buildReport(ReportAttributes reportAttributes) throws Exception;
}
