package com.dtv.middle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;


@Entity
@Immutable
@Table(name = "commongrade")
public class TestModel {

    @Id
    @Column(name = "IdCommonGrade")
    private int IdCommonGrade;

    @Column(name = "CommonGradeName")
    private String CommonGradeName;

    public TestModel() {
    }

    public TestModel(int idCommonGrade, String commonGradeName) {
        IdCommonGrade = idCommonGrade;
        CommonGradeName = commonGradeName;
    }

    public int getIdCommonGrade() {
        return IdCommonGrade;
    }

    public void setIdCommonGrade(int idCommonGrade) {
        IdCommonGrade = idCommonGrade;
    }

    public String getCommonGradeName() {
        return CommonGradeName;
    }

    public void setCommonGradeName(String commonGradeName) {
        CommonGradeName = commonGradeName;
    }
}
