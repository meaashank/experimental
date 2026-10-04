package com.unity3d.services.identifiers;

import android.content.Context;
import java.util.List;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.G;
import x2.InterfaceC5780b;

/* JADX INFO: loaded from: classes7.dex */
public final class UnitySharedLibraryInitializer implements InterfaceC5780b<L0> {
    @Override // x2.InterfaceC5780b
    public final L0 create(Context context) {
        G.p(context, "context");
        Context applicationContext = context.getApplicationContext();
        G.o(applicationContext, "context.applicationContext");
        a.f194507b = new a(applicationContext);
        return L0.f217464a;
    }

    @Override // x2.InterfaceC5780b
    public final List<Class<? extends InterfaceC5780b<?>>> dependencies() {
        return EmptyList.f217510a;
    }
}
