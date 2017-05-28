package com.tahutelorcommunity.bukapagar.Service;

import com.tahutelorcommunity.bukapagar.Model.Authenticate.Login.User;
import com.tahutelorcommunity.bukapagar.Model.Carts.CartResponse.Carts;
import com.tahutelorcommunity.bukapagar.Model.Dompet.History.DompetHistory;
import com.tahutelorcommunity.bukapagar.Model.Dompet.Mutation.Mutation;
import com.tahutelorcommunity.bukapagar.Model.Dompet.TopUp;
import com.tahutelorcommunity.bukapagar.Model.Dompet.TopUpRequest;
import com.tahutelorcommunity.bukapagar.Model.Dompet.WithdrawalsHistory.WithdrawalsHistory;
import com.tahutelorcommunity.bukapagar.Model.ImageResponse.Image;
import com.tahutelorcommunity.bukapagar.Model.Invoices.ResponseInvoice.ResponseInvoice;
import com.tahutelorcommunity.bukapagar.Model.Messages.Conversation.Conversation;
import com.tahutelorcommunity.bukapagar.Model.Messages.Inbox.Message;
import com.tahutelorcommunity.bukapagar.Model.Products.CreateProductRequest.CreateRequest;
import com.tahutelorcommunity.bukapagar.Model.Products.CreateProductResponse.ProductsCreate;
import com.tahutelorcommunity.bukapagar.Model.Products.Pelapak.Pelapak;
import com.tahutelorcommunity.bukapagar.Model.Transaction.TransactionList;
import com.tahutelorcommunity.bukapagar.Model.Users.AccountSummary.AccountSummary;
import com.tahutelorcommunity.bukapagar.Model.Users.Couriers.Couriers;
import com.tahutelorcommunity.bukapagar.Model.Users.Info.Bank;
import com.tahutelorcommunity.bukapagar.Model.Users.PasswordReset.PasswordReset;
import com.tahutelorcommunity.bukapagar.Model.Users.Register.Register;
import com.tahutelorcommunity.bukapagar.Model.Users.Report.ReportResponse;
import com.tahutelorcommunity.bukapagar.Model.Users.UserAccountSetting.UserAccountSetting;
import com.tahutelorcommunity.bukapagar.Model.Users.UserId.Products.UserProduct;
import com.tahutelorcommunity.bukapagar.Model.Users.UserProfil.UserProfil;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

/**
 * Created by Farizko on 26-May-17.
 */

public interface Request {
    //TODO Here is Post Request

    @POST("authenticate.json")
    Call<User> doBasicLogin();

    @POST("users/password_reset.json")
    Call<PasswordReset> doResetPassword(@Body String body);

    @FormUrlEncoded
    @POST("users.json")
    Call<Register> doRegister(@Field("user[email]=") String email,
                              @Field("user[username]=") String username,
                              @Field("user[name]=") String name,
                              @Field("user[password]=") String pass,
                              @Field("user[password_confirmation]=") String passconfirm,
                              @Field("user[policy]=") String policy,
                              @Field("user[gender]=") String gender,
                              @Field("user[address_attributes][province]=") String province,
                              @Field("user[address_attributes][city]=") String city,
                              @Field("user[address_attributes][area]=") String area,
                              @Field("user[address_attributes][address]=") String address,
                              @Field("user[address_attributes][post_code]=") String post_code
                              );

    @POST //https://api.bukalapak.com/v2/users/:userid/report.json
    Call<ReportResponse> doReportUser(@Url String url, @Body String body);

    /*    -d '{
            "product": {
        "category_id": "242",
                "name": "Polygon Helios 200",
                "new": "true",
                "price": "2700000",
                "negotiable": "true",
                "weight": "5000",
                "stock": "2",
                "description_bb": "Sepeda roadbike polygon series helios 200",
                "free_shipping": [2, 3, 4],
        "product_detail_attributes": {
            "type": "Roadbike",
                    "brand": "Polygon",
                    "bahan": "Cromoly",
                    "referer": "bukalapak_app"
        }
    },
            "images": "10820, 10822, 10283",
            "force_insurance": "on"
}' \
        */
//  https://api.bukalapak.com/v2/products.json "Content-Type: application/json" POST
    @POST("products.json")
    @Headers("Content-type: application/json")
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.CreateProductResponse.ProductsCreate> CreateProducts(
            @Body CreateRequest body
    );

//    https://api.bukalapak.com/v2/users/:id/report.json

    //    https://api.bukalapak.com/v2/images.json
    @Multipart
    @POST("images.json")
    Call<Image> upload(@Part MultipartBody.Part file);

//    curl  "https://api.bukalapak.com/v2/carts/add_product/my5q.json"
//            -X  "POST"
//            -d  "identity=tokenkeyiskmzwa8awaa&quantity=2"
    @POST
    Call<Carts> addToCart(@Url String url, @Body String body);

    @POST
    Call<Carts> addToCart(@Url String url);

    @POST("invoices.json") //https://api.bukalapak.com/v2/invoices.json
    Call<ResponseInvoice> createInvoice(@Body String body);
    //TODO Here is Get Request

    @GET("users/couriers.json")
    Call<Couriers> getUsersCouriers();

    @GET("users/account_summary.json")
    Call<AccountSummary> getUserInfo();

    @GET("users/{:id}/products.json")
    public Call<UserProduct> getUserProducts();

    @GET("carts.json")
    public Call<Carts> getCarts();

    @GET //start 1 for uri use "messages.json?page={:page}"
    public Call<Message> getMessages(@Url String url);

    @GET //start 1 for uri use "messages/{:id}.json?per_page=5"
    public Call<Conversation> getConversation(@Url String url);

    //    https://api.bukalapak.com/v2/products/populars.json
    @GET("products/populars.json")
    Call<com.tahutelorcommunity.bukapagar.Model.Products.ReadProduct.Product> getPopularProduct();

    //    https://api.bukalapak.com/v2/products.json
    @GET("products.json")
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ReadProduct.Product> getProducts();

    //    https://api.bukalapak.com/v2/products.json?keywords=nikon&conditions\[\]=new
    @GET //for uri use "products.json?keywords=nikon&conditions\\[\\]=new"
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> getSearchProductsByNewCondition(@Url String url);

    //    https://api.bukalapak.com/v2/products.json?keywords=canon&conditions\[\]=used
    @GET //for uri use "products.json?keywords=canon&conditions\\[\\]=used"
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> getSearchProductsByUsedCondition(@Url String url);


    //    https://api.bukalapak.com/v2/products.json?todays_deal=1&tomorrows_deal=0
    @GET("products.json?todays_deal=1&tomorrows_deal=0")
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> getSearchProductsByDeal();


    //    https://api.bukalapak.com/v2/products.json?keywords=blackberry&price_range=5000000-10000000
    @GET // for uri use "products.json?keywords={:search}&price_range={:min}-{:max}"
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> getSearchProductsByRange(@Url String url);

    //    https://api.bukalapak.com/v2/products.json?keywords=galaxy+tab&price_range=on&price_min=3300000&price_max=3500000
    @GET("products.json?keywords={:search}&price_range=on&price_min={:min}&price_max={:max}")
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> getSearchProductsByPrice();

    //    https://api.bukalapak.com/v2/products.json?brand=Polygon
    @GET("products.json?brand={:searchedBrand}")
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> getSearchProductsByBrand();

    //    https://api.bukalapak.com/v2/products.json?keywords=fixie&page=2&per_page=20
    @GET//"products.json?keywords={:search}&page={:searchPage}&per_page=5"
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> getSearchProducts(@Url String url);

    //    https://api.bukalapak.com/v2/products.json?favorited=true
    @GET("products.json?favorited=true")
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> getFavoritedProducts();

    //    https://api.bukalapak.com/v2/products/mylapak.json
    @GET("products/mylapak.json")
    public Call<Pelapak> getPelapak();

    //    https://api.bukalapak.com/v2/products/:id.json "Content-Type: application/json" GET
    @GET //products/@url.json @url diisi String{:searchProduct}.json
    @Headers("Content-type: application/json")
    public Call<com.tahutelorcommunity.bukapagar.Model.Products.ReadProduct.Product> getReadProducts(@Url String url);

    //    https://api.bukalapak.com/v2/users/info.json
    @GET("users/info.json")
    public Call<com.tahutelorcommunity.bukapagar.Model.Users.Info.User> getInfoLoggedInUser();

    //    https://api.bukalapak.com/v2/users.json
    @GET("users.json")
    Call<UserAccountSetting> getUserAccountSetting();

    //    https://api.bukalapak.com/v2/users/:username.json atau https://api.bukalapak.com/v2/users/:id/profile.json
    @GET // users/@url.json @url diisi nama user yang ingin dicari
    Call<UserProfil> getUserProfile(@Url String url);

    //    https://api.bukalapak.com/v2/users/account_summary.json
    @GET("users/account_summary.json")
    Call<AccountSummary> getAccountSummary();

    //    https://api.bukalapak.com/v2/dompet/history.json?page=1&per_page=2
    @GET("")
    Call<DompetHistory> getDompetHistory(@Url String url);

    //    https://api.bukalapak.com/v2/dompet/history/mutations.json?page=1&per_page=2
    @GET("dompet/history.json/page={:page}&per_page={:perpage}")
    Call<Mutation> getMutationHistory();

    //    "https://api.bukalapak.com/v2/dompet/history/withdrawals.json?page=1&per_page=2"
    @GET("dompet/history.json/page={:page}&per_page={:perpage}")
    Call<WithdrawalsHistory> getWithdrawalsHistory();

    @GET //example  "https://api.bukalapak.com/v2/transactions.json?page=2&per_page=10"
    Call<TransactionList> getTransactionList(@Url String url);


    @GET("users/banks.json")
    Call<Bank> getBankInfo();

    @GET("dompet/topup.json")
    Call<TopUp> getTopUpReq(@Body TopUpRequest topUpRequest);


    //TODO Here is Patch Request

    /*    PATCH -F "user[name]=asadasan" -F "user[birthday_date]=21" -F "user[birthday_month]=12" -F "user[birthday_year]=1999"\
                -F "user[address_attributes][province]=Banten" -F "user[address_attributes][city]=Tangerang" -F "user[address_attributes][area]=Batuceper"\
                -F "user[address_attributes][address]=jl xxx" -F "user[address_attributes][post_code]=11111"\
                -F "user[avatar_attributes][data]=@/home/sdsdkkk/Desktop/xkcd.png" -F "user[avatar_attributes][id]=36837"\
                "https://api.bukalapak.com/v2/users.json"*/
    @PATCH("users.json")
    Call<UserAccountSetting> updateUserAccountSetting();

    /*    -d '{
                "product": {
            "price": "2700000",
                    "stock": "2"
        },
                "images": "623525, 4552235",
    }' \*/
    //        "https://api.bukalapak.com/v2/products/f3vi.json" "Content-Type: application/json" PATCH
    @PATCH("products/{:id}.json")
    @Headers("Content-type: application/json")
    Call<ProductsCreate> updateProduct();
}
