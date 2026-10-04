package androidx.compose.foundation.lazy.layout;

import ed.InterfaceC4376a;
import k0.InterfaceC4814e;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,309:1\n149#2:310\n149#2:311\n149#2:312\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n36#1:310\n37#1:311\n38#1:312\n*E\n"})
public final class LazyAnimateScrollKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f91557a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f91558b = 1500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f91559c = 50;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f91560d = false;

    @Nullable
    public static final Object d(@NotNull InterfaceC1732f interfaceC1732f, int i10, int i11, int i12, @NotNull InterfaceC4814e interfaceC4814e, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objA = interfaceC1732f.a(new LazyAnimateScrollKt$animateScrollToItem$2(i10, interfaceC4814e, interfaceC1732f, i11, i12, null), eVar);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : L0.f217464a;
    }

    public static final boolean f(@NotNull InterfaceC1732f interfaceC1732f, int i10) {
        return i10 <= interfaceC1732f.d() && interfaceC1732f.b() <= i10;
    }

    public static final void e(InterfaceC4376a<String> interfaceC4376a) {
    }
}
