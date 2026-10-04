package com.inmobi.media;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152008a = "H0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f152009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f152010c;

    @Nullable
    public final String a() {
        return this.f152009b;
    }

    public final String b() {
        return this.f152008a;
    }

    @Nullable
    public final Boolean c() {
        return this.f152010c;
    }

    public final void a(@Nullable String str) {
        this.f152009b = str;
    }

    @e.f0(otherwise = 4)
    public final void a(boolean z10) {
        kotlin.jvm.internal.G.m(this.f152008a);
        this.f152010c = Boolean.valueOf(z10);
    }
}
