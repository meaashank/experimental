package io.reactivex.rxkotlin;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    @NotNull
    public static final io.reactivex.disposables.b a(@NotNull io.reactivex.disposables.b receiver, @NotNull io.reactivex.disposables.a compositeDisposable) {
        G.q(receiver, "$receiver");
        G.q(compositeDisposable, "compositeDisposable");
        compositeDisposable.c(receiver);
        return receiver;
    }

    public static final void b(@NotNull io.reactivex.disposables.a receiver, @NotNull io.reactivex.disposables.b disposable) {
        G.q(receiver, "$receiver");
        G.q(disposable, "disposable");
        receiver.c(disposable);
    }
}
