package com.gdgibadan.qwizzclean.dagger.modules;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mayowa on 24/09/2016.
 */
@Module
public class ApplicationModule {
    private static Application sApplication;

    public ApplicationModule(Application application) {
        sApplication = application;
    }

    @Singleton
    @Provides
    Application providesApplication() {
        return sApplication;
    }
}
