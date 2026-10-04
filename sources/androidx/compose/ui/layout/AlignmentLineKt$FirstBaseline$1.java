package androidx.compose.ui.layout;

import jd.C4804b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements ed.p<Integer, Integer, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AlignmentLineKt$FirstBaseline$1 f102378a = new AlignmentLineKt$FirstBaseline$1();

    public AlignmentLineKt$FirstBaseline$1() {
        super(2, C4804b.class, "min", "min(II)I", 1);
    }

    @NotNull
    public final Integer e(int i10, int i11) {
        return Integer.valueOf(Math.min(i10, i11));
    }

    @Override // ed.p
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return e(num.intValue(), num2.intValue());
    }
}
