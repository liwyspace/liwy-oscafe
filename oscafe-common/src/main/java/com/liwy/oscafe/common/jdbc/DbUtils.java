package com.liwy.oscafe.common.jdbc;

import com.liwy.commons.lang.collection.CollectionUtils;

import java.util.List;

/**
 * @author liwy
 * @date 2019-07-04 14:13
 */
public class DbUtils {
    /**
     * <p>
     * 判断数据库操作是否成功
     * </p>
     *
     * @param result 数据库操作返回影响条数
     * @return boolean
     */
    public static boolean retBool(Integer result) {
        return null != result && result >= 1;
    }

    /**
     * <p>
     * 从list中取第一条数据返回对应List中泛型的单个结果
     * </p>
     *
     * @param list
     * @param <E>
     * @return
     */
    public static <E> E getObject(List<E> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            int size = list.size();
            if (size > 1) {
                System.out.println(String.format("Warn: execute Method There are  %s results.", size));
            }
            return list.get(0);
        }
        return null;
    }
}
