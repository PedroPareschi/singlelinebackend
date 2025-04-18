package com.cepel.unifilarbackend.dto.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class ComponentRequestDTO {

    @XmlElement(name = "title")
    private String title;

    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "x")
    private int positionX;

    @XmlElement(name = "y")
    private int positionY;

    @XmlElement(name = "sourcePosition")
    private String sourcePosition;

    @XmlElement(name = "targetPosition")
    private String targetPosition;

    @XmlElement(name = "type")
    private String type;

    @XmlElement(name = "hidden")
    private boolean hidden;

    public ComponentRequestDTO() {
    }

    public ComponentRequestDTO(String title, String id, int positionX, int positionY, String sourcePosition, String targetPosition, String type, boolean hidden) {
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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
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

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComponentRequestDTO that = (ComponentRequestDTO) o;
        return positionX == that.positionX && positionY == that.positionY && hidden == that.hidden && Objects.equals(title, that.title) && Objects.equals(id, that.id) && Objects.equals(sourcePosition, that.sourcePosition) && Objects.equals(targetPosition, that.targetPosition) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, id, positionX, positionY, sourcePosition, targetPosition, type, hidden);
    }
}
