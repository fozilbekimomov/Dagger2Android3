package uz.example.dagger_2_android3.core.networkimport retrofit2.Responseimport retrofit2.http.GETimport retrofit2.http.Queryimport uz.example.dagger_2_android3.core.model.TopHeadlineResponseinterface MovieDbApi {    //    https://newsapi.org/    @GET("v2/top-headlines")    suspend fun loadTopHeadline(        @Query("country") country: String,        @Query("apiKey") apiKey: String,    ): Response<TopHeadlineResponse?>}