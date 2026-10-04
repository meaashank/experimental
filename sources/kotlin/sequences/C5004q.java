package kotlin.sequences;

import java.util.Iterator;
import kotlin.InterfaceC4849b;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5004q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f218206a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f218207b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f218208c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f218209d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f218210e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f218211f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.q$a */
    @V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,730:1\n26#2:731\n*E\n"})
    public static final class a<T> implements InterfaceC5000m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.p f218212a;

        public a(ed.p pVar) {
            this.f218212a = pVar;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<T> iterator() {
            return C5004q.a(this.f218212a);
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static <T> Iterator<T> a(@InterfaceC4849b @NotNull ed.p<? super AbstractC5002o<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> block) {
        kotlin.jvm.internal.G.p(block, "block");
        C5001n c5001n = new C5001n();
        c5001n.f218205d = IntrinsicsKt__IntrinsicsJvmKt.c(block, c5001n, c5001n);
        return c5001n;
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static <T> InterfaceC5000m<T> b(@InterfaceC4849b @NotNull ed.p<? super AbstractC5002o<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> block) {
        kotlin.jvm.internal.G.p(block, "block");
        return new a(block);
    }
}
