package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.config.AdvertProjection;
import com.rstzkrt.carsalebackend.config.AppUserProjection;
import com.rstzkrt.carsalebackend.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(excerptProjection = AppUserProjection.class)
public interface IAppUserRepository extends JpaRepository<AppUser,Long> {

    @Query(value = "SELECT advert_id FROM user_favourites where app_user_id=:Id",nativeQuery = true)
    List<Long> getFavouritesById(@Param("Id")Long Id);

    @Transactional
    @Modifying
    @Query(value =
            "insert into user_favourites (app_user_id,advert_id) values (:userId, :advertId)",
            nativeQuery = true)
    void saveToFavourites(@Param("userId")Long userId,@Param("advertId")Long advertId);


    @Transactional
    @Modifying
    @Query(value =
            "insert into app_user_adverts (app_user_app_user_id,adverts_advert_id) values (:app_user_app_user_id, :adverts_advert_id)",
            nativeQuery = true)
    void saveAdverts(@Param("app_user_app_user_id")Long app_user_app_user_id, @Param("adverts_advert_id")Long adverts_advert_id);


    @Transactional
    @Modifying
    @Query(value =
            "insert into app_user_reports (app_user_app_user_id,reports_report_id) values (:app_user_app_user_id, :reports_report_id)",
            nativeQuery = true)
    void saveReports(@Param("app_user_app_user_id")Long app_user_app_user_id, @Param("reports_report_id")Long reports_report_id);
}