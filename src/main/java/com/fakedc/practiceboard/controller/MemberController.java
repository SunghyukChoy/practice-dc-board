package com.fakedc.practiceboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fakedc.practiceboard.domain.Member;
import com.fakedc.practiceboard.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

  @Autowired
  MemberService memberService;

  @GetMapping(value = "/info/{memberId}")
  public ModelAndView info(@PathVariable String memberId) {
    ModelAndView mv = new ModelAndView("member/info");

    mv.addObject("member", memberService.getMember(memberId));
    return mv;
  }

  @GetMapping(value = "/list")
  public ModelAndView list() {
    ModelAndView mv = new ModelAndView("member/list");

    mv.addObject("memberList", memberService.getMembers());
    return mv;
  }

  @GetMapping(value = "/register")
  public ModelAndView register() {
    ModelAndView mv = new ModelAndView("member/register");

    return mv;
  }

  @PostMapping(value = "/register")
  public String addMember(Member member) {
    memberService.register(member);
    return "redirect:/";
  }

  @PostMapping(value = "/delete")
  public String delete(String id) {
    memberService.withdraw(id);
    return "redirect:/member/list";
  }

  @GetMapping(value = "/update/{id}")
  public ModelAndView update(@PathVariable String id) {
    ModelAndView mv = new ModelAndView("member/update");

    Member member = memberService.getMember(id);

    mv.addObject("member", member);
    return mv;
  }

  @PostMapping(value = "/update/{id}")
  public String updateMember(@PathVariable String id, Member member) {
    memberService.updateMember(member);
    return "redirect:/member/info/" + id;
  }

}
