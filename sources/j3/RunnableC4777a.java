package j3;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.load.resource.bitmap.C3096h;
import e.f0;
import g3.InterfaceC4444b;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import y3.o;

/* JADX INFO: renamed from: j3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4777a implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @f0
    public static final String f212514i = "PreFillRunner";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f212516k = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f212517l = 40;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f212518m = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f212520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f212521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4778b f212522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0805a f212523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<PreFillType> f212524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f212525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f212526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f212527h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0805a f212515j = new C0805a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f212519n = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: j3.a$a, reason: collision with other inner class name */
    @f0
    public static class C0805a {
        public long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* JADX INFO: renamed from: j3.a$b */
    public static final class b implements InterfaceC4444b {
        @Override // g3.InterfaceC4444b
        public void b(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public RunnableC4777a(e eVar, j jVar, C4778b c4778b) {
        this(eVar, jVar, c4778b, f212515j, new Handler(Looper.getMainLooper()));
    }

    @f0
    public boolean a() {
        Bitmap bitmapCreateBitmap;
        long jA = this.f212523d.a();
        while (!this.f212522c.b() && !e(jA)) {
            PreFillType preFillTypeC = this.f212522c.c();
            if (this.f212524e.contains(preFillTypeC)) {
                bitmapCreateBitmap = Bitmap.createBitmap(preFillTypeC.f139754a, preFillTypeC.f139755b, preFillTypeC.f139756c);
            } else {
                this.f212524e.add(preFillTypeC);
                bitmapCreateBitmap = this.f212520a.g(preFillTypeC.f139754a, preFillTypeC.f139755b, preFillTypeC.f139756c);
            }
            int i10 = o.i(bitmapCreateBitmap);
            if (c() >= i10) {
                this.f212521b.f(new b(), C3096h.d(bitmapCreateBitmap, this.f212520a));
            } else {
                this.f212520a.d(bitmapCreateBitmap);
            }
            if (Log.isLoggable(f212514i, 3)) {
                Log.d(f212514i, "allocated [" + preFillTypeC.f139754a + "x" + preFillTypeC.f139755b + "] " + preFillTypeC.f139756c + " size: " + i10);
            }
        }
        return (this.f212527h || this.f212522c.b()) ? false : true;
    }

    public void b() {
        this.f212527h = true;
    }

    public final long c() {
        return this.f212521b.e() - this.f212521b.d();
    }

    public final long d() {
        long j10 = this.f212526g;
        this.f212526g = Math.min(4 * j10, f212519n);
        return j10;
    }

    public final boolean e(long j10) {
        return this.f212523d.a() - j10 >= 32;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f212525f.postDelayed(this, d());
        }
    }

    @f0
    public RunnableC4777a(e eVar, j jVar, C4778b c4778b, C0805a c0805a, Handler handler) {
        this.f212524e = new HashSet();
        this.f212526g = 40L;
        this.f212520a = eVar;
        this.f212521b = jVar;
        this.f212522c = c4778b;
        this.f212523d = c0805a;
        this.f212525f = handler;
    }
}
