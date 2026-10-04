package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f137477a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f137478b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f137479c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f137480d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f137481e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137482a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f137482a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137482a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137482a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137482a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137482a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f137482a[crashType.ordinal()];
        if (i10 == 1) {
            this.f137477a.add(iCrashCallback);
            this.f137478b.add(iCrashCallback);
            this.f137479c.add(iCrashCallback);
            this.f137480d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f137480d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f137478b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f137477a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f137479c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f137482a[crashType.ordinal()];
        if (i10 == 1) {
            this.f137477a.remove(iCrashCallback);
            this.f137478b.remove(iCrashCallback);
            this.f137479c.remove(iCrashCallback);
            this.f137480d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f137480d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f137478b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f137477a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f137479c.remove(iCrashCallback);
        }
    }

    @NonNull
    public final List<ICrashCallback> c() {
        return this.f137478b;
    }

    @NonNull
    public final List<ICrashCallback> d() {
        return this.f137479c;
    }

    @NonNull
    public final List<ICrashCallback> e() {
        return this.f137480d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f137481e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f137481e.remove(iOOMCallback);
    }

    @NonNull
    public final List<IOOMCallback> a() {
        return this.f137481e;
    }

    @NonNull
    public final List<ICrashCallback> b() {
        return this.f137477a;
    }
}
