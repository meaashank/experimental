package j5;

import android.app.Activity;
import android.app.Dialog;
import androidx.annotation.Nullable;
import androidx.collection.N0;
import e.e0;
import j5.g;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Activity f214084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Dialog f214085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue<e> f214086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f214087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public g f214088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f214089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f214090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f214091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g.m f214092i = new a();

    public class a extends g.m {
        public a() {
        }

        @Override // j5.g.m
        public void a(g gVar) {
            if (f.this.f214090g) {
                b(gVar);
            }
        }

        @Override // j5.g.m
        public void b(g gVar) {
            gVar.j(false);
            f fVar = f.this;
            if (fVar.f214091h) {
                b bVar = fVar.f214089f;
                if (bVar != null) {
                    bVar.a(gVar.f214149q, false);
                }
                f.this.e();
                return;
            }
            b bVar2 = fVar.f214089f;
            if (bVar2 != null) {
                bVar2.c(gVar.f214149q);
            }
        }

        @Override // j5.g.m
        public void c(g gVar) {
            gVar.j(true);
            b bVar = f.this.f214089f;
            if (bVar != null) {
                bVar.a(gVar.f214149q, true);
            }
            f.this.e();
        }
    }

    public interface b {
        void a(e eVar, boolean z10);

        void b();

        void c(e eVar);
    }

    public f(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity is null");
        }
        this.f214084a = activity;
        this.f214085b = null;
        this.f214086c = new LinkedList();
    }

    @e0
    public boolean a() {
        g gVar;
        if (!this.f214087d || (gVar = this.f214088e) == null || !gVar.f214100G) {
            return false;
        }
        gVar.j(false);
        this.f214087d = false;
        this.f214086c.clear();
        b bVar = this.f214089f;
        if (bVar == null) {
            return true;
        }
        bVar.c(this.f214088e.f214149q);
        return true;
    }

    public f b(boolean z10) {
        this.f214090g = z10;
        return this;
    }

    public f c(boolean z10) {
        this.f214091h = z10;
        return this;
    }

    public f d(b bVar) {
        this.f214089f = bVar;
        return this;
    }

    public void e() {
        try {
            e eVarRemove = this.f214086c.remove();
            Activity activity = this.f214084a;
            if (activity != null) {
                this.f214088e = g.C(activity, eVarRemove, this.f214092i);
            } else {
                this.f214088e = g.E(this.f214085b, eVarRemove, this.f214092i);
            }
        } catch (NoSuchElementException unused) {
            this.f214088e = null;
            b bVar = this.f214089f;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    @e0
    public void f() {
        if (this.f214086c.isEmpty() || this.f214087d) {
            return;
        }
        this.f214087d = true;
        e();
    }

    public void g(int i10) {
        if (this.f214087d) {
            return;
        }
        if (i10 < 0 || i10 >= this.f214086c.size()) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Given invalid index ", i10));
        }
        int size = this.f214086c.size() - i10;
        while (this.f214086c.peek() != null && this.f214086c.size() != size) {
            this.f214086c.poll();
        }
        if (this.f214086c.size() != size) {
            throw new IllegalStateException(N0.a("Given index ", i10, " not in sequence"));
        }
        f();
    }

    public void h(int i10) {
        if (this.f214087d) {
            return;
        }
        while (this.f214086c.peek() != null && this.f214086c.peek().I() != i10) {
            this.f214086c.poll();
        }
        e eVarPeek = this.f214086c.peek();
        if (eVarPeek == null || eVarPeek.I() != i10) {
            throw new IllegalStateException(N0.a("Given target ", i10, " not in sequence"));
        }
        f();
    }

    public f i(e eVar) {
        this.f214086c.add(eVar);
        return this;
    }

    public f j(List<e> list) {
        this.f214086c.addAll(list);
        return this;
    }

    public f k(e... eVarArr) {
        Collections.addAll(this.f214086c, eVarArr);
        return this;
    }

    public f(Dialog dialog) {
        if (dialog != null) {
            this.f214085b = dialog;
            this.f214084a = null;
            this.f214086c = new LinkedList();
            return;
        }
        throw new IllegalArgumentException("Given null Dialog");
    }
}
