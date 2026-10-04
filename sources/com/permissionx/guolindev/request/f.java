package com.permissionx.guolindev.request;

import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final v f161743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC3832d f161744b;

    public f(@NotNull v pb2, @NotNull InterfaceC3832d chainTask) {
        G.p(pb2, "pb");
        G.p(chainTask, "chainTask");
        this.f161743a = pb2;
        this.f161744b = chainTask;
    }

    public static /* synthetic */ void e(f fVar, List list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        fVar.d(list, str, str2, str3);
    }

    public final void a(@NotNull T5.c dialog) {
        G.p(dialog, "dialog");
        this.f161743a.K(this.f161744b, false, dialog);
    }

    public final void b(@NotNull T5.d dialogFragment) {
        G.p(dialogFragment, "dialogFragment");
        this.f161743a.L(this.f161744b, false, dialogFragment);
    }

    @dd.k
    public final void c(@NotNull List<String> permissions, @NotNull String message, @NotNull String positiveText) {
        G.p(permissions, "permissions");
        G.p(message, "message");
        G.p(positiveText, "positiveText");
        d(permissions, message, positiveText, null);
    }

    @dd.k
    public final void d(@NotNull List<String> permissions, @NotNull String message, @NotNull String positiveText, @Nullable String str) {
        G.p(permissions, "permissions");
        G.p(message, "message");
        G.p(positiveText, "positiveText");
        this.f161743a.M(this.f161744b, false, permissions, message, positiveText, str);
    }
}
