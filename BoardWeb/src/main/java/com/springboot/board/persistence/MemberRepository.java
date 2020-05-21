package com.springboot.board.persistence;

import org.springframework.data.repository.CrudRepository;

import com.springboot.board.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
