package com.fakedc.practiceboard.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "members")
@DynamicUpdate
@DynamicInsert
@Getter
@Setter
@ToString
public class Member {

  @Id
  @Column
  private String id;
  @Column
  private String password;
  @Column
  private String lastName;
  @Column
  private String firstName;
  @Column
  private String nickname;
  @Column
  private String email;
  @Column
  private LocalDateTime registerDate;

  @JoinColumn(name = "createdBy")
  @OneToMany
  List<Post> writedPosts;

  public void readyToUpdate(Member member) {
    this.password = member.password;
    this.firstName = member.firstName;
    this.lastName = member.lastName;
    this.nickname = member.nickname;
    this.email = member.email;
  }
}
