package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.inmobi.media.AbstractC3760v3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import jd.C4806d;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import q8.C5443b;

/* JADX INFO: renamed from: com.inmobi.media.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3760v3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f153435c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f153438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Integer f153439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Float f153440h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3774w3 f153433a = new C3774w3(0, 2.0f, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3746u3 f153434b = new C3746u3(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f153436d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f153437e = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f153441i = C3635m3.f153124a.x();

    public static String a() {
        Display displayA;
        Context contextD = C3657nb.d();
        if (contextD == null || (displayA = a(contextD)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append('x');
        sb2.append(i11);
        return sb2.toString();
    }

    public static float b() {
        Display displayA;
        if (f153436d == -1.0f) {
            Context contextD = C3657nb.d();
            if (contextD == null || (displayA = a(contextD)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            if (f10 == 0.0f) {
                return 2.0f;
            }
            f153436d = f10;
        }
        return f153436d;
    }

    public static HashMap c() {
        HashMap map = new HashMap();
        try {
            map.put("d-device-screen-density", String.valueOf(b()));
            C3774w3 c3774w3D = d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c3774w3D.f153495a);
            sb2.append('X');
            sb2.append(c3774w3D.f153496b);
            map.put("d-device-screen-size", sb2.toString());
            map.put("d-density-dependent-screen-size", a());
            map.put("d-orientation", String.valueOf((int) g()));
            Float f10 = f153440h;
            map.put("d-textsize", String.valueOf(f10 != null ? f10.floatValue() : 37.0f));
        } catch (Exception unused) {
        }
        return map;
    }

    public static C3774w3 d() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return f153433a;
        }
        Display displayA = a(contextD);
        if (displayA == null) {
            return f153433a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new C3774w3((int) (displayMetrics.widthPixels / f10), f10, (int) (displayMetrics.heightPixels / f10));
    }

    public static String e() {
        String string = null;
        if (f153437e) {
            return null;
        }
        String str = f153435c;
        if (str != null) {
            return str;
        }
        Context contextD = C3657nb.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            string = J5.a(contextD, "display_info_store").f152165a.getString("gesture_margin", null);
        }
        f153435c = string;
        return string;
    }

    public static Integer f() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return null;
        }
        int i10 = Settings.Secure.getInt(contextD.getContentResolver(), "navigation_mode", -1);
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return i10 != 2 ? null : 1;
    }

    public static byte g() {
        Display displayA;
        Context contextD = C3657nb.d();
        if (contextD == null || (displayA = a(contextD)) == null) {
            return (byte) 1;
        }
        int rotation = displayA.getRotation();
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation != 2) {
            return rotation != 3 ? (byte) 1 : (byte) 4;
        }
        return (byte) 2;
    }

    public static C3774w3 h() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return f153433a;
        }
        Display displayA = a(contextD);
        if (displayA == null) {
            return f153433a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new C3774w3((int) (displayMetrics.widthPixels / f10), f10, (int) (displayMetrics.heightPixels / f10));
    }

    public static final void b(WindowInsets insets, Context context) {
        kotlin.jvm.internal.G.p(insets, "$insets");
        try {
            String string = insets.getSystemGestureInsets().toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            String[] strArr = (String[]) new Regex("Insets").r(string, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(",").r(new Regex("[^0-9,=a-zA-Z]*").p(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String[] strArr3 = (String[]) new Regex("=").r(strArr2[i10], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append('\"' + strArr3[0] + '\"');
                        stringBuffer.append(com.prism.gaia.server.accounts.b.f166434b0);
                        stringBuffer.append(a(Integer.parseInt(strArr3[1])));
                        if (i10 < strArr2.length - 1) {
                            stringBuffer.append(U6.j.f68738d);
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                f153435c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                kotlin.jvm.internal.G.m(context);
                K5 k5A = J5.a(context, "display_info_store");
                String string2 = stringBuffer.toString();
                SharedPreferences.Editor editorEdit = k5A.f152165a.edit();
                editorEdit.putString("gesture_margin", string2);
                editorEdit.apply();
            }
        } catch (Exception unused) {
        }
    }

    public static final int a(int i10) {
        try {
            return C4806d.L0(i10 / b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void a(final WindowInsets insets, final Context context) {
        kotlin.jvm.internal.G.p(insets, "insets");
        if (f153437e) {
            return;
        }
        C3657nb.a(new Runnable() { // from class: F5.E2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3760v3.b(insets, context);
            }
        });
    }

    public static Display a(Context context) {
        if (C3635m3.f153124a.w()) {
            Object systemService = context.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                return displayManager.getDisplay(0);
            }
        } else {
            Object systemService2 = context.getSystemService(C5443b.f226850e);
            WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
            if (windowManager != null) {
                return windowManager.getDefaultDisplay();
            }
        }
        return null;
    }

    public static final void c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f153437e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.view.WindowInsets r3) {
        /*
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.G.p(r3, r0)
            com.inmobi.media.m3 r0 = com.inmobi.media.C3635m3.f153124a
            boolean r0 = r0.E()
            if (r0 == 0) goto L5b
            byte r0 = g()
            com.inmobi.media.s9 r0 = com.inmobi.media.AbstractC3738t9.a(r0)
            r1 = 16
            android.graphics.Insets r3 = androidx.core.view.C1.a(r3, r1)
            java.lang.String r1 = "getInsets(...)"
            kotlin.jvm.internal.G.o(r3, r1)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L4f
            if (r0 == r1) goto L42
            r2 = 2
            if (r0 == r2) goto L4f
            r2 = 3
            if (r0 != r2) goto L3c
            int r0 = androidx.appcompat.widget.C1519z.a(r3)
            if (r0 != 0) goto L5c
            int r3 = androidx.appcompat.widget.A.a(r3)
            if (r3 != 0) goto L5c
            goto L5b
        L3c:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L42:
            int r0 = androidx.appcompat.widget.C1517x.a(r3)
            if (r0 != 0) goto L5c
            int r3 = androidx.appcompat.widget.A.a(r3)
            if (r3 != 0) goto L5c
            goto L5b
        L4f:
            int r0 = androidx.appcompat.widget.C1517x.a(r3)
            if (r0 != 0) goto L5c
            int r3 = androidx.appcompat.widget.C1519z.a(r3)
            if (r3 != 0) goto L5c
        L5b:
            r1 = 0
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3760v3.a(android.view.WindowInsets):int");
    }

    public static void a(final Map value) {
        kotlin.jvm.internal.G.p(value, "value");
        final Context contextD = C3657nb.d();
        if (contextD == null) {
            return;
        }
        C3657nb.a(new Runnable() { // from class: F5.F2
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                AbstractC3760v3.a(value, contextD);
            }
        });
    }

    public static final void a(Map value, Context context) throws JSONException {
        kotlin.jvm.internal.G.p(value, "$value");
        kotlin.jvm.internal.G.p(context, "$context");
        Objects.toString(value);
        if (f153438f == null) {
            f153438f = new JSONObject();
        }
        Iterator it = value.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f153438f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(iIntValue), value.get(Integer.valueOf(iIntValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        K5 k5A = J5.a(context, "display_info_store");
        JSONObject jSONObject2 = f153438f;
        k5A.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null);
    }

    public static C3746u3 b(Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        Display displayA = a(context);
        if (displayA == null) {
            return f153434b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        return new C3746u3(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static void a(final Integer num) {
        final Context contextD = C3657nb.d();
        if (contextD == null) {
            return;
        }
        C3657nb.a(new Runnable() { // from class: F5.G2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3760v3.a(num, contextD);
            }
        });
    }

    public static final void a(Integer num, Context context) {
        kotlin.jvm.internal.G.p(context, "$context");
        f153439g = num;
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        J5.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1);
    }
}
