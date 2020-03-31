package com.example.mainlibrary;

import com.example.commonlibrary.base.BasePresenter;
import com.example.commonlibrary.base.BaseView;

public interface MainContract {
    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePresenter{

    }
}
