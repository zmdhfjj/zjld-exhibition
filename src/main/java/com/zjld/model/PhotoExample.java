package com.zjld.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PhotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotoExample() {
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

        public Criteria andPhotoNameIsNull() {
            addCriterion("photo_name is null");
            return (Criteria) this;
        }

        public Criteria andPhotoNameIsNotNull() {
            addCriterion("photo_name is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoNameEqualTo(String value) {
            addCriterion("photo_name =", value, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameNotEqualTo(String value) {
            addCriterion("photo_name <>", value, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameGreaterThan(String value) {
            addCriterion("photo_name >", value, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameGreaterThanOrEqualTo(String value) {
            addCriterion("photo_name >=", value, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameLessThan(String value) {
            addCriterion("photo_name <", value, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameLessThanOrEqualTo(String value) {
            addCriterion("photo_name <=", value, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameLike(String value) {
            addCriterion("photo_name like", value, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameNotLike(String value) {
            addCriterion("photo_name not like", value, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameIn(List<String> values) {
            addCriterion("photo_name in", values, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameNotIn(List<String> values) {
            addCriterion("photo_name not in", values, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameBetween(String value1, String value2) {
            addCriterion("photo_name between", value1, value2, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoNameNotBetween(String value1, String value2) {
            addCriterion("photo_name not between", value1, value2, "photoName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameIsNull() {
            addCriterion("photo_real_name is null");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameIsNotNull() {
            addCriterion("photo_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameEqualTo(String value) {
            addCriterion("photo_real_name =", value, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameNotEqualTo(String value) {
            addCriterion("photo_real_name <>", value, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameGreaterThan(String value) {
            addCriterion("photo_real_name >", value, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("photo_real_name >=", value, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameLessThan(String value) {
            addCriterion("photo_real_name <", value, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameLessThanOrEqualTo(String value) {
            addCriterion("photo_real_name <=", value, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameLike(String value) {
            addCriterion("photo_real_name like", value, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameNotLike(String value) {
            addCriterion("photo_real_name not like", value, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameIn(List<String> values) {
            addCriterion("photo_real_name in", values, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameNotIn(List<String> values) {
            addCriterion("photo_real_name not in", values, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameBetween(String value1, String value2) {
            addCriterion("photo_real_name between", value1, value2, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoRealNameNotBetween(String value1, String value2) {
            addCriterion("photo_real_name not between", value1, value2, "photoRealName");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("photo_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("photo_url =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("photo_url <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("photo_url >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photo_url >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("photo_url <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("photo_url <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("photo_url like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("photo_url not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("photo_url in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("photo_url not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("photo_url between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("photo_url not between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryIsNull() {
            addCriterion("photo_memory is null");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryIsNotNull() {
            addCriterion("photo_memory is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryEqualTo(Long value) {
            addCriterion("photo_memory =", value, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryNotEqualTo(Long value) {
            addCriterion("photo_memory <>", value, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryGreaterThan(Long value) {
            addCriterion("photo_memory >", value, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryGreaterThanOrEqualTo(Long value) {
            addCriterion("photo_memory >=", value, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryLessThan(Long value) {
            addCriterion("photo_memory <", value, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryLessThanOrEqualTo(Long value) {
            addCriterion("photo_memory <=", value, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryIn(List<Long> values) {
            addCriterion("photo_memory in", values, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryNotIn(List<Long> values) {
            addCriterion("photo_memory not in", values, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryBetween(Long value1, Long value2) {
            addCriterion("photo_memory between", value1, value2, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoMemoryNotBetween(Long value1, Long value2) {
            addCriterion("photo_memory not between", value1, value2, "photoMemory");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightIsNull() {
            addCriterion("photo_height is null");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightIsNotNull() {
            addCriterion("photo_height is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightEqualTo(Integer value) {
            addCriterion("photo_height =", value, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightNotEqualTo(Integer value) {
            addCriterion("photo_height <>", value, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightGreaterThan(Integer value) {
            addCriterion("photo_height >", value, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_height >=", value, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightLessThan(Integer value) {
            addCriterion("photo_height <", value, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightLessThanOrEqualTo(Integer value) {
            addCriterion("photo_height <=", value, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightIn(List<Integer> values) {
            addCriterion("photo_height in", values, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightNotIn(List<Integer> values) {
            addCriterion("photo_height not in", values, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightBetween(Integer value1, Integer value2) {
            addCriterion("photo_height between", value1, value2, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_height not between", value1, value2, "photoHeight");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthIsNull() {
            addCriterion("photo_width is null");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthIsNotNull() {
            addCriterion("photo_width is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthEqualTo(Integer value) {
            addCriterion("photo_width =", value, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthNotEqualTo(Integer value) {
            addCriterion("photo_width <>", value, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthGreaterThan(Integer value) {
            addCriterion("photo_width >", value, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_width >=", value, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthLessThan(Integer value) {
            addCriterion("photo_width <", value, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthLessThanOrEqualTo(Integer value) {
            addCriterion("photo_width <=", value, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthIn(List<Integer> values) {
            addCriterion("photo_width in", values, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthNotIn(List<Integer> values) {
            addCriterion("photo_width not in", values, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthBetween(Integer value1, Integer value2) {
            addCriterion("photo_width between", value1, value2, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_width not between", value1, value2, "photoWidth");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeIsNull() {
            addCriterion("photo_type is null");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeIsNotNull() {
            addCriterion("photo_type is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeEqualTo(String value) {
            addCriterion("photo_type =", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeNotEqualTo(String value) {
            addCriterion("photo_type <>", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeGreaterThan(String value) {
            addCriterion("photo_type >", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("photo_type >=", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeLessThan(String value) {
            addCriterion("photo_type <", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeLessThanOrEqualTo(String value) {
            addCriterion("photo_type <=", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeLike(String value) {
            addCriterion("photo_type like", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeNotLike(String value) {
            addCriterion("photo_type not like", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeIn(List<String> values) {
            addCriterion("photo_type in", values, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeNotIn(List<String> values) {
            addCriterion("photo_type not in", values, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeBetween(String value1, String value2) {
            addCriterion("photo_type between", value1, value2, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeNotBetween(String value1, String value2) {
            addCriterion("photo_type not between", value1, value2, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionIsNull() {
            addCriterion("photo_description is null");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionIsNotNull() {
            addCriterion("photo_description is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionEqualTo(String value) {
            addCriterion("photo_description =", value, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionNotEqualTo(String value) {
            addCriterion("photo_description <>", value, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionGreaterThan(String value) {
            addCriterion("photo_description >", value, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("photo_description >=", value, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionLessThan(String value) {
            addCriterion("photo_description <", value, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("photo_description <=", value, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionLike(String value) {
            addCriterion("photo_description like", value, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionNotLike(String value) {
            addCriterion("photo_description not like", value, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionIn(List<String> values) {
            addCriterion("photo_description in", values, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionNotIn(List<String> values) {
            addCriterion("photo_description not in", values, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionBetween(String value1, String value2) {
            addCriterion("photo_description between", value1, value2, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andPhotoDescriptionNotBetween(String value1, String value2) {
            addCriterion("photo_description not between", value1, value2, "photoDescription");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
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