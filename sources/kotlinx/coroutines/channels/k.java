package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.internal.N;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3086:1\n1#2:3087\n*E\n"})
public final class k<E> extends N<k<E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final BufferedChannel<E> f219198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f219199f;

    public k(long j10, @Nullable k<E> kVar, @Nullable BufferedChannel<E> bufferedChannel, int i10) {
        super(j10, kVar, i10);
        this.f219198e = bufferedChannel;
        this.f219199f = new AtomicReferenceArray(BufferedChannelKt.f218908b * 2);
    }

    public final boolean D(int i10, @Nullable Object obj, @Nullable Object obj2) {
        return com.google.common.util.concurrent.r.a(this.f219199f, (i10 * 2) + 1, obj, obj2);
    }

    public final void E(int i10) {
        M(i10, null);
    }

    @Nullable
    public final Object F(int i10, @Nullable Object obj) {
        return this.f219199f.getAndSet((i10 * 2) + 1, obj);
    }

    @NotNull
    public final BufferedChannel<E> G() {
        BufferedChannel<E> bufferedChannel = this.f219198e;
        G.m(bufferedChannel);
        return bufferedChannel;
    }

    public final /* synthetic */ AtomicReferenceArray H() {
        return this.f219199f;
    }

    public final E I(int i10) {
        return (E) this.f219199f.get(i10 * 2);
    }

    @Nullable
    public final Object J(int i10) {
        return this.f219199f.get((i10 * 2) + 1);
    }

    public final void K(int i10, boolean z10) {
        if (z10) {
            BufferedChannel<E> bufferedChannel = this.f219198e;
            G.m(bufferedChannel);
            bufferedChannel.k2((this.f220301c * ((long) BufferedChannelKt.f218908b)) + ((long) i10));
        }
        A();
    }

    public final E L(int i10) {
        E eI = I(i10);
        M(i10, null);
        return eI;
    }

    public final void M(int i10, Object obj) {
        this.f219199f.set(i10 * 2, obj);
    }

    public final void N(int i10, @Nullable Object obj) {
        this.f219199f.set((i10 * 2) + 1, obj);
    }

    public final void O(int i10, E e10) {
        M(i10, e10);
    }

    @Override // kotlinx.coroutines.internal.N
    public int y() {
        return BufferedChannelKt.f218908b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        M(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r5 = r4.f219198e;
        kotlin.jvm.internal.G.m(r5);
        r5 = r5.f218867b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (r5 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(int r5, @org.jetbrains.annotations.Nullable java.lang.Throwable r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r7) {
        /*
            r4 = this;
            int r6 = kotlinx.coroutines.channels.BufferedChannelKt.f218908b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.lang.Object r6 = r4.I(r5)
        Le:
            java.lang.Object r1 = r4.J(r5)
            boolean r2 = r1 instanceof kotlinx.coroutines.l1
            r3 = 0
            if (r2 != 0) goto L66
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.t
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            kotlinx.coroutines.internal.Q r2 = kotlinx.coroutines.channels.BufferedChannelKt.f218918l
            if (r1 == r2) goto L54
            kotlinx.coroutines.internal.Q r2 = kotlinx.coroutines.channels.BufferedChannelKt.f218919m
            if (r1 != r2) goto L25
            goto L54
        L25:
            kotlinx.coroutines.internal.Q r2 = kotlinx.coroutines.channels.BufferedChannelKt.f218915i
            if (r1 == r2) goto Le
            kotlinx.coroutines.internal.Q r2 = kotlinx.coroutines.channels.BufferedChannelKt.f218914h
            if (r1 != r2) goto L2e
            goto Le
        L2e:
            kotlinx.coroutines.internal.Q r5 = kotlinx.coroutines.channels.BufferedChannelKt.f218917k
            if (r1 == r5) goto L89
            kotlinx.coroutines.internal.Q r5 = kotlinx.coroutines.channels.BufferedChannelKt.f218912f
            if (r1 != r5) goto L37
            goto L89
        L37:
            kotlinx.coroutines.internal.Q r5 = kotlinx.coroutines.channels.BufferedChannelKt.f218920n
            if (r1 != r5) goto L3c
            goto L89
        L3c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "unexpected state: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L54:
            r4.M(r5, r3)
            if (r0 == 0) goto L89
            kotlinx.coroutines.channels.BufferedChannel<E> r5 = r4.f219198e
            kotlin.jvm.internal.G.m(r5)
            ed.l<E, kotlin.L0> r5 = r5.f218867b
            if (r5 == 0) goto L89
            kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r5, r6, r7)
            return
        L66:
            if (r0 == 0) goto L6b
            kotlinx.coroutines.internal.Q r2 = kotlinx.coroutines.channels.BufferedChannelKt.f218918l
            goto L6d
        L6b:
            kotlinx.coroutines.internal.Q r2 = kotlinx.coroutines.channels.BufferedChannelKt.f218919m
        L6d:
            boolean r1 = r4.D(r5, r1, r2)
            if (r1 == 0) goto Le
            r4.M(r5, r3)
            r1 = r0 ^ 1
            r4.K(r5, r1)
            if (r0 == 0) goto L89
            kotlinx.coroutines.channels.BufferedChannel<E> r5 = r4.f219198e
            kotlin.jvm.internal.G.m(r5)
            ed.l<E, kotlin.L0> r5 = r5.f218867b
            if (r5 == 0) goto L89
            kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r5, r6, r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.k.z(int, java.lang.Throwable, kotlin.coroutines.i):void");
    }
}
