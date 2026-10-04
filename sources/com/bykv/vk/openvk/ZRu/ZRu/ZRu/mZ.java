package com.bykv.vk.openvk.ZRu.ZRu.ZRu;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private static int Ht = 1;
    private static Context NOt = null;
    private static ZH TFq = null;
    public static boolean ZRu = false;
    private static String mZ = null;
    private static boolean uR = false;

    public static int Ht() {
        return Ht;
    }

    public static String NOt() {
        if (TextUtils.isEmpty(mZ)) {
            try {
                File file = new File(ZRu().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                mZ = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return mZ;
    }

    public static boolean TFq() {
        return ZRu;
    }

    public static Context ZRu() {
        return NOt;
    }

    public static boolean mZ() {
        return uR;
    }

    public static ZH uR() {
        if (TFq == null) {
            ZH.ZRu zRu = new ZH.ZRu("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TFq = zRu.ZRu(10000L, timeUnit).NOt(10000L, timeUnit).mZ(10000L, timeUnit).ZRu();
        }
        return TFq;
    }

    public static void ZRu(Context context, String str) {
        NOt = context;
        mZ = str;
    }

    public static void ZRu(boolean z10) {
        uR = z10;
    }

    public static void ZRu(ZH zh) {
        TFq = zh;
    }

    public static void ZRu(int i10) {
        Ht = i10;
    }
}
