//package com.rstzkrt.carsalebackend.elasticsearch;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.core.SearchHit;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ESearchServiceImpl implements ESearchService{
//
//    @Autowired
//    private ESearchAdvertRepository eSearchAdvertRepository;
//
//    @Override
//    public ESearchAdvert saveOrUpdate(ESearchAdvert eSearchAdvert) {
//        return eSearchAdvertRepository.save(eSearchAdvert);
//    }
//
//    @Override
//    public void deleteByAdvertId(Long id) {
//        eSearchAdvertRepository.deleteESearchAdvertByAdvertId(id);
//    }
//
//    @Override
//    public Page<ESearchAdvert> findAll(Pageable pageable) {
//        return eSearchAdvertRepository.findAll(pageable);
//    }
//
//    @Override
//    public List<SearchHit<ESearchAdvert>> queryAdverts(String keyword, Pageable pageable) {
//        return eSearchAdvertRepository.queryAdverts(keyword, pageable);
//    }
//}
