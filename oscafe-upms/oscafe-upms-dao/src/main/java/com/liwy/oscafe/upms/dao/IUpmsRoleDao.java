package com.liwy.oscafe.upms.dao;

import com.liwy.oscafe.common.mybatis.CommonExample;
import com.liwy.oscafe.upms.entity.UpmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liwy on 2018/2/25.
 */
public interface IUpmsRoleDao {
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
    int insert(UpmsRole upmsRole);

    /**
     * 选择性的插入对象
     * @param upmsRole
     * @return
     */
    int insertSelective(UpmsRole upmsRole);

    /**
     * 通过条件查询
     * @return
     */
    List<UpmsRole> selectByExample(CommonExample example);

    /**
     * 通过主键查询
     * @param userId
     * @return
     */
    UpmsRole selectByPrimaryKey(Integer userId);

    /**
     * 根据条件有选择性的更新
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") UpmsRole record, @Param("example") CommonExample example);

    /**
     * 根据条件更新
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") UpmsRole record, @Param("example") CommonExample example);

    /**
     * 根据主键有选择性的更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UpmsRole record);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(UpmsRole record);
}
