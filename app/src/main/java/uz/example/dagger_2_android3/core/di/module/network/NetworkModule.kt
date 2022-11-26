package uz.example.dagger_2_android3.core.di.module.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.example.dagger_2_android3.core.di.annotation.MovieDBAnnotation
import uz.example.dagger_2_android3.core.di.annotation.NewsApiAnnotation
import javax.inject.Named
import javax.inject.Singleton


@Module
object NetworkModule {
    
    @Provides
    @Singleton
    @NewsApiAnnotation
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://newsapi.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    @MovieDBAnnotation
    fun get1Retrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.themoviedb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}