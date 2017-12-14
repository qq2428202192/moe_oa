package com.oa.entity;

import java.sql.Timestamp;

/**
 * 出差 加班 病假 事假实体类
 */
public class Attendance {

  private Integer at_id; //id
  private String reason; //原因
  private String type; //类型
  private String name; //登记人名
  private Integer us_id; //登记id
  private Timestamp start_time; //开始时间
  private Timestamp end_time; //结束时间
  private Timestamp length_time; //时长
  private String remark; //备注

}
