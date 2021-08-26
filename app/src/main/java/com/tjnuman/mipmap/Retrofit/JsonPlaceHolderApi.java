package com.tjnuman.mipmap.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {

//    @GET("posts") //https://jsonplaceholder.typicode.com/posts. here post is the relative url after the base url
//    Call<List<PostModel>> getPost();

    @GET("103.159.186.254?access_key=3f366e369ce8f6864aec20c7bf9fe350&format=1") //http://api.ipstack.com/103.159.186.254?access_key=3f366e369ce8f6864aec20c7bf9fe350&format=1. here post is the relative url after the base url
    Call<PostModel> getSinglePost();

//    @POST("posts")
//    Call<PostModel>creatPost(@Body PostModel post);


}
