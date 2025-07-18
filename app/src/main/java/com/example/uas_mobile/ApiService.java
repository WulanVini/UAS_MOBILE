package com.example.uas_mobile;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;

public interface ApiService {

    @GET("get_menu.php")
    Call<List<ModelMenuMakanan>> getMenu();

    @GET("get_riwayat.php")
    Call<List<ModelRiwayat>> getRiwayat();


    // Untuk register user
    @FormUrlEncoded
    @POST("register.php")
    Call<ResponseModel> register(
            @Field("username") String username,
            @Field("email") String email,
            @Field("password") String password
    );

    // Untuk login user
    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseModel> login(
            @Field("username") String username,
            @Field("password") String password
    );

    // Untuk menyimpan pesanan
    @FormUrlEncoded
    @POST("pesan_sekarang.php")
    Call<ResponseModel> insertPesanan(
            @Field("id_makanan") int id_makanan,
            @Field("jumlah") int jumlah,
            @Field("total_harga") int total_harga
    );

    //hapus pesanan
//    @FormUrlEncoded
//    @POST("hapus_riwayat.php")
//    Call<ResponseModel> hapusPesanan(@Field("id") int id);



}
