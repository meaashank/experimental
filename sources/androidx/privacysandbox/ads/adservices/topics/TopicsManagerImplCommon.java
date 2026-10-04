package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.core.os.z;
import e.InterfaceC4345t;
import e.U;
import e.W;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5102o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nTopicsManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,54:1\n314#2,11:55\n*S KotlinDebug\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n*L\n28#1:55,11\n*E\n"})
@U(extension = 1000000, version = 4)
@SuppressLint({"NewApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TopicsManagerImplCommon extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TopicsManager f116130b;

    public TopicsManagerImplCommon(@NotNull TopicsManager mTopicsManager) {
        G.p(mTopicsManager, "mTopicsManager");
        this.f116130b = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @e.InterfaceC4345t
    @e.W("android.permission.ACCESS_ADSERVICES_TOPICS")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object g(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r5, kotlin.coroutines.e<? super androidx.privacysandbox.ads.adservices.topics.a> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r0
            int r1 = r0.f116134d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116134d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f116132b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f116134d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f116131a
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r4
            kotlin.C4885d0.n(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C4885d0.n(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.e(r5)
            r0.f116131a = r4
            r0.f116134d = r3
            java.lang.Object r6 = r4.h(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.l.a(r6)
            androidx.privacysandbox.ads.adservices.topics.a r4 = r4.f(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.g(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.c
    @InterfaceC4345t
    @W("android.permission.ACCESS_ADSERVICES_TOPICS")
    @Nullable
    public Object a(@NotNull GetTopicsRequest getTopicsRequest, @NotNull kotlin.coroutines.e<? super a> eVar) {
        return g(this, getTopicsRequest, eVar);
    }

    @NotNull
    public android.adservices.topics.GetTopicsRequest e(@NotNull GetTopicsRequest request) {
        G.p(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = j.a().setAdsSdkName(request.f116128a).build();
        G.o(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    @NotNull
    public final a f(@NotNull GetTopicsResponse response) {
        G.p(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicA = n.a(it.next());
            arrayList.add(new b(topicA.getTaxonomyVersion(), topicA.getModelVersion(), topicA.getTopicId()));
        }
        return new a(arrayList);
    }

    @W("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object h(android.adservices.topics.GetTopicsRequest getTopicsRequest, kotlin.coroutines.e<? super GetTopicsResponse> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        this.f116130b.getTopics(getTopicsRequest, new androidx.privacysandbox.ads.adservices.adid.h(), z.a(c5102o));
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }
}
