package com.example.chanalaaa.app01;

/**
 * Created by Chanalaaa on 23/12/2015.
 */
public class MyData {

    public  String[] title(){
        String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลี้ยวซ้าย";
        strTitle[1] = "ห้ามเลี้ยวขวา";
        strTitle[2] = "ตรงไป";
        strTitle[3] = "เลี้ยวขวา";
        strTitle[4] = "เลี้ยวซ้าย";
        strTitle[5] = "ทางออก";
        strTitle[6] = "ทางเข้า";
        strTitle[7] = "ทางออก2";
        strTitle[8] = "หยุดรถ";
        strTitle[9] = "จำกัดความสูง 2.5m";
        strTitle[10] = "แยกซ้ายขวา";
        strTitle[11] = "ห้ามกลับรถ";
        strTitle[12] = "ห้ามจอด";
        strTitle[13] = "รถสวน";
        strTitle[14] = "ห้ามแซง";
        strTitle[15] = "ทางเข้า";
        strTitle[16] = "โปรดหยุดรถ";
        strTitle[17] = "จำกัดความเร็ว 50km/hr";
        strTitle[18] = "จำกัดความกว้าง 2.5m";
        strTitle[19] = "จำกัดความสูง 5m";

        return strTitle;
    }

    public int[] icon(){
        int[] intIcon = {R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03,R.drawable.traffic_04,R.drawable.traffic_05,
                R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,R.drawable.traffic_09,R.drawable.traffic_10,
                R.drawable.traffic_11,R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,R.drawable.traffic_15,
                R.drawable.traffic_16,R.drawable.traffic_17,R.drawable.traffic_18,R.drawable.traffic_19,R.drawable.traffic_20,};

        return intIcon;
    }

}
