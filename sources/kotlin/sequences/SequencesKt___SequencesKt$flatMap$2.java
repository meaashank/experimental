package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2<R> extends FunctionReferenceImpl implements ed.l<InterfaceC5000m<? extends R>, Iterator<? extends R>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SequencesKt___SequencesKt$flatMap$2 f218108a = new SequencesKt___SequencesKt$flatMap$2();

    public SequencesKt___SequencesKt$flatMap$2() {
        super(1, InterfaceC5000m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // ed.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Iterator<R> invoke(InterfaceC5000m<? extends R> p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return p02.iterator();
    }
}
