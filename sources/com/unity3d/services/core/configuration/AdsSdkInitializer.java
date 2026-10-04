package com.unity3d.services.core.configuration;

import android.content.Context;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.List;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import x2.InterfaceC5780b;

/* JADX INFO: loaded from: classes7.dex */
public final class AdsSdkInitializer implements InterfaceC5780b<L0> {
    @Override // x2.InterfaceC5780b
    public /* bridge */ /* synthetic */ L0 create(Context context) {
        create2(context);
        return L0.f217464a;
    }

    @Override // x2.InterfaceC5780b
    @NotNull
    public List<Class<? extends InterfaceC5780b<?>>> dependencies() {
        return EmptyList.f217510a;
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        G.p(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
    }
}
