package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$1<R> extends FunctionReferenceImpl implements ed.l<Iterable<? extends R>, Iterator<? extends R>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SequencesKt___SequencesKt$flatMapIndexed$1 f218109a = new SequencesKt___SequencesKt$flatMapIndexed$1();

    public SequencesKt___SequencesKt$flatMapIndexed$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // ed.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Iterator<R> invoke(Iterable<? extends R> p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return p02.iterator();
    }
}
