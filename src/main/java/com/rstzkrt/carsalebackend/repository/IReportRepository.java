package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReportRepository extends JpaRepository<Report,Long> {
}
