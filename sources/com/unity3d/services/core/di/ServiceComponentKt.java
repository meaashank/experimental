package com.unity3d.services.core.di;

import ed.InterfaceC4376a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ServiceComponentKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceComponentKt$inject$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends Lambda implements InterfaceC4376a<T> {
        final /* synthetic */ String $named;
        final /* synthetic */ ServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ServiceComponent serviceComponent, String str) {
            super(0);
            this.$this_inject = serviceComponent;
            this.$named = str;
        }

        @Override // ed.InterfaceC4376a
        @NotNull
        public final T invoke() {
            this.$this_inject.getServiceProvider().getRegistry();
            G.P();
            throw null;
        }
    }

    public static final <T> T get(ServiceComponent get, String named) {
        G.p(get, "$this$get");
        G.p(named, "named");
        get.getServiceProvider().getRegistry();
        G.P();
        throw null;
    }

    public static Object get$default(ServiceComponent get, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        G.p(get, "$this$get");
        G.p(named, "named");
        get.getServiceProvider().getRegistry();
        G.P();
        throw null;
    }

    public static final <T> kotlin.G<T> inject(ServiceComponent inject, String named, LazyThreadSafetyMode mode) {
        G.p(inject, "$this$inject");
        G.p(named, "named");
        G.p(mode, "mode");
        G.P();
        throw null;
    }

    public static kotlin.G inject$default(ServiceComponent inject, String named, LazyThreadSafetyMode mode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        if ((i10 & 2) != 0) {
            mode = LazyThreadSafetyMode.NONE;
        }
        G.p(inject, "$this$inject");
        G.p(named, "named");
        G.p(mode, "mode");
        G.P();
        throw null;
    }
}
