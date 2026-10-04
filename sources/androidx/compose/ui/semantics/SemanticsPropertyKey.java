package androidx.compose.ui.semantics;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SemanticsPropertyKey<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104093d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.p<T, T, T> f104095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104096c;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@NotNull String str, @NotNull ed.p<? super T, ? super T, ? extends T> pVar) {
        this.f104094a = str;
        this.f104095b = pVar;
    }

    @NotNull
    public final ed.p<T, T, T> a() {
        return this.f104095b;
    }

    @NotNull
    public final String b() {
        return this.f104094a;
    }

    public final T c(@NotNull u uVar, @NotNull kotlin.reflect.n<?> nVar) {
        SemanticsPropertiesKt.d();
        throw null;
    }

    public final boolean d() {
        return this.f104096c;
    }

    @Nullable
    public final T e(@Nullable T t10, T t11) {
        return this.f104095b.invoke(t10, t11);
    }

    public final void f(@NotNull u uVar, @NotNull kotlin.reflect.n<?> nVar, T t10) {
        uVar.b(this, t10);
    }

    @NotNull
    public String toString() {
        return "AccessibilityKey: " + this.f104094a;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, ed.p pVar, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? new ed.p<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // ed.p
            @Nullable
            public final T invoke(@Nullable T t10, T t11) {
                return t10 == null ? t11 : t10;
            }
        } : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@NotNull String str, boolean z10) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.f104096c = z10;
    }

    public SemanticsPropertyKey(@NotNull String str, boolean z10, @NotNull ed.p<? super T, ? super T, ? extends T> pVar) {
        this(str, pVar);
        this.f104096c = z10;
    }
}
