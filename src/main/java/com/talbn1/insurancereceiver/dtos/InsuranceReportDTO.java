package com.talbn1.insurancereceiver.dtos;

import com.talbn1.insurancereceiver.models.InsuranceStatus;
import com.talbn1.insurancereceiver.models.InsuranceType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


/**
 * @author talbn on 8/26/2020
 **/

@Data
@NoArgsConstructor
@Builder
public class InsuranceReportDTO {

    public InsuranceReportDTO(@NotNull String customerName,
                              @NotNull InsuranceType type,
                              @NotNull InsuranceStatus status,
                              @NotNull String freeText) {
        this.customerName = customerName;
        this.type = type;
        this.status = status;
        this.freeText = freeText;
    }

    @NotNull
    private String customerName;

    @NotNull
    private InsuranceType type;

    @NotNull
    private InsuranceStatus status;

    @NotNull
    private String freeText;
}
