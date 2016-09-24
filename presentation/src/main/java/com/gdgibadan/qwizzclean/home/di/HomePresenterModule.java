package com.gdgibadan.qwizzclean.home.di;

import com.gdgibadan.qwizzclean.home.HomeContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mayowa on 24/09/2016.
 */
@Module
public class HomePresenterModule {
    private final HomeContract.View mView;

    public HomePresenterModule(HomeContract.View view) {
        this.mView = view;
    }

    @Provides
    HomeContract.View providesHomeContractView() {
        return mView;
    }
}
