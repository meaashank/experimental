package androidx.navigation;

import androidx.lifecycle.m0;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavGraphViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphViewModelLazy.kt\nandroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$2\n*L\n1#1,220:1\n*E\n"})
public final class NavGraphViewModelLazyKt$navGraphViewModels$2 extends Lambda implements InterfaceC4376a<m0.c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.G<NavBackStackEntry> f115115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$2(kotlin.G<NavBackStackEntry> g10) {
        super(0);
        this.f115115d = g10;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final m0.c invoke() {
        return this.f115115d.getValue().f114961n;
    }
}
