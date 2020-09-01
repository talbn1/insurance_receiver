package com.talbn1.insurancereceiver.services;

import com.talbn1.insurancereceiver.dtos.InsuranceReportDTO;
import com.talbn1.insurancereceiver.models.InsuranceReport;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author talbn on 8/26/2020
 **/

public interface ReportService {

    InsuranceReport saveReport(JSONObject insuranceReportDTO) throws JSONException;
}
