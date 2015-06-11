package demo.leakcanary.srain.in.leakcanarydemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }

}
