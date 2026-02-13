package com.sist.web.service;
import java.util.*;

import org.springframework.stereotype.Service;

import com.sist.web.dto.AttractionDTO;
import com.sist.web.dto.CommonsDTO;
import com.sist.web.repository.*;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class TravelServiceImpl implements TravelService{
	private final SeoulTravelRepository sRepo;
	private final BusanTravelRepository bRepo;
	private final JejuTravelRepository jRepo;
	
	@Override
	public List<CommonsDTO> busanMainListData() {
		// TODO Auto-generated method stub
		return bRepo.busanMainListData();
	}
	@Override
	public List<CommonsDTO> jejuMainListData() {
		// TODO Auto-generated method stub
		return jRepo.jejuMainListData();
	}
	@Override
	public CommonsDTO seoulMainData() {
		// TODO Auto-generated method stub
		return sRepo.seoulMainData();
	}
	@Override
	public List<CommonsDTO> seoulMainListData() {
		// TODO Auto-generated method stub
		return sRepo.seoulMainListData();
	}
	@Override
	public List<AttractionDTO> jejuAttractionData(int start) {
		// TODO Auto-generated method stub
		List<AttractionDTO> list = jRepo.jejuAttractionData(start);
		return list;
	}
	@Override
	public int jejuDetailTotalPage(int contenttype) {
		// TODO Auto-generated method stub
		return jRepo.jejuDetailTotalPage(contenttype);
	}
	@Override
	public AttractionDTO jejuAttractionDetail(int contentid) {
		// TODO Auto-generated method stub
		return jRepo.jejuAttractionDetail(contentid);
	}
	
}
