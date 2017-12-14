package com.oa.entity;

import java.sql.Timestamp;

/**
* 上下班考勤实体类
*/
public class CommuterRegistrationEntity {

  private Integer cr_id; //考勤id;
  private Timestamp working_time; //上班时间;
  private Timestamp closed_time; //下班时间;
  private Integer us_id; //登记id;
  private String name; //登记人名;

}
