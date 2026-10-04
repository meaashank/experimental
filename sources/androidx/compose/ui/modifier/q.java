package androidx.compose.ui.modifier;

import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,253:1\n81#2:254\n107#2,2:255\n53#3,7:257\n53#3,7:264\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:254\n44#1:255,2\n51#1:257,7\n57#1:264,7\n*E\n"})
@r(parameters = 1)
public final class q extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102639d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c<?> f102640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final L0 f102641c = M1.g(null, null, 2, null);

    public q(@NotNull c<?> cVar) {
        this.f102640b = cVar;
    }

    @Override // androidx.compose.ui.modifier.h
    public boolean a(@NotNull c<?> cVar) {
        return cVar == this.f102640b;
    }

    @Override // androidx.compose.ui.modifier.h
    @Nullable
    public <T> T b(@NotNull c<T> cVar) {
        if (cVar != this.f102640b) {
            W.a.g("Check failed.");
            throw null;
        }
        T value = this.f102641c.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // androidx.compose.ui.modifier.h
    public <T> void c(@NotNull c<T> cVar, T t10) {
        if (cVar == this.f102640b) {
            f(t10);
        } else {
            W.a.g("Check failed.");
            throw null;
        }
    }

    public final void d(@Nullable Object obj) {
        f(obj);
    }

    public final Object e() {
        return this.f102641c.getValue();
    }

    public final void f(Object obj) {
        this.f102641c.setValue(obj);
    }
}
