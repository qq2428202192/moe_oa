package com.oa.entity;

import java.sql.Timestamp;

/**
 * 审核实体类
 */

public class BusinessApproval {

  private Integer ba_id; //业务id
  private String type; //审批类型
  private String Reason; //审批原因
  private String name; //员工名
  private String first_approver; //一层审批人
  private String first_is_consent; //一层是否通过
  private Timestamp first_approver_time; //一层审批时间
  private String second_approver; //二层审批人
  private String second_is_consent; //二层是否通过
  private Timestamp second_approver_time; //二层审批时间

}
