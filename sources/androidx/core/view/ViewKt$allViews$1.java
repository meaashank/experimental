package androidx.core.view;

import android.view.View;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5002o;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {410, 412}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super View>, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f111700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f111701d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, kotlin.coroutines.e<? super ViewKt$allViews$1> eVar) {
        super(2, eVar);
        this.f111701d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<kotlin.L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f111701d, eVar);
        viewKt$allViews$1.f111700c = obj;
        return viewKt$allViews$1;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super View> abstractC5002o, kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return ((ViewKt$allViews$1) create(abstractC5002o, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1.f(r3, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.f111699b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.C4885d0.n(r5)
            goto L4e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r1 = r4.f111700c
            kotlin.sequences.o r1 = (kotlin.sequences.AbstractC5002o) r1
            kotlin.C4885d0.n(r5)
            goto L35
        L20:
            kotlin.C4885d0.n(r5)
            java.lang.Object r5 = r4.f111700c
            r1 = r5
            kotlin.sequences.o r1 = (kotlin.sequences.AbstractC5002o) r1
            android.view.View r5 = r4.f111701d
            r4.f111700c = r1
            r4.f111699b = r3
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L35
            goto L4d
        L35:
            android.view.View r5 = r4.f111701d
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L4e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.core.view.ViewGroupKt$c r3 = new androidx.core.view.ViewGroupKt$c
            r3.<init>(r5)
            r5 = 0
            r4.f111700c = r5
            r4.f111699b = r2
            java.lang.Object r5 = r1.f(r3, r4)
            if (r5 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
