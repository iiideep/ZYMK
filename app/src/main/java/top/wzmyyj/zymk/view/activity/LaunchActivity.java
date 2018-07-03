package top.wzmyyj.zymk.view.activity;

import top.wzmyyj.zymk.R;
import top.wzmyyj.zymk.presenter.LaunchPresenter;
import top.wzmyyj.zymk.view.ILaunchView;


/**
 * Created by wzm on 2018/06/24. email: 2209011667@qq.com
 */

public class LaunchActivity extends BaseActivity<LaunchPresenter> implements ILaunchView {

    @Override
    protected void initPresenter() {
        mPresenter = new LaunchPresenter(activity, this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_launch;
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        mPresenter.run();
    }

    @Override
    public void showToast(String t) {

    }
}
