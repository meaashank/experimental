package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f159948a;

    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f159949a;

        public a(Handler handler) {
            this.f159949a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f159949a.post(runnable);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f159951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f159952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f159953c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f159951a = tVar;
            this.f159952b = vVar;
            this.f159953c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f159951a.v()) {
                this.f159951a.c("canceled-at-delivery");
                return;
            }
            if (this.f159952b.a()) {
                this.f159951a.a(this.f159952b.f160094a);
            } else {
                this.f159951a.b(this.f159952b.f160096c);
            }
            if (this.f159952b.f160097d) {
                this.f159951a.a("intermediate-response");
            } else {
                this.f159951a.c("done");
            }
            Runnable runnable = this.f159953c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f159948a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f159948a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f159948a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f159948a.execute(new b(tVar, v.a(b0Var), null));
    }
}
