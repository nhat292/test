package nguyenvannhat.android.com.activeandroid;

import android.app.Application;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

/**
 * Project ActiveAndroid
 * Created by Nguyen Van Nhat on 03/22/2016.
 */
public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        //using dynamic database name
        Configuration dbConfiguration = new Configuration.Builder(this).setDatabaseName("nhat292.db").create();
        ActiveAndroid.initialize(dbConfiguration);
    }
}
