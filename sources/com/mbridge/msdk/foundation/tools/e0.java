package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f156743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f156744b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f156745a;

        public a(Runnable runnable) {
            this.f156745a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f156745a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f156743a == null) {
                this.f156743a = a(runnable);
                c0.a().execute(this.f156743a);
            } else if (this.f156744b == null) {
                this.f156744b = a(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f156744b;
        this.f156743a = runnable;
        this.f156744b = null;
        if (runnable != null) {
            c0.a().execute(this.f156743a);
        }
    }
}
