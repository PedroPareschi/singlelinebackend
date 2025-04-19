package com.cepel.unifilarbackend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectionDTO {

    @XmlElement(name = "label")
    private String label;

    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "source")
    private String source;

    @XmlElement(name = "target")
    private String target;

    public ConnectionDTO() {
    }

    public ConnectionDTO(String label, String id, String source, String target) {
        this.label = label;
        this.id = id;
        this.source = source;
        this.target = target;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
