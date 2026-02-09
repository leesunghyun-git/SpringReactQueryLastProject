package com.sist.web.service;

import java.util.List;


import com.sist.web.dto.CommonsDTO;

public interface TravelService {
	CommonsDTO seoulMainData();
	List<CommonsDTO> seoulMainListData();
	List<CommonsDTO> busanMainListData();
	List<CommonsDTO> jejuMainListData();
}
