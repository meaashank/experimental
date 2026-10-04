package com.unity3d.services.core.di;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface IServiceProvider {
    @NotNull
    IServicesRegistry getRegistry();

    @NotNull
    IServicesRegistry initialize();
}
