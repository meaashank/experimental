package com.unity3d.services.core.domain;

import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    /* JADX INFO: renamed from: io, reason: collision with root package name */
    @NotNull
    private final CoroutineDispatcher f194503io = C5052b0.c();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private final CoroutineDispatcher f10default = C5052b0.f218828b;

    @NotNull
    private final CoroutineDispatcher main = C.f220271c;

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getDefault() {
        return this.f10default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getIo() {
        return this.f194503io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getMain() {
        return this.main;
    }
}
