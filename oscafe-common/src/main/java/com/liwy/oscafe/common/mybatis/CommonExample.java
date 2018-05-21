package com.liwy.oscafe.common.mybatis;

import java.util.ArrayList;
import java.util.List;


/**
 * 公用的sql条件类
 * Created by liwy on 2018/1/20.
 */
public class CommonExample {
    /**
     * 排序条件
     */
    protected String orderByClause;

    /**
     * 是否去除重复行
     */
    protected boolean distinct;

    /**
     * 组合条件列表,将会通过or分割
     */
    protected List<Criteria> oredCriteria;

    public CommonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序方式
     *
     * @param orderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序方式
     *
     * @return
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置是否去除重复行
     *
     * @param distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 判断是否去除重复行
     *
     * @return
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取组合条件列表
     *
     * @return
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 创建组合条件实例
     *
     * @return
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 添加组合条件实例
     *
     * @param criteria
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 添加组合条件
     *
     * @return
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    //=========================== 内部类 ==================================

    /**
     * 组合条件类
     */
    public static class Criteria {
        /**
         * 条件项列表
         */
        private List<Criterion> criteria;

        protected Criteria() {
            criteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 判断是否存在条件项
         *
         * @return
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * 获取条件项列表
         *
         * @return
         */
        public List<Criterion> getAllCriterion() {
            return criteria;
        }

        /**
         * 添加没有值的条件项
         *
         * @param condition
         */
        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
         * 添加一个值或列表值的条件项
         *
         * @param condition
         * @param value
         */
        public void addCriterion(String condition, Object value) {
            if (value == null) {
                throw new RuntimeException("Value cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
         * 添加两个值的条件项
         *
         * @param condition
         * @param value1
         * @param value2
         */
        public void addCriterion(String condition, Object value1, Object value2) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
    }

    /**
     * 条件项类
     */
    public static class Criterion {
        /**
         * 条件
         */
        private String condition;

        /**
         * 值
         */
        private Object value;

        /**
         * 第二个值
         */
        private Object secondValue;

        //类型
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;

        /**
         * 获取条件
         *
         * @return
         */
        public String getCondition() {
            return condition;
        }

        /**
         * 获取值
         *
         * @return
         */
        public Object getValue() {
            return value;
        }

        /**
         * 获取第二个值
         *
         * @return
         */
        public Object getSecondValue() {
            return secondValue;
        }

        //判断类型
        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        /**
         * 构造没有值的条件项
         *
         * @param condition
         */
        protected Criterion(String condition) {
            this.condition = condition;
            this.noValue = true;
        }

        /**
         * 构造一个值或列表值的条件项
         *
         * @param condition
         * @param value
         */
        protected Criterion(String condition, Object value) {
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        /**
         * 构造两个值得条件项
         *
         * @param condition
         * @param value
         * @param secondValue
         */
        protected Criterion(String condition, Object value, Object secondValue) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}
