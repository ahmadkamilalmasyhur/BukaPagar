
package com.tahutelorcommunity.bukapagar.Model.Products.ReadProduct;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product_ {

    @SerializedName("deal_info")
    @Expose
    private DealInfo dealInfo;
    @SerializedName("deal_request_state")
    @Expose
    private String dealRequestState;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("category_structure")
    @Expose
    private List<String> categoryStructure = null;
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
    @SerializedName("seller_delivery_time")
    @Expose
    private String sellerDeliveryTime;
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
    private String sellerAlert;
    @SerializedName("for_sale")
    @Expose
    private Boolean forSale;
    @SerializedName("state_description")
    @Expose
    private List<String> stateDescription = null;
    @SerializedName("premium_account")
    @Expose
    private Boolean premiumAccount;
    @SerializedName("top_merchant")
    @Expose
    private Boolean topMerchant;
    @SerializedName("last_order_schedule")
    @Expose
    private Object lastOrderSchedule;
    @SerializedName("seller_voucher")
    @Expose
    private SellerVoucher sellerVoucher;
    @SerializedName("waiting_payment")
    @Expose
    private Integer waitingPayment;
    @SerializedName("sold_count")
    @Expose
    private Integer soldCount;
    @SerializedName("specs")
    @Expose
    private Specs specs;
    @SerializedName("force_insurance")
    @Expose
    private Boolean forceInsurance;
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
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("favorited")
    @Expose
    private Boolean favorited;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("product_sin")
    @Expose
    private List<Object> productSin = null;
    @SerializedName("rating")
    @Expose
    private Rating rating;
    @SerializedName("current_variant_name")
    @Expose
    private String currentVariantName;
    @SerializedName("current_product_sku_id")
    @Expose
    private Integer currentProductSkuId;
    @SerializedName("product_sku")
    @Expose
    private List<Object> productSku = null;
    @SerializedName("options")
    @Expose
    private List<Object> options = null;
    @SerializedName("interest_count")
    @Expose
    private Integer interestCount;
    @SerializedName("last_relist_at")
    @Expose
    private String lastRelistAt;
    @SerializedName("view_count")
    @Expose
    private Integer viewCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product_() {
    }

    /**
     * 
     * @param currentVariantName
     * @param lastRelistAt
     * @param dealRequestState
     * @param city
     * @param stock
     * @param forceInsurance
     * @param productSku
     * @param province
     * @param sellerTermCondition
     * @param sellerAvatar
     * @param condition
     * @param categoryId
     * @param categoryStructure
     * @param courier
     * @param sellerAlert
     * @param waitingPayment
     * @param sellerName
     * @param url
     * @param sellerNegativeFeedback
     * @param interestCount
     * @param category
     * @param price
     * @param favorited
     * @param active
     * @param images
     * @param sellerVoucher
     * @param sellerLevel
     * @param lastOrderSchedule
     * @param viewCount
     * @param dealInfo
     * @param specs
     * @param weight
     * @param desc
     * @param topMerchant
     * @param smallImages
     * @param freeShippingCoverage
     * @param sellerUsername
     * @param id
     * @param createdAt
     * @param name
     * @param sellerPositiveFeedback
     * @param sellerDeliveryTime
     * @param soldCount
     * @param productSin
     * @param options
     * @param sellerLevelBadgeUrl
     * @param updatedAt
     * @param stateDescription
     * @param currentProductSkuId
     * @param premiumAccount
     * @param forSale
     * @param sellerId
     * @param rating
     * @param imageIds
     */
    public Product_(DealInfo dealInfo, String dealRequestState, Integer price, Integer categoryId, String category, List<String> categoryStructure, List<String> courier, String sellerUsername, String sellerName, Integer sellerId, String sellerAvatar, String sellerLevel, String sellerLevelBadgeUrl, String sellerDeliveryTime, Integer sellerPositiveFeedback, Integer sellerNegativeFeedback, String sellerTermCondition, String sellerAlert, Boolean forSale, List<String> stateDescription, Boolean premiumAccount, Boolean topMerchant, Object lastOrderSchedule, SellerVoucher sellerVoucher, Integer waitingPayment, Integer soldCount, Specs specs, Boolean forceInsurance, List<Object> freeShippingCoverage, String id, String url, String name, Boolean active, String city, String province, Integer weight, List<Integer> imageIds, List<String> images, List<String> smallImages, String desc, String condition, Integer stock, Boolean favorited, String createdAt, String updatedAt, List<Object> productSin, Rating rating, String currentVariantName, Integer currentProductSkuId, List<Object> productSku, List<Object> options, Integer interestCount, String lastRelistAt, Integer viewCount) {
        super();
        this.dealInfo = dealInfo;
        this.dealRequestState = dealRequestState;
        this.price = price;
        this.categoryId = categoryId;
        this.category = category;
        this.categoryStructure = categoryStructure;
        this.courier = courier;
        this.sellerUsername = sellerUsername;
        this.sellerName = sellerName;
        this.sellerId = sellerId;
        this.sellerAvatar = sellerAvatar;
        this.sellerLevel = sellerLevel;
        this.sellerLevelBadgeUrl = sellerLevelBadgeUrl;
        this.sellerDeliveryTime = sellerDeliveryTime;
        this.sellerPositiveFeedback = sellerPositiveFeedback;
        this.sellerNegativeFeedback = sellerNegativeFeedback;
        this.sellerTermCondition = sellerTermCondition;
        this.sellerAlert = sellerAlert;
        this.forSale = forSale;
        this.stateDescription = stateDescription;
        this.premiumAccount = premiumAccount;
        this.topMerchant = topMerchant;
        this.lastOrderSchedule = lastOrderSchedule;
        this.sellerVoucher = sellerVoucher;
        this.waitingPayment = waitingPayment;
        this.soldCount = soldCount;
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
        this.stock = stock;
        this.favorited = favorited;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.productSin = productSin;
        this.rating = rating;
        this.currentVariantName = currentVariantName;
        this.currentProductSkuId = currentProductSkuId;
        this.productSku = productSku;
        this.options = options;
        this.interestCount = interestCount;
        this.lastRelistAt = lastRelistAt;
        this.viewCount = viewCount;
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

    public String getSellerDeliveryTime() {
        return sellerDeliveryTime;
    }

    public void setSellerDeliveryTime(String sellerDeliveryTime) {
        this.sellerDeliveryTime = sellerDeliveryTime;
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

    public String getSellerAlert() {
        return sellerAlert;
    }

    public void setSellerAlert(String sellerAlert) {
        this.sellerAlert = sellerAlert;
    }

    public Boolean getForSale() {
        return forSale;
    }

    public void setForSale(Boolean forSale) {
        this.forSale = forSale;
    }

    public List<String> getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(List<String> stateDescription) {
        this.stateDescription = stateDescription;
    }

    public Boolean getPremiumAccount() {
        return premiumAccount;
    }

    public void setPremiumAccount(Boolean premiumAccount) {
        this.premiumAccount = premiumAccount;
    }

    public Boolean getTopMerchant() {
        return topMerchant;
    }

    public void setTopMerchant(Boolean topMerchant) {
        this.topMerchant = topMerchant;
    }

    public Object getLastOrderSchedule() {
        return lastOrderSchedule;
    }

    public void setLastOrderSchedule(Object lastOrderSchedule) {
        this.lastOrderSchedule = lastOrderSchedule;
    }

    public SellerVoucher getSellerVoucher() {
        return sellerVoucher;
    }

    public void setSellerVoucher(SellerVoucher sellerVoucher) {
        this.sellerVoucher = sellerVoucher;
    }

    public Integer getWaitingPayment() {
        return waitingPayment;
    }

    public void setWaitingPayment(Integer waitingPayment) {
        this.waitingPayment = waitingPayment;
    }

    public Integer getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Integer soldCount) {
        this.soldCount = soldCount;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }

    public Boolean getForceInsurance() {
        return forceInsurance;
    }

    public void setForceInsurance(Boolean forceInsurance) {
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Object> getProductSin() {
        return productSin;
    }

    public void setProductSin(List<Object> productSin) {
        this.productSin = productSin;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getCurrentVariantName() {
        return currentVariantName;
    }

    public void setCurrentVariantName(String currentVariantName) {
        this.currentVariantName = currentVariantName;
    }

    public Integer getCurrentProductSkuId() {
        return currentProductSkuId;
    }

    public void setCurrentProductSkuId(Integer currentProductSkuId) {
        this.currentProductSkuId = currentProductSkuId;
    }

    public List<Object> getProductSku() {
        return productSku;
    }

    public void setProductSku(List<Object> productSku) {
        this.productSku = productSku;
    }

    public List<Object> getOptions() {
        return options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public Integer getInterestCount() {
        return interestCount;
    }

    public void setInterestCount(Integer interestCount) {
        this.interestCount = interestCount;
    }

    public String getLastRelistAt() {
        return lastRelistAt;
    }

    public void setLastRelistAt(String lastRelistAt) {
        this.lastRelistAt = lastRelistAt;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

}
