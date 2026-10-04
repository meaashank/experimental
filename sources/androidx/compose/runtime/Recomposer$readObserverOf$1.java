package androidx.compose.runtime;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Recomposer$readObserverOf$1 extends Lambda implements ed.l<Object, kotlin.L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f99267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$readObserverOf$1(L l10) {
        super(1);
        this.f99267d = l10;
    }

    public final void e(@NotNull Object obj) {
        this.f99267d.a(obj);
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj) {
        e(obj);
        return kotlin.L0.f217464a;
    }
}
