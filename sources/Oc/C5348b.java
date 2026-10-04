package oc;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: oc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5348b implements io.reactivex.disposables.b, InterfaceC5347a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<io.reactivex.disposables.b> f225144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f225145b;

    public C5348b() {
    }

    @Override // oc.InterfaceC5347a
    public boolean a(io.reactivex.disposables.b bVar) {
        if (!b(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // oc.InterfaceC5347a
    public boolean b(io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
        if (this.f225145b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f225145b) {
                    return false;
                }
                List<io.reactivex.disposables.b> list = this.f225144a;
                if (list != null && list.remove(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // oc.InterfaceC5347a
    public boolean c(io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "d is null");
        if (!this.f225145b) {
            synchronized (this) {
                try {
                    if (!this.f225145b) {
                        List linkedList = this.f225144a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f225144a = linkedList;
                        }
                        linkedList.add(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.dispose();
        return false;
    }

    public boolean d(io.reactivex.disposables.b... bVarArr) {
        io.reactivex.internal.functions.a.g(bVarArr, "ds is null");
        if (!this.f225145b) {
            synchronized (this) {
                try {
                    if (!this.f225145b) {
                        List linkedList = this.f225144a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f225144a = linkedList;
                        }
                        for (io.reactivex.disposables.b bVar : bVarArr) {
                            io.reactivex.internal.functions.a.g(bVar, "d is null");
                            linkedList.add(bVar);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (io.reactivex.disposables.b bVar2 : bVarArr) {
            bVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (this.f225145b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f225145b) {
                    return;
                }
                this.f225145b = true;
                List<io.reactivex.disposables.b> list = this.f225144a;
                this.f225144a = null;
                f(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        if (this.f225145b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f225145b) {
                    return;
                }
                List<io.reactivex.disposables.b> list = this.f225144a;
                this.f225144a = null;
                f(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(List<io.reactivex.disposables.b> list) {
        if (list == null) {
            return;
        }
        Iterator<io.reactivex.disposables.b> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.e((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f225145b;
    }

    public C5348b(io.reactivex.disposables.b... bVarArr) {
        io.reactivex.internal.functions.a.g(bVarArr, "resources is null");
        this.f225144a = new LinkedList();
        for (io.reactivex.disposables.b bVar : bVarArr) {
            io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
            this.f225144a.add(bVar);
        }
    }

    public C5348b(Iterable<? extends io.reactivex.disposables.b> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "resources is null");
        this.f225144a = new LinkedList();
        for (io.reactivex.disposables.b bVar : iterable) {
            io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
            this.f225144a.add(bVar);
        }
    }
}
