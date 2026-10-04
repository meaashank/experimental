package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.InterfaceC5043v;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC5043v
public final class x implements WildcardType, u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218031c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final x f218032d = new x(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Type f218033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Type f218034b;

    public static final class a {
        public a() {
        }

        @NotNull
        public final x a() {
            return x.f218032d;
        }

        public a(C4969v c4969v) {
        }
    }

    public x(@Nullable Type type, @Nullable Type type2) {
        this.f218033a = type;
        this.f218034b = type2;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getLowerBounds() {
        Type type = this.f218034b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.u
    @NotNull
    public String getTypeName() {
        if (this.f218034b != null) {
            return "? super " + TypesJVMKt.j(this.f218034b);
        }
        Type type = this.f218033a;
        if (type == null || G.g(type, Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.j(this.f218033a);
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getUpperBounds() {
        Type type = this.f218033a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
