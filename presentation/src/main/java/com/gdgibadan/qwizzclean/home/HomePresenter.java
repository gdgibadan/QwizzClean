package com.gdgibadan.qwizzclean.home;

import javax.inject.Inject;

/**
 * Created by mayowa on 22/09/2016.
 */
public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View mHomeView;

    @Inject
    HomePresenter(HomeContract.View homeView) {
        this.mHomeView = homeView;
    }

    @Inject
    void setupListeners() {
        mHomeView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
