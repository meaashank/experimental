package androidx.compose.ui.focus;

import androidx.compose.ui.p;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,82:1\n728#2,2:83\n735#2,2:85\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n*L\n74#1:83,2\n78#1:85,2\n*E\n"})
public final class G extends p.d implements F {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public FocusRequester f100627o;

    public G(@NotNull FocusRequester focusRequester) {
        this.f100627o = focusRequester;
    }

    @Override // androidx.compose.ui.p.d
    public void O2() {
        this.f100627o.f100595a.b(this);
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        this.f100627o.f100595a.h0(this);
    }

    public final void e3(@NotNull FocusRequester focusRequester) {
        this.f100627o = focusRequester;
    }

    @NotNull
    public final FocusRequester u0() {
        return this.f100627o;
    }
}
