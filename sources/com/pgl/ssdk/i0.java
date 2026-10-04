package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i0 f161865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f161866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f161867c = new ArrayList();

    private i0(Context context) {
        this.f161866b = null;
        this.f161866b = context;
    }

    public static i0 a(Context context) {
        if (f161865a == null) {
            synchronized (i0.class) {
                try {
                    if (f161865a == null) {
                        f161865a = new i0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161865a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.f161866b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        if (this.f161866b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return 0;
        }
        return Math.round(((r0.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0) / r0.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f161867c.size() <= 0) {
            return "-1";
        }
        return String.valueOf(this.f161867c.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f161867c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * 10000) + iC;
        } catch (Exception unused) {
            return iB * 10000;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f161867c.add(Integer.valueOf(iF));
        try {
            int size = this.f161867c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f161867c.subList(size - 10, size));
                this.f161867c.clear();
                this.f161867c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
