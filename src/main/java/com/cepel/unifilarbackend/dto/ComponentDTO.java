package com.cepel.unifilarbackend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComponentDTO {

    @XmlElement(name = "title")
    private String title;

    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "x")
    private Integer positionX;

    @XmlElement(name = "y")
    private Integer positionY;

    @XmlElement(name = "sourcePosition")
    private String sourcePosition;

    @XmlElement(name = "targetPosition")
    private String targetPosition;

    @XmlElement(name = "type")
    private String type;

    @XmlElement(name = "hidden")
    private Boolean hidden;

    public ComponentDTO() {
    }

    public ComponentDTO(String title, String id, Integer positionX, Integer positionY, String sourcePosition, String targetPosition, String type, Boolean hidden) {
        this.title = title;
        this.id = id;
        this.positionX = positionX;
        this.positionY = positionY;
        this.sourcePosition = sourcePosition;
        this.targetPosition = targetPosition;
        this.type = type;
        this.hidden = hidden;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
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

    public Boolean isHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComponentDTO that = (ComponentDTO) o;
        return positionX == that.positionX && positionY == that.positionY && hidden == that.hidden && Objects.equals(title, that.title) && Objects.equals(id, that.id) && Objects.equals(sourcePosition, that.sourcePosition) && Objects.equals(targetPosition, that.targetPosition) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, id, positionX, positionY, sourcePosition, targetPosition, type, hidden);
    }
}
