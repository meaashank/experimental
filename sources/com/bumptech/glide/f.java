package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Queue;
import v3.p;
import w3.InterfaceC5744e;
import y3.o;

/* JADX INFO: loaded from: classes2.dex */
public class f<T> implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f137625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f137626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f137627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<T> f137628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b<T> f137629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f137630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f137631g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f137633i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f137632h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f137634j = true;

    public interface a<U> {
        @NonNull
        List<U> a(int i10);

        @Nullable
        j<?> b(@NonNull U u10);
    }

    public interface b<T> {
        @Nullable
        int[] a(@NonNull T t10, int i10, int i11);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<c> f137638a;

        public d(int i10) {
            this.f137638a = o.g(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f137638a.offer(new c());
            }
        }

        public c a(int i10, int i11) {
            c cVarPoll = this.f137638a.poll();
            this.f137638a.offer(cVarPoll);
            cVarPoll.f137636b = i10;
            cVarPoll.f137635a = i11;
            return cVarPoll;
        }
    }

    public f(@NonNull k kVar, @NonNull a<T> aVar, @NonNull b<T> bVar, int i10) {
        this.f137627c = kVar;
        this.f137628d = aVar;
        this.f137629e = bVar;
        this.f137625a = i10;
        this.f137626b = new d(i10 + 1);
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f137626b.f137638a.size(); i10++) {
            this.f137627c.y(this.f137626b.a(0, 0));
        }
    }

    public final void b(int i10, int i11) {
        int iMin;
        int iMax;
        if (i10 < i11) {
            iMax = Math.max(this.f137630f, i10);
            iMin = i11;
        } else {
            iMin = Math.min(this.f137631g, i10);
            iMax = i11;
        }
        int iMin2 = Math.min(this.f137633i, iMin);
        int iMin3 = Math.min(this.f137633i, Math.max(0, iMax));
        if (i10 < i11) {
            for (int i12 = iMin3; i12 < iMin2; i12++) {
                d(this.f137628d.a(i12), i12, true);
            }
        } else {
            for (int i13 = iMin2 - 1; i13 >= iMin3; i13--) {
                d(this.f137628d.a(i13), i13, false);
            }
        }
        this.f137631g = iMin3;
        this.f137630f = iMin2;
    }

    public final void c(int i10, boolean z10) {
        if (this.f137634j != z10) {
            this.f137634j = z10;
            a();
        }
        b(i10, (z10 ? this.f137625a : -this.f137625a) + i10);
    }

    public final void d(List<T> list, int i10, boolean z10) {
        int size = list.size();
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e(list.get(i11), i10, i11);
            }
            return;
        }
        for (int i12 = size - 1; i12 >= 0; i12--) {
            e(list.get(i12), i10, i12);
        }
    }

    public final void e(@Nullable T t10, int i10, int i11) {
        int[] iArrA;
        j<?> jVarB;
        if (t10 == null || (iArrA = this.f137629e.a(t10, i10, i11)) == null || (jVarB = this.f137628d.b(t10)) == null) {
            return;
        }
        jVarB.s1(this.f137626b.a(iArrA[0], iArrA[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        if (this.f137633i == 0 && i12 == 0) {
            return;
        }
        this.f137633i = i12;
        int i13 = this.f137632h;
        if (i10 > i13) {
            c(i11 + i10, true);
        } else if (i10 < i13) {
            c(i10, false);
        }
        this.f137632h = i10;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }

    public static final class c implements p<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f137636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public com.bumptech.glide.request.e f137637c;

        @Override // v3.p
        public void d(@Nullable Drawable drawable) {
        }

        @Override // v3.p
        @Nullable
        public com.bumptech.glide.request.e getRequest() {
            return this.f137637c;
        }

        @Override // v3.p
        public void h(@NonNull v3.o oVar) {
            oVar.d(this.f137636b, this.f137635a);
        }

        @Override // v3.p
        public void k(@Nullable Drawable drawable) {
        }

        @Override // v3.p
        public void m(@Nullable com.bumptech.glide.request.e eVar) {
            this.f137637c = eVar;
        }

        @Override // v3.p
        public void n(@Nullable Drawable drawable) {
        }

        @Override // s3.l
        public void onDestroy() {
        }

        @Override // s3.l
        public void onStart() {
        }

        @Override // s3.l
        public void onStop() {
        }

        @Override // v3.p
        public void f(@NonNull v3.o oVar) {
        }

        @Override // v3.p
        public void g(@NonNull Object obj, @Nullable InterfaceC5744e<? super Object> interfaceC5744e) {
        }
    }
}
