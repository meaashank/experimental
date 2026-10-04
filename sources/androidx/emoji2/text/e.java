package androidx.emoji2.text;

import G0.V;
import G0.c0;
import Q0.j;
import Q0.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.t;
import androidx.emoji2.text.c;
import e.InterfaceC4326A;
import e.T;
import e.g0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import q1.ExecutorC5418a;

/* JADX INFO: loaded from: classes2.dex */
public class e extends c.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f113339k = new b();

    public static class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f113340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f113341b;

        public a(long j10) {
            this.f113340a = j10;
        }

        @Override // androidx.emoji2.text.e.d
        public long a() {
            if (this.f113341b == 0) {
                this.f113341b = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f113341b;
            if (jUptimeMillis > this.f113340a) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), this.f113340a - jUptimeMillis);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {
        @Nullable
        public Typeface a(@NonNull Context context, @NonNull l.c cVar) throws PackageManager.NameNotFoundException {
            return V.d(context, null, new l.c[]{cVar}, 0);
        }

        @NonNull
        public l.b b(@NonNull Context context, @NonNull j jVar) throws PackageManager.NameNotFoundException {
            return l.b(context, null, jVar);
        }

        public void c(@NonNull Context context, @NonNull Uri uri, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class c implements c.j {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f113342l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f113343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final j f113344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final b f113345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final Object f113346d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        @InterfaceC4326A("mLock")
        public Handler f113347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        @InterfaceC4326A("mLock")
        public Executor f113348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        @InterfaceC4326A("mLock")
        public ThreadPoolExecutor f113349g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        @InterfaceC4326A("mLock")
        public d f113350h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        @InterfaceC4326A("mLock")
        public c.k f113351i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        @InterfaceC4326A("mLock")
        public ContentObserver f113352j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        @InterfaceC4326A("mLock")
        public Runnable f113353k;

        public class a extends ContentObserver {
            public a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10, Uri uri) {
                c.this.d();
            }
        }

        public c(@NonNull Context context, @NonNull j jVar, @NonNull b bVar) {
            t.m(context, "Context cannot be null");
            t.m(jVar, "FontRequest cannot be null");
            this.f113343a = context.getApplicationContext();
            this.f113344b = jVar;
            this.f113345c = bVar;
        }

        @Override // androidx.emoji2.text.c.j
        @T(19)
        public void a(@NonNull c.k kVar) {
            t.m(kVar, "LoaderCallback cannot be null");
            synchronized (this.f113346d) {
                this.f113351i = kVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f113346d) {
                try {
                    this.f113351i = null;
                    ContentObserver contentObserver = this.f113352j;
                    if (contentObserver != null) {
                        this.f113345c.d(this.f113343a, contentObserver);
                        this.f113352j = null;
                    }
                    Handler handler = this.f113347e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f113353k);
                    }
                    this.f113347e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f113349g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f113348f = null;
                    this.f113349g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @T(19)
        @g0
        public void c() {
            synchronized (this.f113346d) {
                try {
                    if (this.f113351i == null) {
                        return;
                    }
                    try {
                        l.c cVarE = e();
                        int iB = cVarE.b();
                        if (iB == 2) {
                            synchronized (this.f113346d) {
                                try {
                                    d dVar = this.f113350h;
                                    if (dVar != null) {
                                        long jA = dVar.a();
                                        if (jA >= 0) {
                                            f(cVarE.d(), jA);
                                            return;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            androidx.core.os.T.b(f113342l);
                            Typeface typefaceA = this.f113345c.a(this.f113343a, cVarE);
                            ByteBuffer byteBufferF = c0.f(this.f113343a, null, cVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarE = f.e(typefaceA, byteBufferF);
                            Trace.endSection();
                            synchronized (this.f113346d) {
                                try {
                                    c.k kVar = this.f113351i;
                                    if (kVar != null) {
                                        kVar.b(fVarE);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            androidx.core.os.T.d();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f113346d) {
                            try {
                                c.k kVar2 = this.f113351i;
                                if (kVar2 != null) {
                                    kVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @T(19)
        public void d() {
            synchronized (this.f113346d) {
                try {
                    if (this.f113351i == null) {
                        return;
                    }
                    if (this.f113348f == null) {
                        ThreadPoolExecutor threadPoolExecutorC = q1.d.c("emojiCompat");
                        this.f113349g = threadPoolExecutorC;
                        this.f113348f = threadPoolExecutorC;
                    }
                    this.f113348f.execute(new Runnable() { // from class: q1.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f226711a.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @g0
        public final l.c e() {
            try {
                l.b bVarB = this.f113345c.b(this.f113343a, this.f113344b);
                if (bVarB.f65764a != 0) {
                    throw new RuntimeException(android.support.v4.media.d.a(new StringBuilder("fetchFonts failed ("), bVarB.f65764a, ")"));
                }
                l.c[] cVarArrC = bVarB.c();
                if (cVarArrC == null || cVarArrC.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return cVarArrC[0];
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @T(19)
        @g0
        public final void f(Uri uri, long j10) {
            synchronized (this.f113346d) {
                try {
                    Handler handlerD = this.f113347e;
                    if (handlerD == null) {
                        handlerD = q1.d.d();
                        this.f113347e = handlerD;
                    }
                    if (this.f113352j == null) {
                        a aVar = new a(handlerD);
                        this.f113352j = aVar;
                        this.f113345c.c(this.f113343a, uri, aVar);
                    }
                    if (this.f113353k == null) {
                        this.f113353k = new Runnable() { // from class: q1.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f226712a.d();
                            }
                        };
                    }
                    handlerD.postDelayed(this.f113353k, j10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g(@NonNull Executor executor) {
            synchronized (this.f113346d) {
                this.f113348f = executor;
            }
        }

        public void h(@Nullable d dVar) {
            synchronized (this.f113346d) {
                this.f113350h = dVar;
            }
        }
    }

    public static abstract class d {
        public abstract long a();
    }

    public e(@NonNull Context context, @NonNull j jVar) {
        super(new c(context, jVar, f113339k));
    }

    @NonNull
    @Deprecated
    public e l(@Nullable Handler handler) {
        if (handler == null) {
            return this;
        }
        m(new ExecutorC5418a(handler));
        return this;
    }

    @NonNull
    public e m(@NonNull Executor executor) {
        ((c) this.f113300a).g(executor);
        return this;
    }

    @NonNull
    public e n(@Nullable d dVar) {
        ((c) this.f113300a).h(dVar);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public e(@NonNull Context context, @NonNull j jVar, @NonNull b bVar) {
        super(new c(context, jVar, bVar));
    }
}
