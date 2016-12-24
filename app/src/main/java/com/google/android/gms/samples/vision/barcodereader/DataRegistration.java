package com.google.android.gms.samples.vision.barcodereader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by ttyady on 2016/12/22.
 */

public class DataRegistration extends Activity implements View.OnClickListener {
    private EditText barcodeEdit;
    private EditText itemEdit;
    private EditText disposalEdit;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_registration);

        barcodeEdit = (EditText)findViewById(R.id.barcode_edit);
        Intent intent = getIntent();
        String barcodedata = intent.getStringExtra("barcodevalue");
        barcodeEdit.setText(barcodedata);

        findViewById(R.id.registration_button).setOnClickListener(this);
        findViewById(R.id.reset_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.registration_button) {
            Log.d("ボタンを押した", "registration_button");

            saveList();
        }
        if(v.getId() == R.id.reset_button){
            reset();

        }
    }

    private void reset() {
        itemEdit.setText("");
        disposalEdit.setText("");
    }

    private void saveList() {
        barcodeEdit = (EditText)findViewById(R.id.barcode_edit);
        Log.d("findID", String.valueOf(barcodeEdit));
        itemEdit = (EditText)findViewById(R.id.item_edit);
        Log.d("findID", String.valueOf(itemEdit));
        disposalEdit = (EditText)findViewById(R.id.disposal_edit);
        Log.d("findID", String.valueOf(disposalEdit));

        int barcodeValue = Integer.parseInt(barcodeEdit.getText().toString());
        String itemValue = itemEdit.getText().toString();
        int disposalValue = Integer.parseInt(disposalEdit.getText().toString());

        DBAdapter dbAdapter = new DBAdapter(this);
        Log.d("DB関連", "dbAdapterセット");

        dbAdapter.openDB();
        Log.d("DB関連", "openDB");

//        dbAdapter.saveDB(barcodeValue,itemValue,disposalValue);
        dbAdapter.saveDB();
        Log.d("DB関連", "saveDB");

        dbAdapter.closeDB();
        Log.d("DB関連", "closeDB");

    }
}
