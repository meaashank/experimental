package com.cookiegames.smartcookie.view;

import bc.InterfaceC2859i;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@InterfaceC2859i
public final class n0 extends AbstractC3240l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f148502e = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public n0(@NotNull k4.j incognitoPageFactory, @NotNull hc.H diskScheduler, @NotNull hc.H foregroundScheduler) {
        super(incognitoPageFactory, diskScheduler, foregroundScheduler);
        kotlin.jvm.internal.G.p(incognitoPageFactory, "incognitoPageFactory");
        kotlin.jvm.internal.G.p(diskScheduler, "diskScheduler");
        kotlin.jvm.internal.G.p(foregroundScheduler, "foregroundScheduler");
    }
}
