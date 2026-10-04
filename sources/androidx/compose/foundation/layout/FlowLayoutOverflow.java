package androidx.compose.foundation.layout;

import androidx.compose.runtime.InterfaceC1946s;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,906:1\n1#2:907\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
@E
public abstract class FlowLayoutOverflow {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f90423f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OverflowType f90424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ed.l<FlowLayoutOverflowState, ed.p<InterfaceC1946s, Integer, kotlin.L0>> f90427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ed.l<FlowLayoutOverflowState, ed.p<InterfaceC1946s, Integer, kotlin.L0>> f90428e;

    public enum OverflowType {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90429a;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90429a = iArr;
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i10, int i11, ed.l lVar, ed.l lVar2, int i12, C4969v c4969v) {
        this(overflowType, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : lVar, (i12 & 16) != 0 ? null : lVar2);
    }

    public final void a(@NotNull FlowLayoutOverflowState flowLayoutOverflowState, @NotNull List<ed.p<InterfaceC1946s, Integer, kotlin.L0>> list) {
        ed.l<FlowLayoutOverflowState, ed.p<InterfaceC1946s, Integer, kotlin.L0>> lVar = this.f90427d;
        ed.p<InterfaceC1946s, Integer, kotlin.L0> pVarInvoke = lVar != null ? lVar.invoke(flowLayoutOverflowState) : null;
        ed.l<FlowLayoutOverflowState, ed.p<InterfaceC1946s, Integer, kotlin.L0>> lVar2 = this.f90428e;
        ed.p<InterfaceC1946s, Integer, kotlin.L0> pVarInvoke2 = lVar2 != null ? lVar2.invoke(flowLayoutOverflowState) : null;
        int i10 = a.f90429a[this.f90424a.ordinal()];
        if (i10 == 1) {
            if (pVarInvoke != null) {
                list.add(pVarInvoke);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (pVarInvoke != null) {
                list.add(pVarInvoke);
            }
            if (pVarInvoke2 != null) {
                list.add(pVarInvoke2);
            }
        }
    }

    @NotNull
    public final FlowLayoutOverflowState b() {
        return new FlowLayoutOverflowState(this.f90424a, this.f90425b, this.f90426c);
    }

    @NotNull
    public final OverflowType c() {
        return this.f90424a;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i10, int i11, ed.l lVar, ed.l lVar2, C4969v c4969v) {
        this(overflowType, i10, i11, lVar, lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowLayoutOverflow(OverflowType overflowType, int i10, int i11, ed.l<? super FlowLayoutOverflowState, ? extends ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>> lVar, ed.l<? super FlowLayoutOverflowState, ? extends ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>> lVar2) {
        this.f90424a = overflowType;
        this.f90425b = i10;
        this.f90426c = i11;
        this.f90427d = lVar;
        this.f90428e = lVar2;
    }
}
