package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import e.U;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@U(extension = 1000000, version = 5)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class k extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public k(@NotNull Context context) {
        G.p(context, "context");
        Object systemService = context.getSystemService((Class<Object>) d.a());
        G.o(systemService, "context.getSystemService…opicsManager::class.java)");
        super(e.a(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    @NotNull
    public android.adservices.topics.GetTopicsRequest e(@NotNull GetTopicsRequest request) {
        G.p(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = j.a().setAdsSdkName(request.f116128a).setShouldRecordObservation(request.f116129b).build();
        G.o(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
