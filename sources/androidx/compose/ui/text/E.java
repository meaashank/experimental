package androidx.compose.ui.text;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104233b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f104232a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final E f104234c = new E();

    public static final class a {
        public a() {
        }

        @NotNull
        public final E a() {
            return E.f104234c;
        }

        public a(C4969v c4969v) {
        }
    }

    @NotNull
    public final E b(@Nullable E e10) {
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof E);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlatformSpanStyle()";
    }
}
