package kotlinx.coroutines.flow.internal;

import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.channels.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ChannelFlowMerge$collectTo$2<T> implements kotlinx.coroutines.flow.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f220086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.sync.b f220087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<T> f220088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<T> f220089d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
    @Vc.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f220090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<T> f220091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<T> f220092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.sync.b f220093d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlinx.coroutines.flow.e<? extends T> eVar, m<T> mVar, kotlinx.coroutines.sync.b bVar, kotlin.coroutines.e<? super AnonymousClass1> eVar2) {
            super(2, eVar2);
            this.f220091b = eVar;
            this.f220092c = mVar;
            this.f220093d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
            return new AnonymousClass1(this.f220091b, this.f220092c, this.f220093d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f220090a;
            try {
                if (i10 == 0) {
                    C4885d0.n(obj);
                    kotlinx.coroutines.flow.e<T> eVar = this.f220091b;
                    m<T> mVar = this.f220092c;
                    this.f220090a = 1;
                    if (eVar.collect(mVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4885d0.n(obj);
                }
                this.f220093d.release();
                return L0.f217464a;
            } catch (Throwable th) {
                this.f220093d.release();
                throw th;
            }
        }

        @Override // ed.p
        @Nullable
        public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
            return ((AnonymousClass1) create(l10, eVar)).invokeSuspend(L0.f217464a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2(A0 a02, kotlinx.coroutines.sync.b bVar, q<? super T> qVar, m<T> mVar) {
        this.f220086a = a02;
        this.f220087b = bVar;
        this.f220088c = qVar;
        this.f220089d = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.e<? extends T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
            int r1 = r0.f220098e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220098e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f220096c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220098e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f220095b
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.e) r8
            java.lang.Object r0 = r0.f220094a
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2) r0
            kotlin.C4885d0.n(r9)
            goto L51
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.C4885d0.n(r9)
            kotlinx.coroutines.A0 r9 = r7.f220086a
            if (r9 == 0) goto L41
            kotlinx.coroutines.JobKt__JobKt.y(r9)
        L41:
            kotlinx.coroutines.sync.b r9 = r7.f220087b
            r0.f220094a = r7
            r0.f220095b = r8
            r0.f220098e = r3
            java.lang.Object r9 = r9.g(r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            r0 = r7
        L51:
            kotlinx.coroutines.channels.q<T> r1 = r0.f220088c
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
            kotlinx.coroutines.flow.internal.m<T> r9 = r0.f220089d
            kotlinx.coroutines.sync.b r0 = r0.f220087b
            r2 = 0
            r4.<init>(r8, r9, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.C5092j.f(r1, r2, r3, r4, r5, r6)
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.emit(kotlinx.coroutines.flow.e, kotlin.coroutines.e):java.lang.Object");
    }
}
