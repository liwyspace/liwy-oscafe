package com.liwy.oscafe.common;

import java.io.Serializable;

/**
 * 自定义枚举接口
 *
 * @author liwy
 * @date 2019-07-04 17:12
 */
public interface IEnumValue<T extends Serializable> {

    /**
     * 枚举数据库存储值
     */
    T getValue();
}
