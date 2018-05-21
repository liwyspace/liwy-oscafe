/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/19 22:24:41                           */
/*==============================================================*/


drop table if exists upms_organization;

drop table if exists upms_resources;

drop table if exists upms_role;

drop table if exists upms_role_res;

drop table if exists upms_user;

drop table if exists upms_user_org;

drop table if exists upms_user_res;

drop table if exists upms_user_role;

/*==============================================================*/
/* Table: upms_organization                                     */
/*==============================================================*/
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

/*==============================================================*/
/* Table: upms_resources                                        */
/*==============================================================*/
create table upms_resources
(
   res_id               int(10) not null comment '编号',
   pid                  int(10) comment '上级编号',
   name                 varchar(20) not null comment '名称',
   type                 tinyint(4) not null comment '类型（0：菜单1：目录2：按钮）',
   uri                  varchar(100) comment 'URI',
   icon                 varchar(50) comment '图标',
   status               tinyint(4) comment '状态（0：禁用1：正常）',
   ctime                bigint(20) not null comment '创建时间',
   orders               bigint(20) comment '排序',
   primary key (res_id)
);

alter table upms_resources comment '资源信息表';

/*==============================================================*/
/* Table: upms_role                                             */
/*==============================================================*/
create table upms_role
(
   role_id              int(10) not null comment '角色id',
   name                 varchar(20) not null comment '角色名称',
   description          varchar(1000) comment '角色描述',
   ctime                bigint(20) not null comment '创建时间',
   primary key (role_id)
);

alter table upms_role comment '角色信息表';

/*==============================================================*/
/* Table: upms_role_res                                         */
/*==============================================================*/
create table upms_role_res
(
   role_res_id          int(10) not null comment '编号',
   role_id              int(10) comment '角色编号',
   res_id               int(10) comment '资源编号',
   primary key (role_res_id)
);

alter table upms_role_res comment '角色资源关联表';

/*==============================================================*/
/* Table: upms_user                                             */
/*==============================================================*/
create table upms_user
(
   user_id              int(10) not null comment '主键',
   username             varchar(20) not null comment '用户账号',
   password             varchar(32) not null comment '密码MD5加密',
   nickname             varchar(20) comment '昵称',
   headpic              varchar(150) comment '头像',
   realname             varchar(20) comment '真实姓名',
   sex                  tinyint(4) comment '性别',
   email                varchar(50) comment '邮箱',
   phone                varchar(20) comment '电话',
   status               tinyint(4) not null comment '状态 （0：正常，1：锁定）',
   ctime                bigint(20) not null comment '创建时间',
   primary key (user_id)
);

alter table upms_user comment '用户信息表';

/*==============================================================*/
/* Table: upms_user_org                                         */
/*==============================================================*/
create table upms_user_org
(
   user_org_id          int(10) unsigned not null auto_increment comment '编号',
   user_id              int(10) unsigned not null comment '用户编号',
   org_id               int(10) unsigned not null comment '组织编号',
   primary key (user_org_id)
);

alter table upms_user_org comment '用户组织关联表';

/*==============================================================*/
/* Table: upms_user_res                                         */
/*==============================================================*/
create table upms_user_res
(
   user_res_id          int(10) not null comment '编号',
   user_id              int(10) not null comment '用户编号',
   res_id               int(10) not null comment '资源编号',
   type                 tinyint(4) not null comment '关联类型（1：加权，-1：减权）',
   primary key (user_res_id)
);

alter table upms_user_res comment '用户资源关联表';

/*==============================================================*/
/* Table: upms_user_role                                        */
/*==============================================================*/
create table upms_user_role
(
   user_role_id         int(10) unsigned not null auto_increment comment '编号',
   user_id              int(10) unsigned not null comment '用户编号',
   role_id              int(10) comment '角色编号',
   primary key (user_role_id)
);

alter table upms_user_role comment '用户角色关联表';

