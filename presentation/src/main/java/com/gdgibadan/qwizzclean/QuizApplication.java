package com.gdgibadan.qwizzclean;

import android.app.Application;

import com.gdgibadan.qwizzclean.dagger.components.ApplicationComponent;
import com.gdgibadan.qwizzclean.dagger.components.DaggerApplicationComponent;
import com.gdgibadan.qwizzclean.dagger.modules.ApplicationModule;

/**
 * Created by mayowa on 24/09/2016.
 */
public class QuizApplication extends Application {
    private static ApplicationComponent sApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        sApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return sApplicationComponent;
    }
}
