package androidx.activity;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$2\n*L\n1#1,90:1\n*E\n"})
public final class ActivityViewModelLazyKt$viewModels$2 extends Lambda implements InterfaceC4376a<R1.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f84838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$2(k kVar) {
        super(0);
        this.f84838d = kVar;
    }

    @NotNull
    public final R1.a g() {
        return this.f84838d.getDefaultViewModelCreationExtras();
    }

    @Override // ed.InterfaceC4376a
    public R1.a invoke() {
        return this.f84838d.getDefaultViewModelCreationExtras();
    }
}
