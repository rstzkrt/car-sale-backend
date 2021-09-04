package com.rstzkrt.carsalebackend.elasticsearch;

import java.util.List;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ESearchAdvertRepository extends ElasticsearchRepository<ESearchAdvert, String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"title\": \"?0\"}}]}}")
    List<SearchHit<ESearchAdvert>> queryAdverts(String keyword, Pageable pageable);

    void deleteESearchAdvertByAdvertId(Long id);

}