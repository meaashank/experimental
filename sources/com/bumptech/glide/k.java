package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import e.InterfaceC4346u;
import e.Q;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import q3.C5424c;
import s3.InterfaceC5571b;
import s3.q;
import s3.r;
import s3.u;
import v3.AbstractC5680f;
import v3.p;
import w3.InterfaceC5744e;
import y3.o;

/* JADX INFO: loaded from: classes2.dex */
public class k implements ComponentCallbacks2, s3.l, g<j<Drawable>> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.bumptech.glide.request.h f139359m = com.bumptech.glide.request.h.e1(Bitmap.class).p0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.bumptech.glide.request.h f139360n = com.bumptech.glide.request.h.e1(C5424c.class).p0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.bumptech.glide.request.h f139361o = com.bumptech.glide.request.h.f1(com.bumptech.glide.load.engine.h.f139671c).E0(Priority.LOW).N0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.c f139362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f139363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3.j f139364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC4326A("this")
    public final r f139365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC4326A("this")
    public final q f139366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC4326A("this")
    public final u f139367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f139368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC5571b f139369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList<com.bumptech.glide.request.g<Object>> f139370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InterfaceC4326A("this")
    public com.bumptech.glide.request.h f139371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f139372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f139373l;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f139364c.a(kVar);
        }
    }

    public class c implements InterfaceC5571b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @InterfaceC4326A("RequestManager.this")
        public final r f139375a;

        public c(@NonNull r rVar) {
            this.f139375a = rVar;
        }

        @Override // s3.InterfaceC5571b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f139375a.g();
                }
            }
        }
    }

    public k(@NonNull com.bumptech.glide.c cVar, @NonNull s3.j jVar, @NonNull q qVar, @NonNull Context context) {
        this(cVar, jVar, qVar, new r(), cVar.i(), context);
    }

    public final synchronized void A() {
        try {
            ArrayList arrayList = (ArrayList) o.l(this.f139367f.f238542a);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                y((p) obj);
            }
            this.f139367f.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @NonNull
    @CheckResult
    public j<File> B(@Nullable Object obj) {
        return C().e(obj);
    }

    @NonNull
    @CheckResult
    public j<File> C() {
        return s(File.class).d(f139361o);
    }

    public List<com.bumptech.glide.request.g<Object>> D() {
        return this.f139370i;
    }

    public synchronized com.bumptech.glide.request.h E() {
        return this.f139371j;
    }

    @NonNull
    public <T> l<?, T> F(Class<T> cls) {
        return this.f139362a.k().e(cls);
    }

    public synchronized boolean G() {
        return this.f139365d.d();
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public j<Drawable> l(@Nullable Bitmap bitmap) {
        return u().l(bitmap);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public j<Drawable> c(@Nullable Drawable drawable) {
        return u().c(drawable);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public j<Drawable> i(@Nullable Uri uri) {
        return u().i(uri);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public j<Drawable> b(@Nullable File file) {
        return u().b(file);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public j<Drawable> p(@Nullable @Q @InterfaceC4346u Integer num) {
        return u().p(num);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public j<Drawable> e(@Nullable Object obj) {
        return u().e(obj);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public j<Drawable> q(@Nullable String str) {
        return u().q(str);
    }

    @Override // com.bumptech.glide.g
    @CheckResult
    @Deprecated
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public j<Drawable> a(@Nullable URL url) {
        return u().a(url);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public j<Drawable> j(@Nullable byte[] bArr) {
        return u().j(bArr);
    }

    public synchronized void Q() {
        this.f139365d.e();
    }

    public synchronized void R() {
        Q();
        Iterator<k> it = this.f139366e.a().iterator();
        while (it.hasNext()) {
            it.next().Q();
        }
    }

    public synchronized void S() {
        this.f139365d.f();
    }

    public synchronized void T() {
        S();
        Iterator<k> it = this.f139366e.a().iterator();
        while (it.hasNext()) {
            it.next().S();
        }
    }

    public synchronized void U() {
        this.f139365d.h();
    }

    public synchronized void V() {
        o.b();
        U();
        Iterator<k> it = this.f139366e.a().iterator();
        while (it.hasNext()) {
            it.next().U();
        }
    }

    @NonNull
    public synchronized k W(@NonNull com.bumptech.glide.request.h hVar) {
        Y(hVar);
        return this;
    }

    public void X(boolean z10) {
        this.f139372k = z10;
    }

    public synchronized void Y(@NonNull com.bumptech.glide.request.h hVar) {
        this.f139371j = hVar.clone().f();
    }

    public synchronized void Z(@NonNull p<?> pVar, @NonNull com.bumptech.glide.request.e eVar) {
        this.f139367f.c(pVar);
        this.f139365d.i(eVar);
    }

    public synchronized boolean a0(@NonNull p<?> pVar) {
        com.bumptech.glide.request.e request = pVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f139365d.b(request)) {
            return false;
        }
        this.f139367f.e(pVar);
        pVar.m(null);
        return true;
    }

    public final void b0(@NonNull p<?> pVar) {
        boolean zA0 = a0(pVar);
        com.bumptech.glide.request.e request = pVar.getRequest();
        if (zA0 || this.f139362a.x(pVar) || request == null) {
            return;
        }
        pVar.m(null);
        request.clear();
    }

    public final synchronized void c0(@NonNull com.bumptech.glide.request.h hVar) {
        this.f139371j = this.f139371j.d(hVar);
    }

    public k o(com.bumptech.glide.request.g<Object> gVar) {
        this.f139370i.add(gVar);
        return this;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // s3.l
    public synchronized void onDestroy() {
        this.f139367f.onDestroy();
        A();
        this.f139365d.c();
        this.f139364c.b(this);
        this.f139364c.b(this.f139369h);
        o.z(this.f139368g);
        this.f139362a.C(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // s3.l
    public synchronized void onStart() {
        U();
        this.f139367f.onStart();
    }

    @Override // s3.l
    public synchronized void onStop() {
        try {
            this.f139367f.onStop();
            if (this.f139373l) {
                A();
            } else {
                S();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f139372k) {
            R();
        }
    }

    @NonNull
    public synchronized k r(@NonNull com.bumptech.glide.request.h hVar) {
        c0(hVar);
        return this;
    }

    @NonNull
    @CheckResult
    public <ResourceType> j<ResourceType> s(@NonNull Class<ResourceType> cls) {
        return new j<>(this.f139362a, this, cls, this.f139363b);
    }

    @NonNull
    @CheckResult
    public j<Bitmap> t() {
        return s(Bitmap.class).d(f139359m);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f139365d + ", treeNode=" + this.f139366e + "}";
    }

    @NonNull
    @CheckResult
    public j<Drawable> u() {
        return s(Drawable.class);
    }

    @NonNull
    @CheckResult
    public j<File> v() {
        return s(File.class).d(com.bumptech.glide.request.h.y1(true));
    }

    @NonNull
    @CheckResult
    public j<C5424c> w() {
        return s(C5424c.class).d(f139360n);
    }

    public void x(@NonNull View view) {
        y(new b(view));
    }

    public void y(@Nullable p<?> pVar) {
        if (pVar == null) {
            return;
        }
        b0(pVar);
    }

    @NonNull
    public synchronized k z() {
        this.f139373l = true;
        return this;
    }

    public k(com.bumptech.glide.c cVar, s3.j jVar, q qVar, r rVar, s3.c cVar2, Context context) {
        this.f139367f = new u();
        a aVar = new a();
        this.f139368g = aVar;
        this.f139362a = cVar;
        this.f139364c = jVar;
        this.f139366e = qVar;
        this.f139365d = rVar;
        this.f139363b = context;
        InterfaceC5571b interfaceC5571bA = cVar2.a(context.getApplicationContext(), new c(rVar));
        this.f139369h = interfaceC5571bA;
        cVar.w(this);
        if (o.u()) {
            o.y(aVar);
        } else {
            jVar.a(this);
        }
        jVar.a(interfaceC5571bA);
        this.f139370i = new CopyOnWriteArrayList<>(cVar.k().c());
        Y(cVar.k().d());
    }

    public static class b extends AbstractC5680f<View, Object> {
        public b(@NonNull View view) {
            super(view);
        }

        @Override // v3.AbstractC5680f
        public void j(@Nullable Drawable drawable) {
        }

        @Override // v3.p
        public void n(@Nullable Drawable drawable) {
        }

        @Override // v3.p
        public void g(@NonNull Object obj, @Nullable InterfaceC5744e<? super Object> interfaceC5744e) {
        }
    }
}
