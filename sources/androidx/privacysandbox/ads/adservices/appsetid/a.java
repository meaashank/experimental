package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.compose.animation.core.E0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nAppSetId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetId.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C0316a f116044c = new C0316a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116045d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f116046e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f116047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116048b;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.appsetid.a$a, reason: collision with other inner class name */
    public static final class C0316a {
        public C0316a() {
        }

        public C0316a(C4969v c4969v) {
        }
    }

    public a(@NotNull String id2, int i10) {
        G.p(id2, "id");
        this.f116047a = id2;
        this.f116048b = i10;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    @NotNull
    public final String a() {
        return this.f116047a;
    }

    public final int b() {
        return this.f116048b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f116047a, aVar.f116047a) && this.f116048b == aVar.f116048b;
    }

    public int hashCode() {
        return (this.f116047a.hashCode() * 31) + this.f116048b;
    }

    @NotNull
    public String toString() {
        return E0.a(new StringBuilder("AppSetId: id="), this.f116047a, ", scope=", this.f116048b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
