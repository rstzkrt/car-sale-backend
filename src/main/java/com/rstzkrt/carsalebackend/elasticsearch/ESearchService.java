//package com.rstzkrt.carsalebackend.elasticsearch;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.core.SearchHit;
//
//import java.util.List;
//
//public interface ESearchService {
//    ESearchAdvert saveOrUpdate(ESearchAdvert eSearchAdvert);
//
//    void deleteByAdvertId(Long id);
//
//    Page<ESearchAdvert> findAll(Pageable pageable);
//
//    List<SearchHit<ESearchAdvert>> queryAdverts(String keyword, Pageable pageable);
//
//}
