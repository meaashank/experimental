package com.github.appintro.internal;

import android.content.Context;
import dd.o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutUtil {

    @NotNull
    public static final LayoutUtil INSTANCE = new LayoutUtil();

    private LayoutUtil() {
    }

    @o
    public static final boolean isRtl(@NotNull Context ctx) {
        G.p(ctx, "ctx");
        return ctx.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
