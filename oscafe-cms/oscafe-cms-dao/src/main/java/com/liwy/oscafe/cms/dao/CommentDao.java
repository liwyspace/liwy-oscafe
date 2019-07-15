/*
 * Copy Right LIWY
 * http://www.oscafe.net
 * 2019-06-29 23:42:05
 */
package com.liwy.oscafe.cms.dao;

import com.liwy.oscafe.cms.dao.model.Comment;

public interface CommentDao {
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
    int insert(Comment record);

    /**
     * 可选插入
     *
     * @param record
     * @return int
     */
    int insertSelective(Comment record);

    /**
     * 通过主键查询
     *
     * @param id
     * @return com.liwy.oscafe.cms.dao.model.Comment
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     * 通过主键选择更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * 
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeyWithBLOBs(Comment record);

    /**
     * 通过主键更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(Comment record);
}