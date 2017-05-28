
package com.tahutelorcommunity.bukapagar.Model.Users.UserAccountSetting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OnboardingStepsDone {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("value")
    @Expose
    private Boolean value;
    @SerializedName("full_text")
    @Expose
    private String fullText;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OnboardingStepsDone() {
    }

    /**
     * 
     * @param id
     * @param fullText
     * @param deeplink
     * @param value
     */
    public OnboardingStepsDone(String id, Boolean value, String fullText, String deeplink) {
        super();
        this.id = id;
        this.value = value;
        this.fullText = fullText;
        this.deeplink = deeplink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

}
