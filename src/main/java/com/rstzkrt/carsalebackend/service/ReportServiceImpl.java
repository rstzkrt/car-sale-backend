package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService{

    @Autowired
    private IReportRepository reportRepository;

}