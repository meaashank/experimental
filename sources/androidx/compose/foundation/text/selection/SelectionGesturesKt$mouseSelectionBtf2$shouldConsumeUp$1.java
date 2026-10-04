package androidx.compose.foundation.text.selection;

import kotlin.L0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1 extends Lambda implements ed.l<androidx.compose.ui.input.pointer.A, L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f94739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1(f fVar) {
        super(1);
        this.f94739d = fVar;
    }

    public final void e(@NotNull androidx.compose.ui.input.pointer.A a10) {
        if (this.f94739d.c(a10.f102148c)) {
            a10.a();
        }
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.input.pointer.A a10) {
        e(a10);
        return L0.f217464a;
    }
}
