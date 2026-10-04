package io.reactivex.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.k;
import java.util.ArrayList;
import lc.e;
import oc.InterfaceC5347a;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b, InterfaceC5347a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k<b> f202938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f202939b;

    public a() {
    }

    @Override // oc.InterfaceC5347a
    public boolean a(@e b bVar) {
        if (!b(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // oc.InterfaceC5347a
    public boolean b(@e b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
        if (this.f202939b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f202939b) {
                    return false;
                }
                k<b> kVar = this.f202938a;
                if (kVar != null && kVar.e(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // oc.InterfaceC5347a
    public boolean c(@e b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "d is null");
        if (!this.f202939b) {
            synchronized (this) {
                try {
                    if (!this.f202939b) {
                        k<b> kVar = this.f202938a;
                        if (kVar == null) {
                            kVar = new k<>();
                            this.f202938a = kVar;
                        }
                        kVar.a(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.dispose();
        return false;
    }

    public boolean d(@e b... bVarArr) {
        io.reactivex.internal.functions.a.g(bVarArr, "ds is null");
        if (!this.f202939b) {
            synchronized (this) {
                try {
                    if (!this.f202939b) {
                        k<b> kVar = this.f202938a;
                        if (kVar == null) {
                            kVar = new k<>(bVarArr.length + 1);
                            this.f202938a = kVar;
                        }
                        for (b bVar : bVarArr) {
                            io.reactivex.internal.functions.a.g(bVar, "d is null");
                            kVar.a(bVar);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (b bVar2 : bVarArr) {
            bVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (this.f202939b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f202939b) {
                    return;
                }
                this.f202939b = true;
                k<b> kVar = this.f202938a;
                this.f202938a = null;
                f(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        if (this.f202939b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f202939b) {
                    return;
                }
                k<b> kVar = this.f202938a;
                this.f202938a = null;
                f(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(k<b> kVar) {
        if (kVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (b bVar : kVar.f207205e) {
            if (bVar instanceof b) {
                try {
                    bVar.dispose();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.e((Throwable) arrayList.get(0));
        }
    }

    public int g() {
        if (this.f202939b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f202939b) {
                    return 0;
                }
                k<b> kVar = this.f202938a;
                return kVar != null ? kVar.f207203c : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f202939b;
    }

    public a(@e b... bVarArr) {
        io.reactivex.internal.functions.a.g(bVarArr, "resources is null");
        this.f202938a = new k<>(bVarArr.length + 1);
        for (b bVar : bVarArr) {
            io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
            this.f202938a.a(bVar);
        }
    }

    public a(@e Iterable<? extends b> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "resources is null");
        this.f202938a = new k<>();
        for (b bVar : iterable) {
            io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
            this.f202938a.a(bVar);
        }
    }
}
