package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import e.InterfaceC4326A;
import e.InterfaceC4336j;
import e.f0;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f139814e = "HardwareConfig";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f139815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4336j(api = 28)
    public static final boolean f139816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final File f139817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f139818i = 50;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f139819j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f139820k = 500;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f139821l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile B f139822m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC4326A("this")
    public int f139824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC4326A("this")
    public boolean f139825c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f139826d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f139823a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f139815f = i10 < 29;
        f139816g = i10 >= 28;
        f139817h = new File("/proc/self/fd");
    }

    @f0
    public B() {
    }

    public static B c() {
        if (f139822m == null) {
            synchronized (B.class) {
                try {
                    if (f139822m == null) {
                        f139822m = new B();
                    }
                } finally {
                }
            }
        }
        return f139822m;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return f139815f && !this.f139826d.get();
    }

    public void b() {
        y3.o.b();
        this.f139826d.set(false);
    }

    public final int d() {
        if (f()) {
            return 500;
        }
        return this.f139823a;
    }

    public final synchronized boolean e() {
        try {
            boolean z10 = true;
            int i10 = this.f139824b + 1;
            this.f139824b = i10;
            if (i10 >= 50) {
                this.f139824b = 0;
                int length = f139817h.list().length;
                long jD = d();
                if (length >= jD) {
                    z10 = false;
                }
                this.f139825c = z10;
                if (!z10 && Log.isLoggable(v.f139956f, 5)) {
                    Log.w(v.f139956f, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jD);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f139825c;
    }

    public boolean g(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable(f139814e, 2)) {
                Log.v(f139814e, "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f139816g) {
            if (Log.isLoggable(f139814e, 2)) {
                Log.v(f139814e, "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable(f139814e, 2)) {
                Log.v(f139814e, "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable(f139814e, 2)) {
                Log.v(f139814e, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable(f139814e, 2)) {
                Log.v(f139814e, "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (e()) {
            return true;
        }
        if (Log.isLoggable(f139814e, 2)) {
            Log.v(f139814e, "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    public boolean h(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zG = g(i10, i11, z10, z11);
        if (zG) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zG;
    }

    public void i() {
        y3.o.b();
        this.f139826d.set(true);
    }
}
