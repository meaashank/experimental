package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Constructor f152491a;

    public Ua(Constructor constructor) {
        kotlin.jvm.internal.G.p(constructor, "constructor");
        this.f152491a = constructor;
    }

    @NotNull
    public final Constructor<Object> a() {
        return this.f152491a;
    }

    public final void a(@NotNull Constructor<Object> constructor) {
        kotlin.jvm.internal.G.p(constructor, "<set-?>");
        this.f152491a = constructor;
    }
}
