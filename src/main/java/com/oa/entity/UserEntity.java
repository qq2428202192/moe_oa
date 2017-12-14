package com.oa.entity;

import java.sql.Timestamp;

/**
* 用户实体类
*/
public class UserEntity {

  private Integer us_id; //用户id
  private String login_name; //登陆名
  private String login_pas; //登录密码
  private Integer pas_error_num; //密码错误次数
  private String user_name; //用户名
  private Timestamp create_time; //创立时间
  private Timestamp last_login_time; //最后登陆时间
  private String is_locking; //是否锁定
  private Timestamp locking_time; //锁定时间
  private String is_delete; //是否删除
  private Integer do_id; //档案关联
  private String string1; //预留

  public Integer getUs_id() {
    return us_id;
  }

  public void setUs_id(Integer us_id) {
    this.us_id = us_id;
  }

  public String getLogin_name() {
    return login_name;
  }

  public void setLogin_name(String login_name) {
    this.login_name = login_name;
  }

  public String getLogin_pas() {
    return login_pas;
  }

  public void setLogin_pas(String login_pas) {
    this.login_pas = login_pas;
  }

  public Integer getPas_error_num() {
    return pas_error_num;
  }

  public void setPas_error_num(Integer pas_error_num) {
    this.pas_error_num = pas_error_num;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public Timestamp getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Timestamp create_time) {
    this.create_time = create_time;
  }

  public Timestamp getLast_login_time() {
    return last_login_time;
  }

  public void setLast_login_time(Timestamp last_login_time) {
    this.last_login_time = last_login_time;
  }

  public String getIs_locking() {
    return is_locking;
  }

  public void setIs_locking(String is_locking) {
    this.is_locking = is_locking;
  }

  public Timestamp getLocking_time() {
    return locking_time;
  }

  public void setLocking_time(Timestamp locking_time) {
    this.locking_time = locking_time;
  }

  public String getIs_delete() {
    return is_delete;
  }

  public void setIs_delete(String is_delete) {
    this.is_delete = is_delete;
  }

  public Integer getDo_id() {
    return do_id;
  }

  public void setDo_id(Integer do_id) {
    this.do_id = do_id;
  }

  public String getString1() {
    return string1;
  }

  public void setString1(String string1) {
    this.string1 = string1;
  }
}
