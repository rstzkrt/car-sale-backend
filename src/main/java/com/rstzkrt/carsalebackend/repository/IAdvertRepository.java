package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.Advert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface IAdvertRepository extends JpaRepository<Advert,Long> {
    List<Advert> findByAdvertIdIn(List<Long> AdvertIds);

    @Transactional
    @Modifying
    @Query(value =
            "insert into advert_images (advert_advert_id,advert_id) values (:advert_advert_id, :images_id)",
            nativeQuery = true)
    void saveImages(@Param("advert_advert_id")Long advert_advert_id, @Param("images_id")Long images_id);

    @Transactional
    @Modifying
    @Query(value =
            "insert into advert_reports (advert_advert_id,reports_report_id) values (:advert_advert_id, :reports_report_id)",
            nativeQuery = true)
    void saveReports(@Param("advert_advert_id")Long advert_advert_id, @Param("reports_report_id")Long reports_report_id);
}