package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import t1.C5596a;

/* JADX INFO: loaded from: classes2.dex */
public class k implements e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f139542k = "LruBitmapPool";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Bitmap.Config f139543l = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f139544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f139545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f139546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f139547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f139548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f139549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f139550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f139551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f139552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f139553j;

    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public static final class b implements a {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
        }
    }

    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Bitmap> f139554a = Collections.synchronizedSet(new HashSet());

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
            if (!this.f139554a.contains(bitmap)) {
                this.f139554a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
            if (!this.f139554a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f139554a.remove(bitmap);
        }
    }

    public k(long j10, l lVar, Set<Bitmap.Config> set) {
        this.f139546c = j10;
        this.f139548e = j10;
        this.f139544a = lVar;
        this.f139545b = set;
        this.f139547d = new b();
    }

    @TargetApi(26)
    public static void h(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    public static Bitmap i(int i10, int i11, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f139543l;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @TargetApi(26)
    public static Set<Bitmap.Config> o() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static l p() {
        return new n();
    }

    @TargetApi(19)
    public static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        bitmap.setPremultiplied(true);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable(f139542k, 3)) {
            C5596a.a("trimMemory, level=", i10, f139542k);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            v(e() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b() {
        if (Log.isLoggable(f139542k, 3)) {
            Log.d(f139542k, "clearMemory");
        }
        v(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void c(float f10) {
        this.f139548e = Math.round(this.f139546c * f10);
        l();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f139544a.b(bitmap) <= this.f139548e && this.f139545b.contains(bitmap.getConfig())) {
                int iB = this.f139544a.b(bitmap);
                this.f139544a.d(bitmap);
                this.f139547d.a(bitmap);
                this.f139552i++;
                this.f139549f += (long) iB;
                if (Log.isLoggable(f139542k, 2)) {
                    Log.v(f139542k, "Put bitmap in pool=" + this.f139544a.c(bitmap));
                }
                j();
                l();
                return;
            }
            if (Log.isLoggable(f139542k, 2)) {
                Log.v(f139542k, "Reject bitmap from pool, bitmap: " + this.f139544a.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f139545b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long e() {
        return this.f139548e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @NonNull
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapQ = q(i10, i11, config);
        if (bitmapQ == null) {
            return i(i10, i11, config);
        }
        bitmapQ.eraseColor(0);
        return bitmapQ;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @NonNull
    public Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapQ = q(i10, i11, config);
        return bitmapQ == null ? i(i10, i11, config) : bitmapQ;
    }

    public final void j() {
        if (Log.isLoggable(f139542k, 2)) {
            k();
        }
    }

    public final void k() {
        Log.v(f139542k, "Hits=" + this.f139550g + ", misses=" + this.f139551h + ", puts=" + this.f139552i + ", evictions=" + this.f139553j + ", currentSize=" + this.f139549f + ", maxSize=" + this.f139548e + "\nStrategy=" + this.f139544a);
    }

    public final void l() {
        v(this.f139548e);
    }

    public long m() {
        return this.f139553j;
    }

    public long n() {
        return this.f139549f;
    }

    @Nullable
    public final synchronized Bitmap q(int i10, int i11, @Nullable Bitmap.Config config) {
        Bitmap bitmapF;
        try {
            h(config);
            bitmapF = this.f139544a.f(i10, i11, config != null ? config : f139543l);
            if (bitmapF == null) {
                if (Log.isLoggable(f139542k, 3)) {
                    Log.d(f139542k, "Missing bitmap=" + this.f139544a.a(i10, i11, config));
                }
                this.f139551h++;
            } else {
                this.f139550g++;
                this.f139549f -= (long) this.f139544a.b(bitmapF);
                this.f139547d.b(bitmapF);
                bitmapF.setHasAlpha(true);
                bitmapF.setPremultiplied(true);
            }
            if (Log.isLoggable(f139542k, 2)) {
                Log.v(f139542k, "Get bitmap=" + this.f139544a.a(i10, i11, config));
            }
            j();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapF;
    }

    public long r() {
        return this.f139550g;
    }

    public long t() {
        return this.f139551h;
    }

    public final synchronized void v(long j10) {
        while (this.f139549f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f139544a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable(f139542k, 5)) {
                        Log.w(f139542k, "Size mismatch, resetting");
                        k();
                    }
                    this.f139549f = 0L;
                    return;
                }
                this.f139547d.b(bitmapRemoveLast);
                this.f139549f -= (long) this.f139544a.b(bitmapRemoveLast);
                this.f139553j++;
                if (Log.isLoggable(f139542k, 3)) {
                    Log.d(f139542k, "Evicting bitmap=" + this.f139544a.c(bitmapRemoveLast));
                }
                j();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k(long j10) {
        this(j10, new n(), o());
    }

    public k(long j10, Set<Bitmap.Config> set) {
        this(j10, new n(), set);
    }
}
