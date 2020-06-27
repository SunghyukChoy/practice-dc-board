package com.fakedc.practiceboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.fakedc.practiceboard.domain.Member;
import com.fakedc.practiceboard.domain.Post;
import com.fakedc.practiceboard.domain.Reply;
import com.fakedc.practiceboard.repository.MemberRepository;

@Service
public class MemberService {

  @Autowired
  MemberRepository memberRepository;
  @Autowired
  PostService postService;
  @Autowired
  ReplyService replyService;

  // 회원가입
  public Member register(Member member) {
    return memberRepository.save(member);
  }

  // 회원정보보기
  public Member getMember(String id) {
    return memberRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

  // 회원들의 정보 가져오기(List)
  public List<Member> getMembers() {
    return memberRepository.findAll();
  }

  // 회원정보수정
  public Member updateMember(Member member) {
    Member updateMember = getMember(member.getId());
    updateMember.readyToUpdate(member);
    return memberRepository.save(updateMember);
  }

  // 탈퇴
  public void withdraw(String id) {
    memberRepository.deleteById(id);
  }

  // 로그인
  public Member login(String id, String password) {
    // TODO: 구현
    return null;
  }

  // 로그아웃
  public void logout(String id) {
    // TODO: 구현
  }

  // 패스워드찾기
  public Member findPassword(String id) {
    // TODO: 구현
    return null;
  }

  // 아이디찾기 + 이름
  public List<Member> findIdByName(String firstName, String lastName) {
    // TODO: 구현
    return null;
  }

  // 글쓰기
  public Post writePost(Post post) {
    return postService.write(post);
  }

  // 댓글
  public Reply writeReply(Reply reply) {
    return replyService.write(reply);
  }

}
