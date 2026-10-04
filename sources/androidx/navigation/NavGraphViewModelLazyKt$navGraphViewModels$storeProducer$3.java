package androidx.navigation;

import androidx.lifecycle.p0;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavGraphViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphViewModelLazy.kt\nandroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3\n*L\n1#1,220:1\n*E\n"})
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 extends Lambda implements InterfaceC4376a<p0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.G<NavBackStackEntry> f115134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(kotlin.G<NavBackStackEntry> g10) {
        super(0);
        this.f115134d = g10;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final p0 invoke() {
        return this.f115134d.getValue().getViewModelStore();
    }
}
