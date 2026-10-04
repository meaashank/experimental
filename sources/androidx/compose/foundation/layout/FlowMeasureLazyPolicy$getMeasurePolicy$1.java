package androidx.compose.foundation.layout;

import k0.C4811b;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class FlowMeasureLazyPolicy$getMeasurePolicy$1 extends Lambda implements ed.p<androidx.compose.ui.layout.G0, C4811b, androidx.compose.ui.layout.T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlowMeasureLazyPolicy f90470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowMeasureLazyPolicy$getMeasurePolicy$1(FlowMeasureLazyPolicy flowMeasureLazyPolicy) {
        super(2);
        this.f90470d = flowMeasureLazyPolicy;
    }

    @NotNull
    public final androidx.compose.ui.layout.T e(@NotNull androidx.compose.ui.layout.G0 g02, long j10) {
        return this.f90470d.C(g02, j10);
    }

    @Override // ed.p
    public androidx.compose.ui.layout.T invoke(androidx.compose.ui.layout.G0 g02, C4811b c4811b) {
        long j10 = c4811b.f214284a;
        return this.f90470d.C(g02, j10);
    }
}
