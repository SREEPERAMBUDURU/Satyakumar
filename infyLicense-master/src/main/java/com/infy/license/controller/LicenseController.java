package com.infy.license.controller;



import com.infy.license.model.License;

import com.infy.license.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class LicenseController {
    @Autowired
    private LicenseService licenseService;






    @GetMapping("/all")
    public List<License> getAllLicenses(String softwareName, String softwareVersion, String vendorName) throws Exception {
        return licenseService.getAllLicenses(softwareName, softwareVersion, vendorName);
    }









}