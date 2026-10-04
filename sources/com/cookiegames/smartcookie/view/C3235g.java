package com.cookiegames.smartcookie.view;

import bc.InterfaceC2859i;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@InterfaceC2859i
public final class C3235g extends AbstractC3240l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f148452e = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C3235g(@NotNull i4.k historyPageFactory, @NotNull hc.H diskScheduler, @NotNull hc.H foregroundScheduler) {
        super(historyPageFactory, diskScheduler, foregroundScheduler);
        kotlin.jvm.internal.G.p(historyPageFactory, "historyPageFactory");
        kotlin.jvm.internal.G.p(diskScheduler, "diskScheduler");
        kotlin.jvm.internal.G.p(foregroundScheduler, "foregroundScheduler");
    }
}
