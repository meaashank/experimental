package com.unity3d.services.core.di;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface IServiceComponent {

    public static final class DefaultImpls {
        @NotNull
        public static IServiceProvider getServiceProvider(@NotNull IServiceComponent iServiceComponent) {
            return ServiceProvider.INSTANCE;
        }
    }

    @NotNull
    IServiceProvider getServiceProvider();
}
