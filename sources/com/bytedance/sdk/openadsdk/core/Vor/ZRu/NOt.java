package com.bytedance.sdk.openadsdk.core.Vor.ZRu;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private static volatile NOt ZRu;
    private final ArrayList<String> NOt = new ArrayList<>();
    private final AtomicBoolean mZ = new AtomicBoolean(false);
    private long uR = System.currentTimeMillis();
    private long TFq = 0;
    private long Ht = 0;
    private String Mm = "";
    private String FA = "";
    private String Vor = "";
    private boolean aT = false;
    private boolean ZH = false;

    public static NOt ZRu(Application application) {
        if (ZRu == null) {
            synchronized (NOt.class) {
                try {
                    if (ZRu == null) {
                        NOt nOt = new NOt();
                        ZRu = nOt;
                        nOt.aT = ZRu((Context) application);
                        ZRu.ZH = ZRu(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        ZRu.ZRu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public void NOt(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.NOt.contains(localClassName)) {
            this.NOt.remove(localClassName);
        }
        if (this.NOt.size() == 0) {
            this.uR = System.currentTimeMillis();
            this.mZ.set(true);
            this.FA = localClassName;
        }
    }

    private static int ZRu(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean ZRu(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void ZRu(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.NOt.size() == 0) {
            this.Mm = localClassName;
            this.TFq = System.currentTimeMillis();
            this.Ht = System.currentTimeMillis() - this.uR;
            this.mZ.set(false);
        }
        if (!this.NOt.contains(localClassName)) {
            this.NOt.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.Vor = localClassName;
    }

    private void ZRu() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z10 = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objValueAt = arrayMap.valueAt(i10);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.NOt.contains(localClassName)) {
                            this.NOt.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.mZ;
                if (this.NOt.size() > 0) {
                    z10 = false;
                }
                atomicBoolean.set(z10);
            }
        } catch (Throwable unused) {
        }
    }

    public String ZRu(String str, long j10, int i10) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.TFq;
        long j12 = jCurrentTimeMillis - j10;
        int i11 = j12 < 500 ? 1 : 0;
        if (this.mZ.get() && this.ZH) {
            i11 |= 2;
        }
        if (!this.mZ.get() && this.Ht >= 5000 && j11 < 1000) {
            i11 = this.FA.equals(this.Vor) ? i11 | 4 : i11 | 8;
        }
        try {
            string = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.Ht).put("rit", i10).put("poptime", j11).put("unlocktime", j12).put("bakground", this.mZ).put("alert", this.ZH).put(NotificationCompat.CATEGORY_SYSTEM, this.aT).put("actsize", this.NOt.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.NOt.mZ()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.Mm = "";
        this.Ht = 0L;
        this.TFq = 0L;
        this.uR = System.currentTimeMillis();
        return string;
    }
}
