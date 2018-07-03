package top.wzmyyj.zymk.presenter;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import top.wzmyyj.zymk.view.ILaunchView;
import top.wzmyyj.zymk.view.activity.MainActivity;

/**
 * Created by wzm on 2018/06/29. email: 2209011667@qq.com
 */

public class LaunchPresenter extends BasePresenter<ILaunchView> {

    private Handler mHandler = new Handler();

    public LaunchPresenter(Activity activity, ILaunchView iLaunchView) {
        super(activity, iLaunchView);
    }

    public void CheckPermission() {

    }

    public void init() {

    }

    public void run() {
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent();
                i.setClass(mActivity, MainActivity.class);
                mActivity.startActivity(i);
                mActivity.finish();
                mActivity.overridePendingTransition(android.R.anim.fade_in,
                        android.R.anim.fade_out);
            }
        }, 2000);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mHandler.removeMessages(0);
    }
}
