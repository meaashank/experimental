package com.bytedance.sdk.openadsdk.uR;

/* JADX INFO: loaded from: classes3.dex */
public class yBV extends uR {
    public static String mZ() {
        return "CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)";
    }
}
