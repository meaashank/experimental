package com.bytedance.adsdk.NOt;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class sAl<T> {
    public static Executor ZRu = Executors.newCachedThreadPool();
    private final Set<ZH<T>> NOt;
    private volatile lp<T> TFq;
    private final Set<ZH<Throwable>> mZ;
    private final Handler uR;

    public class ZRu extends FutureTask<lp<T>> {
        public ZRu(Callable<lp<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                sAl.this.ZRu((lp) get());
            } catch (InterruptedException | ExecutionException e10) {
                sAl.this.ZRu(new lp(e10));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public sAl(Callable<lp<T>> callable) {
        this(callable, false);
    }

    public synchronized sAl<T> NOt(ZH<T> zh) {
        this.NOt.remove(zh);
        return this;
    }

    public synchronized sAl<T> mZ(ZH<Throwable> zh) {
        try {
            lp<T> lpVar = this.TFq;
            if (lpVar != null && lpVar.NOt() != null) {
                zh.ZRu(lpVar.NOt());
            }
            this.mZ.add(zh);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized sAl<T> uR(ZH<Throwable> zh) {
        this.mZ.remove(zh);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public sAl(Callable<lp<T>> callable, boolean z10) {
        this.NOt = new LinkedHashSet(1);
        this.mZ = new LinkedHashSet(1);
        this.uR = new Handler(Looper.getMainLooper());
        this.TFq = null;
        if (!z10) {
            ZRu.execute(new ZRu(callable));
            return;
        }
        try {
            ZRu((lp) callable.call());
        } catch (Throwable th) {
            ZRu((lp) new lp<>(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(lp<T> lpVar) {
        if (this.TFq == null) {
            this.TFq = lpVar;
            ZRu();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized sAl<T> ZRu(ZH<T> zh) {
        try {
            lp<T> lpVar = this.TFq;
            if (lpVar != null && lpVar.ZRu() != null) {
                zh.ZRu(lpVar.ZRu());
            }
            this.NOt.add(zh);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void ZRu() {
        this.uR.post(new Runnable() { // from class: com.bytedance.adsdk.NOt.sAl.1
            @Override // java.lang.Runnable
            public void run() {
                lp lpVar = sAl.this.TFq;
                if (lpVar == null) {
                    return;
                }
                if (lpVar.ZRu() != null) {
                    sAl.this.ZRu(lpVar.ZRu());
                } else {
                    sAl.this.ZRu(lpVar.NOt());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ZRu(T t10) {
        ArrayList arrayList = new ArrayList(this.NOt);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ZH) obj).ZRu(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ZRu(Throwable th) {
        ArrayList arrayList = new ArrayList(this.mZ);
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ZH) obj).ZRu(th);
        }
    }
}
