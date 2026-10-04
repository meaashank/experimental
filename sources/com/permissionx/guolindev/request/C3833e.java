package com.permissionx.guolindev.request;

import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.permissionx.guolindev.request.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3833e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final v f161741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC3832d f161742b;

    public C3833e(@NotNull v pb2, @NotNull InterfaceC3832d chainTask) {
        G.p(pb2, "pb");
        G.p(chainTask, "chainTask");
        this.f161741a = pb2;
        this.f161742b = chainTask;
    }

    public static /* synthetic */ void e(C3833e c3833e, List list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        c3833e.d(list, str, str2, str3);
    }

    public final void a(@NotNull T5.c dialog) {
        G.p(dialog, "dialog");
        this.f161741a.K(this.f161742b, true, dialog);
    }

    public final void b(@NotNull T5.d dialogFragment) {
        G.p(dialogFragment, "dialogFragment");
        this.f161741a.L(this.f161742b, true, dialogFragment);
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
        this.f161741a.M(this.f161742b, true, permissions, message, positiveText, str);
    }
}
