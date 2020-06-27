package com.fakedc.practiceboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fakedc.practiceboard.domain.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
