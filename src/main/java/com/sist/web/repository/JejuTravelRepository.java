package com.sist.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sist.web.dto.CommonsDTO;
import com.sist.web.entity.JejuTravel;

@Repository
public interface JejuTravelRepository extends JpaRepository<JejuTravel, Integer>{
	@Query(value="SELECT contentid,title,address,image1,hit,contenttype FROM jejutravel ORDER BY DBMS_RANDOM.VALUE OFFSET 0 ROWS FETCH NEXT 4 ROWS ONLY",nativeQuery=true)
	List<CommonsDTO> jejuMainListData();
}
