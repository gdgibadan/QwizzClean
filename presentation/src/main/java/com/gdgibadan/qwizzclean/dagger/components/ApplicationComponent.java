package com.gdgibadan.qwizzclean.dagger.components;

import android.app.Application;

import com.gdgibadan.qwizzclean.dagger.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mayowa on 24/09/2016.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    Application getApplication();
}
