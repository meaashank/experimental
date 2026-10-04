package io.reactivex.rxjava3.disposables;

import U6.j;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes7.dex */
final class ActionDisposable extends ReferenceDisposable<Bc.a> {
    private static final long serialVersionUID = -8219729196779211169L;

    public ActionDisposable(Bc.a value) {
        super(value);
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@yc.e Bc.a value) {
        try {
            value.run();
        } catch (Throwable th) {
            throw ExceptionHelper.i(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + j.f68738d + get() + ")";
    }
}
