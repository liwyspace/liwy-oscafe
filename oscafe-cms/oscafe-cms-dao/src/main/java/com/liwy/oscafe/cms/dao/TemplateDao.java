/*
 * Copy Right LIWY
 * http://www.oscafe.net
 * 2019-06-29 23:42:05
 */
package com.liwy.oscafe.cms.dao;

import com.liwy.oscafe.cms.dao.model.Template;

public interface TemplateDao {
    /**
     * 通过主键删除
     *
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     *
     * @param record
     * @return int
     */
    int insert(Template record);

    /**
     * 可选插入
     *
     * @param record
     * @return int
     */
    int insertSelective(Template record);

    /**
     * 通过主键查询
     *
     * @param id
     * @return com.liwy.oscafe.cms.dao.model.Template
     */
    Template selectByPrimaryKey(Integer id);

    /**
     * 通过主键选择更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(Template record);

    /**
     * 
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeyWithBLOBs(Template record);

    /**
     * 通过主键更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(Template record);
}