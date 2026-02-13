package com.sist.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sist.web.dto.AttractionDTO;
import com.sist.web.dto.CommonsDTO;
import com.sist.web.entity.JejuTravel;

@Repository
public interface JejuTravelRepository extends JpaRepository<JejuTravel, Integer>{
	@Query(value="SELECT contentid,title,address,image1,hit,contenttype FROM jejutravel ORDER BY DBMS_RANDOM.VALUE OFFSET 0 ROWS FETCH NEXT 4 ROWS ONLY",nativeQuery=true)
	List<CommonsDTO> jejuMainListData();

	@Query(value="SELECT j.contentid,title,x,y,address,image1,hit,contenttype,infocenter,restdate,usetime,parking,DBMS_LOB.SUBSTR(msg,48000,1) as msg FROM jejutravel j JOIN attraction a ON j.contentid=a.contentid ORDER BY j.contentid "
			+ "OFFSET :start ROWS FETCH NEXT 12 ROWS ONLY",nativeQuery = true)
	List<AttractionDTO> jejuAttractionData(@Param("start")int start);
	
	@Query(value="SELECT ceil(count(*)/12.0) FROM jejutravel WHERE contenttype = :contenttype",nativeQuery=true)
	int jejuDetailTotalPage(@Param("contenttype") int contenttype);
	
	@Query(value="SELECT j.contentid,title,x,y,address,image1,hit,contenttype,infocenter,restdate,usetime,parking,CAST(DBMS_LOB.SUBSTR(msg,4000,1) AS VARCHAR2(4000)) as msg FROM jejutravel j JOIN attraction a ON j.contentid=a.contentid WHERE j.contentid=:contentid "
			,nativeQuery = true)
	AttractionDTO jejuAttractionDetail(@Param("contentid")int contentid);
	
}
