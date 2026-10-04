package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class MR {
    private static String NOt = null;
    private static String ZRu = null;
    private static String mZ = null;
    private static volatile boolean uR = true;

    public static class ZRu extends com.bytedance.sdk.component.FA.FA {
        public static AtomicBoolean ZRu = new AtomicBoolean(false);
        private static final AtomicLong NOt = new AtomicLong(0);

        public ZRu(String str, int i10) {
            super(str, i10);
        }

        public static void ZRu() {
            if (ZRu.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = NOt;
            if (jCurrentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            WD.NOt((com.bytedance.sdk.component.FA.FA) new ZRu("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            ZRu.set(true);
            MR.TFq();
            ZRu.set(false);
        }
    }

    public static String NOt() {
        try {
            ZRu.ZRu();
            if (!uR) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                sb2.append(uR ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.lp.ZRu("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.WMI.ZRu().getResources().getConfiguration();
            int i10 = configuration.mcc;
            String strValueOf = i10 != 0 ? String.valueOf(i10) : NOt;
            com.bytedance.sdk.component.utils.lp.ZRu("MCC", "config=" + configuration.mcc + ",sMCC=" + NOt);
            return strValueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("SimUtils", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void TFq() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.WMI.ZRu() == null) {
            return;
        }
        uR = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.WMI.ZRu().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    uR = false;
                }
                com.bytedance.sdk.component.utils.lp.ZRu("MCC", uR ? "Have SIM card" : "No SIM card");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("SimUtils", th.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                ZRu = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                NOt = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            mZ = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String ZRu() {
        ZRu.ZRu();
        return ZRu;
    }

    public static String mZ() {
        ZRu.ZRu();
        return mZ;
    }
}
