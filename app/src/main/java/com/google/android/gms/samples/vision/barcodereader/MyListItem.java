package com.google.android.gms.samples.vision.barcodereader;

import android.util.Log;

/**
 * Created by ttyady on 2016/12/21.
 */

public class MyListItem {
    protected int id;   //id
    protected int barcode;  //barcode
    protected String item;  //商品名
    protected int disposal; //廃棄日

    /**
     * MyListItem()
     *
     * @param id      int ID
     * @param barcode int バーコード
     * @param item String 商品名
     * @param disposal int 廃棄日
     */
    public MyListItem(int id,int barcode,String item,int disposal){
        this.id = id;
        this.barcode = barcode;
        this.item = item;
        this.disposal = disposal;
    }

    /**
     * IDを取得
     * getId()
     *
     * @return id int ID
     */
    public int getId() {
        Log.d("取得したID：", String.valueOf(id));
        return id;
    }

    /**
     * バーコードを取得
     * getBarcode()
     *
     * @return barcode int バーコード
     */
    public int getBarcode() {
        return barcode;
    }

    /**
     * 商品名を取得
     * getItem()
     *
     * @return item String 商品名
     */
    public String getItem() {
        return item;
    }

    /**
     * 廃棄日を取得
     * getDisposal()
     *
     * @return disposal int 廃棄日
     */
    public int getDisposal() {
        return disposal;
    }
}
