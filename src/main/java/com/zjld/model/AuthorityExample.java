package com.zjld.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNull() {
            addCriterion("authority_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNotNull() {
            addCriterion("authority_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameEqualTo(String value) {
            addCriterion("authority_name =", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotEqualTo(String value) {
            addCriterion("authority_name <>", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThan(String value) {
            addCriterion("authority_name >", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThanOrEqualTo(String value) {
            addCriterion("authority_name >=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThan(String value) {
            addCriterion("authority_name <", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThanOrEqualTo(String value) {
            addCriterion("authority_name <=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLike(String value) {
            addCriterion("authority_name like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotLike(String value) {
            addCriterion("authority_name not like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIn(List<String> values) {
            addCriterion("authority_name in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotIn(List<String> values) {
            addCriterion("authority_name not in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameBetween(String value1, String value2) {
            addCriterion("authority_name between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotBetween(String value1, String value2) {
            addCriterion("authority_name not between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidIsNull() {
            addCriterion("authority_uuid is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidIsNotNull() {
            addCriterion("authority_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidEqualTo(String value) {
            addCriterion("authority_uuid =", value, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidNotEqualTo(String value) {
            addCriterion("authority_uuid <>", value, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidGreaterThan(String value) {
            addCriterion("authority_uuid >", value, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidGreaterThanOrEqualTo(String value) {
            addCriterion("authority_uuid >=", value, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidLessThan(String value) {
            addCriterion("authority_uuid <", value, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidLessThanOrEqualTo(String value) {
            addCriterion("authority_uuid <=", value, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidLike(String value) {
            addCriterion("authority_uuid like", value, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidNotLike(String value) {
            addCriterion("authority_uuid not like", value, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidIn(List<String> values) {
            addCriterion("authority_uuid in", values, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidNotIn(List<String> values) {
            addCriterion("authority_uuid not in", values, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidBetween(String value1, String value2) {
            addCriterion("authority_uuid between", value1, value2, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUuidNotBetween(String value1, String value2) {
            addCriterion("authority_uuid not between", value1, value2, "authorityUuid");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlIsNull() {
            addCriterion("authority_url is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlIsNotNull() {
            addCriterion("authority_url is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlEqualTo(String value) {
            addCriterion("authority_url =", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlNotEqualTo(String value) {
            addCriterion("authority_url <>", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlGreaterThan(String value) {
            addCriterion("authority_url >", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlGreaterThanOrEqualTo(String value) {
            addCriterion("authority_url >=", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlLessThan(String value) {
            addCriterion("authority_url <", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlLessThanOrEqualTo(String value) {
            addCriterion("authority_url <=", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlLike(String value) {
            addCriterion("authority_url like", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlNotLike(String value) {
            addCriterion("authority_url not like", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlIn(List<String> values) {
            addCriterion("authority_url in", values, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlNotIn(List<String> values) {
            addCriterion("authority_url not in", values, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlBetween(String value1, String value2) {
            addCriterion("authority_url between", value1, value2, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlNotBetween(String value1, String value2) {
            addCriterion("authority_url not between", value1, value2, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlIsNull() {
            addCriterion("authority_html is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlIsNotNull() {
            addCriterion("authority_html is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlEqualTo(String value) {
            addCriterion("authority_html =", value, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlNotEqualTo(String value) {
            addCriterion("authority_html <>", value, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlGreaterThan(String value) {
            addCriterion("authority_html >", value, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlGreaterThanOrEqualTo(String value) {
            addCriterion("authority_html >=", value, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlLessThan(String value) {
            addCriterion("authority_html <", value, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlLessThanOrEqualTo(String value) {
            addCriterion("authority_html <=", value, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlLike(String value) {
            addCriterion("authority_html like", value, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlNotLike(String value) {
            addCriterion("authority_html not like", value, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlIn(List<String> values) {
            addCriterion("authority_html in", values, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlNotIn(List<String> values) {
            addCriterion("authority_html not in", values, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlBetween(String value1, String value2) {
            addCriterion("authority_html between", value1, value2, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andAuthorityHtmlNotBetween(String value1, String value2) {
            addCriterion("authority_html not between", value1, value2, "authorityHtml");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeIsNull() {
            addCriterion("creator_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeIsNotNull() {
            addCriterion("creator_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeEqualTo(Date value) {
            addCriterionForJDBCDate("creator_time =", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("creator_time <>", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("creator_time >", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creator_time >=", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeLessThan(Date value) {
            addCriterionForJDBCDate("creator_time <", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creator_time <=", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeIn(List<Date> values) {
            addCriterionForJDBCDate("creator_time in", values, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("creator_time not in", values, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creator_time between", value1, value2, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creator_time not between", value1, value2, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentIsNull() {
            addCriterion("authority_parent is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentIsNotNull() {
            addCriterion("authority_parent is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentEqualTo(String value) {
            addCriterion("authority_parent =", value, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentNotEqualTo(String value) {
            addCriterion("authority_parent <>", value, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentGreaterThan(String value) {
            addCriterion("authority_parent >", value, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentGreaterThanOrEqualTo(String value) {
            addCriterion("authority_parent >=", value, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentLessThan(String value) {
            addCriterion("authority_parent <", value, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentLessThanOrEqualTo(String value) {
            addCriterion("authority_parent <=", value, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentLike(String value) {
            addCriterion("authority_parent like", value, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentNotLike(String value) {
            addCriterion("authority_parent not like", value, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentIn(List<String> values) {
            addCriterion("authority_parent in", values, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentNotIn(List<String> values) {
            addCriterion("authority_parent not in", values, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentBetween(String value1, String value2) {
            addCriterion("authority_parent between", value1, value2, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andAuthorityParentNotBetween(String value1, String value2) {
            addCriterion("authority_parent not between", value1, value2, "authorityParent");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIsNull() {
            addCriterion("authority_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIsNotNull() {
            addCriterion("authority_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeEqualTo(String value) {
            addCriterion("authority_type =", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotEqualTo(String value) {
            addCriterion("authority_type <>", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeGreaterThan(String value) {
            addCriterion("authority_type >", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("authority_type >=", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeLessThan(String value) {
            addCriterion("authority_type <", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeLessThanOrEqualTo(String value) {
            addCriterion("authority_type <=", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeLike(String value) {
            addCriterion("authority_type like", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotLike(String value) {
            addCriterion("authority_type not like", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIn(List<String> values) {
            addCriterion("authority_type in", values, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotIn(List<String> values) {
            addCriterion("authority_type not in", values, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeBetween(String value1, String value2) {
            addCriterion("authority_type between", value1, value2, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotBetween(String value1, String value2) {
            addCriterion("authority_type not between", value1, value2, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionIsNull() {
            addCriterion("authority_permission is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionIsNotNull() {
            addCriterion("authority_permission is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionEqualTo(String value) {
            addCriterion("authority_permission =", value, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionNotEqualTo(String value) {
            addCriterion("authority_permission <>", value, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionGreaterThan(String value) {
            addCriterion("authority_permission >", value, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("authority_permission >=", value, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionLessThan(String value) {
            addCriterion("authority_permission <", value, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionLessThanOrEqualTo(String value) {
            addCriterion("authority_permission <=", value, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionLike(String value) {
            addCriterion("authority_permission like", value, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionNotLike(String value) {
            addCriterion("authority_permission not like", value, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionIn(List<String> values) {
            addCriterion("authority_permission in", values, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionNotIn(List<String> values) {
            addCriterion("authority_permission not in", values, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionBetween(String value1, String value2) {
            addCriterion("authority_permission between", value1, value2, "authorityPermission");
            return (Criteria) this;
        }

        public Criteria andAuthorityPermissionNotBetween(String value1, String value2) {
            addCriterion("authority_permission not between", value1, value2, "authorityPermission");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

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

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}