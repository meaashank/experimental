package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.inmobi.media.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3484b6 extends Ua {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f152725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3484b6(@NotNull Constructor<List<Object>> constructor, @NotNull Class<Object> valueClass) {
        super(constructor);
        kotlin.jvm.internal.G.p(constructor, "constructor");
        kotlin.jvm.internal.G.p(valueClass, "valueClass");
        this.f152725b = valueClass;
    }

    @NotNull
    public final List<Object> b() {
        return (List) a().construct();
    }

    @NotNull
    public final Class<Object> c() {
        return this.f152725b;
    }
}
