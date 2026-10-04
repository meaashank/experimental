package com.prism.gaia.naked.compat.android.net.wifi;

import W6.c;
import android.net.wifi.WifiInfo;
import com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class WifiInfoCompat2 {

    public static class Util {
        public static void setMacAddress(WifiInfo wifiInfo, String str) {
            if (WifiInfoCAG.f165849C.mMacAddress() != null) {
                WifiInfoCAG.f165849C.mMacAddress().set(wifiInfo, str);
            }
        }
    }
}
