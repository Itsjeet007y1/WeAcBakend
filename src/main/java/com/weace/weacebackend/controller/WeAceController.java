package com.weace.weacebackend.controller;

import com.weace.weacebackend.model.ReportData;
import org.springframework.boot.origin.Origin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeAceController {

    @PostMapping("/getReport")
    @CrossOrigin(origins = "http://localhost:4200")
    public ReportData getReport(@RequestBody ReportData reportData) {
        ReportData rd = new ReportData();
        rd.setAns1(reportData.getAns1());
        rd.setAns2(reportData.getAns2());
        rd.setAns3(reportData.getAns3());
        rd.setAns4(reportData.getAns4());
        rd.setAns5(reportData.getAns5());
        rd.setAns6(reportData.getAns6());
        rd.setSatisfactionIndex((rd.getAns1() * 0.30) + (rd.getAns2() * 0.10) + (rd.getAns2() * 0.20) + (rd.getAns2() * 0.20) + (rd.getAns2() * 0.10) + (rd.getAns2() * 0.30));
        return rd;
    }
}
