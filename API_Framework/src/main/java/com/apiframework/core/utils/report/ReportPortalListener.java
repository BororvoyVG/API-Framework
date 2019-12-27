package com.apiframework.core.utils.report;

import com.epam.reportportal.cucumber.ScenarioReporter;
import com.epam.reportportal.cucumber.StepReporter;
import com.epam.reportportal.service.ReportPortal;


public class ReportPortalListener extends StepReporter {

    protected ReportPortal buildReportPortal() {
        return ReportPortal.builder().build();
    }
}
