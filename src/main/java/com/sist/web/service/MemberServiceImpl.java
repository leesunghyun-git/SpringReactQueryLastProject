package com.sist.web.service;

import org.springframework.stereotype.Service;

import com.sist.web.dto.MemberDTO;
import com.sist.web.entity.MemberEntity;
import com.sist.web.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
	private final MemberRepository mRepo;
	
	@Override
	public MemberDTO memberLogin(String id, String pwd) {
		// TODO Auto-generated method stub
		MemberDTO dto = new MemberDTO();
		if(mRepo.countById(id)!=1)
		{
			dto.setMsg("NOID");
			return dto;
		}
		MemberEntity dbvo = mRepo.findMemberEntityById(id);
		if(dbvo.getPwd().equals(pwd))
		{
			dto.setId(dbvo.getId());
			dto.setName(dbvo.getName());
			dto.setMsg("OK");
		}
		else {
			dto.setMsg("NOPWD");
		}
		return dto;
	}
}
