package com.cepel.unifilarbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Component {

    @JsonIgnore
    private DataWrapper data;
    private String title;
    private Integer kv;
    private String id;
    private Position position;
    private String sourcePosition;
    private String targetPosition;
    private String type;
    private Boolean hidden;

    public static class DataWrapper {
        public Integer kv;
        public String title;
    }

    @JacksonXmlProperty(localName = "data")
    public void setData(DataWrapper data) {
        this.data = data;
        if (data != null) {
            this.kv = data.kv;
            this.title = data.title;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getKv() {
        return kv;
    }

    public void setKv(Integer kv) {
        this.kv = kv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getSourcePosition() {
        return sourcePosition;
    }

    public void setSourcePosition(String sourcePosition) {
        this.sourcePosition = sourcePosition;
    }

    public String getTargetPosition() {
        return targetPosition;
    }

    public void setTargetPosition(String targetPosition) {
        this.targetPosition = targetPosition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }
}
