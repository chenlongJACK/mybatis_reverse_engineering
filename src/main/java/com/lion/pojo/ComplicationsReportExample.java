package com.lion.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplicationsReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplicationsReportExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNull() {
            addCriterion("reportDate is null");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNotNull() {
            addCriterion("reportDate is not null");
            return (Criteria) this;
        }

        public Criteria andReportdateEqualTo(Date value) {
            addCriterion("reportDate =", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotEqualTo(Date value) {
            addCriterion("reportDate <>", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThan(Date value) {
            addCriterion("reportDate >", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThanOrEqualTo(Date value) {
            addCriterion("reportDate >=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThan(Date value) {
            addCriterion("reportDate <", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThanOrEqualTo(Date value) {
            addCriterion("reportDate <=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIn(List<Date> values) {
            addCriterion("reportDate in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotIn(List<Date> values) {
            addCriterion("reportDate not in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateBetween(Date value1, Date value2) {
            addCriterion("reportDate between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotBetween(Date value1, Date value2) {
            addCriterion("reportDate not between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidIsNull() {
            addCriterion("baseInfoId is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidIsNotNull() {
            addCriterion("baseInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidEqualTo(String value) {
            addCriterion("baseInfoId =", value, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidNotEqualTo(String value) {
            addCriterion("baseInfoId <>", value, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidGreaterThan(String value) {
            addCriterion("baseInfoId >", value, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("baseInfoId >=", value, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidLessThan(String value) {
            addCriterion("baseInfoId <", value, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidLessThanOrEqualTo(String value) {
            addCriterion("baseInfoId <=", value, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidLike(String value) {
            addCriterion("baseInfoId like", value, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidNotLike(String value) {
            addCriterion("baseInfoId not like", value, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidIn(List<String> values) {
            addCriterion("baseInfoId in", values, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidNotIn(List<String> values) {
            addCriterion("baseInfoId not in", values, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidBetween(String value1, String value2) {
            addCriterion("baseInfoId between", value1, value2, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseinfoidNotBetween(String value1, String value2) {
            addCriterion("baseInfoId not between", value1, value2, "baseinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidIsNull() {
            addCriterion("baseUserInfoId is null");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidIsNotNull() {
            addCriterion("baseUserInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidEqualTo(String value) {
            addCriterion("baseUserInfoId =", value, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidNotEqualTo(String value) {
            addCriterion("baseUserInfoId <>", value, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidGreaterThan(String value) {
            addCriterion("baseUserInfoId >", value, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("baseUserInfoId >=", value, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidLessThan(String value) {
            addCriterion("baseUserInfoId <", value, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidLessThanOrEqualTo(String value) {
            addCriterion("baseUserInfoId <=", value, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidLike(String value) {
            addCriterion("baseUserInfoId like", value, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidNotLike(String value) {
            addCriterion("baseUserInfoId not like", value, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidIn(List<String> values) {
            addCriterion("baseUserInfoId in", values, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidNotIn(List<String> values) {
            addCriterion("baseUserInfoId not in", values, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidBetween(String value1, String value2) {
            addCriterion("baseUserInfoId between", value1, value2, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andBaseuserinfoidNotBetween(String value1, String value2) {
            addCriterion("baseUserInfoId not between", value1, value2, "baseuserinfoid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidIsNull() {
            addCriterion("registeredHospitalId is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidIsNotNull() {
            addCriterion("registeredHospitalId is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidEqualTo(String value) {
            addCriterion("registeredHospitalId =", value, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidNotEqualTo(String value) {
            addCriterion("registeredHospitalId <>", value, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidGreaterThan(String value) {
            addCriterion("registeredHospitalId >", value, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidGreaterThanOrEqualTo(String value) {
            addCriterion("registeredHospitalId >=", value, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidLessThan(String value) {
            addCriterion("registeredHospitalId <", value, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidLessThanOrEqualTo(String value) {
            addCriterion("registeredHospitalId <=", value, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidLike(String value) {
            addCriterion("registeredHospitalId like", value, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidNotLike(String value) {
            addCriterion("registeredHospitalId not like", value, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidIn(List<String> values) {
            addCriterion("registeredHospitalId in", values, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidNotIn(List<String> values) {
            addCriterion("registeredHospitalId not in", values, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidBetween(String value1, String value2) {
            addCriterion("registeredHospitalId between", value1, value2, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalidNotBetween(String value1, String value2) {
            addCriterion("registeredHospitalId not between", value1, value2, "registeredhospitalid");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalIsNull() {
            addCriterion("registeredHospital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalIsNotNull() {
            addCriterion("registeredHospital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalEqualTo(String value) {
            addCriterion("registeredHospital =", value, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalNotEqualTo(String value) {
            addCriterion("registeredHospital <>", value, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalGreaterThan(String value) {
            addCriterion("registeredHospital >", value, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalGreaterThanOrEqualTo(String value) {
            addCriterion("registeredHospital >=", value, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalLessThan(String value) {
            addCriterion("registeredHospital <", value, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalLessThanOrEqualTo(String value) {
            addCriterion("registeredHospital <=", value, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalLike(String value) {
            addCriterion("registeredHospital like", value, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalNotLike(String value) {
            addCriterion("registeredHospital not like", value, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalIn(List<String> values) {
            addCriterion("registeredHospital in", values, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalNotIn(List<String> values) {
            addCriterion("registeredHospital not in", values, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalBetween(String value1, String value2) {
            addCriterion("registeredHospital between", value1, value2, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andRegisteredhospitalNotBetween(String value1, String value2) {
            addCriterion("registeredHospital not between", value1, value2, "registeredhospital");
            return (Criteria) this;
        }

        public Criteria andPatientnameIsNull() {
            addCriterion("patientName is null");
            return (Criteria) this;
        }

        public Criteria andPatientnameIsNotNull() {
            addCriterion("patientName is not null");
            return (Criteria) this;
        }

        public Criteria andPatientnameEqualTo(String value) {
            addCriterion("patientName =", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotEqualTo(String value) {
            addCriterion("patientName <>", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThan(String value) {
            addCriterion("patientName >", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThanOrEqualTo(String value) {
            addCriterion("patientName >=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThan(String value) {
            addCriterion("patientName <", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThanOrEqualTo(String value) {
            addCriterion("patientName <=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLike(String value) {
            addCriterion("patientName like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotLike(String value) {
            addCriterion("patientName not like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameIn(List<String> values) {
            addCriterion("patientName in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotIn(List<String> values) {
            addCriterion("patientName not in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameBetween(String value1, String value2) {
            addCriterion("patientName between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotBetween(String value1, String value2) {
            addCriterion("patientName not between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientageIsNull() {
            addCriterion("patientAge is null");
            return (Criteria) this;
        }

        public Criteria andPatientageIsNotNull() {
            addCriterion("patientAge is not null");
            return (Criteria) this;
        }

        public Criteria andPatientageEqualTo(Integer value) {
            addCriterion("patientAge =", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageNotEqualTo(Integer value) {
            addCriterion("patientAge <>", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageGreaterThan(Integer value) {
            addCriterion("patientAge >", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientAge >=", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageLessThan(Integer value) {
            addCriterion("patientAge <", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageLessThanOrEqualTo(Integer value) {
            addCriterion("patientAge <=", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageIn(List<Integer> values) {
            addCriterion("patientAge in", values, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageNotIn(List<Integer> values) {
            addCriterion("patientAge not in", values, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageBetween(Integer value1, Integer value2) {
            addCriterion("patientAge between", value1, value2, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageNotBetween(Integer value1, Integer value2) {
            addCriterion("patientAge not between", value1, value2, "patientage");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("stage is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("stage is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(Integer value) {
            addCriterion("stage =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(Integer value) {
            addCriterion("stage <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(Integer value) {
            addCriterion("stage >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("stage >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(Integer value) {
            addCriterion("stage <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(Integer value) {
            addCriterion("stage <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<Integer> values) {
            addCriterion("stage in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<Integer> values) {
            addCriterion("stage not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(Integer value1, Integer value2) {
            addCriterion("stage between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(Integer value1, Integer value2) {
            addCriterion("stage not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telePhone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telePhone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telePhone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telePhone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telePhone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telePhone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telePhone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telePhone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telePhone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telePhone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telePhone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telePhone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telePhone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telePhone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisIsNull() {
            addCriterion("preoperativeDiagnosis is null");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisIsNotNull() {
            addCriterion("preoperativeDiagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisEqualTo(String value) {
            addCriterion("preoperativeDiagnosis =", value, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisNotEqualTo(String value) {
            addCriterion("preoperativeDiagnosis <>", value, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisGreaterThan(String value) {
            addCriterion("preoperativeDiagnosis >", value, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("preoperativeDiagnosis >=", value, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisLessThan(String value) {
            addCriterion("preoperativeDiagnosis <", value, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisLessThanOrEqualTo(String value) {
            addCriterion("preoperativeDiagnosis <=", value, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisLike(String value) {
            addCriterion("preoperativeDiagnosis like", value, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisNotLike(String value) {
            addCriterion("preoperativeDiagnosis not like", value, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisIn(List<String> values) {
            addCriterion("preoperativeDiagnosis in", values, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisNotIn(List<String> values) {
            addCriterion("preoperativeDiagnosis not in", values, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisBetween(String value1, String value2) {
            addCriterion("preoperativeDiagnosis between", value1, value2, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andPreoperativediagnosisNotBetween(String value1, String value2) {
            addCriterion("preoperativeDiagnosis not between", value1, value2, "preoperativediagnosis");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalIsNull() {
            addCriterion("firstOperationHospital is null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalIsNotNull() {
            addCriterion("firstOperationHospital is not null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalEqualTo(String value) {
            addCriterion("firstOperationHospital =", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalNotEqualTo(String value) {
            addCriterion("firstOperationHospital <>", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalGreaterThan(String value) {
            addCriterion("firstOperationHospital >", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalGreaterThanOrEqualTo(String value) {
            addCriterion("firstOperationHospital >=", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalLessThan(String value) {
            addCriterion("firstOperationHospital <", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalLessThanOrEqualTo(String value) {
            addCriterion("firstOperationHospital <=", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalLike(String value) {
            addCriterion("firstOperationHospital like", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalNotLike(String value) {
            addCriterion("firstOperationHospital not like", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalIn(List<String> values) {
            addCriterion("firstOperationHospital in", values, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalNotIn(List<String> values) {
            addCriterion("firstOperationHospital not in", values, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalBetween(String value1, String value2) {
            addCriterion("firstOperationHospital between", value1, value2, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalNotBetween(String value1, String value2) {
            addCriterion("firstOperationHospital not between", value1, value2, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidIsNull() {
            addCriterion("firstOperationHospitalId is null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidIsNotNull() {
            addCriterion("firstOperationHospitalId is not null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidEqualTo(String value) {
            addCriterion("firstOperationHospitalId =", value, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidNotEqualTo(String value) {
            addCriterion("firstOperationHospitalId <>", value, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidGreaterThan(String value) {
            addCriterion("firstOperationHospitalId >", value, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidGreaterThanOrEqualTo(String value) {
            addCriterion("firstOperationHospitalId >=", value, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidLessThan(String value) {
            addCriterion("firstOperationHospitalId <", value, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidLessThanOrEqualTo(String value) {
            addCriterion("firstOperationHospitalId <=", value, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidLike(String value) {
            addCriterion("firstOperationHospitalId like", value, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidNotLike(String value) {
            addCriterion("firstOperationHospitalId not like", value, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidIn(List<String> values) {
            addCriterion("firstOperationHospitalId in", values, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidNotIn(List<String> values) {
            addCriterion("firstOperationHospitalId not in", values, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidBetween(String value1, String value2) {
            addCriterion("firstOperationHospitalId between", value1, value2, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalidNotBetween(String value1, String value2) {
            addCriterion("firstOperationHospitalId not between", value1, value2, "firstoperationhospitalid");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateIsNull() {
            addCriterion("firstOperationDate is null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateIsNotNull() {
            addCriterion("firstOperationDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateEqualTo(Date value) {
            addCriterion("firstOperationDate =", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateNotEqualTo(Date value) {
            addCriterion("firstOperationDate <>", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateGreaterThan(Date value) {
            addCriterion("firstOperationDate >", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("firstOperationDate >=", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateLessThan(Date value) {
            addCriterion("firstOperationDate <", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateLessThanOrEqualTo(Date value) {
            addCriterion("firstOperationDate <=", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateIn(List<Date> values) {
            addCriterion("firstOperationDate in", values, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateNotIn(List<Date> values) {
            addCriterion("firstOperationDate not in", values, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateBetween(Date value1, Date value2) {
            addCriterion("firstOperationDate between", value1, value2, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateNotBetween(Date value1, Date value2) {
            addCriterion("firstOperationDate not between", value1, value2, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodIsNull() {
            addCriterion("firstOperationMethod is null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodIsNotNull() {
            addCriterion("firstOperationMethod is not null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodEqualTo(String value) {
            addCriterion("firstOperationMethod =", value, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodNotEqualTo(String value) {
            addCriterion("firstOperationMethod <>", value, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodGreaterThan(String value) {
            addCriterion("firstOperationMethod >", value, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodGreaterThanOrEqualTo(String value) {
            addCriterion("firstOperationMethod >=", value, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodLessThan(String value) {
            addCriterion("firstOperationMethod <", value, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodLessThanOrEqualTo(String value) {
            addCriterion("firstOperationMethod <=", value, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodLike(String value) {
            addCriterion("firstOperationMethod like", value, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodNotLike(String value) {
            addCriterion("firstOperationMethod not like", value, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodIn(List<String> values) {
            addCriterion("firstOperationMethod in", values, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodNotIn(List<String> values) {
            addCriterion("firstOperationMethod not in", values, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodBetween(String value1, String value2) {
            addCriterion("firstOperationMethod between", value1, value2, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andFirstoperationmethodNotBetween(String value1, String value2) {
            addCriterion("firstOperationMethod not between", value1, value2, "firstoperationmethod");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyIsNull() {
            addCriterion("netflixNameAndCompany is null");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyIsNotNull() {
            addCriterion("netflixNameAndCompany is not null");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyEqualTo(String value) {
            addCriterion("netflixNameAndCompany =", value, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyNotEqualTo(String value) {
            addCriterion("netflixNameAndCompany <>", value, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyGreaterThan(String value) {
            addCriterion("netflixNameAndCompany >", value, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("netflixNameAndCompany >=", value, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyLessThan(String value) {
            addCriterion("netflixNameAndCompany <", value, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyLessThanOrEqualTo(String value) {
            addCriterion("netflixNameAndCompany <=", value, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyLike(String value) {
            addCriterion("netflixNameAndCompany like", value, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyNotLike(String value) {
            addCriterion("netflixNameAndCompany not like", value, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyIn(List<String> values) {
            addCriterion("netflixNameAndCompany in", values, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyNotIn(List<String> values) {
            addCriterion("netflixNameAndCompany not in", values, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyBetween(String value1, String value2) {
            addCriterion("netflixNameAndCompany between", value1, value2, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyNotBetween(String value1, String value2) {
            addCriterion("netflixNameAndCompany not between", value1, value2, "netflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidIsNull() {
            addCriterion("netflixNameAndCompanyId is null");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidIsNotNull() {
            addCriterion("netflixNameAndCompanyId is not null");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidEqualTo(String value) {
            addCriterion("netflixNameAndCompanyId =", value, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidNotEqualTo(String value) {
            addCriterion("netflixNameAndCompanyId <>", value, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidGreaterThan(String value) {
            addCriterion("netflixNameAndCompanyId >", value, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("netflixNameAndCompanyId >=", value, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidLessThan(String value) {
            addCriterion("netflixNameAndCompanyId <", value, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidLessThanOrEqualTo(String value) {
            addCriterion("netflixNameAndCompanyId <=", value, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidLike(String value) {
            addCriterion("netflixNameAndCompanyId like", value, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidNotLike(String value) {
            addCriterion("netflixNameAndCompanyId not like", value, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidIn(List<String> values) {
            addCriterion("netflixNameAndCompanyId in", values, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidNotIn(List<String> values) {
            addCriterion("netflixNameAndCompanyId not in", values, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidBetween(String value1, String value2) {
            addCriterion("netflixNameAndCompanyId between", value1, value2, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andNetflixnameandcompanyidNotBetween(String value1, String value2) {
            addCriterion("netflixNameAndCompanyId not between", value1, value2, "netflixnameandcompanyid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsIsNull() {
            addCriterion("afterOperatioMonths is null");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsIsNotNull() {
            addCriterion("afterOperatioMonths is not null");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsEqualTo(Integer value) {
            addCriterion("afterOperatioMonths =", value, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsNotEqualTo(Integer value) {
            addCriterion("afterOperatioMonths <>", value, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsGreaterThan(Integer value) {
            addCriterion("afterOperatioMonths >", value, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsGreaterThanOrEqualTo(Integer value) {
            addCriterion("afterOperatioMonths >=", value, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsLessThan(Integer value) {
            addCriterion("afterOperatioMonths <", value, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsLessThanOrEqualTo(Integer value) {
            addCriterion("afterOperatioMonths <=", value, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsIn(List<Integer> values) {
            addCriterion("afterOperatioMonths in", values, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsNotIn(List<Integer> values) {
            addCriterion("afterOperatioMonths not in", values, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsBetween(Integer value1, Integer value2) {
            addCriterion("afterOperatioMonths between", value1, value2, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andAfteroperatiomonthsNotBetween(Integer value1, Integer value2) {
            addCriterion("afterOperatioMonths not between", value1, value2, "afteroperatiomonths");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionIsNull() {
            addCriterion("complicationsDescription is null");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionIsNotNull() {
            addCriterion("complicationsDescription is not null");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionEqualTo(String value) {
            addCriterion("complicationsDescription =", value, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionNotEqualTo(String value) {
            addCriterion("complicationsDescription <>", value, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionGreaterThan(String value) {
            addCriterion("complicationsDescription >", value, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("complicationsDescription >=", value, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionLessThan(String value) {
            addCriterion("complicationsDescription <", value, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionLessThanOrEqualTo(String value) {
            addCriterion("complicationsDescription <=", value, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionLike(String value) {
            addCriterion("complicationsDescription like", value, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionNotLike(String value) {
            addCriterion("complicationsDescription not like", value, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionIn(List<String> values) {
            addCriterion("complicationsDescription in", values, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionNotIn(List<String> values) {
            addCriterion("complicationsDescription not in", values, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionBetween(String value1, String value2) {
            addCriterion("complicationsDescription between", value1, value2, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andComplicationsdescriptionNotBetween(String value1, String value2) {
            addCriterion("complicationsDescription not between", value1, value2, "complicationsdescription");
            return (Criteria) this;
        }

        public Criteria andHandleIsNull() {
            addCriterion("handle is null");
            return (Criteria) this;
        }

        public Criteria andHandleIsNotNull() {
            addCriterion("handle is not null");
            return (Criteria) this;
        }

        public Criteria andHandleEqualTo(String value) {
            addCriterion("handle =", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotEqualTo(String value) {
            addCriterion("handle <>", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleGreaterThan(String value) {
            addCriterion("handle >", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleGreaterThanOrEqualTo(String value) {
            addCriterion("handle >=", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLessThan(String value) {
            addCriterion("handle <", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLessThanOrEqualTo(String value) {
            addCriterion("handle <=", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLike(String value) {
            addCriterion("handle like", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotLike(String value) {
            addCriterion("handle not like", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleIn(List<String> values) {
            addCriterion("handle in", values, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotIn(List<String> values) {
            addCriterion("handle not in", values, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleBetween(String value1, String value2) {
            addCriterion("handle between", value1, value2, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotBetween(String value1, String value2) {
            addCriterion("handle not between", value1, value2, "handle");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsIsNull() {
            addCriterion("perioperativePeriodComplications is null");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsIsNotNull() {
            addCriterion("perioperativePeriodComplications is not null");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsEqualTo(String value) {
            addCriterion("perioperativePeriodComplications =", value, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsNotEqualTo(String value) {
            addCriterion("perioperativePeriodComplications <>", value, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsGreaterThan(String value) {
            addCriterion("perioperativePeriodComplications >", value, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsGreaterThanOrEqualTo(String value) {
            addCriterion("perioperativePeriodComplications >=", value, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsLessThan(String value) {
            addCriterion("perioperativePeriodComplications <", value, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsLessThanOrEqualTo(String value) {
            addCriterion("perioperativePeriodComplications <=", value, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsLike(String value) {
            addCriterion("perioperativePeriodComplications like", value, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsNotLike(String value) {
            addCriterion("perioperativePeriodComplications not like", value, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsIn(List<String> values) {
            addCriterion("perioperativePeriodComplications in", values, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsNotIn(List<String> values) {
            addCriterion("perioperativePeriodComplications not in", values, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsBetween(String value1, String value2) {
            addCriterion("perioperativePeriodComplications between", value1, value2, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andPerioperativeperiodcomplicationsNotBetween(String value1, String value2) {
            addCriterion("perioperativePeriodComplications not between", value1, value2, "perioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsIsNull() {
            addCriterion("otherPerioperativePeriodComplications is null");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsIsNotNull() {
            addCriterion("otherPerioperativePeriodComplications is not null");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsEqualTo(String value) {
            addCriterion("otherPerioperativePeriodComplications =", value, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsNotEqualTo(String value) {
            addCriterion("otherPerioperativePeriodComplications <>", value, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsGreaterThan(String value) {
            addCriterion("otherPerioperativePeriodComplications >", value, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsGreaterThanOrEqualTo(String value) {
            addCriterion("otherPerioperativePeriodComplications >=", value, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsLessThan(String value) {
            addCriterion("otherPerioperativePeriodComplications <", value, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsLessThanOrEqualTo(String value) {
            addCriterion("otherPerioperativePeriodComplications <=", value, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsLike(String value) {
            addCriterion("otherPerioperativePeriodComplications like", value, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsNotLike(String value) {
            addCriterion("otherPerioperativePeriodComplications not like", value, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsIn(List<String> values) {
            addCriterion("otherPerioperativePeriodComplications in", values, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsNotIn(List<String> values) {
            addCriterion("otherPerioperativePeriodComplications not in", values, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsBetween(String value1, String value2) {
            addCriterion("otherPerioperativePeriodComplications between", value1, value2, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherperioperativeperiodcomplicationsNotBetween(String value1, String value2) {
            addCriterion("otherPerioperativePeriodComplications not between", value1, value2, "otherperioperativeperiodcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsIsNull() {
            addCriterion("zyqComplications is null");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsIsNotNull() {
            addCriterion("zyqComplications is not null");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsEqualTo(String value) {
            addCriterion("zyqComplications =", value, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsNotEqualTo(String value) {
            addCriterion("zyqComplications <>", value, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsGreaterThan(String value) {
            addCriterion("zyqComplications >", value, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsGreaterThanOrEqualTo(String value) {
            addCriterion("zyqComplications >=", value, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsLessThan(String value) {
            addCriterion("zyqComplications <", value, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsLessThanOrEqualTo(String value) {
            addCriterion("zyqComplications <=", value, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsLike(String value) {
            addCriterion("zyqComplications like", value, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsNotLike(String value) {
            addCriterion("zyqComplications not like", value, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsIn(List<String> values) {
            addCriterion("zyqComplications in", values, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsNotIn(List<String> values) {
            addCriterion("zyqComplications not in", values, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsBetween(String value1, String value2) {
            addCriterion("zyqComplications between", value1, value2, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andZyqcomplicationsNotBetween(String value1, String value2) {
            addCriterion("zyqComplications not between", value1, value2, "zyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsIsNull() {
            addCriterion("otherZyqComplications is null");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsIsNotNull() {
            addCriterion("otherZyqComplications is not null");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsEqualTo(String value) {
            addCriterion("otherZyqComplications =", value, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsNotEqualTo(String value) {
            addCriterion("otherZyqComplications <>", value, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsGreaterThan(String value) {
            addCriterion("otherZyqComplications >", value, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsGreaterThanOrEqualTo(String value) {
            addCriterion("otherZyqComplications >=", value, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsLessThan(String value) {
            addCriterion("otherZyqComplications <", value, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsLessThanOrEqualTo(String value) {
            addCriterion("otherZyqComplications <=", value, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsLike(String value) {
            addCriterion("otherZyqComplications like", value, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsNotLike(String value) {
            addCriterion("otherZyqComplications not like", value, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsIn(List<String> values) {
            addCriterion("otherZyqComplications in", values, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsNotIn(List<String> values) {
            addCriterion("otherZyqComplications not in", values, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsBetween(String value1, String value2) {
            addCriterion("otherZyqComplications between", value1, value2, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andOtherzyqcomplicationsNotBetween(String value1, String value2) {
            addCriterion("otherZyqComplications not between", value1, value2, "otherzyqcomplications");
            return (Criteria) this;
        }

        public Criteria andMeshtypeIsNull() {
            addCriterion("meshType is null");
            return (Criteria) this;
        }

        public Criteria andMeshtypeIsNotNull() {
            addCriterion("meshType is not null");
            return (Criteria) this;
        }

        public Criteria andMeshtypeEqualTo(Integer value) {
            addCriterion("meshType =", value, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeNotEqualTo(Integer value) {
            addCriterion("meshType <>", value, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeGreaterThan(Integer value) {
            addCriterion("meshType >", value, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("meshType >=", value, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeLessThan(Integer value) {
            addCriterion("meshType <", value, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeLessThanOrEqualTo(Integer value) {
            addCriterion("meshType <=", value, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeIn(List<Integer> values) {
            addCriterion("meshType in", values, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeNotIn(List<Integer> values) {
            addCriterion("meshType not in", values, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeBetween(Integer value1, Integer value2) {
            addCriterion("meshType between", value1, value2, "meshtype");
            return (Criteria) this;
        }

        public Criteria andMeshtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("meshType not between", value1, value2, "meshtype");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMeshtimeIsNull() {
            addCriterion("meshTime is null");
            return (Criteria) this;
        }

        public Criteria andMeshtimeIsNotNull() {
            addCriterion("meshTime is not null");
            return (Criteria) this;
        }

        public Criteria andMeshtimeEqualTo(Integer value) {
            addCriterion("meshTime =", value, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeNotEqualTo(Integer value) {
            addCriterion("meshTime <>", value, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeGreaterThan(Integer value) {
            addCriterion("meshTime >", value, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("meshTime >=", value, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeLessThan(Integer value) {
            addCriterion("meshTime <", value, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeLessThanOrEqualTo(Integer value) {
            addCriterion("meshTime <=", value, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeIn(List<Integer> values) {
            addCriterion("meshTime in", values, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeNotIn(List<Integer> values) {
            addCriterion("meshTime not in", values, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeBetween(Integer value1, Integer value2) {
            addCriterion("meshTime between", value1, value2, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("meshTime not between", value1, value2, "meshtime");
            return (Criteria) this;
        }

        public Criteria andMeshIsNull() {
            addCriterion("mesh is null");
            return (Criteria) this;
        }

        public Criteria andMeshIsNotNull() {
            addCriterion("mesh is not null");
            return (Criteria) this;
        }

        public Criteria andMeshEqualTo(Integer value) {
            addCriterion("mesh =", value, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshNotEqualTo(Integer value) {
            addCriterion("mesh <>", value, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshGreaterThan(Integer value) {
            addCriterion("mesh >", value, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshGreaterThanOrEqualTo(Integer value) {
            addCriterion("mesh >=", value, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshLessThan(Integer value) {
            addCriterion("mesh <", value, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshLessThanOrEqualTo(Integer value) {
            addCriterion("mesh <=", value, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshIn(List<Integer> values) {
            addCriterion("mesh in", values, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshNotIn(List<Integer> values) {
            addCriterion("mesh not in", values, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshBetween(Integer value1, Integer value2) {
            addCriterion("mesh between", value1, value2, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshNotBetween(Integer value1, Integer value2) {
            addCriterion("mesh not between", value1, value2, "mesh");
            return (Criteria) this;
        }

        public Criteria andMeshminceIsNull() {
            addCriterion("meshMince is null");
            return (Criteria) this;
        }

        public Criteria andMeshminceIsNotNull() {
            addCriterion("meshMince is not null");
            return (Criteria) this;
        }

        public Criteria andMeshminceEqualTo(Integer value) {
            addCriterion("meshMince =", value, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceNotEqualTo(Integer value) {
            addCriterion("meshMince <>", value, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceGreaterThan(Integer value) {
            addCriterion("meshMince >", value, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceGreaterThanOrEqualTo(Integer value) {
            addCriterion("meshMince >=", value, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceLessThan(Integer value) {
            addCriterion("meshMince <", value, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceLessThanOrEqualTo(Integer value) {
            addCriterion("meshMince <=", value, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceIn(List<Integer> values) {
            addCriterion("meshMince in", values, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceNotIn(List<Integer> values) {
            addCriterion("meshMince not in", values, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceBetween(Integer value1, Integer value2) {
            addCriterion("meshMince between", value1, value2, "meshmince");
            return (Criteria) this;
        }

        public Criteria andMeshminceNotBetween(Integer value1, Integer value2) {
            addCriterion("meshMince not between", value1, value2, "meshmince");
            return (Criteria) this;
        }

        public Criteria andPainIsNull() {
            addCriterion("pain is null");
            return (Criteria) this;
        }

        public Criteria andPainIsNotNull() {
            addCriterion("pain is not null");
            return (Criteria) this;
        }

        public Criteria andPainEqualTo(Integer value) {
            addCriterion("pain =", value, "pain");
            return (Criteria) this;
        }

        public Criteria andPainNotEqualTo(Integer value) {
            addCriterion("pain <>", value, "pain");
            return (Criteria) this;
        }

        public Criteria andPainGreaterThan(Integer value) {
            addCriterion("pain >", value, "pain");
            return (Criteria) this;
        }

        public Criteria andPainGreaterThanOrEqualTo(Integer value) {
            addCriterion("pain >=", value, "pain");
            return (Criteria) this;
        }

        public Criteria andPainLessThan(Integer value) {
            addCriterion("pain <", value, "pain");
            return (Criteria) this;
        }

        public Criteria andPainLessThanOrEqualTo(Integer value) {
            addCriterion("pain <=", value, "pain");
            return (Criteria) this;
        }

        public Criteria andPainIn(List<Integer> values) {
            addCriterion("pain in", values, "pain");
            return (Criteria) this;
        }

        public Criteria andPainNotIn(List<Integer> values) {
            addCriterion("pain not in", values, "pain");
            return (Criteria) this;
        }

        public Criteria andPainBetween(Integer value1, Integer value2) {
            addCriterion("pain between", value1, value2, "pain");
            return (Criteria) this;
        }

        public Criteria andPainNotBetween(Integer value1, Integer value2) {
            addCriterion("pain not between", value1, value2, "pain");
            return (Criteria) this;
        }

        public Criteria andPainpositionIsNull() {
            addCriterion("painPosition is null");
            return (Criteria) this;
        }

        public Criteria andPainpositionIsNotNull() {
            addCriterion("painPosition is not null");
            return (Criteria) this;
        }

        public Criteria andPainpositionEqualTo(Integer value) {
            addCriterion("painPosition =", value, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionNotEqualTo(Integer value) {
            addCriterion("painPosition <>", value, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionGreaterThan(Integer value) {
            addCriterion("painPosition >", value, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("painPosition >=", value, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionLessThan(Integer value) {
            addCriterion("painPosition <", value, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionLessThanOrEqualTo(Integer value) {
            addCriterion("painPosition <=", value, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionIn(List<Integer> values) {
            addCriterion("painPosition in", values, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionNotIn(List<Integer> values) {
            addCriterion("painPosition not in", values, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionBetween(Integer value1, Integer value2) {
            addCriterion("painPosition between", value1, value2, "painposition");
            return (Criteria) this;
        }

        public Criteria andPainpositionNotBetween(Integer value1, Integer value2) {
            addCriterion("painPosition not between", value1, value2, "painposition");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyIsNull() {
            addCriterion("otherNetflixNameAndCompany is null");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyIsNotNull() {
            addCriterion("otherNetflixNameAndCompany is not null");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyEqualTo(String value) {
            addCriterion("otherNetflixNameAndCompany =", value, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyNotEqualTo(String value) {
            addCriterion("otherNetflixNameAndCompany <>", value, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyGreaterThan(String value) {
            addCriterion("otherNetflixNameAndCompany >", value, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("otherNetflixNameAndCompany >=", value, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyLessThan(String value) {
            addCriterion("otherNetflixNameAndCompany <", value, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyLessThanOrEqualTo(String value) {
            addCriterion("otherNetflixNameAndCompany <=", value, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyLike(String value) {
            addCriterion("otherNetflixNameAndCompany like", value, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyNotLike(String value) {
            addCriterion("otherNetflixNameAndCompany not like", value, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyIn(List<String> values) {
            addCriterion("otherNetflixNameAndCompany in", values, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyNotIn(List<String> values) {
            addCriterion("otherNetflixNameAndCompany not in", values, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyBetween(String value1, String value2) {
            addCriterion("otherNetflixNameAndCompany between", value1, value2, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andOthernetflixnameandcompanyNotBetween(String value1, String value2) {
            addCriterion("otherNetflixNameAndCompany not between", value1, value2, "othernetflixnameandcompany");
            return (Criteria) this;
        }

        public Criteria andDindoIsNull() {
            addCriterion("dinDo is null");
            return (Criteria) this;
        }

        public Criteria andDindoIsNotNull() {
            addCriterion("dinDo is not null");
            return (Criteria) this;
        }

        public Criteria andDindoEqualTo(Integer value) {
            addCriterion("dinDo =", value, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoNotEqualTo(Integer value) {
            addCriterion("dinDo <>", value, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoGreaterThan(Integer value) {
            addCriterion("dinDo >", value, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dinDo >=", value, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoLessThan(Integer value) {
            addCriterion("dinDo <", value, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoLessThanOrEqualTo(Integer value) {
            addCriterion("dinDo <=", value, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoIn(List<Integer> values) {
            addCriterion("dinDo in", values, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoNotIn(List<Integer> values) {
            addCriterion("dinDo not in", values, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoBetween(Integer value1, Integer value2) {
            addCriterion("dinDo between", value1, value2, "dindo");
            return (Criteria) this;
        }

        public Criteria andDindoNotBetween(Integer value1, Integer value2) {
            addCriterion("dinDo not between", value1, value2, "dindo");
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