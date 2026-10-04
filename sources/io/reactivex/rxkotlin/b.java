package io.reactivex.rxkotlin;

import ed.InterfaceC4376a;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a f212220a;

    public b(InterfaceC4376a interfaceC4376a) {
        this.f212220a = interfaceC4376a;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f212220a.invoke();
    }
}
