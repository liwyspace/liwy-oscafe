/*
 * Copy Right LIWY
 * http://www.oscafe.net
 * 2019-06-29 23:42:05
 */
package com.liwy.oscafe.cms.dao;

import com.liwy.oscafe.cms.dao.model.ContentTagRel;

public interface ContentTagRelDao {
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
    int insert(ContentTagRel record);

    /**
     * 可选插入
     *
     * @param record
     * @return int
     */
    int insertSelective(ContentTagRel record);

    /**
     * 通过主键查询
     *
     * @param id
     * @return com.liwy.oscafe.cms.dao.model.ContentTagRel
     */
    ContentTagRel selectByPrimaryKey(Integer id);

    /**
     * 通过主键选择更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(ContentTagRel record);

    /**
     * 通过主键更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(ContentTagRel record);
}