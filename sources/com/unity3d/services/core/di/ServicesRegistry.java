package com.unity3d.services.core.di;

import ed.InterfaceC4376a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.G;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, G<?>> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, InterfaceC4376a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.p(instance, "instance");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String named, InterfaceC4376a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.p(instance, "instance");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public final <T> ServiceKey factory(String named, InterfaceC4376a<? extends T> instance) {
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.p(instance, "instance");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public final <T> T get(String named) {
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(@NotNull String named, @NotNull d<?> instance) {
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.p(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @NotNull
    public Map<ServiceKey, G<?>> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(@NotNull ServiceKey key) {
        kotlin.jvm.internal.G.p(key, "key");
        G<?> g10 = getServices().get(key);
        if (g10 != null) {
            return (T) g10.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @Nullable
    public <T> T resolveServiceOrNull(@NotNull ServiceKey key) {
        kotlin.jvm.internal.G.p(key, "key");
        G<?> g10 = getServices().get(key);
        if (g10 != null) {
            return (T) g10.getValue();
        }
        return null;
    }

    public final <T> ServiceKey single(String named, InterfaceC4376a<? extends T> instance) {
        kotlin.jvm.internal.G.p(named, "named");
        kotlin.jvm.internal.G.p(instance, "instance");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(@NotNull ServiceKey key, @NotNull G<? extends T> instance) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have multiple identical services");
        }
        this._services.put(key, instance);
    }
}
