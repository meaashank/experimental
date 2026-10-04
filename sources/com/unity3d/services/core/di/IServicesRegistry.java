package com.unity3d.services.core.di;

import java.util.Map;
import kotlin.G;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface IServicesRegistry {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i10 & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, dVar);
        }
    }

    <T> T getService(@NotNull String str, @NotNull d<?> dVar);

    @NotNull
    Map<ServiceKey, G<?>> getServices();

    <T> T resolveService(@NotNull ServiceKey serviceKey);

    @Nullable
    <T> T resolveServiceOrNull(@NotNull ServiceKey serviceKey);

    <T> void updateService(@NotNull ServiceKey serviceKey, @NotNull G<? extends T> g10);
}
