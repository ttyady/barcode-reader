package com.google.android.gms.samples.vision.barcodereader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by ttyady on 2016/12/21.
 */

public class ShowTableActivity extends Activity {
    private ListView tableView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tableView = new ListView(this);

    }
}
