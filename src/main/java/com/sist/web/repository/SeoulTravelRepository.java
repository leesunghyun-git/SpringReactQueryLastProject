package com.sist.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sist.web.entity.SeoulTravel;

import java.util.*;
import com.sist.web.dto.*;
@Repository
public interface SeoulTravelRepository extends JpaRepository<SeoulTravel, Integer>{
	
	@Query(value="SELECT contentid,title,address,image1,hit,contenttype FROM seoultravel ORDER BY DBMS_RANDOM.VALUE OFFSET 0 ROWS FETCH NEXT 1 ROWS ONLY",nativeQuery=true)
	CommonsDTO seoulMainData();
	
	/*
	 * 	SELECT contentid,title,address,image1,hit,contenttype
	 *  FROM seoultravel
	 *  ORDER BY contentid ASC
	 *  LIMIT 0,1
	 *  
	 *  SELECT contentid,title,address,image1,hit,contenttype,rownum FROM seoultravel WHERE rownum=1
	 */
	@Query(value="SELECT contentid,title,address,image1,hit,contenttype FROM seoultravel ORDER BY DBMS_RANDOM.VALUE OFFSET 0 ROWS FETCH NEXT 4 ROWS ONLY",nativeQuery=true)
	List<CommonsDTO> seoulMainListData();

}
