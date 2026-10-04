package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f114831f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f114832g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f114833h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f114837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f114838e;

    public class a implements w.b {
        public a() {
        }

        @Override // androidx.media.w.b
        public void a(int i10) {
            v.this.getClass();
        }

        @Override // androidx.media.w.b
        public void b(int i10) {
            v.this.getClass();
        }
    }

    public static abstract class b {
        public abstract void onVolumeChanged(v vVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    public v(int i10, int i11, int i12) {
        this.f114834a = i10;
        this.f114835b = i11;
        this.f114836c = i12;
    }

    public final int a() {
        return this.f114836c;
    }

    public final int b() {
        return this.f114835b;
    }

    public final int c() {
        return this.f114834a;
    }

    public Object d() {
        if (this.f114838e == null) {
            this.f114838e = new w.a(this.f114834a, this.f114835b, this.f114836c, new a());
        }
        return this.f114838e;
    }

    public void e(int i10) {
    }

    public void f(int i10) {
    }

    public void g(b bVar) {
        this.f114837d = bVar;
    }

    public final void h(int i10) {
        this.f114836c = i10;
        Object objD = d();
        if (objD != null) {
            w.b(objD, i10);
        }
        b bVar = this.f114837d;
        if (bVar != null) {
            bVar.onVolumeChanged(this);
        }
    }
}
