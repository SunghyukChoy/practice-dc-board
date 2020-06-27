package com.fakedc.practiceboard.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "posts")
@DynamicInsert
@Getter
@Setter
@ToString
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private long id;

  @Column
  private String title;

  @Column
  private String content;

  @Column
  private String createdBy;

  @JoinColumn(name = "postId")
  @OneToMany
  List<Reply> replies;
}
