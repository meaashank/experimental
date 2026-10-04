package androidx.compose.ui.layout;

import jd.C4804b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements ed.p<Integer, Integer, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AlignmentLineKt$LastBaseline$1 f102379a = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, C4804b.class, "max", "max(II)I", 1);
    }

    @NotNull
    public final Integer e(int i10, int i11) {
        return Integer.valueOf(Math.max(i10, i11));
    }

    @Override // ed.p
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return e(num.intValue(), num2.intValue());
    }
}
