package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class NavArgument {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final L<Object> f114943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f114944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f114945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Object f114946d;

    public static final class Builder {

        @Nullable
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;

        @Nullable
        private L<Object> type;

        @NotNull
        public final NavArgument build() {
            L<Object> lC = this.type;
            if (lC == null) {
                lC = L.f114923c.c(this.defaultValue);
            }
            return new NavArgument(lC, this.isNullable, this.defaultValue, this.defaultValuePresent);
        }

        @NotNull
        public final Builder setDefaultValue(@Nullable Object obj) {
            this.defaultValue = obj;
            this.defaultValuePresent = true;
            return this;
        }

        @NotNull
        public final Builder setIsNullable(boolean z10) {
            this.isNullable = z10;
            return this;
        }

        @NotNull
        public final <T> Builder setType(@NotNull L<T> type) {
            kotlin.jvm.internal.G.p(type, "type");
            this.type = type;
            return this;
        }
    }

    public NavArgument(@NotNull L<Object> type, boolean z10, @Nullable Object obj, boolean z11) {
        kotlin.jvm.internal.G.p(type, "type");
        if (!type.f() && z10) {
            throw new IllegalArgumentException((type.c() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.c() + " has null value but is not nullable.").toString());
        }
        this.f114943a = type;
        this.f114944b = z10;
        this.f114946d = obj;
        this.f114945c = z11;
    }

    @Nullable
    public final Object a() {
        return this.f114946d;
    }

    @NotNull
    public final L<Object> b() {
        return this.f114943a;
    }

    public final boolean c() {
        return this.f114945c;
    }

    public final boolean d() {
        return this.f114944b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void e(@NotNull String name, @NotNull Bundle bundle) {
        kotlin.jvm.internal.G.p(name, "name");
        kotlin.jvm.internal.G.p(bundle, "bundle");
        if (this.f114945c) {
            this.f114943a.k(bundle, name, this.f114946d);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NavArgument.class.equals(obj.getClass())) {
            NavArgument navArgument = (NavArgument) obj;
            if (this.f114944b != navArgument.f114944b || this.f114945c != navArgument.f114945c || !kotlin.jvm.internal.G.g(this.f114943a, navArgument.f114943a)) {
                return false;
            }
            Object obj2 = this.f114946d;
            if (obj2 != null) {
                return kotlin.jvm.internal.G.g(obj2, navArgument.f114946d);
            }
            if (navArgument.f114946d == null) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean f(@NotNull String name, @NotNull Bundle bundle) {
        kotlin.jvm.internal.G.p(name, "name");
        kotlin.jvm.internal.G.p(bundle, "bundle");
        if (!this.f114944b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f114943a.b(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f114943a.hashCode() * 31) + (this.f114944b ? 1 : 0)) * 31) + (this.f114945c ? 1 : 0)) * 31;
        Object obj = this.f114946d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NavArgument.class.getSimpleName());
        sb2.append(" Type: " + this.f114943a);
        sb2.append(" Nullable: " + this.f114944b);
        if (this.f114945c) {
            sb2.append(" DefaultValue: " + this.f114946d);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "sb.toString()");
        return string;
    }
}
