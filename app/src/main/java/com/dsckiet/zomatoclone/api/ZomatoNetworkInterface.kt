package com.dsckiet.zomatoclone.api

//import com.dsckiet.zomatoclone.model.CitySearchData
import com.dsckiet.zomatoclone.model.LocationDetails
import com.dsckiet.zomatoclone.model.LocationSearchItem
import com.dsckiet.zomatoclone.model.Restaurant
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ZomatoNetworkInterface {
   @GET("cities")
    fun getCityByName(
        @Header("user-key") apiKey: String,
        @Query("q") cityName: String
    ): Call<List<LocationSearchItem>>

    @GET("cities")
//    @Headers("user-key: f5cd87e4deca15ff2a49d74ce3328e1b")
    fun getCityByCord(
        @Query("lat") latitude: Double,
        @Query("long") longitude: Double
    ): Call<LocationSearchItem>

    @GET("location_details")

//    @Headers("user-key: f5cd87e4deca15ff2a49d74ce3328e1b")
    fun getLocationDetails(
//        @Header("user-key") apiKey: String,
        @Query("entity_id") entityId: Int,
        @Query("entity_type") entityType: String

    ): Call<LocationDetails>

}