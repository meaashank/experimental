package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f161931a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f161932b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f161933c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f161934d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f161935e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f161936f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f161937g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static InputManager f161938h;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f161939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f161940b;

        public a(Context context, int i10) {
            this.f161939a = context;
            this.f161940b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputManager inputManagerB = w.b(this.f161939a);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f161940b);
            w.g();
            if (inputDevice == null) {
                w.a();
                w.b();
                w.b("nihc");
            } else if (inputDevice.isVirtual()) {
                w.c();
                w.d();
                w.b("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                w.e();
                w.f();
                w.b("eihc");
            }
        }
    }

    public static /* synthetic */ int b() {
        int i10 = f161936f;
        f161936f = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int c() {
        int i10 = f161931a;
        f161931a = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int d() {
        int i10 = f161934d;
        f161934d = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int e() {
        int i10 = f161932b;
        f161932b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f() {
        int i10 = f161935e;
        f161935e = i10 + 1;
        return i10;
    }

    public static void g() {
        if (f161937g) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = u0.a(x.b());
            if (sharedPreferencesA != null) {
                f161936f = sharedPreferencesA.getInt("nihc", 0);
                f161935e = sharedPreferencesA.getInt("eihc", 0);
                f161934d = sharedPreferencesA.getInt("vihc", 0);
                f161937g = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ int a() {
        int i10 = f161933c;
        f161933c = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        try {
            SharedPreferences sharedPreferencesA = u0.a(x.b());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            o0.b(new a(context, motionEvent.getDeviceId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f161938h == null) {
            f161938h = (InputManager) context.getSystemService("input");
        }
        return f161938h;
    }

    public static void a(JSONObject jSONObject) {
        try {
            jSONObject.put("vihc", f161934d);
            jSONObject.put("eihc", f161935e);
            jSONObject.put("nihc", f161936f);
            jSONObject.put("vic", f161931a);
            jSONObject.put("nic", f161933c);
            jSONObject.put("eic", f161932b);
        } catch (JSONException unused) {
        }
    }
}
