package com.aspirine.global.data;

import com.aspirine.global.abstracts.MathDocument;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Model for GiveMeData
 *
 * @author yathish
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GiveMeData extends MathDocument implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("data_one")
    private String dataOne;

    @JsonProperty("data_two")
    private String dataTwo;

    @JsonProperty("data_three")
    private String dataThree;

    @JsonProperty("data_four")
    private String dataFour;

    @JsonCreator
    public GiveMeData(@JsonProperty("company_code") String mathCode) {
        super(mathCode);
    }

    public String getDataOne() {
        return dataOne;
    }

    public void setDataOne(String dataOne) {
        this.dataOne = dataOne;
    }

    public String getDataTwo() {
        return dataTwo;
    }

    public void setDataTwo(String dataTwo) {
        this.dataTwo = dataTwo;
    }

    public String getDataThree() {
        return dataThree;
    }

    public void setDataThree(String dataThree) {
        this.dataThree = dataThree;
    }

    public String getDataFour() {
        return dataFour;
    }

    public void setDataFour(String dataFour) {
        this.dataFour = dataFour;
    }
}
