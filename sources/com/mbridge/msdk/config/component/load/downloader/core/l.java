package com.mbridge.msdk.config.component.load.downloader.core;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile l f154559e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f154560a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.d f154561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f154562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile v f154563d;

    public class a implements com.mbridge.msdk.config.component.load.downloader.database.d {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.d
        public SQLiteDatabase getWritableDatabase() {
            return com.mbridge.msdk.config.component.database.a.a().a(true);
        }
    }

    private l() {
    }

    public static l c() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(f154559e)) {
            synchronized (l.class) {
                try {
                    if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(f154559e)) {
                        f154559e = new l();
                    }
                } finally {
                }
            }
        }
        return f154559e;
    }

    private void e() {
        HandlerThread handlerThread = new HandlerThread("mb_db_thread");
        handlerThread.start();
        this.f154562c = new com.mbridge.msdk.config.component.load.downloader.database.a(new Handler(handlerThread.getLooper()), new a());
    }

    public int a() {
        return this.f154560a;
    }

    public com.mbridge.msdk.config.component.load.downloader.database.c b() {
        return this.f154562c;
    }

    public v d() {
        if (this.f154563d == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            com.mbridge.msdk.thrid.okhttp.m mVar = new com.mbridge.msdk.thrid.okhttp.m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
            mVar.a(this.f154561b.f());
            mVar.b(this.f154561b.g());
            v.b bVar = new v.b();
            long jA = this.f154561b.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f154563d = bVar.b(jA, timeUnit).d(this.f154561b.a(), timeUnit).e(this.f154561b.d(), timeUnit).a(mVar).c(this.f154561b.b(), timeUnit).b(true).a(new com.mbridge.msdk.thrid.okhttp.i(32, 5L, TimeUnit.MINUTES)).a(arrayList).a();
        }
        return this.f154563d;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.d dVar) {
        this.f154561b = dVar;
        e();
    }
}
