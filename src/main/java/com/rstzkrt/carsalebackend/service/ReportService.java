package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Report;

import java.util.List;

public interface ReportService {

    List<Long> getReportIdsByUserId(Long userId);

    List<Report> getAllReportsByUserId(List<Long> reportIds);
}
