package androidx.activity;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
public final class ActivityViewModelLazyKt$viewModels$4 extends Lambda implements InterfaceC4376a<R1.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<R1.a> f84840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f84841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewModelLazyKt$viewModels$4(InterfaceC4376a<? extends R1.a> interfaceC4376a, k kVar) {
        super(0);
        this.f84840d = interfaceC4376a;
        this.f84841e = kVar;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final R1.a invoke() {
        R1.a aVarInvoke;
        InterfaceC4376a<R1.a> interfaceC4376a = this.f84840d;
        return (interfaceC4376a == null || (aVarInvoke = interfaceC4376a.invoke()) == null) ? this.f84841e.getDefaultViewModelCreationExtras() : aVarInvoke;
    }
}
