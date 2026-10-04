package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;

/* JADX INFO: loaded from: classes5.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f161946a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f161947b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f161948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f161949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f161950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static DisplayManager f161951f;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            y.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            y.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            y.b(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f161948c)) {
                    return;
                }
                f161948c = strA;
            } else if (i11 == 2) {
                if (strA.equals(f161949d)) {
                    return;
                }
                f161949d = strA;
            } else {
                if (i11 != 3 || strA.equals(f161950e)) {
                    return;
                }
                f161950e = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context) {
        Handler handlerB;
        if (f161947b) {
            return;
        }
        f161947b = true;
        if (f161946a == null) {
            f161946a = new a();
        }
        if (f161951f == null) {
            f161951f = (DisplayManager) context.getSystemService("display");
        }
        if (f161951f == null || (handlerB = o0.b()) == null) {
            return;
        }
        try {
            f161951f.registerDisplayListener(f161946a, handlerB);
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object objA = s0.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = s0.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = s0.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    public static boolean b(Context context) {
        if (f161948c == null && f161949d == null && f161950e == null) {
            return (context == null || TextUtils.isEmpty(a(context))) ? false : true;
        }
        return true;
    }

    private static String a(int i10) {
        Display display = f161951f.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    public static String a(Context context) {
        Display[] displays;
        if (f161951f == null) {
            f161951f = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f161951f;
        if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < displays.length; i10++) {
            Display display = displays[i10];
            if (display != null && display.getDisplayId() != 0) {
                stringBuffer.append(a(displays[i10]));
                if (i10 != displays.length - 1) {
                    stringBuffer.append(",");
                }
            }
        }
        return stringBuffer.toString();
    }
}
