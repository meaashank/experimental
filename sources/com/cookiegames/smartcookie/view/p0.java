package com.cookiegames.smartcookie.view;

import bc.InterfaceC2859i;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@InterfaceC2859i
public final class p0 extends AbstractC3240l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f148510e = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public p0(@NotNull j4.j homePageFactory, @NotNull hc.H diskScheduler, @NotNull hc.H foregroundScheduler) {
        super(homePageFactory, diskScheduler, foregroundScheduler);
        kotlin.jvm.internal.G.p(homePageFactory, "homePageFactory");
        kotlin.jvm.internal.G.p(diskScheduler, "diskScheduler");
        kotlin.jvm.internal.G.p(foregroundScheduler, "foregroundScheduler");
    }
}
