package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.load.engine.cache.a;
import e3.b;
import g3.InterfaceC4444b;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f139597f = "DiskLruCacheWrapper";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f139598g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f139599h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static e f139600i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f139602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f139603c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e3.b f139605e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f139604d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f139601a = new l();

    @Deprecated
    public e(File file, long j10) {
        this.f139602b = file;
        this.f139603c = j10;
    }

    public static a d(File file, long j10) {
        return new e(file, j10);
    }

    @Deprecated
    public static synchronized a e(File file, long j10) {
        try {
            if (f139600i == null) {
                f139600i = new e(file, j10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f139600i;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public File a(InterfaceC4444b interfaceC4444b) {
        String strB = this.f139601a.b(interfaceC4444b);
        if (Log.isLoggable(f139597f, 2)) {
            Log.v(f139597f, "Get: Obtained: " + strB + " for for Key: " + interfaceC4444b);
        }
        try {
            b.e eVarP = f().P(strB);
            if (eVarP != null) {
                return eVarP.f200214d[0];
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable(f139597f, 5)) {
                return null;
            }
            Log.w(f139597f, "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void b(InterfaceC4444b interfaceC4444b) {
        try {
            f().f1(this.f139601a.b(interfaceC4444b));
        } catch (IOException e10) {
            if (Log.isLoggable(f139597f, 5)) {
                Log.w(f139597f, "Unable to delete from disk cache", e10);
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void c(InterfaceC4444b interfaceC4444b, a.b bVar) {
        String strB = this.f139601a.b(interfaceC4444b);
        this.f139604d.a(strB);
        try {
            if (Log.isLoggable(f139597f, 2)) {
                Log.v(f139597f, "Put: Obtained: " + strB + " for for Key: " + interfaceC4444b);
            }
            try {
                e3.b bVarF = f();
                if (bVarF.P(strB) == null) {
                    b.c cVarU = bVarF.u(strB, -1L);
                    if (cVarU == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strB));
                    }
                    try {
                        if (bVar.a(cVarU.f(0))) {
                            cVarU.e();
                        }
                        cVarU.b();
                    } catch (Throwable th) {
                        cVarU.b();
                        throw th;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable(f139597f, 5)) {
                    Log.w(f139597f, "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f139604d.b(strB);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public synchronized void clear() {
        try {
            try {
                f().q();
            } catch (IOException e10) {
                if (Log.isLoggable(f139597f, 5)) {
                    Log.w(f139597f, "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
        } finally {
            g();
        }
    }

    public final synchronized e3.b f() throws IOException {
        try {
            if (this.f139605e == null) {
                this.f139605e = e3.b.N0(this.f139602b, 1, 1, this.f139603c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f139605e;
    }

    public final synchronized void g() {
        this.f139605e = null;
    }
}
