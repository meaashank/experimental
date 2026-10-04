package androidx.fragment.app;

import R1.a;
import androidx.lifecycle.InterfaceC2605s;
import androidx.lifecycle.q0;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$viewModels$3 extends Lambda implements InterfaceC4376a<R1.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.G<q0> f113660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$3(kotlin.G<? extends q0> g10) {
        super(0);
        this.f113660d = g10;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final R1.a invoke() {
        R1.a defaultViewModelCreationExtras;
        q0 value = this.f113660d.getValue();
        InterfaceC2605s interfaceC2605s = value instanceof InterfaceC2605s ? (InterfaceC2605s) value : null;
        return (interfaceC2605s == null || (defaultViewModelCreationExtras = interfaceC2605s.getDefaultViewModelCreationExtras()) == null) ? a.C0103a.f67688b : defaultViewModelCreationExtras;
    }
}
