package com.unity3d.services.core.di;

import ed.InterfaceC4376a;
import kotlin.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
final class Factory<T> implements G<T> {
    private final InterfaceC4376a<T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public Factory(@NotNull InterfaceC4376a<? extends T> initializer) {
        kotlin.jvm.internal.G.p(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // kotlin.G
    public T getValue() {
        return this.initializer.invoke();
    }

    @Override // kotlin.G
    public boolean isInitialized() {
        return false;
    }
}
