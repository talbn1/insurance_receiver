package com.talbn1.insurancereceiver.repositories;

import com.talbn1.insurancereceiver.models.InsuranceReport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author talbn on 8/26/2020
 **/

public interface ReportRepository extends JpaRepository<InsuranceReport, Long> {

    InsuranceReport save(InsuranceReport report);
}
