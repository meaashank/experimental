package androidx.privacysandbox.ads.adservices.topics;

import androidx.compose.animation.C1635o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class GetTopicsRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f116128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116129b;

    @V({"SMAP\nGetTopicsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTopicsRequest.kt\nandroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    public static final class Builder {

        @NotNull
        private String adsSdkName = "";
        private boolean shouldRecordObservation = true;

        @NotNull
        public final GetTopicsRequest build() {
            if (this.adsSdkName.length() > 0) {
                return new GetTopicsRequest(this.adsSdkName, this.shouldRecordObservation);
            }
            throw new IllegalStateException("adsSdkName must be set");
        }

        @NotNull
        public final Builder setAdsSdkName(@NotNull String adsSdkName) {
            G.p(adsSdkName, "adsSdkName");
            this.adsSdkName = adsSdkName;
            return this;
        }

        @NotNull
        public final Builder setShouldRecordObservation(boolean z10) {
            this.shouldRecordObservation = z10;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetTopicsRequest() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String a() {
        return this.f116128a;
    }

    @dd.j(name = "shouldRecordObservation")
    public final boolean b() {
        return this.f116129b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) obj;
        return G.g(this.f116128a, getTopicsRequest.f116128a) && this.f116129b == getTopicsRequest.f116129b;
    }

    public int hashCode() {
        return C1635o.a(this.f116129b) + (this.f116128a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f116128a + ", shouldRecordObservation=" + this.f116129b;
    }

    public GetTopicsRequest(@NotNull String adsSdkName, boolean z10) {
        G.p(adsSdkName, "adsSdkName");
        this.f116128a = adsSdkName;
        this.f116129b = z10;
    }

    public /* synthetic */ GetTopicsRequest(String str, boolean z10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
