package com.gdgibadan.qwizzclean.home.di;

import com.gdgibadan.qwizzclean.dagger.components.ApplicationComponent;
import com.gdgibadan.qwizzclean.dagger.customscopes.FragmentScoped;
import com.gdgibadan.qwizzclean.home.HomeActivity;

import dagger.Component;

/**
 * Created by mayowa on 24/09/2016.
 */
@FragmentScoped
@Component(dependencies = {ApplicationComponent.class}, modules = {HomePresenterModule.class})
public interface HomePresenterComponent {
    void inject(HomeActivity homeActivity);
}
