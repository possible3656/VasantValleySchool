package com.example.vasantvalleyschool.WebApi;

import com.example.vasantvalleyschool.Model.RefCode;
import com.example.vasantvalleyschool.Model.RefUser;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ClientApi {

    @POST("fetch_user_cover_information.php")
    Call<RefCode> refCodeSignIn(
            @Query("SubURL") int SubURL,
            @Query("username") String username,
            @Query("password") String password,
            @Query("refcode") String refcode
    );

    @POST("user_registration_information.php")
    Call<RefUser> refUserSignIn(
            @Query("SubURL") int SubURL,
            @Query("name") String name,
            @Query("email") String email,
            @Query("mobile") String mobile,
            @Query("refcode") String refcode,
            @Query("password") String password);
}
