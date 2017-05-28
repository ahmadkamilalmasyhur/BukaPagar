
package com.tahutelorcommunity.bukapagar.Model.Carts.Carts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("deal_info")
    @Expose
    private DealInfo dealInfo;
    @SerializedName("deal_request_state")
    @Expose
    private String dealRequestState;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("courier")
    @Expose
    private List<String> courier = null;
    @SerializedName("seller_username")
    @Expose
    private String sellerUsername;
    @SerializedName("seller_name")
    @Expose
    private String sellerName;
    @SerializedName("seller_id")
    @Expose
    private Integer sellerId;
    @SerializedName("seller_avatar")
    @Expose
    private String sellerAvatar;
    @SerializedName("seller_level")
    @Expose
    private String sellerLevel;
    @SerializedName("seller_level_badge_url")
    @Expose
    private String sellerLevelBadgeUrl;
    @SerializedName("seller_positive_feedback")
    @Expose
    private Integer sellerPositiveFeedback;
    @SerializedName("seller_negative_feedback")
    @Expose
    private Integer sellerNegativeFeedback;
    @SerializedName("seller_term_condition")
    @Expose
    private String sellerTermCondition;
    @SerializedName("seller_alert")
    @Expose
    private Object sellerAlert;
    @SerializedName("for_sale")
    @Expose
    private Boolean forSale;
    @SerializedName("state_description")
    @Expose
    private List<Object> stateDescription = null;
    @SerializedName("last_relist_at")
    @Expose
    private String lastRelistAt;
    @SerializedName("specs")
    @Expose
    private Specs specs;
    @SerializedName("force_insurance")
    @Expose
    private Object forceInsurance;
    @SerializedName("free_shipping_coverage")
    @Expose
    private List<Object> freeShippingCoverage = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("image_ids")
    @Expose
    private List<Integer> imageIds = null;
    @SerializedName("images")
    @Expose
    private List<String> images = null;
    @SerializedName("small_images")
    @Expose
    private List<String> smallImages = null;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("nego")
    @Expose
    private Boolean nego;
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("minimum_negotiable")
    @Expose
    private Object minimumNegotiable;
    @SerializedName("view_count")
    @Expose
    private Integer viewCount;
    @SerializedName("sold_count")
    @Expose
    private Integer soldCount;
    @SerializedName("waiting_payment")
    @Expose
    private Integer waitingPayment;
    @SerializedName("favorited")
    @Expose
    private Boolean favorited;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("product_sin")
    @Expose
    private List<Object> productSin = null;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("category_structure")
    @Expose
    private List<String> categoryStructure = null;
    @SerializedName("interest_count")
    @Expose
    private Integer interestCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param desc
     * @param weight
     * @param smallImages
     * @param lastRelistAt
     * @param freeShippingCoverage
     * @param dealRequestState
     * @param sellerUsername
     * @param nego
     * @param city
     * @param id
     * @param stock
     * @param createdAt
     * @param forceInsurance
     * @param name
     * @param province
     * @param sellerPositiveFeedback
     * @param soldCount
     * @param productSin
     * @param condition
     * @param sellerAvatar
     * @param sellerTermCondition
     * @param categoryId
     * @param categoryStructure
     * @param courier
     * @param waitingPayment
     * @param minimumNegotiable
     * @param sellerAlert
     * @param sellerName
     * @param sellerLevelBadgeUrl
     * @param url
     * @param sellerNegativeFeedback
     * @param interestCount
     * @param category
     * @param price
     * @param stateDescription
     * @param forSale
     * @param favorited
     * @param sellerId
     * @param images
     * @param active
     * @param sellerLevel
     * @param viewCount
     * @param dealInfo
     * @param imageIds
     * @param specs
     */
    public Product(DealInfo dealInfo, String dealRequestState, Integer price, List<String> courier, String sellerUsername, String sellerName, Integer sellerId, String sellerAvatar, String sellerLevel, String sellerLevelBadgeUrl, Integer sellerPositiveFeedback, Integer sellerNegativeFeedback, String sellerTermCondition, Object sellerAlert, Boolean forSale, List<Object> stateDescription, String lastRelistAt, Specs specs, Object forceInsurance, List<Object> freeShippingCoverage, String id, String url, String name, Boolean active, String city, String province, Integer weight, List<Integer> imageIds, List<String> images, List<String> smallImages, String desc, String condition, Boolean nego, Integer stock, Object minimumNegotiable, Integer viewCount, Integer soldCount, Integer waitingPayment, Boolean favorited, String createdAt, List<Object> productSin, Integer categoryId, String category, List<String> categoryStructure, Integer interestCount) {
        super();
        this.dealInfo = dealInfo;
        this.dealRequestState = dealRequestState;
        this.price = price;
        this.courier = courier;
        this.sellerUsername = sellerUsername;
        this.sellerName = sellerName;
        this.sellerId = sellerId;
        this.sellerAvatar = sellerAvatar;
        this.sellerLevel = sellerLevel;
        this.sellerLevelBadgeUrl = sellerLevelBadgeUrl;
        this.sellerPositiveFeedback = sellerPositiveFeedback;
        this.sellerNegativeFeedback = sellerNegativeFeedback;
        this.sellerTermCondition = sellerTermCondition;
        this.sellerAlert = sellerAlert;
        this.forSale = forSale;
        this.stateDescription = stateDescription;
        this.lastRelistAt = lastRelistAt;
        this.specs = specs;
        this.forceInsurance = forceInsurance;
        this.freeShippingCoverage = freeShippingCoverage;
        this.id = id;
        this.url = url;
        this.name = name;
        this.active = active;
        this.city = city;
        this.province = province;
        this.weight = weight;
        this.imageIds = imageIds;
        this.images = images;
        this.smallImages = smallImages;
        this.desc = desc;
        this.condition = condition;
        this.nego = nego;
        this.stock = stock;
        this.minimumNegotiable = minimumNegotiable;
        this.viewCount = viewCount;
        this.soldCount = soldCount;
        this.waitingPayment = waitingPayment;
        this.favorited = favorited;
        this.createdAt = createdAt;
        this.productSin = productSin;
        this.categoryId = categoryId;
        this.category = category;
        this.categoryStructure = categoryStructure;
        this.interestCount = interestCount;
    }

    public DealInfo getDealInfo() {
        return dealInfo;
    }

    public void setDealInfo(DealInfo dealInfo) {
        this.dealInfo = dealInfo;
    }

    public String getDealRequestState() {
        return dealRequestState;
    }

    public void setDealRequestState(String dealRequestState) {
        this.dealRequestState = dealRequestState;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<String> getCourier() {
        return courier;
    }

    public void setCourier(List<String> courier) {
        this.courier = courier;
    }

    public String getSellerUsername() {
        return sellerUsername;
    }

    public void setSellerUsername(String sellerUsername) {
        this.sellerUsername = sellerUsername;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerAvatar() {
        return sellerAvatar;
    }

    public void setSellerAvatar(String sellerAvatar) {
        this.sellerAvatar = sellerAvatar;
    }

    public String getSellerLevel() {
        return sellerLevel;
    }

    public void setSellerLevel(String sellerLevel) {
        this.sellerLevel = sellerLevel;
    }

    public String getSellerLevelBadgeUrl() {
        return sellerLevelBadgeUrl;
    }

    public void setSellerLevelBadgeUrl(String sellerLevelBadgeUrl) {
        this.sellerLevelBadgeUrl = sellerLevelBadgeUrl;
    }

    public Integer getSellerPositiveFeedback() {
        return sellerPositiveFeedback;
    }

    public void setSellerPositiveFeedback(Integer sellerPositiveFeedback) {
        this.sellerPositiveFeedback = sellerPositiveFeedback;
    }

    public Integer getSellerNegativeFeedback() {
        return sellerNegativeFeedback;
    }

    public void setSellerNegativeFeedback(Integer sellerNegativeFeedback) {
        this.sellerNegativeFeedback = sellerNegativeFeedback;
    }

    public String getSellerTermCondition() {
        return sellerTermCondition;
    }

    public void setSellerTermCondition(String sellerTermCondition) {
        this.sellerTermCondition = sellerTermCondition;
    }

    public Object getSellerAlert() {
        return sellerAlert;
    }

    public void setSellerAlert(Object sellerAlert) {
        this.sellerAlert = sellerAlert;
    }

    public Boolean getForSale() {
        return forSale;
    }

    public void setForSale(Boolean forSale) {
        this.forSale = forSale;
    }

    public List<Object> getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(List<Object> stateDescription) {
        this.stateDescription = stateDescription;
    }

    public String getLastRelistAt() {
        return lastRelistAt;
    }

    public void setLastRelistAt(String lastRelistAt) {
        this.lastRelistAt = lastRelistAt;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }

    public Object getForceInsurance() {
        return forceInsurance;
    }

    public void setForceInsurance(Object forceInsurance) {
        this.forceInsurance = forceInsurance;
    }

    public List<Object> getFreeShippingCoverage() {
        return freeShippingCoverage;
    }

    public void setFreeShippingCoverage(List<Object> freeShippingCoverage) {
        this.freeShippingCoverage = freeShippingCoverage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public List<Integer> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<Integer> imageIds) {
        this.imageIds = imageIds;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(List<String> smallImages) {
        this.smallImages = smallImages;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Boolean getNego() {
        return nego;
    }

    public void setNego(Boolean nego) {
        this.nego = nego;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Object getMinimumNegotiable() {
        return minimumNegotiable;
    }

    public void setMinimumNegotiable(Object minimumNegotiable) {
        this.minimumNegotiable = minimumNegotiable;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Integer soldCount) {
        this.soldCount = soldCount;
    }

    public Integer getWaitingPayment() {
        return waitingPayment;
    }

    public void setWaitingPayment(Integer waitingPayment) {
        this.waitingPayment = waitingPayment;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<Object> getProductSin() {
        return productSin;
    }

    public void setProductSin(List<Object> productSin) {
        this.productSin = productSin;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getCategoryStructure() {
        return categoryStructure;
    }

    public void setCategoryStructure(List<String> categoryStructure) {
        this.categoryStructure = categoryStructure;
    }

    public Integer getInterestCount() {
        return interestCount;
    }

    public void setInterestCount(Integer interestCount) {
        this.interestCount = interestCount;
    }

}
