package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Report;
import com.rstzkrt.carsalebackend.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService{

    @Autowired
    private IReportRepository reportRepository;

    @Override
    public List<Long> getReportIdsByUserId(Long userId) {
        return reportRepository.getAllReportIdsByUserId(userId);
    }

    @Override
    public List<Report> getAllReportsByUserId(List<Long> reportIds) {
        return reportRepository.findReportByReportIdIn(reportIds);
    }
}