package co.uk.thewirelessguy.androidsubredditcompose.di

import co.uk.thewirelessguy.androidsubredditcompose.data.ApiInterface
import co.uk.thewirelessguy.androidsubredditcompose.data.getApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiInterfaceModule {

    @Provides
    @Singleton
    fun providesApiInterface(
        okHttpClient: OkHttpClient
    ): ApiInterface = getApiClient(
        clazz = ApiInterface::class.java,
        okHttpClient = okHttpClient
    )
}