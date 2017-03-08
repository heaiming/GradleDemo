package geniatech.com.gradledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
public static final String TAG="GradleDemo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gradleDemo();
    }
    public void gradleDemo(){
        boolean env = BuildConfig.API_ENV;
        String host = BuildConfig.host;
        MainActivity.this.getString(R.string.hehe);
        Log.d(TAG,"MainActivity--gradleDemo env="+env+",host="+host);

    }
}
