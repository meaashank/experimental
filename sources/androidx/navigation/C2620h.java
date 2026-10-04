package androidx.navigation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.navigation.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2620h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f115276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NavArgument f115277b;

    public C2620h(@NotNull String name, @NotNull NavArgument argument) {
        kotlin.jvm.internal.G.p(name, "name");
        kotlin.jvm.internal.G.p(argument, "argument");
        this.f115276a = name;
        this.f115277b = argument;
    }

    @NotNull
    public final String a() {
        return this.f115276a;
    }

    @NotNull
    public final NavArgument b() {
        return this.f115277b;
    }

    @NotNull
    public final NavArgument c() {
        return this.f115277b;
    }

    @NotNull
    public final String d() {
        return this.f115276a;
    }
}
