package com.sist.web.service;

import java.util.List;


import com.sist.web.dto.AttractionDTO;
import com.sist.web.dto.CommonsDTO;

public interface TravelService {
	CommonsDTO seoulMainData();
	List<CommonsDTO> seoulMainListData();
	List<CommonsDTO> busanMainListData();
	List<CommonsDTO> jejuMainListData();
	List<AttractionDTO> jejuAttractionData(int start);
	int jejuDetailTotalPage(int contenttype);
	AttractionDTO jejuAttractionDetail(int contentid);
}
