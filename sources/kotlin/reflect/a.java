package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.InterfaceC5043v;
import kotlin.jvm.internal.G;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC5043v
public final class a implements GenericArrayType, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Type f218024a;

    public a(@NotNull Type elementType) {
        G.p(elementType, "elementType");
        this.f218024a = elementType;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof GenericArrayType) && G.g(this.f218024a, ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.f218024a;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.u
    @NotNull
    public String getTypeName() {
        return TypesJVMKt.j(this.f218024a) + HttpUrl.f225216p;
    }

    public int hashCode() {
        return this.f218024a.hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
