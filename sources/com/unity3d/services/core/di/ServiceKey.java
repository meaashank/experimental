package com.unity3d.services.core.di;

import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class ServiceKey {

    @NotNull
    private final d<?> instanceClass;

    @NotNull
    private final String named;

    public ServiceKey(@NotNull String named, @NotNull d<?> instanceClass) {
        G.p(named, "named");
        G.p(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i10 & 2) != 0) {
            dVar = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, dVar);
    }

    @NotNull
    public final String component1() {
        return this.named;
    }

    @NotNull
    public final d<?> component2() {
        return this.instanceClass;
    }

    @NotNull
    public final ServiceKey copy(@NotNull String named, @NotNull d<?> instanceClass) {
        G.p(named, "named");
        G.p(instanceClass, "instanceClass");
        return new ServiceKey(named, instanceClass);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        return G.g(this.named, serviceKey.named) && G.g(this.instanceClass, serviceKey.instanceClass);
    }

    @NotNull
    public final d<?> getInstanceClass() {
        return this.instanceClass;
    }

    @NotNull
    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        String str = this.named;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        d<?> dVar = this.instanceClass;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ")";
    }

    public /* synthetic */ ServiceKey(String str, d dVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? "" : str, dVar);
    }
}
