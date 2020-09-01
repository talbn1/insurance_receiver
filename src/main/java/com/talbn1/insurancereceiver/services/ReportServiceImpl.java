package com.talbn1.insurancereceiver.services;

import com.talbn1.insurancereceiver.dtos.InsuranceReportDTO;
import com.talbn1.insurancereceiver.mappers.InsuranceReportMapper;
import com.talbn1.insurancereceiver.models.InsuranceReport;
import com.talbn1.insurancereceiver.repositories.ReportRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author talbn on 8/26/2020
 **/

@Service
public class ReportServiceImpl implements ReportService {

    private final InsuranceReportMapper mapper;
    private final ReportRepository repository;

    public ReportServiceImpl(InsuranceReportMapper mapper, ReportRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public InsuranceReport saveReport(JSONObject jsonInsuranceReport) throws JSONException {
        return repository.save(mapper.jsonToEntity(jsonInsuranceReport));
    }
}