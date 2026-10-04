package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public final class M implements InterfaceC4966s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<?> f217888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f217889b;

    public M(@NotNull Class<?> jClass, @NotNull String moduleName) {
        G.p(jClass, "jClass");
        G.p(moduleName, "moduleName");
        this.f217888a = jClass;
        this.f217889b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC4966s
    @NotNull
    public Class<?> c() {
        return this.f217888a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof M) && G.g(this.f217888a, ((M) obj).f217888a);
    }

    @Override // kotlin.reflect.h
    @NotNull
    public Collection<kotlin.reflect.c<?>> g() {
        throw new KotlinReflectionNotSupportedError();
    }

    public int hashCode() {
        return this.f217888a.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f217888a.toString() + O.f217894b;
    }
}
