package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.n;

/* JADX INFO: loaded from: classes2.dex */
public class a implements ICrashCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f137006d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f137007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile i.a f137008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile i.a f137009c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f137010e = false;

    private a() {
    }

    public static a a() {
        if (f137006d == null) {
            synchronized (a.class) {
                try {
                    if (f137006d == null) {
                        f137006d = new a();
                    }
                } finally {
                }
            }
        }
        return f137006d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f137007a = str;
        this.f137008b = aVar;
        this.f137009c = aVar2;
        if (this.f137010e) {
            return;
        }
        this.f137010e = true;
        n.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
