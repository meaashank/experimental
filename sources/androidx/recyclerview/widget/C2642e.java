package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2642e implements t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f116604f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f116605g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f116606h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116607i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f116608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116609b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116610c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116611d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f116612e = null;

    public C2642e(@NonNull t tVar) {
        this.f116608a = tVar;
    }

    @Override // androidx.recyclerview.widget.t
    public void a(int i10, int i11, Object obj) {
        int i12;
        if (this.f116609b == 3) {
            int i13 = this.f116610c;
            int i14 = this.f116611d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f116612e == obj) {
                this.f116610c = Math.min(i10, i13);
                this.f116611d = Math.max(i14 + i13, i12) - this.f116610c;
                return;
            }
        }
        e();
        this.f116610c = i10;
        this.f116611d = i11;
        this.f116612e = obj;
        this.f116609b = 3;
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int i10, int i11) {
        int i12;
        if (this.f116609b == 1 && i10 >= (i12 = this.f116610c)) {
            int i13 = this.f116611d;
            if (i10 <= i12 + i13) {
                this.f116611d = i13 + i11;
                this.f116610c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f116610c = i10;
        this.f116611d = i11;
        this.f116609b = 1;
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int i10, int i11) {
        int i12;
        if (this.f116609b == 2 && (i12 = this.f116610c) >= i10 && i12 <= i10 + i11) {
            this.f116611d += i11;
            this.f116610c = i10;
        } else {
            e();
            this.f116610c = i10;
            this.f116611d = i11;
            this.f116609b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.t
    public void d(int i10, int i11) {
        e();
        this.f116608a.d(i10, i11);
    }

    public void e() {
        int i10 = this.f116609b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f116608a.b(this.f116610c, this.f116611d);
        } else if (i10 == 2) {
            this.f116608a.c(this.f116610c, this.f116611d);
        } else if (i10 == 3) {
            this.f116608a.a(this.f116610c, this.f116611d, this.f116612e);
        }
        this.f116612e = null;
        this.f116609b = 0;
    }
}
