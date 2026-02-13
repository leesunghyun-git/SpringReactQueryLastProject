package com.sist.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sist.web.dto.MemberDTO;
import com.sist.web.entity.MemberEntity;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, String>{
//	@Query(value="SELECT COUNT(*) FROM MEMBER_2 WHERE id = :id")
//	int memberIdCount(@Param("id")String id);
//	
	int countById(String id);
	
	MemberEntity findMemberEntityById(String id);
	
	@Query(value="SELECT m.id,m.name,m.address FROM MemberEntity m WHERE m.id = :id")
	MemberDTO loginMemberInfo(String id);
}
