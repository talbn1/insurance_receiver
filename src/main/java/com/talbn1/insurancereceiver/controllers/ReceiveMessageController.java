package com.talbn1.insurancereceiver.controllers;

import com.talbn1.insurancereceiver.models.InsuranceReport;
import com.talbn1.insurancereceiver.services.ReportService;
import lombok.RequiredArgsConstructor;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author talbn on 8/26/2020
 **/

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/")
public class ReceiveMessageController {

    private final ReportService service;

    @PostMapping(path = "save")
    public ResponseEntity<InsuranceReport> saveNewCustomer(@RequestBody String JsonInsuranceReport) throws JSONException {

        JSONObject jsonObject = new JSONObject(JsonInsuranceReport);
        return new ResponseEntity<InsuranceReport>(service.saveReport(jsonObject),HttpStatus.CREATED);
    }
}
