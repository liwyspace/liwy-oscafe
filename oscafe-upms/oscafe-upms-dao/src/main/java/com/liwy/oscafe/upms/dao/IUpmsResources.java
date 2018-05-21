package com.liwy.oscafe.upms.dao;

import com.liwy.oscafe.common.mybatis.CommonExample;
import com.liwy.oscafe.upms.entity.UpmsOrganization;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liwy on 2018/2/25.
 */
public interface IUpmsResources {
    /**
     * 根据条件统计
     * @return
     */
    long countByExample(CommonExample example);

    /**
     * 根据条件删除
     * @return
     */
    int deleteByExample(CommonExample example);

    /**
     * 根据主键删除
     * @return
     */
    int deleteByPrimaryKey();

    /**
     * 插入对象
     * @return
     */
    int insert(UpmsOrganization upmsOrganization);

    /**
     * 选择性的插入对象
     * @param upmsOrganization
     * @return
     */
    int insertSelective(UpmsOrganization upmsOrganization);

    /**
     * 通过条件查询
     * @return
     */
    List<UpmsOrganization> selectByExample(CommonExample example);

    /**
     * 通过主键查询
     * @param orgId
     * @return
     */
    UpmsOrganization selectByPrimaryKey(Integer orgId);

    /**
     * 根据条件有选择性的更新
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") UpmsOrganization record, @Param("example") CommonExample example);

    /**
     * 根据条件更新
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") UpmsOrganization record, @Param("example") CommonExample example);

    /**
     * 根据主键有选择性的更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UpmsOrganization record);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(UpmsOrganization record);
}
