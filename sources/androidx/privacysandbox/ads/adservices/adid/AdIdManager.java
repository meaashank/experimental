package androidx.privacysandbox.ads.adservices.adid;

import android.adservices.adid.AdId;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.os.z;
import dd.o;
import e.U;
import e.W;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5102o;
import m2.C5196a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AdIdManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f116013a = new a();

    public static final class a {
        public a() {
        }

        @o
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final AdIdManager a(@NotNull Context context) {
            G.p(context, "context");
            if (C5196a.f221087a.a() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }

        public a(C4969v c4969v) {
        }
    }

    @o
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final AdIdManager b(@NotNull Context context) {
        return f116013a.a(context);
    }

    @W("android.permission.ACCESS_ADSERVICES_AD_ID")
    @Nullable
    public abstract Object a(@NotNull kotlin.coroutines.e<? super androidx.privacysandbox.ads.adservices.adid.a> eVar);

    @V({"SMAP\nAdIdManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManager.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManager$Api33Ext4Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,98:1\n314#2,11:99\n*S KotlinDebug\n*F\n+ 1 AdIdManager.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManager$Api33Ext4Impl\n*L\n67#1:99,11\n*E\n"})
    @U(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public static final class Api33Ext4Impl extends AdIdManager {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final android.adservices.adid.AdIdManager f116014b;

        public Api33Ext4Impl(@NotNull android.adservices.adid.AdIdManager mAdIdManager) {
            G.p(mAdIdManager, "mAdIdManager");
            this.f116014b = mAdIdManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
        @e.InterfaceC4345t
        @e.W("android.permission.ACCESS_ADSERVICES_AD_ID")
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.privacysandbox.ads.adservices.adid.a> r5) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                if (r0 == 0) goto L13
                r0 = r5
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1) r0
                int r1 = r0.f116018d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f116018d = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r0 = new androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.f116016b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f116018d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r0 = r0.f116015a
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl) r0
                kotlin.C4885d0.n(r5)
                goto L42
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L33:
                kotlin.C4885d0.n(r5)
                r0.f116015a = r4
                r0.f116018d = r3
                java.lang.Object r5 = r4.f(r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                r0 = r4
            L42:
                android.adservices.adid.AdId r5 = androidx.privacysandbox.ads.adservices.adid.d.a(r5)
                androidx.privacysandbox.ads.adservices.adid.a r5 = r0.e(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.a(kotlin.coroutines.e):java.lang.Object");
        }

        public final androidx.privacysandbox.ads.adservices.adid.a e(AdId adId) {
            String adId2 = adId.getAdId();
            G.o(adId2, "response.adId");
            return new androidx.privacysandbox.ads.adservices.adid.a(adId2, adId.isLimitAdTrackingEnabled());
        }

        @W("android.permission.ACCESS_ADSERVICES_AD_ID")
        public final Object f(kotlin.coroutines.e<? super AdId> eVar) {
            C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
            c5102o.n0();
            this.f116014b.getAdId(new h(), z.a(c5102o));
            Object objZ = c5102o.z();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objZ;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(@NotNull Context context) {
            G.p(context, "context");
            Object systemService = context.getSystemService((Class<Object>) e.a());
            G.o(systemService, "context.getSystemService…:class.java\n            )");
            this(f.a(systemService));
        }
    }
}
