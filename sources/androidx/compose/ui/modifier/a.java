package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,253:1\n53#2,7:254\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n*L\n73#1:254,7\n*E\n"})
@r(parameters = 0)
public final class a extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102628c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public m<?> f102629b;

    public a(@NotNull m<?> mVar) {
        this.f102629b = mVar;
    }

    @Override // androidx.compose.ui.modifier.h
    public boolean a(@NotNull c<?> cVar) {
        return cVar == this.f102629b.getKey();
    }

    @Override // androidx.compose.ui.modifier.h
    @Nullable
    public <T> T b(@NotNull c<T> cVar) {
        if (cVar == this.f102629b.getKey()) {
            return (T) this.f102629b.getValue();
        }
        W.a.g("Check failed.");
        throw null;
    }

    @Override // androidx.compose.ui.modifier.h
    public <T> void c(@NotNull c<T> cVar, T t10) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    @NotNull
    public final m<?> d() {
        return this.f102629b;
    }

    public final void e(@NotNull m<?> mVar) {
        this.f102629b = mVar;
    }
}
