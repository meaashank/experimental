package com.permissionx.guolindev.request;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public AbstractC3831c f161796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public AbstractC3831c f161797b;

    public final void a(@NotNull AbstractC3831c task) {
        G.p(task, "task");
        if (this.f161796a == null) {
            this.f161796a = task;
        }
        AbstractC3831c abstractC3831c = this.f161797b;
        if (abstractC3831c != null) {
            abstractC3831c.f161738b = task;
        }
        this.f161797b = task;
    }

    public final void b() {
        AbstractC3831c abstractC3831c = this.f161796a;
        if (abstractC3831c != null) {
            abstractC3831c.request();
        }
    }
}
