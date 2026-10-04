package androidx.navigation;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavGraphViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphViewModelLazy.kt\nandroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$5\n*L\n1#1,220:1\n*E\n"})
public final class NavGraphViewModelLazyKt$navGraphViewModels$5 extends Lambda implements InterfaceC4376a<R1.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.G<NavBackStackEntry> f115119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$5(kotlin.G<NavBackStackEntry> g10) {
        super(0);
        this.f115119d = g10;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final R1.a invoke() {
        return this.f115119d.getValue().getDefaultViewModelCreationExtras();
    }
}
