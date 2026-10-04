package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.d;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<d> implements d {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int capacity) {
        super(capacity);
    }

    public d a(int index, d resource) {
        d dVar;
        do {
            dVar = get(index);
            if (dVar == DisposableHelper.DISPOSED) {
                resource.dispose();
                return null;
            }
        } while (!compareAndSet(index, dVar, resource));
        return dVar;
    }

    public boolean b(int index, d resource) {
        d dVar;
        do {
            dVar = get(index);
            if (dVar == DisposableHelper.DISPOSED) {
                resource.dispose();
                return false;
            }
        } while (!compareAndSet(index, dVar, resource));
        if (dVar == null) {
            return true;
        }
        dVar.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        d andSet;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                d dVar = get(i10);
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (dVar != disposableHelper && (andSet = getAndSet(i10, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }
}
