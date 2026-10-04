package com.unity3d.services.core.domain;

import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface ISDKDispatchers {
    @NotNull
    CoroutineDispatcher getDefault();

    @NotNull
    CoroutineDispatcher getIo();

    @NotNull
    CoroutineDispatcher getMain();
}
