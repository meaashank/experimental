package com.unity3d.services.core.di;

import ed.InterfaceC4376a;
import kotlin.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ServiceFactoryKt {
    @NotNull
    public static final <T> G<T> factoryOf(@NotNull InterfaceC4376a<? extends T> initializer) {
        kotlin.jvm.internal.G.p(initializer, "initializer");
        return new Factory(initializer);
    }
}
