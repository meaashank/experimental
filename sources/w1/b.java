package W1;

import W1.a;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.W0;
import androidx.compose.runtime.changelist.j;
import androidx.core.util.C2430g;
import androidx.lifecycle.B;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.loader.content.c;
import com.bumptech.glide.load.engine.GlideException;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import e.I;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import kotlin.reflect.d;

/* JADX INFO: loaded from: classes2.dex */
public class b extends W1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76510c = "LoaderManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f76511d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final B f76512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final c f76513b;

    public static class a<D> extends P<D> implements c.InterfaceC0304c<D> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f76514m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final Bundle f76515n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NonNull
        public final androidx.loader.content.c<D> f76516o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public B f76517p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public C0130b<D> f76518q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public androidx.loader.content.c<D> f76519r;

        public a(int i10, @Nullable Bundle bundle, @NonNull androidx.loader.content.c<D> cVar, @Nullable androidx.loader.content.c<D> cVar2) {
            this.f76514m = i10;
            this.f76515n = bundle;
            this.f76516o = cVar;
            this.f76519r = cVar2;
            cVar.registerListener(i10, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0304c
        public void a(@NonNull androidx.loader.content.c<D> cVar, @Nullable D d10) {
            if (b.f76511d) {
                Log.v(b.f76510c, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r(d10);
                return;
            }
            if (b.f76511d) {
                Log.w(b.f76510c, "onLoadComplete was incorrectly called on a background thread");
            }
            o(d10);
        }

        @Override // androidx.lifecycle.K
        public void m() {
            if (b.f76511d) {
                Log.v(b.f76510c, "  Starting: " + this);
            }
            this.f76516o.startLoading();
        }

        @Override // androidx.lifecycle.K
        public void n() {
            if (b.f76511d) {
                Log.v(b.f76510c, "  Stopping: " + this);
            }
            this.f76516o.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.K
        public void p(@NonNull Q<? super D> q10) {
            super.p(q10);
            this.f76517p = null;
            this.f76518q = null;
        }

        @Override // androidx.lifecycle.P, androidx.lifecycle.K
        public void r(D d10) {
            super.r(d10);
            androidx.loader.content.c<D> cVar = this.f76519r;
            if (cVar != null) {
                cVar.reset();
                this.f76519r = null;
            }
        }

        @I
        public androidx.loader.content.c<D> s(boolean z10) {
            if (b.f76511d) {
                Log.v(b.f76510c, "  Destroying: " + this);
            }
            this.f76516o.cancelLoad();
            this.f76516o.abandon();
            C0130b<D> c0130b = this.f76518q;
            if (c0130b != null) {
                p(c0130b);
                if (z10) {
                    c0130b.d();
                }
            }
            this.f76516o.unregisterListener(this);
            if ((c0130b == null || c0130b.c()) && !z10) {
                return this.f76516o;
            }
            this.f76516o.reset();
            return this.f76519r;
        }

        public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f76514m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f76515n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f76516o);
            this.f76516o.dump(j.a(str, GlideException.a.f139488d), fileDescriptor, printWriter, strArr);
            if (this.f76518q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f76518q);
                this.f76518q.b(str + GlideException.a.f139488d, printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(u().dataToString(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f76514m);
            sb2.append(" : ");
            C2430g.a(this.f76516o, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        @NonNull
        public androidx.loader.content.c<D> u() {
            return this.f76516o;
        }

        public boolean v() {
            C0130b<D> c0130b;
            return (!h() || (c0130b = this.f76518q) == null || c0130b.c()) ? false : true;
        }

        public void w() {
            B b10 = this.f76517p;
            C0130b<D> c0130b = this.f76518q;
            if (b10 == null || c0130b == null) {
                return;
            }
            super.p(c0130b);
            k(b10, c0130b);
        }

        @NonNull
        @I
        public androidx.loader.content.c<D> x(@NonNull B b10, @NonNull a.InterfaceC0129a<D> interfaceC0129a) {
            C0130b<D> c0130b = new C0130b<>(this.f76516o, interfaceC0129a);
            k(b10, c0130b);
            C0130b<D> c0130b2 = this.f76518q;
            if (c0130b2 != null) {
                p(c0130b2);
            }
            this.f76517p = b10;
            this.f76518q = c0130b;
            return this.f76516o;
        }
    }

    /* JADX INFO: renamed from: W1.b$b, reason: collision with other inner class name */
    public static class C0130b<D> implements Q<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final androidx.loader.content.c<D> f76520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final a.InterfaceC0129a<D> f76521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f76522c = false;

        public C0130b(@NonNull androidx.loader.content.c<D> cVar, @NonNull a.InterfaceC0129a<D> interfaceC0129a) {
            this.f76520a = cVar;
            this.f76521b = interfaceC0129a;
        }

        @Override // androidx.lifecycle.Q
        public void a(@Nullable D d10) {
            if (b.f76511d) {
                Log.v(b.f76510c, "  onLoadFinished in " + this.f76520a + ": " + this.f76520a.dataToString(d10));
            }
            this.f76521b.onLoadFinished(this.f76520a, d10);
            this.f76522c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f76522c);
        }

        public boolean c() {
            return this.f76522c;
        }

        @I
        public void d() {
            if (this.f76522c) {
                if (b.f76511d) {
                    Log.v(b.f76510c, "  Resetting: " + this.f76520a);
                }
                this.f76521b.onLoaderReset(this.f76520a);
            }
        }

        public String toString() {
            return this.f76521b.toString();
        }
    }

    public static class c extends k0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m0.c f76523d = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public W0<a> f76524b = new W0<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f76525c = false;

        public static class a implements m0.c {
            @Override // androidx.lifecycle.m0.c
            public /* synthetic */ k0 a(Class cls, R1.a aVar) {
                return n0.b(this, cls, aVar);
            }

            @Override // androidx.lifecycle.m0.c
            @NonNull
            public <T extends k0> T b(@NonNull Class<T> cls) {
                return new c();
            }

            @Override // androidx.lifecycle.m0.c
            public /* synthetic */ k0 c(d dVar, R1.a aVar) {
                return n0.c(this, dVar, aVar);
            }
        }

        @NonNull
        public static c j(p0 p0Var) {
            return (c) new m0(p0Var, f76523d).c(c.class);
        }

        @Override // androidx.lifecycle.k0
        public void g() {
            int iY = this.f76524b.y();
            for (int i10 = 0; i10 < iY; i10++) {
                this.f76524b.z(i10).s(true);
            }
            this.f76524b.b();
        }

        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f76524b.y() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + TextProcessor.f150538k0;
                for (int i10 = 0; i10 < this.f76524b.y(); i10++) {
                    a aVarZ = this.f76524b.z(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f76524b.m(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarZ.toString());
                    aVarZ.t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void i() {
            this.f76525c = false;
        }

        public <D> a<D> k(int i10) {
            return this.f76524b.g(i10);
        }

        public boolean l() {
            int iY = this.f76524b.y();
            for (int i10 = 0; i10 < iY; i10++) {
                if (this.f76524b.z(i10).v()) {
                    return true;
                }
            }
            return false;
        }

        public boolean m() {
            return this.f76525c;
        }

        public void n() {
            int iY = this.f76524b.y();
            for (int i10 = 0; i10 < iY; i10++) {
                this.f76524b.z(i10).w();
            }
        }

        public void o(int i10, @NonNull a aVar) {
            this.f76524b.n(i10, aVar);
        }

        public void p(int i10) {
            this.f76524b.r(i10);
        }

        public void q() {
            this.f76525c = true;
        }
    }

    public b(@NonNull B b10, @NonNull p0 p0Var) {
        this.f76512a = b10;
        this.f76513b = c.j(p0Var);
    }

    @Override // W1.a
    @I
    public void a(int i10) {
        if (this.f76513b.m()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f76511d) {
            Log.v(f76510c, "destroyLoader in " + this + " of " + i10);
        }
        a aVarK = this.f76513b.k(i10);
        if (aVarK != null) {
            aVarK.s(true);
            this.f76513b.p(i10);
        }
    }

    @Override // W1.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f76513b.h(str, fileDescriptor, printWriter, strArr);
    }

    @Override // W1.a
    @Nullable
    public <D> androidx.loader.content.c<D> e(int i10) {
        if (this.f76513b.m()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> aVarK = this.f76513b.k(i10);
        if (aVarK != null) {
            return aVarK.u();
        }
        return null;
    }

    @Override // W1.a
    public boolean f() {
        return this.f76513b.l();
    }

    @Override // W1.a
    @NonNull
    @I
    public <D> androidx.loader.content.c<D> g(int i10, @Nullable Bundle bundle, @NonNull a.InterfaceC0129a<D> interfaceC0129a) {
        if (this.f76513b.m()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarK = this.f76513b.k(i10);
        if (f76511d) {
            Log.v(f76510c, "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarK == null) {
            return j(i10, bundle, interfaceC0129a, null);
        }
        if (f76511d) {
            Log.v(f76510c, "  Re-using existing loader " + aVarK);
        }
        return aVarK.x(this.f76512a, interfaceC0129a);
    }

    @Override // W1.a
    public void h() {
        this.f76513b.n();
    }

    @Override // W1.a
    @NonNull
    @I
    public <D> androidx.loader.content.c<D> i(int i10, @Nullable Bundle bundle, @NonNull a.InterfaceC0129a<D> interfaceC0129a) {
        if (this.f76513b.m()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f76511d) {
            Log.v(f76510c, "restartLoader in " + this + ": args=" + bundle);
        }
        a<D> aVarK = this.f76513b.k(i10);
        return j(i10, bundle, interfaceC0129a, aVarK != null ? aVarK.s(false) : null);
    }

    @NonNull
    @I
    public final <D> androidx.loader.content.c<D> j(int i10, @Nullable Bundle bundle, @NonNull a.InterfaceC0129a<D> interfaceC0129a, @Nullable androidx.loader.content.c<D> cVar) {
        try {
            this.f76513b.q();
            androidx.loader.content.c<D> cVarOnCreateLoader = interfaceC0129a.onCreateLoader(i10, bundle);
            if (cVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(cVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarOnCreateLoader);
            }
            a aVar = new a(i10, bundle, cVarOnCreateLoader, cVar);
            if (f76511d) {
                Log.v(f76510c, "  Created new loader " + aVar);
            }
            this.f76513b.o(i10, aVar);
            this.f76513b.i();
            return aVar.x(this.f76512a, interfaceC0129a);
        } catch (Throwable th) {
            this.f76513b.i();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C2430g.a(this.f76512a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
