package androidx.navigation;

import androidx.navigation.NavArgument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.navigation.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@z
public final class C2627o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NavArgument.Builder f115289a = new NavArgument.Builder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public L<?> f115290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f115291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Object f115292d;

    @NotNull
    public final NavArgument a() {
        return this.f115289a.build();
    }

    @Nullable
    public final Object b() {
        return this.f115292d;
    }

    public final boolean c() {
        return this.f115291c;
    }

    @NotNull
    public final L<?> d() {
        L<?> l10 = this.f115290b;
        if (l10 != null) {
            return l10;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final void e(@Nullable Object obj) {
        this.f115292d = obj;
        this.f115289a.setDefaultValue(obj);
    }

    public final void f(boolean z10) {
        this.f115291c = z10;
        this.f115289a.setIsNullable(z10);
    }

    public final void g(@NotNull L<?> value) {
        kotlin.jvm.internal.G.p(value, "value");
        this.f115290b = value;
        this.f115289a.setType(value);
    }
}
