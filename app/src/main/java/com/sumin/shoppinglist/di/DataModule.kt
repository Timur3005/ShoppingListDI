package com.sumin.shoppinglist.di

import android.app.Application
import com.sumin.shoppinglist.data.AppDatabase
import com.sumin.shoppinglist.data.ShopListDao
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    @ApplicationScope
    fun provideShopListDao(application: Application): ShopListDao{
        return AppDatabase.getInstance(application).shopListDao()
    }
}