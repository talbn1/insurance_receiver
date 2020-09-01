package com.talbn1.insurancereceiver.mappers;

import com.talbn1.insurancereceiver.dtos.InsuranceReportDTO;
import com.talbn1.insurancereceiver.models.InsuranceReport;
import com.talbn1.insurancereceiver.models.InsuranceStatus;
import com.talbn1.insurancereceiver.models.InsuranceType;
import org.springframework.stereotype.Service;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author talbn on 8/26/2020
 **/


@Service
public class InsuranceReportMapper {

    public InsuranceReport dtoToEntity(InsuranceReportDTO dto){

        if ( dto == null ) {
            return null;
        }

        InsuranceReport.InsuranceReportBuilder report = InsuranceReport.builder();
        report.customerName(dto.getCustomerName());
        report.status(dto.getStatus());
        report.type(dto.getType());
        report.freeText(dto.getFreeText());

        return report.build();
    }

    public InsuranceReportDTO entityToDTO(InsuranceReport entity){

        if ( entity == null ) {
            return null;
        }

        InsuranceReportDTO.InsuranceReportDTOBuilder dto = InsuranceReportDTO.builder();
        dto.customerName(entity.getCustomerName());
        dto.status(entity.getStatus());
        dto.type(entity.getType());
        dto.freeText(entity.getFreeText());

        return dto.build();
    }

    public InsuranceReport jsonToEntity(JSONObject json) throws JSONException {

        if ( json == null ) {
            return null;
        }

        InsuranceReport.InsuranceReportBuilder report = InsuranceReport.builder();
        report.customerName(json.getString("customerName"));
        report.status(InsuranceStatus.valueOf(json.getString("status")));
        report.type(InsuranceType.valueOf(json.getString("type")));
        report.freeText(json.getString("freeText"));

        return report.build();
    }
}
