package androidx.recyclerview.widget;

import android.view.View;
import androidx.core.text.BidiFormatter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f116315c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116316d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f116317e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f116318f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f116319g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f116320h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116321i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116322j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f116323k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f116324l = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f116325m = 64;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f116326n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f116327o = 256;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f116328p = 512;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f116329q = 1024;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f116330r = 12;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f116331s = 4096;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f116332t = 8192;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f116333u = 16384;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f116334v = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f116335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f116336b = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116337a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f116341e;

        public void a(int i10) {
            this.f116337a = i10 | this.f116337a;
        }

        public boolean b() {
            int i10 = this.f116337a;
            if ((i10 & 7) != 0 && (i10 & c(this.f116340d, this.f116338b)) == 0) {
                return false;
            }
            int i11 = this.f116337a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f116340d, this.f116339c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f116337a;
            if ((i12 & BidiFormatter.a.f111332f) != 0 && (i12 & (c(this.f116341e, this.f116338b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f116337a;
            return (i13 & kotlin.uuid.f.f218490c) == 0 || (i13 & (c(this.f116341e, this.f116339c) << 12)) != 0;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f116337a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.f116338b = i10;
            this.f116339c = i11;
            this.f116340d = i12;
            this.f116341e = i13;
        }
    }

    public interface b {
        View a(int i10);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public J(b bVar) {
        this.f116335a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int iB = this.f116335a.b();
        int iC = this.f116335a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f116335a.a(i10);
            this.f116336b.e(iB, iC, this.f116335a.d(viewA), this.f116335a.e(viewA));
            if (i12 != 0) {
                this.f116336b.d();
                this.f116336b.a(i12);
                if (this.f116336b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f116336b.d();
                this.f116336b.a(i13);
                if (this.f116336b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.f116336b.e(this.f116335a.b(), this.f116335a.c(), this.f116335a.d(view), this.f116335a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f116336b.d();
        this.f116336b.a(i10);
        return this.f116336b.b();
    }
}
