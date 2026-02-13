package com.sist.web.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.service.MemberService;
import com.sist.web.service.TravelService;

import lombok.RequiredArgsConstructor;
import java.util.*;
import com.sist.web.dto.*;
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins="*")
public class MainRestController {
	private final TravelService tService;
	private final MemberService mService;
	@GetMapping("/main_react")
	public ResponseEntity<Map> main_react(){
		Map map = new HashMap();
		try {
			CommonsDTO mainDTO = tService.seoulMainData();
			List<CommonsDTO> seoulList = tService.seoulMainListData();
			List<CommonsDTO> busanList = tService.busanMainListData();
			List<CommonsDTO> jejuList = tService.jejuMainListData();
			map.put("mainVO", mainDTO);
			map.put("sList", seoulList);
			map.put("bList", busanList);
			map.put("jList", jejuList);
		}
		catch(Exception ex) {
		ex.printStackTrace();
		return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
	
	@GetMapping("/member/login/{id}/{pwd}")
	public ResponseEntity<MemberDTO> member_login(@PathVariable("id")String id,@PathVariable("pwd")String pwd)
	{
		MemberDTO dto = null;
		try {
			dto=mService.memberLogin(id, pwd);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
}
