/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/12/07 22:24:41                           */
/*==============================================================*/

/*==============================================================*/
/* Table: upms_organization                                     */
/*==============================================================*/
drop table if exists upms_organization;
create table upms_organization
(
   org_id               int(10) not null comment '主键，编号',
   pid                  int(10) comment '上级组织编号',
   name                 varchar(20) not null comment '组织名称',
   description          varchar(1000) comment '描述',
   ctime                bigint(20) not null comment '创建时间',
   primary key (org_id)
);

alter table upms_organization comment '组织信息表';
