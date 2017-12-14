package com.oa.entity;

import java.sql.Timestamp;

/**
* 档案实体类
*/
public class DossierEntity {
 
  private Integer do_id; //档案编号
  private String name; //姓名
  private String sex; //性别
  private String native_place; //籍贯
  private String id_card; //身份证号
  private String ethnicity; //民族
  private Timestamp birthday; //出生日期
  private Integer age; //年龄
  private String education; //学历
  private String profession; //专业
  private String graduated_school; //毕业学校
  private Integer their_department_id; //所属部门
  private String position; //职位
  private Timestamp entry_time; //入职日期
  private Timestamp leave_time; //离职日期
  private String phone; //手机号
  private String email; //邮箱
  private String common_often; //合同年限
  private Integer us_id; //帐号关联

}
