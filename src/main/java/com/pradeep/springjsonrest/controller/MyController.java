package com.pradeep.springjsonrest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.springjsonrest.bean.DepartmentDetails;
import com.pradeep.springjsonrest.bean.FinanceDetails;
import com.pradeep.springjsonrest.bean.HRDetails;
import com.pradeep.springjsonrest.bean.ITDetails;
import com.pradeep.springjsonrest.bean.MarketingDetails;
import com.pradeep.springjsonrest.bean.Request;

@RestController
@RequestMapping("/api")
public class MyController {

    @PostMapping("/process")
    public String processRequest(@RequestBody Request request) {
        String input = request.getInput();
        DepartmentDetails details = request.getDetails();

        if (details instanceof HRDetails) {
            HRDetails hrDetails = (HRDetails) details;
            return "Input: " + input + ", Department: HR, Employee ID: " + hrDetails.getEmployeeId();
        } else if (details instanceof FinanceDetails) {
            FinanceDetails financeDetails = (FinanceDetails) details;
            return "Input: " + input + ", Department: Finance, Account Number: " + financeDetails.getAccountNumber();
        } else if (details instanceof ITDetails) {
            ITDetails itDetails = (ITDetails) details;
            return "Input: " + input + ", Department: IT, Project Code: " + itDetails.getProjectCode();
        } else if (details instanceof MarketingDetails) {
            MarketingDetails marketingDetails = (MarketingDetails) details;
            return "Input: " + input + ", Department: Marketing, Campaign Name: " + marketingDetails.getCampaignName();
        }

        return "Input: " + input + ", Department: Unknown";
    }
}
