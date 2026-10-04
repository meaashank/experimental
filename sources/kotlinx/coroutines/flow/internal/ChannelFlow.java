package kotlinx.coroutines.flow.internal;

import androidx.compose.runtime.R0;
import ed.p;
import java.util.ArrayList;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.collections.U;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
@InterfaceC5120x0
public abstract class ChannelFlow<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final kotlin.coroutines.i f220074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public final int f220075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public final BufferOverflow f220076c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    @Vc.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f220077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f220078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.f<T> f220079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ChannelFlow<T> f220080d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(kotlinx.coroutines.flow.f<? super T> fVar, ChannelFlow<T> channelFlow, kotlin.coroutines.e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.f220079c = fVar;
            this.f220080d = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f220079c, this.f220080d, eVar);
            anonymousClass2.f220078b = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f220077a;
            if (i10 == 0) {
                C4885d0.n(obj);
                L l10 = (L) this.f220078b;
                kotlinx.coroutines.flow.f<T> fVar = this.f220079c;
                ReceiveChannel<T> receiveChannelM = this.f220080d.m(l10);
                this.f220077a = 1;
                if (FlowKt__ChannelsKt.d(fVar, receiveChannelM, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4885d0.n(obj);
            }
            return L0.f217464a;
        }

        @Override // ed.p
        @Nullable
        public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
            return ((AnonymousClass2) create(l10, eVar)).invokeSuspend(L0.f217464a);
        }
    }

    public ChannelFlow(@NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        this.f220074a = iVar;
        this.f220075b = i10;
        this.f220076c = bufferOverflow;
    }

    public static <T> Object d(ChannelFlow<T> channelFlow, kotlinx.coroutines.flow.f<? super T> fVar, kotlin.coroutines.e<? super L0> eVar) {
        Object objG = M.g(new AnonymousClass2(fVar, channelFlow, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // kotlinx.coroutines.flow.internal.i
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlinx.coroutines.flow.e<T> b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
        /*
            r1 = this;
            kotlin.coroutines.i r0 = r1.f220074a
            kotlin.coroutines.i r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f220075b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f220076c
        L25:
            kotlin.coroutines.i r0 = r1.f220074a
            boolean r0 = kotlin.jvm.internal.G.g(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f220075b
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.f220076c
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.f(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlow.b(kotlin.coroutines.i, int, kotlinx.coroutines.channels.BufferOverflow):kotlinx.coroutines.flow.e");
    }

    @Nullable
    public String c() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return d(this, fVar, eVar);
    }

    @Nullable
    public abstract Object e(@NotNull q<? super T> qVar, @NotNull kotlin.coroutines.e<? super L0> eVar);

    @NotNull
    public abstract ChannelFlow<T> f(@NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow);

    @Nullable
    public kotlinx.coroutines.flow.e<T> g() {
        return null;
    }

    @NotNull
    public final p<q<? super T>, kotlin.coroutines.e<? super L0>, Object> k() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int l() {
        int i10 = this.f220075b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    @NotNull
    public ReceiveChannel<T> m(@NotNull L l10) {
        return ProduceKt.h(l10, this.f220074a, l(), this.f220076c, CoroutineStart.ATOMIC, null, k(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        if (this.f220074a != EmptyCoroutineContext.f217673a) {
            arrayList.add("context=" + this.f220074a);
        }
        if (this.f220075b != -3) {
            arrayList.add("capacity=" + this.f220075b);
        }
        if (this.f220076c != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f220076c);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return R0.a(sb2, U.r3(arrayList, U6.j.f68738d, null, null, 0, null, null, 62, null), ']');
    }
}
