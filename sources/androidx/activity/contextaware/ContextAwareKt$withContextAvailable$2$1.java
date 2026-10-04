package androidx.activity.contextaware;

import androidx.activity.contextaware.ContextAwareKt;
import b.InterfaceC2722a;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1\n*L\n1#1,94:1\n*E\n"})
public final class ContextAwareKt$withContextAvailable$2$1 extends Lambda implements l<Throwable, L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2722a f85002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ContextAwareKt.a f85003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextAwareKt$withContextAvailable$2$1(InterfaceC2722a interfaceC2722a, ContextAwareKt.a aVar) {
        super(1);
        this.f85002d = interfaceC2722a;
        this.f85003e = aVar;
    }

    public final void e(@Nullable Throwable th) {
        this.f85002d.removeOnContextAvailableListener(this.f85003e);
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
        e(th);
        return L0.f217464a;
    }
}
