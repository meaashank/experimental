package com.inmobi.media;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f152528b;

    public Va(@NotNull String fieldName, @NotNull Class<?> originClass) {
        kotlin.jvm.internal.G.p(fieldName, "fieldName");
        kotlin.jvm.internal.G.p(originClass, "originClass");
        this.f152527a = fieldName;
        this.f152528b = originClass;
    }

    @NotNull
    public final Va a(@NotNull String fieldName, @NotNull Class<?> originClass) {
        kotlin.jvm.internal.G.p(fieldName, "fieldName");
        kotlin.jvm.internal.G.p(originClass, "originClass");
        return new Va(fieldName, originClass);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Va)) {
            return false;
        }
        Va va2 = (Va) obj;
        return kotlin.jvm.internal.G.g(this.f152527a, va2.f152527a) && kotlin.jvm.internal.G.g(this.f152528b, va2.f152528b);
    }

    public int hashCode() {
        return this.f152528b.hashCode() + (this.f152527a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RuleKey(fieldName=" + this.f152527a + ", originClass=" + this.f152528b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Va a(Va va2, String str, Class cls, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = va2.f152527a;
        }
        if ((i10 & 2) != 0) {
            cls = va2.f152528b;
        }
        return va2.a(str, cls);
    }
}
