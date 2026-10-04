package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Recomposer$writeObserverOf$1 extends Lambda implements ed.l<Object, kotlin.L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f99324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet<Object> f99325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(L l10, MutableScatterSet<Object> mutableScatterSet) {
        super(1);
        this.f99324d = l10;
        this.f99325e = mutableScatterSet;
    }

    public final void e(@NotNull Object obj) {
        this.f99324d.u(obj);
        MutableScatterSet<Object> mutableScatterSet = this.f99325e;
        if (mutableScatterSet != null) {
            mutableScatterSet.C(obj);
        }
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj) {
        e(obj);
        return kotlin.L0.f217464a;
    }
}
