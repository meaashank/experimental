package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class q {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F a(@NotNull Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F b(@NotNull p<F, S> pVar) {
        return pVar.f111414a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S c(@NotNull Pair<F, S> pair) {
        return (S) pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S d(@NotNull p<F, S> pVar) {
        return pVar.f111415b;
    }

    @NotNull
    public static final <F, S> Pair<F, S> e(@NotNull kotlin.Pair<? extends F, ? extends S> pair) {
        return new Pair<>(pair.f217467a, pair.f217468b);
    }

    @NotNull
    public static final <F, S> p<F, S> f(@NotNull kotlin.Pair<? extends F, ? extends S> pair) {
        return new p<>(pair.f217467a, pair.f217468b);
    }

    @NotNull
    public static final <F, S> kotlin.Pair<F, S> g(@NotNull Pair<F, S> pair) {
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    @NotNull
    public static final <F, S> kotlin.Pair<F, S> h(@NotNull p<F, S> pVar) {
        return new kotlin.Pair<>(pVar.f111414a, pVar.f111415b);
    }
}
