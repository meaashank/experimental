package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import e.W;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import m2.C5196a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f116139a = new a();

    public static final class a {
        public a() {
        }

        @dd.o
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final c a(@NotNull Context context) {
            G.p(context, "context");
            C5196a c5196a = C5196a.f221087a;
            if (c5196a.a() >= 5) {
                return new k(context);
            }
            if (c5196a.a() == 4) {
                return new f(context);
            }
            return null;
        }

        public a(C4969v c4969v) {
        }
    }

    @dd.o
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final c b(@NotNull Context context) {
        return f116139a.a(context);
    }

    @W("android.permission.ACCESS_ADSERVICES_TOPICS")
    @Nullable
    public abstract Object a(@NotNull GetTopicsRequest getTopicsRequest, @NotNull kotlin.coroutines.e<? super androidx.privacysandbox.ads.adservices.topics.a> eVar);
}
