package com.liwy.oscafe.upms.dao;

import com.liwy.oscafe.common.mybatis.CommonExample;
import com.liwy.oscafe.upms.entity.UpmsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liwy on 2018/1/18.
 */
public interface IUpmsUserDao {

    /**
     * 插入对象
     * @return
     */
    int insert(UpmsUser upmsUser);

    /**
     * 选择性的插入对象
     * @param upmsUser
     * @return
     */
    int insertSelective(UpmsUser upmsUser);

    /**
     * 根据条件删除
     * @return
     */
    int deleteByExample(CommonExample example);

    /**
     * 根据主键删除
     * @return
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * 根据条件更新
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") UpmsUser record, @Param("example") CommonExample example);

    /**
     * 根据主键有选择性的更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UpmsUser record);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(UpmsUser record);

    /**
     * 根据条件统计
     * @return
     */
    long countByExample(CommonExample example);

    /**
     * 通过条件查询
     * @return
     */
    List<UpmsUser> selectByExample(CommonExample example);

    /**
     * 通过主键查询
     * @param userId
     * @return
     */
    UpmsUser selectByPrimaryKey(Integer userId);

    /**
     * 根据条件有选择性的更新
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") UpmsUser record, @Param("example") CommonExample example);
}
