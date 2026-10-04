package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f137120a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f137121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f137122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Printer f137123d;

    public interface a {
    }

    public static class b implements Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<Printer> f137124a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Printer> f137127d = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<Printer> f137125b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f137128e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f137126c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f137126c) {
                for (Printer printer : this.f137125b) {
                    if (!this.f137124a.contains(printer)) {
                        this.f137124a.add(printer);
                    }
                }
                this.f137125b.clear();
                this.f137126c = false;
            }
            if (this.f137124a.size() > i.f137120a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f137124a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() {
        if (f137122c) {
            return;
        }
        f137122c = true;
        f137121b = new b();
        Printer printerD = d();
        f137123d = printerD;
        if (printerD != null) {
            f137121b.f137124a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f137121b);
        }
    }

    public static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f137121b.f137125b.contains(printer)) {
            return;
        }
        f137121b.f137125b.add(printer);
        f137121b.f137126c = true;
    }
}
