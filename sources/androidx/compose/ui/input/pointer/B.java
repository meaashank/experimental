package androidx.compose.ui.input.pointer;

import androidx.collection.C1531f0;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,276:1\n33#2,6:277\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n184#1:277,6\n*E\n"})
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1531f0<a> f102159a = new C1531f0<>(0, 1, null);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f102160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f102161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f102162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f102163d;

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, C4969v c4969v) {
            this(j10, j11, z10, i10);
        }

        public final boolean a() {
            return this.f102162c;
        }

        public final long b() {
            return this.f102161b;
        }

        public final int c() {
            return this.f102163d;
        }

        public final long d() {
            return this.f102160a;
        }

        public a(long j10, long j11, boolean z10, int i10) {
            this.f102160a = j10;
            this.f102161b = j11;
            this.f102162c = z10;
            this.f102163d = i10;
        }
    }

    public final void a() {
        this.f102159a.b();
    }

    @NotNull
    public final C2142i b(@NotNull C c10, @NotNull P p10) {
        long j10;
        boolean z10;
        long jD;
        C1531f0 c1531f0 = new C1531f0(c10.f102166b.size());
        List<D> list = c10.f102166b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            D d10 = list.get(i10);
            a aVarG = this.f102159a.g(d10.f102171a);
            if (aVarG == null) {
                j10 = d10.f102172b;
                jD = d10.f102174d;
                z10 = false;
            } else {
                long j11 = aVarG.f102160a;
                j10 = j11;
                z10 = aVarG.f102162c;
                jD = p10.D(aVarG.f102161b);
            }
            long j12 = d10.f102171a;
            int i11 = i10;
            List<D> list2 = list;
            int i12 = size;
            c1531f0.m(j12, new A(j12, d10.f102172b, d10.f102174d, d10.f102175e, d10.f102176f, j10, jD, z10, false, d10.f102177g, d10.f102179i, d10.f102180j, d10.f102181k));
            boolean z11 = d10.f102175e;
            if (z11) {
                this.f102159a.m(d10.f102171a, new a(d10.f102172b, d10.f102173c, z11, d10.f102177g));
            } else {
                this.f102159a.q(d10.f102171a);
            }
            i10 = i11 + 1;
            list = list2;
            size = i12;
        }
        return new C2142i(c1531f0, c10);
    }
}
