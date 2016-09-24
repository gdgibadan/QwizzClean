package com.gdgibadan.qwizzclean.home;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gdgibadan.qwizzclean.QuizApplication;
import com.gdgibadan.qwizzclean.R;
import com.gdgibadan.qwizzclean.home.di.DaggerHomePresenterComponent;
import com.gdgibadan.qwizzclean.home.di.HomePresenterModule;
import com.gdgibadan.qwizzclean.utils.ActivityUtils;

import javax.inject.Inject;

/**
 * Home Activity
 */
public class HomeActivity extends AppCompatActivity {

    //ActivityHomeBinding mBinding;

    @Inject HomePresenter mHomePresenter;

    private HomeFragment mHomeFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataBindingUtil.setContentView(this, R.layout.activity_home);

        startHomeFragment();

        //create presenter
        DaggerHomePresenterComponent.builder()
                .applicationComponent(((QuizApplication)getApplication()).getApplicationComponent())
                .homePresenterModule(new HomePresenterModule(mHomeFragment))
                .build().inject(this);

    }

    private void startHomeFragment() {
        mHomeFragment = (HomeFragment) getSupportFragmentManager().
                findFragmentById(R.id.container);

        if (mHomeFragment == null) {
            mHomeFragment = HomeFragment.newInstance(null);

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    mHomeFragment, R.id.container);

        }
    }

}
