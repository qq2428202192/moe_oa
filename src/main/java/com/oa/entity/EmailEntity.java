package com.oa.entity;

import java.sql.Timestamp;

/**
* 邮件实体类
*/
public class EmailEntity {

  private Integer em_id;  //id
  private Integer sender_id;  //发送人id
  private String sender_name;  //发送人名字
  private Integer accepter_id;  //接受人id
  private String accepter_name;  //接受人名字
  private String email_name;  //主题名
  private Timestamp send_time;  //发送时间
  private String content;  //内容
  private String attachment;  //附件

}
