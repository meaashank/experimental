package io.reactivex.disposables;

import io.reactivex.internal.util.ExceptionHelper;
import lc.e;
import nc.InterfaceC5265a;

/* JADX INFO: loaded from: classes7.dex */
final class ActionDisposable extends ReferenceDisposable<InterfaceC5265a> {
    private static final long serialVersionUID = -8219729196779211169L;

    public ActionDisposable(InterfaceC5265a interfaceC5265a) {
        super(interfaceC5265a);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@e InterfaceC5265a interfaceC5265a) {
        try {
            interfaceC5265a.run();
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }
}
