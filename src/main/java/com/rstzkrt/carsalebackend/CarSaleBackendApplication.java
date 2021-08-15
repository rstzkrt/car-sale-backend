package com.rstzkrt.carsalebackend;

import com.rstzkrt.carsalebackend.entity.*;
import com.rstzkrt.carsalebackend.repository.IAdvertRepository;
import com.rstzkrt.carsalebackend.repository.IAppUserRepository;
import com.rstzkrt.carsalebackend.repository.ICarRepository;
import com.rstzkrt.carsalebackend.repository.IReportRepository;
import com.rstzkrt.carsalebackend.service.AdvertService;
import com.rstzkrt.carsalebackend.service.AppUserService;
import com.rstzkrt.carsalebackend.service.CarService;
import com.rstzkrt.carsalebackend.service.ReportService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class CarSaleBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarSaleBackendApplication.class);
    }

    @Bean
    CommandLineRunner run(ICarRepository carRepository, IAdvertRepository advertRepository, IAppUserRepository appUserRepository, IReportRepository reportRepository){
       return args -> {
           //mock data
           AppUser appUser1=new AppUser("Name1", "LastName1", "email@.com", "Role1", "url1", LocalDate.of(1999,3,23));
           AppUser appUser2=new AppUser("Name2", "LastName2", "email2@.com", "Role2", "url2", LocalDate.of(1999,2,23));
           AppUser appUser3=new AppUser("Name3", "LastName3", "email3@.com", "Role3", "url3", LocalDate.of(1999,1,23));

           appUserRepository.save(appUser1);
           appUserRepository.save(appUser2);
           appUserRepository.save(appUser3);
//
           Car car1=new Car("brand1", "transmission1", 123.1, "bodyType1", "fuelType1", "condition1");
           Car car2=new Car("brand2", "transmission2", 123.2, "bodyType2", "fuelType2", "condition2");
           Car car3=new Car("brand3", "transmission3", 123.3, "bodyType3", "fuelType3", "condition3");

           carRepository.save(car1);
           carRepository.save(car2);
           carRepository.save(car3);

//
           Advert advert1= new Advert("Description1","title1",LocalDate.now(),111.0,"address1");
           Advert advert2= new Advert("Description2","title2",LocalDate.now(),222.0,"address2");
           Advert advert3= new Advert("Description3","title3",LocalDate.now(),333.0,"address3");

           advertRepository.save(advert1);
           advertRepository.save(advert2);
           advertRepository.save(advert3);
//
           appUserRepository.saveToFavourites(44L,50L);
           appUserRepository.saveToFavourites(44L,51L);
           appUserRepository.saveToFavourites(44L,52L);
//

           Report report1= new Report("Description1");
           Report report2= new Report("Description2");
           Report report3= new Report("Description3");

           reportRepository.save(report1);
           reportRepository.save(report2);
           reportRepository.save(report3);



       } ;
    }
}
