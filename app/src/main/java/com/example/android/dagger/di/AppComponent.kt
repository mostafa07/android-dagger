package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppSubcomponents::class, StorageModule::class])
@Singleton
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }


    fun registrationComponent(): RegistrationComponent.Factory


    fun inject(activity: MainActivity)
}