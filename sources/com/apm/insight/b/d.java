package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.b.h;
import com.apm.insight.l.m;
import com.apm.insight.runtime.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f137053a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f137054b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f137055c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static FileObserver f137056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f137057e;

    public static boolean b() {
        return f137055c;
    }

    public static void c() {
        f137057e = null;
    }

    public static void a(final String str, final h.a aVar) {
        FileObserver fileObserver = f137056d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i10, @Nullable String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.f137053a = aVar.a();
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    k.a(th, "NPTH_CATCH");
                }
            }
        };
        f137056d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static JSONObject a() throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", m.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            com.apm.insight.c.a();
            k.a(th, "NPTH_CATCH");
            return null;
        }
    }

    public static String a(Context context) {
        if (SystemClock.uptimeMillis() - f137054b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoB = com.apm.insight.l.a.b(context);
            if (processErrorStateInfoB != null && Process.myPid() == processErrorStateInfoB.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f137057e;
                if (processErrorStateInfo != null && String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfoB.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfoB.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfoB.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfoB.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfoB.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfoB.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfoB.longMsg))) {
                    return null;
                }
                f137057e = processErrorStateInfoB;
                f137053a = null;
                f137054b = SystemClock.uptimeMillis();
                f137055c = false;
                if (!com.apm.insight.e.t()) {
                    return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
                }
                StringBuilder sb2 = new StringBuilder("|------------- processErrorStateInfo--------------|\n");
                sb2.append("condition: " + processErrorStateInfoB.condition + "\n");
                sb2.append("processName: " + processErrorStateInfoB.processName + "\n");
                sb2.append("pid: " + processErrorStateInfoB.pid + "\n");
                sb2.append("uid: " + processErrorStateInfoB.uid + "\n");
                sb2.append("tag: " + processErrorStateInfoB.tag + "\n");
                sb2.append("shortMsg : " + processErrorStateInfoB.shortMsg + "\n");
                sb2.append("longMsg : " + processErrorStateInfoB.longMsg + "\n");
                sb2.append("-----------------------end----------------------------");
                return sb2.toString();
            }
        } catch (Throwable unused) {
        }
        String str = f137053a;
        if (str == null) {
            return null;
        }
        f137055c = true;
        f137053a = null;
        f137054b = SystemClock.uptimeMillis();
        return str;
    }
}
