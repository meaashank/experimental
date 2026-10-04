package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.inmobi.media.C3510d4;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: com.inmobi.media.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3510d4 implements InterfaceC3496c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Movie f152810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f152812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f152813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC3482b4 f152814e;

    public C3510d4(String filePath) {
        kotlin.jvm.internal.G.p(filePath, "filePath");
        File file = new File(filePath);
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int i10 = fileInputStream.read(bArr);
            C3473a9.a((Closeable) fileInputStream);
            Movie movieDecodeByteArray = Movie.decodeByteArray(bArr, 0, i10);
            this.f152810a = movieDecodeByteArray;
            if (movieDecodeByteArray == null) {
                throw new IllegalStateException("Cannot decode gif byte array");
            }
        } catch (Throwable th) {
            C3473a9.a((Closeable) fileInputStream);
            throw th;
        }
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void a(boolean z10) {
        this.f152813d = z10;
        if (!this.f152813d) {
            this.f152812c = SystemClock.uptimeMillis() - ((long) this.f152811b);
        }
        InterfaceC3482b4 interfaceC3482b4 = this.f152814e;
        if (interfaceC3482b4 != null) {
            ((C3524e4) interfaceC3482b4).invalidate();
        }
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void b() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f152812c == 0) {
            this.f152812c = jUptimeMillis;
        }
        Movie movie = this.f152810a;
        int iDuration = movie != null ? movie.duration() : 0;
        if (iDuration == 0) {
            iDuration = 1000;
        }
        int i10 = (int) ((jUptimeMillis - this.f152812c) % ((long) iDuration));
        this.f152811b = i10;
        Movie movie2 = this.f152810a;
        if (movie2 != null) {
            movie2.setTime(i10);
        }
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final boolean c() {
        return !this.f152813d;
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final int d() {
        Movie movie = this.f152810a;
        if (movie != null) {
            return movie.width();
        }
        return 0;
    }

    public final void e() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: F5.Z0
            @Override // java.lang.Runnable
            public final void run() {
                C3510d4.a(this.f34429a);
            }
        });
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void start() {
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final int a() {
        Movie movie = this.f152810a;
        if (movie != null) {
            return movie.height();
        }
        return 0;
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void a(Canvas canvas, float f10, float f11) {
        Movie movie = this.f152810a;
        if (movie != null) {
            movie.draw(canvas, f10, f11);
        }
        Movie movie2 = this.f152810a;
        if (this.f152811b + 20 >= (movie2 != null ? movie2.duration() : 0)) {
            e();
        }
    }

    public static final void a(C3510d4 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f152811b = 0;
        this$0.a(false);
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void a(InterfaceC3482b4 interfaceC3482b4) {
        this.f152814e = interfaceC3482b4;
    }
}
