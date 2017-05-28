
package com.tahutelorcommunity.bukapagar.Model.Categories.Attribute.Categories;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attribute {

    @SerializedName("fieldName")
    @Expose
    private String fieldName;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("inputType")
    @Expose
    private String inputType;
    @SerializedName("options")
    @Expose
    private List<String> options = null;
    @SerializedName("required")
    @Expose
    private Boolean required;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attribute() {
    }

    /**
     * 
     * @param inputType
     * @param required
     * @param displayName
     * @param fieldName
     * @param options
     */
    public Attribute(String fieldName, String displayName, String inputType, List<String> options, Boolean required) {
        super();
        this.fieldName = fieldName;
        this.displayName = displayName;
        this.inputType = inputType;
        this.options = options;
        this.required = required;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

}
