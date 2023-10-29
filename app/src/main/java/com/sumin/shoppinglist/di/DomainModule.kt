package com.sumin.shoppinglist.di

import com.sumin.shoppinglist.data.ShopListRepositoryImpl
import com.sumin.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    @ApplicationScope
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository
}