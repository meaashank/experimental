package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C3638m6;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3638m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f153139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f153141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f153142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f153143g;

    public C3638m6(Context context, String url, long j10, long j11, int i10, int i11) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(url, "url");
        this.f153137a = url;
        this.f153138b = j10;
        this.f153139c = j11;
        this.f153140d = i10;
        this.f153141e = i11;
        this.f153142f = new WeakReference(context);
        this.f153143g = new AtomicBoolean(false);
        a();
    }

    public final void a() {
        final Context context = (Context) this.f153142f.get();
        if (context != null) {
            AbstractC3721s6.f153342a.submit(new Runnable() { // from class: F5.W1
                @Override // java.lang.Runnable
                public final void run() {
                    C3638m6.a(this.f34411a, context);
                }
            });
        }
    }

    public static final void a(C3638m6 this$0, Context context) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(context, "$context");
        if (this$0.f153143g.get()) {
            return;
        }
        if (!this$0.f153143g.get()) {
            int iA = F1.a((F1) AbstractC3531eb.d());
            C3554g6 c3554g6D = AbstractC3531eb.d();
            c3554g6D.getClass();
            ArrayList arrayListA = F1.a(c3554g6D, "hasLoggerFinished=1", null, null, null, null, Integer.valueOf(iA), 30);
            C3624l6 c3624l6 = new C3624l6(this$0, context);
            kotlin.jvm.internal.G.p(arrayListA, "<this>");
            Iterator it = kotlin.collections.U.x2(arrayListA).iterator();
            while (it.hasNext()) {
                c3624l6.invoke(it.next());
            }
        }
        ScheduledExecutorService scheduledExecutorService = AbstractC3721s6.f153342a;
        AbstractC3707r6.a(AbstractC3531eb.d(), Calendar.getInstance().getTimeInMillis() - this$0.f153139c, this$0.f153141e);
    }

    public final void a(final Context context, final String str, C3540f6 c3540f6) {
        Iterable<String> iterableDz;
        String[] list;
        int i10;
        if (this.f153143g.get()) {
            return;
        }
        if (c3540f6.f152917d == 0 || System.currentTimeMillis() - c3540f6.f152917d >= this.f153138b) {
            X8 x8B = new C3652n6(str, c3540f6).b();
            if (x8B.b() && (i10 = c3540f6.f152916c + 1) < this.f153140d) {
                T8 t82 = x8B.f152598c;
                if ((t82 != null ? t82.f152457a : null) != J3.f152113s) {
                    final C3540f6 c3540f62 = new C3540f6(c3540f6.f152914a, c3540f6.f152915b, i10, System.currentTimeMillis(), false, 0, 48);
                    AbstractC3531eb.d().b(c3540f62);
                    AbstractC3721s6.f153342a.schedule(new Runnable() { // from class: F5.X1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3638m6.a(this.f34416a, context, str, c3540f62);
                        }
                    }, this.f153138b, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            AbstractC3735t6.a(c3540f6.f152914a);
            AbstractC3531eb.d().a(c3540f6);
            Context context2 = (Context) this.f153142f.get();
            if (context2 != null) {
                ScheduledExecutorService scheduledExecutorService = AbstractC3721s6.f153342a;
                String directoryPath = context2.getFilesDir() + "/logging";
                kotlin.jvm.internal.G.p(directoryPath, "directoryPath");
                File file = new File(directoryPath);
                if (!file.exists() || !file.isDirectory() || (list = file.list()) == null || (iterableDz = kotlin.collections.B.dz(list)) == null) {
                    iterableDz = EmptyList.f217510a;
                }
                for (String fileName : iterableDz) {
                    C3554g6 c3554g6D = AbstractC3531eb.d();
                    c3554g6D.getClass();
                    kotlin.jvm.internal.G.p(fileName, "fileName");
                    if (F1.a(c3554g6D, "filename=\"" + fileName + '\"', null, null, null, null, null, 62).isEmpty()) {
                        AbstractC3735t6.a(fileName);
                    }
                }
            }
        }
    }

    public static final void a(C3638m6 this$0, Context context, String url, C3540f6 updatedData) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(context, "$context");
        kotlin.jvm.internal.G.p(url, "$url");
        kotlin.jvm.internal.G.p(updatedData, "$updatedData");
        this$0.a(context, url, updatedData);
    }
}
