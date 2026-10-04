package androidx.navigation;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavGraphViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphViewModelLazy.kt\nandroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$3\n*L\n1#1,220:1\n*E\n"})
public final class NavGraphViewModelLazyKt$navGraphViewModels$3 extends Lambda implements InterfaceC4376a<R1.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<R1.a> f115116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.G<NavBackStackEntry> f115117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavGraphViewModelLazyKt$navGraphViewModels$3(InterfaceC4376a<? extends R1.a> interfaceC4376a, kotlin.G<NavBackStackEntry> g10) {
        super(0);
        this.f115116d = interfaceC4376a;
        this.f115117e = g10;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final R1.a invoke() {
        R1.a aVarInvoke;
        InterfaceC4376a<R1.a> interfaceC4376a = this.f115116d;
        return (interfaceC4376a == null || (aVarInvoke = interfaceC4376a.invoke()) == null) ? this.f115117e.getValue().getDefaultViewModelCreationExtras() : aVarInvoke;
    }
}
