package kotlinx.coroutines.channels;

import androidx.collection.N0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.collections.U;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.M;
import kotlinx.coroutines.channels.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n11#2:412\n11#2:413\n11#2:417\n11#2:420\n11#2:426\n11#2:427\n11#2:433\n11#2:436\n11#2:437\n11#2:438\n766#3:414\n857#3,2:415\n1855#3,2:418\n1747#3,3:421\n1855#3,2:424\n1855#3,2:428\n766#3:430\n857#3,2:431\n1855#3,2:434\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n163#1:412\n185#1:413\n210#1:417\n234#1:420\n276#1:426\n328#1:427\n340#1:433\n352#1:436\n379#1:437\n391#1:438\n186#1:414\n186#1:415,2\n223#1:418,2\n239#1:421,3\n248#1:424,2\n330#1:428,2\n335#1:430\n335#1:431,2\n343#1:434,2\n*E\n"})
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements d<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f218835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f218836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public List<? extends BufferedChannel<E>> f218837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Object f218838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final HashMap<kotlinx.coroutines.selects.j<?>, Object> f218839q;

    @V({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,411:1\n11#2:412\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n359#1:412\n*E\n"})
    public final class a extends BufferedChannel<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(BroadcastChannelImpl.this.f218835m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
        public boolean S(@Nullable Throwable th) {
            BroadcastChannelImpl<E> broadcastChannelImpl = BroadcastChannelImpl.this;
            ReentrantLock reentrantLock = broadcastChannelImpl.f218836n;
            reentrantLock.lock();
            try {
                broadcastChannelImpl.t2(this);
                return super.S(th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final class b extends n<E> {
        public b() {
            super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: p2, reason: merged with bridge method [inline-methods] */
        public boolean S(@Nullable Throwable th) {
            BroadcastChannelImpl.this.t2(this);
            return super.S(th);
        }
    }

    public BroadcastChannelImpl(int i10) {
        super(0, null);
        this.f218835m = i10;
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException(N0.a("BroadcastChannel capacity must be positive or Channel.CONFLATED, but ", i10, " was specified").toString());
        }
        this.f218836n = new ReentrantLock();
        this.f218837o = EmptyList.f217510a;
        this.f218838p = e.f219176a;
        this.f218839q = new HashMap<>();
    }

    public static /* synthetic */ void q2() {
    }

    public static /* synthetic */ void s2() {
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void A1(@NotNull kotlinx.coroutines.selects.j<?> jVar, @Nullable Object obj) {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            Object objRemove = this.f218839q.remove(jVar);
            if (objRemove != null) {
                jVar.f(objRemove);
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                C5092j.f(M.a(jVar.getContext()), null, CoroutineStart.UNDISPATCHED, new BroadcastChannelImpl$registerSelectForSend$2(this, obj, jVar, null), 1, null);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.s
    public boolean C() {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            return super.C();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.s
    public boolean G(@Nullable Throwable th) {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f218837o.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).G(th);
            }
            List<? extends BufferedChannel<E>> list = this.f218837o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj).J0()) {
                    arrayList.add(obj);
                }
            }
            this.f218837o = arrayList;
            boolean zW = W(th, false);
            reentrantLock.unlock();
            return zW;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007b -> B:30:0x007e). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.s
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object I(E r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) r0
            int r1 = r0.f218851f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218851f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f218849d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f218851f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f218848c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f218847b
            java.lang.Object r4 = r0.f218846a
            kotlinx.coroutines.channels.BroadcastChannelImpl r4 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r4
            kotlin.C4885d0.n(r8)
            goto L7e
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.C4885d0.n(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.f218836n
            r8.lock()
            boolean r2 = r6.C()     // Catch: java.lang.Throwable -> L4f
            if (r2 != 0) goto L97
            int r2 = r6.f218835m     // Catch: java.lang.Throwable -> L4f
            r4 = -1
            if (r2 != r4) goto L51
            r6.f218838p = r7     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r7 = move-exception
            goto L9c
        L51:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r2 = r6.f218837o     // Catch: java.lang.Throwable -> L4f
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r8
            r8 = r7
            r7 = r4
            r4 = r6
        L60:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r0.f218846a = r4
            r0.f218847b = r8
            r0.f218848c = r7
            r0.f218851f = r3
            java.lang.Object r2 = r2.G1(r8, r0)
            if (r2 != r1) goto L7b
            return r1
        L7b:
            r5 = r2
            r2 = r8
            r8 = r5
        L7e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L92
            boolean r8 = r4.C()
            if (r8 != 0) goto L8d
            goto L92
        L8d:
            java.lang.Throwable r7 = r4.B0()
            throw r7
        L92:
            r8 = r2
            goto L60
        L94:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        L97:
            java.lang.Throwable r7 = r6.B0()     // Catch: java.lang.Throwable -> L4f
            throw r7     // Catch: java.lang.Throwable -> L4f
        L9c:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.I(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean S(@Nullable Throwable th) {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f218837o.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).S(th);
            }
            this.f218838p = e.f219176a;
            boolean zS = super.S(th);
            reentrantLock.unlock();
            return zS;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.d
    @NotNull
    public ReceiveChannel<E> i() {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            a bVar = this.f218835m == -1 ? new b() : new a();
            if (C() && this.f218838p == e.f219176a) {
                ((BufferedChannel) bVar).G(l0());
                reentrantLock.unlock();
                return bVar;
            }
            if (this.f218838p != e.f219176a) {
                ((BufferedChannel) bVar).t(p2());
            }
            this.f218837o = U.J4(this.f218837o, bVar);
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int o2() {
        return this.f218835m;
    }

    public final E p2() {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            if (C()) {
                Throwable thL0 = l0();
                if (thL0 == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw thL0;
            }
            E e10 = (E) this.f218838p;
            if (e10 == e.f219176a) {
                throw new IllegalStateException("No value");
            }
            reentrantLock.unlock();
            return e10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Nullable
    public final E r2() {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            E e10 = null;
            if (!D()) {
                Object obj = this.f218838p;
                if (obj != e.f219176a) {
                    e10 = (E) obj;
                }
            }
            return e10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.s
    @NotNull
    public Object t(E e10) {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            if (C()) {
                return super.t(e10);
            }
            List<? extends BufferedChannel<E>> list = this.f218837o;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((BufferedChannel) it.next()).W1()) {
                        j.f219194b.getClass();
                        return j.f219195c;
                    }
                }
            }
            if (this.f218835m == -1) {
                this.f218838p = e10;
            }
            Iterator<T> it2 = this.f218837o.iterator();
            while (it2.hasNext()) {
                ((BufferedChannel) it2.next()).t(e10);
            }
            j.b bVar = j.f219194b;
            L0 l02 = L0.f217464a;
            bVar.getClass();
            return l02;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t2(ReceiveChannel<? extends E> receiveChannel) {
        ReentrantLock reentrantLock = this.f218836n;
        reentrantLock.lock();
        try {
            List<? extends BufferedChannel<E>> list = this.f218837o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj) != receiveChannel) {
                    arrayList.add(obj);
                }
            }
            this.f218837o = arrayList;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f218838p != e.f219176a) {
            str = "CONFLATED_ELEMENT=" + this.f218838p + "; ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("BROADCAST=<");
        sb2.append(super.toString());
        sb2.append(">; SUBSCRIBERS=");
        sb2.append(U.r3(this.f218837o, ";", "<", ">", 0, null, null, 56, null));
        return sb2.toString();
    }
}
