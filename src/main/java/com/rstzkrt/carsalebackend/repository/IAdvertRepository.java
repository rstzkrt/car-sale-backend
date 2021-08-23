package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.config.AdvertProjection;
import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(excerptProjection = AdvertProjection.class)
public interface IAdvertRepository extends JpaRepository<Advert,Long> {
    List<Advert> findByAdvertIdIn(List<Long> AdvertIds);

    List<Advert> findAllByPostedBy_AppUserId(Long userId);

    @Transactional
    @Modifying
    @Query(value =
            "insert into advert_images (advert_advert_id,images_id) values (:advert_advert_id, :images_id)",
            nativeQuery = true)
    void saveImages(@Param("advert_advert_id")Long advert_advert_id, @Param("images_id")Long images_id);

    @Transactional
    @Modifying
    @Query(value =
            "insert into advert_reports (advert_advert_id,reports_report_id) values (:advert_advert_id, :reports_report_id)",
            nativeQuery = true)
    void saveReports(@Param("advert_advert_id")Long advert_advert_id, @Param("reports_report_id")Long reports_report_id);
}