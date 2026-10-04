package com.prism.lib_google_billing;

import V5.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.foundation.layout.T;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.C2983c0;
import com.android.billingclient.api.C3007i0;
import com.android.billingclient.api.C3011j0;
import com.android.billingclient.api.InterfaceC2995f0;
import com.android.billingclient.api.InterfaceC3003h0;
import com.android.billingclient.api.InterfaceC3065x;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.android.billingclient.api.Y;
import com.android.billingclient.api.Z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.B;
import kotlin.collections.EmptyList;
import kotlin.collections.U;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.C5110s0;
import kotlinx.coroutines.flow.FlowKt__BuildersKt;
import kotlinx.coroutines.flow.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nBillingClientWrap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingClientWrap.kt\ncom/prism/lib_google_billing/BillingClientWrap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,424:1\n774#2:425\n865#2:426\n1761#2,3:427\n866#2:430\n774#2:431\n865#2,2:432\n2756#2:434\n1563#2:436\n1634#2,3:437\n1374#2:440\n1460#2,2:441\n1573#2:443\n1604#2,4:444\n1462#2,3:448\n1563#2:451\n1634#2,3:452\n1563#2:455\n1634#2,2:456\n1563#2:458\n1634#2,2:459\n1563#2:461\n1634#2,3:462\n1636#2:465\n1636#2:466\n1374#2:467\n1460#2,5:468\n774#2:473\n865#2,2:474\n1563#2:476\n1634#2,3:477\n774#2:480\n865#2,2:481\n1#3:435\n*S KotlinDebug\n*F\n+ 1 BillingClientWrap.kt\ncom/prism/lib_google_billing/BillingClientWrap\n*L\n87#1:425\n87#1:426\n87#1:427,3\n87#1:430\n88#1:431\n88#1:432,2\n89#1:434\n153#1:436\n153#1:437,3\n173#1:440\n173#1:441,2\n184#1:443\n184#1:444,4\n173#1:448,3\n201#1:451\n201#1:452,3\n221#1:455\n221#1:456,2\n222#1:458\n222#1:459,2\n226#1:461\n226#1:462,3\n222#1:465\n221#1:466\n235#1:467\n235#1:468,5\n237#1:473\n237#1:474,2\n238#1:476\n238#1:477,3\n240#1:480\n240#1:481,2\n89#1:435\n*E\n"})
public final class BillingClientWrap {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f188934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f188935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f188936k = "KEY_NO_ADS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static BillingClientWrap f188937l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f188938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BillingClient f188939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f188940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.j<d> f188941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.e<d> f188942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.j<b> f188943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.e<b> f188944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final InterfaceC3003h0 f188945h;

    public static final class a {
        public a() {
        }

        @NotNull
        public final synchronized BillingClientWrap a(@NotNull Context context) {
            BillingClientWrap billingClientWrap;
            try {
                G.p(context, "context");
                if (BillingClientWrap.f188937l == null) {
                    BillingClientWrap.f188937l = new BillingClientWrap(context);
                }
                billingClientWrap = BillingClientWrap.f188937l;
                G.n(billingClientWrap, "null cannot be cast to non-null type com.prism.lib_google_billing.BillingClientWrap");
            } catch (Throwable th) {
                throw th;
            }
            return billingClientWrap;
        }

        @NotNull
        public final String b() {
            return BillingClientWrap.f188935j;
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<m> f188946a;

        public b(@NotNull List<m> purchasePlans) {
            G.p(purchasePlans, "purchasePlans");
            this.f188946a = purchasePlans;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = bVar.f188946a;
            }
            return bVar.b(list);
        }

        @NotNull
        public final List<m> a() {
            return this.f188946a;
        }

        @NotNull
        public final b b(@NotNull List<m> purchasePlans) {
            G.p(purchasePlans, "purchasePlans");
            return new b(purchasePlans);
        }

        @NotNull
        public final List<m> d() {
            return this.f188946a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && G.g(this.f188946a, ((b) obj).f188946a);
        }

        public int hashCode() {
            return this.f188946a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(purchasePlans=" + this.f188946a + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BillingResult f188947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<Y> f188948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<C3011j0> f188949c;

        public c(@NotNull BillingResult billingResult, @NotNull List<Y> productDetailsList, @NotNull List<C3011j0> unfetchedProductList) {
            G.p(billingResult, "billingResult");
            G.p(productDetailsList, "productDetailsList");
            G.p(unfetchedProductList, "unfetchedProductList");
            this.f188947a = billingResult;
            this.f188948b = productDetailsList;
            this.f188949c = unfetchedProductList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c e(c cVar, BillingResult billingResult, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResult = cVar.f188947a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f188948b;
            }
            if ((i10 & 4) != 0) {
                list2 = cVar.f188949c;
            }
            return cVar.d(billingResult, list, list2);
        }

        @NotNull
        public final BillingResult a() {
            return this.f188947a;
        }

        @NotNull
        public final List<Y> b() {
            return this.f188948b;
        }

        @NotNull
        public final List<C3011j0> c() {
            return this.f188949c;
        }

        @NotNull
        public final c d(@NotNull BillingResult billingResult, @NotNull List<Y> productDetailsList, @NotNull List<C3011j0> unfetchedProductList) {
            G.p(billingResult, "billingResult");
            G.p(productDetailsList, "productDetailsList");
            G.p(unfetchedProductList, "unfetchedProductList");
            return new c(billingResult, productDetailsList, unfetchedProductList);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return G.g(this.f188947a, cVar.f188947a) && G.g(this.f188948b, cVar.f188948b) && G.g(this.f188949c, cVar.f188949c);
        }

        @NotNull
        public final BillingResult f() {
            return this.f188947a;
        }

        @NotNull
        public final List<Y> g() {
            return this.f188948b;
        }

        @NotNull
        public final List<C3011j0> h() {
            return this.f188949c;
        }

        public int hashCode() {
            return this.f188949c.hashCode() + T.a(this.f188948b, this.f188947a.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ProductDetailsQueryResult(billingResult=" + this.f188947a + ", productDetailsList=" + this.f188948b + ", unfetchedProductList=" + this.f188949c + ")";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<C2983c0> f188954a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Nullable List<? extends C2983c0> list) {
            this.f188954a = list;
        }

        public static d c(d dVar, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = dVar.f188954a;
            }
            dVar.getClass();
            return new d(list);
        }

        @Nullable
        public final List<C2983c0> a() {
            return this.f188954a;
        }

        @NotNull
        public final d b(@Nullable List<? extends C2983c0> list) {
            return new d(list);
        }

        @Nullable
        public final List<C2983c0> d() {
            return this.f188954a;
        }

        public final boolean e() {
            List<C2983c0> list = this.f188954a;
            return !(list == null || list.isEmpty());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && G.g(this.f188954a, ((d) obj).f188954a);
        }

        public int hashCode() {
            List<C2983c0> list = this.f188954a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "PurchaseRecord(records=" + this.f188954a + ")";
        }
    }

    public static final class e implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.e<c> f188955a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(kotlin.coroutines.e<? super c> eVar) {
            this.f188955a = eVar;
        }

        @Override // com.android.billingclient.api.Z
        public final void a(BillingResult billingResult, C3007i0 queryProductDetailsResult) {
            G.p(billingResult, "billingResult");
            G.p(queryProductDetailsResult, "queryProductDetailsResult");
            kotlin.coroutines.e<c> eVar = this.f188955a;
            List list = queryProductDetailsResult.f136708a;
            if (list == null) {
                list = EmptyList.f217510a;
            }
            List list2 = queryProductDetailsResult.f136709b;
            if (list2 == null) {
                list2 = EmptyList.f217510a;
            }
            eVar.resumeWith(new c(billingResult, list, list2));
        }
    }

    public static final class f implements InterfaceC2995f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f188956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.e<List<? extends C2983c0>> f188957b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(String str, kotlin.coroutines.e<? super List<? extends C2983c0>> eVar) {
            this.f188956a = str;
            this.f188957b = eVar;
        }

        @Override // com.android.billingclient.api.InterfaceC2995f0
        public final void a(BillingResult billingResult, List<? extends C2983c0> purchases) {
            G.p(billingResult, "billingResult");
            G.p(purchases, "purchases");
            BillingClientWrap.f188934i.getClass();
            String str = BillingClientWrap.f188935j;
            String str2 = this.f188956a;
            int i10 = billingResult.f136358a;
            String str3 = billingResult.f136360c;
            StringBuilder sbA = androidx.constraintlayout.widget.e.a("queryPurchasesAsync(", str2, "): ", i10, U6.j.f68738d);
            sbA.append(str3);
            sbA.append(", purchases: ");
            sbA.append(purchases);
            Log.d(str, sbA.toString());
            if (billingResult.f136358a == 0) {
                this.f188957b.resumeWith(purchases);
            } else {
                this.f188957b.resumeWith(null);
            }
        }
    }

    static {
        a aVar = new a();
        f188934i = aVar;
        f188935j = aVar.getClass().getName();
    }

    public BillingClientWrap(@NotNull Context context) {
        G.p(context, "context");
        this.f188938a = context;
        kotlinx.coroutines.flow.j<d> jVarA = v.a(null);
        this.f188941d = jVarA;
        this.f188942e = jVarA;
        kotlinx.coroutines.flow.j<b> jVarA2 = v.a(null);
        this.f188943f = jVarA2;
        this.f188944g = jVarA2;
        InterfaceC3003h0 interfaceC3003h0 = new InterfaceC3003h0() { // from class: com.prism.lib_google_billing.b
            @Override // com.android.billingclient.api.InterfaceC3003h0
            public final void a(BillingResult billingResult, List list) {
                BillingClientWrap.u(this.f189053a, billingResult, list);
            }
        };
        this.f188945h = interfaceC3003h0;
        BillingClient billingClientBuild = BillingClient.q(context).setListener(interfaceC3003h0).enablePendingPurchases(PendingPurchasesParams.c().enableOneTimeProducts().build()).enableAutoServiceReconnection().build();
        G.o(billingClientBuild, "build(...)");
        this.f188939b = billingClientBuild;
        SharedPreferences sharedPreferences = context.getSharedPreferences("BILLING_RECORD", 0);
        G.o(sharedPreferences, "getSharedPreferences(...)");
        this.f188940c = sharedPreferences;
    }

    public static final void H(BillingResult acknowledgePurchaseResult) {
        G.p(acknowledgePurchaseResult, "acknowledgePurchaseResult");
    }

    public static final void u(BillingClientWrap billingClientWrap, BillingResult billingResult, List list) {
        G.p(billingResult, "billingResult");
        if (billingResult.f136358a == 0) {
            billingClientWrap.G(list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.prism.lib_google_billing.BillingClientWrap$queryPurchasePlan$1
            if (r0 == 0) goto L13
            r0 = r8
            com.prism.lib_google_billing.BillingClientWrap$queryPurchasePlan$1 r0 = (com.prism.lib_google_billing.BillingClientWrap$queryPurchasePlan$1) r0
            int r1 = r0.f188984d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188984d = r1
            goto L18
        L13:
            com.prism.lib_google_billing.BillingClientWrap$queryPurchasePlan$1 r0 = new com.prism.lib_google_billing.BillingClientWrap$queryPurchasePlan$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f188982b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f188984d
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L37
            if (r2 != r5) goto L2f
            java.lang.Object r7 = r0.f188981a
            java.util.List r7 = (java.util.List) r7
            kotlin.C4885d0.n(r8)
            goto L7c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f188981a
            java.util.List r7 = (java.util.List) r7
            kotlin.C4885d0.n(r8)
            goto L5c
        L3f:
            kotlin.C4885d0.n(r8)
            kotlinx.coroutines.flow.j<com.prism.lib_google_billing.BillingClientWrap$b> r8 = r6.f188943f
            r8.setValue(r4)
            com.android.billingclient.api.BillingClient r8 = r6.f188939b
            if (r8 == 0) goto L9e
            int r8 = r8.i()
            if (r8 == r5) goto L71
            r0.f188981a = r7
            r0.f188984d = r3
            java.lang.Object r8 = r6.o(r0)
            if (r8 != r1) goto L5c
            goto L7b
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L65
            goto L71
        L65:
            java.lang.String r7 = com.prism.lib_google_billing.BillingClientWrap.f188935j
            java.lang.String r8 = "billingClient can not start a connection."
            int r7 = android.util.Log.d(r7, r8)
            Vc.a.f(r7)
            goto L9b
        L71:
            r0.f188981a = r4
            r0.f188984d = r5
            java.lang.Object r8 = r6.x(r7, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            java.util.List r8 = (java.util.List) r8
            java.lang.String r7 = com.prism.lib_google_billing.BillingClientWrap.f188935j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "purchasePlans: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r7, r0)
            kotlinx.coroutines.flow.j<com.prism.lib_google_billing.BillingClientWrap$b> r7 = r6.f188943f
            com.prism.lib_google_billing.BillingClientWrap$b r0 = new com.prism.lib_google_billing.BillingClientWrap$b
            r0.<init>(r8)
            r7.setValue(r0)
        L9b:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        L9e:
            java.lang.String r7 = "billingClient"
            kotlin.jvm.internal.G.S(r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib_google_billing.BillingClientWrap.A(java.util.List, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(java.util.List<java.lang.String> r17, kotlin.coroutines.e<? super java.util.List<com.prism.lib_google_billing.m>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib_google_billing.BillingClientWrap.B(java.util.List, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.prism.lib_google_billing.BillingClientWrap$refreshPurchase$1
            if (r0 == 0) goto L13
            r0 = r6
            com.prism.lib_google_billing.BillingClientWrap$refreshPurchase$1 r0 = (com.prism.lib_google_billing.BillingClientWrap$refreshPurchase$1) r0
            int r1 = r0.f188993c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188993c = r1
            goto L18
        L13:
            com.prism.lib_google_billing.BillingClientWrap$refreshPurchase$1 r0 = new com.prism.lib_google_billing.BillingClientWrap$refreshPurchase$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f188991a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f188993c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            kotlin.C4885d0.n(r6)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.C4885d0.n(r6)
            goto L4c
        L36:
            kotlin.C4885d0.n(r6)
            com.android.billingclient.api.BillingClient r6 = r5.f188939b
            if (r6 == 0) goto L65
            int r6 = r6.i()
            if (r6 == r4) goto L54
            r0.f188993c = r3
            java.lang.Object r6 = r5.o(r0)
            if (r6 != r1) goto L4c
            goto L5c
        L4c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L62
        L54:
            r0.f188993c = r4
            java.lang.Object r6 = r5.z(r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            java.util.List r6 = (java.util.List) r6
            r5.G(r6)
        L62:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L65:
            java.lang.String r6 = "billingClient"
            kotlin.jvm.internal.G.S(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib_google_billing.BillingClientWrap.C(kotlin.coroutines.e):java.lang.Object");
    }

    public final void D(@NotNull c.a factory, @NotNull Context context) {
        G.p(factory, "factory");
        G.p(context, "context");
        com.prism.lib_google_billing.a.f189044c.getClass();
        com.prism.lib_google_billing.a.f189045d.g(factory, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v8, types: [T, com.android.billingclient.api.BillingFlowParams, java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(@org.jetbrains.annotations.NotNull android.app.Activity r12, @org.jetbrains.annotations.NotNull com.prism.lib_google_billing.m r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib_google_billing.BillingClientWrap.E(android.app.Activity, com.prism.lib_google_billing.m, kotlin.coroutines.e):java.lang.Object");
    }

    public final void F(List<? extends C2983c0> list) {
        SharedPreferences sharedPreferences = this.f188940c;
        if (sharedPreferences == null) {
            G.S("preferences");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        List<? extends C2983c0> list2 = list;
        editorEdit.putBoolean(f188936k, !(list2 == null || list2.isEmpty()));
        editorEdit.commit();
    }

    public final void G(List<? extends C2983c0> list) {
        Log.d(f188935j, "purchaseList: " + list);
        List<? extends C2983c0> list2 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C2983c0 c2983c0 = (C2983c0) obj;
                List<String> listB = q.b();
                if (!(listB instanceof Collection) || !listB.isEmpty()) {
                    Iterator<T> it = listB.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ArrayList) c2983c0.g()).contains((String) it.next())) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList.get(i11);
                i11++;
                if (((C2983c0) obj2).h() == 1) {
                    arrayList2.add(obj2);
                }
            }
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                C2983c0 c2983c02 = (C2983c0) obj3;
                if (!c2983c02.n()) {
                    AcknowledgePurchaseParams acknowledgePurchaseParamsBuild = AcknowledgePurchaseParams.b().setPurchaseToken(c2983c02.j()).build();
                    G.o(acknowledgePurchaseParamsBuild, "build(...)");
                    BillingClient billingClient = this.f188939b;
                    if (billingClient == null) {
                        G.S("billingClient");
                        throw null;
                    }
                    billingClient.a(acknowledgePurchaseParamsBuild, new com.prism.lib_google_billing.c());
                }
                Log.d(f188935j, "valid purchased: " + c2983c02.g() + ", purchaseState: " + c2983c02.h());
            }
            list2 = arrayList2;
        }
        this.f188941d.getValue();
        Log.d(f188935j, "filterdRecords: " + list2);
        this.f188941d.setValue(new d(list2));
        F(list2);
    }

    public final String n(Y y10, Y.b bVar, int i10) {
        return U.r3(B.lb(new String[]{y10.f136586c, bVar.f136602f, bVar.f136601e, bVar.f136600d, String.valueOf(i10)}), com.prism.gaia.server.accounts.b.f166434b0, null, null, 0, null, null, 62, null);
    }

    public final Object o(kotlin.coroutines.e<? super Boolean> eVar) throws Throwable {
        final kotlin.coroutines.l lVar = new kotlin.coroutines.l(IntrinsicsKt__IntrinsicsJvmKt.e(eVar));
        BillingClient billingClient = this.f188939b;
        if (billingClient == null) {
            G.S("billingClient");
            throw null;
        }
        if (billingClient.i() == 1) {
            Log.d(f188935j, "connecting to billing server .. .. ..");
            lVar.resumeWith(Boolean.FALSE);
        } else {
            BillingClient billingClient2 = this.f188939b;
            if (billingClient2 == null) {
                G.S("billingClient");
                throw null;
            }
            billingClient2.x(new InterfaceC3065x() { // from class: com.prism.lib_google_billing.BillingClientWrap$connectBilling$2$1
                @Override // com.android.billingclient.api.InterfaceC3065x
                public void onBillingServiceDisconnected() {
                    BillingClientWrap.f188934i.getClass();
                    Log.d(BillingClientWrap.f188935j, "onBillingServiceDisconnected");
                }

                @Override // com.android.billingclient.api.InterfaceC3065x
                public void onBillingSetupFinished(BillingResult billingResult) {
                    G.p(billingResult, "billingResult");
                    BillingClientWrap.f188934i.getClass();
                    Log.d(BillingClientWrap.f188935j, "startConnection, response: " + billingResult.f136358a + U6.j.f68738d + billingResult.f136360c);
                    if (billingResult.f136358a != 0) {
                        billingResult = null;
                    }
                    if (billingResult == null) {
                        lVar.resumeWith(Boolean.FALSE);
                        return;
                    }
                    kotlin.coroutines.e<Boolean> eVar2 = lVar;
                    C5092j.f(C5110s0.f220641a, null, null, new BillingClientWrap$connectBilling$2$1$onBillingSetupFinished$2$1(this, null), 3, null);
                    eVar2.resumeWith(Boolean.TRUE);
                }
            });
        }
        Object objA = lVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objA;
    }

    public final kotlinx.coroutines.flow.e<Boolean> p(SharedPreferences sharedPreferences, String str) {
        return kotlinx.coroutines.flow.h.d(FlowKt__BuildersKt.k(new BillingClientWrap$getBoolFlowForKey$1(sharedPreferences, str, null)), Integer.MAX_VALUE, null, 2, null);
    }

    @NotNull
    public final Context q() {
        return this.f188938a;
    }

    @NotNull
    public final kotlinx.coroutines.flow.e<b> r() {
        return this.f188944g;
    }

    @NotNull
    public final kotlinx.coroutines.flow.e<d> s() {
        return this.f188942e;
    }

    public final boolean t() {
        String str = f188935j;
        SharedPreferences sharedPreferences = this.f188940c;
        if (sharedPreferences == null) {
            G.S("preferences");
            throw null;
        }
        Log.d(str, "NO_ADS_KEY: " + sharedPreferences.getBoolean(f188936k, false));
        SharedPreferences sharedPreferences2 = this.f188940c;
        if (sharedPreferences2 == null) {
            G.S("preferences");
            throw null;
        }
        boolean z10 = sharedPreferences2.getBoolean(f188936k, false);
        C5092j.f(C5110s0.f220641a, null, null, new BillingClientWrap$hasNoAds$1(this, null), 3, null);
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(java.util.List<java.lang.String> r17, kotlin.coroutines.e<? super java.util.List<com.prism.lib_google_billing.m>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib_google_billing.BillingClientWrap.v(java.util.List, kotlin.coroutines.e):java.lang.Object");
    }

    public final Object w(QueryProductDetailsParams queryProductDetailsParams, kotlin.coroutines.e<? super c> eVar) throws Throwable {
        kotlin.coroutines.l lVar = new kotlin.coroutines.l(IntrinsicsKt__IntrinsicsJvmKt.e(eVar));
        BillingClient billingClient = this.f188939b;
        if (billingClient == null) {
            G.S("billingClient");
            throw null;
        }
        billingClient.r(queryProductDetailsParams, new e(lVar));
        Object objA = lVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(java.util.List<java.lang.String> r6, kotlin.coroutines.e<? super java.util.List<com.prism.lib_google_billing.m>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.prism.lib_google_billing.BillingClientWrap$queryProductOfferDetails$1
            if (r0 == 0) goto L13
            r0 = r7
            com.prism.lib_google_billing.BillingClientWrap$queryProductOfferDetails$1 r0 = (com.prism.lib_google_billing.BillingClientWrap$queryProductOfferDetails$1) r0
            int r1 = r0.f188976f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188976f = r1
            goto L18
        L13:
            com.prism.lib_google_billing.BillingClientWrap$queryProductOfferDetails$1 r0 = new com.prism.lib_google_billing.BillingClientWrap$queryProductOfferDetails$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f188974d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f188976f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f188973c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r1 = r0.f188972b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r0 = r0.f188971a
            java.util.List r0 = (java.util.List) r0
            kotlin.C4885d0.n(r7)
            goto L6d
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.f188971a
            java.util.List r6 = (java.util.List) r6
            kotlin.C4885d0.n(r7)
            goto L54
        L46:
            kotlin.C4885d0.n(r7)
            r0.f188971a = r6
            r0.f188976f = r4
            java.lang.Object r7 = r5.v(r6, r0)
            if (r7 != r1) goto L54
            goto L6a
        L54:
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            r7 = 0
            r0.f188971a = r7
            r0.f188972b = r2
            r0.f188973c = r2
            r0.f188976f = r3
            java.lang.Object r7 = r5.B(r6, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r6 = r2
            r1 = r6
        L6d:
            java.util.Collection r7 = (java.util.Collection) r7
            r6.addAll(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib_google_billing.BillingClientWrap.x(java.util.List, kotlin.coroutines.e):java.lang.Object");
    }

    public final Object y(String str, kotlin.coroutines.e<? super List<? extends C2983c0>> eVar) throws Throwable {
        kotlin.coroutines.l lVar = new kotlin.coroutines.l(IntrinsicsKt__IntrinsicsJvmKt.e(eVar));
        QueryPurchasesParams.Builder productType = QueryPurchasesParams.b().setProductType(str);
        G.o(productType, "setProductType(...)");
        BillingClient billingClient = this.f188939b;
        if (billingClient == null) {
            G.S("billingClient");
            throw null;
        }
        billingClient.s(productType.build(), new f(str, lVar));
        Object objA = lVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(kotlin.coroutines.e<? super java.util.List<? extends com.android.billingclient.api.C2983c0>> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.prism.lib_google_billing.BillingClientWrap$queryPurchase$3
            if (r0 == 0) goto L13
            r0 = r7
            com.prism.lib_google_billing.BillingClientWrap$queryPurchase$3 r0 = (com.prism.lib_google_billing.BillingClientWrap$queryPurchase$3) r0
            int r1 = r0.f188980d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188980d = r1
            goto L18
        L13:
            com.prism.lib_google_billing.BillingClientWrap$queryPurchase$3 r0 = new com.prism.lib_google_billing.BillingClientWrap$queryPurchase$3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f188978b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f188980d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f188977a
            java.util.List r0 = (java.util.List) r0
            kotlin.C4885d0.n(r7)
            goto L5a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.C4885d0.n(r7)
            goto L48
        L3a:
            kotlin.C4885d0.n(r7)
            r0.f188980d = r4
            java.lang.String r7 = "subs"
            java.lang.Object r7 = r6.y(r7, r0)
            if (r7 != r1) goto L48
            goto L56
        L48:
            java.util.List r7 = (java.util.List) r7
            r0.f188977a = r7
            r0.f188980d = r3
            java.lang.String r2 = "inapp"
            java.lang.Object r0 = r6.y(r2, r0)
            if (r0 != r1) goto L57
        L56:
            return r1
        L57:
            r5 = r0
            r0 = r7
            r7 = r5
        L5a:
            java.util.List r7 = (java.util.List) r7
            if (r0 == 0) goto L6d
            if (r7 == 0) goto L6d
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r0 = (java.util.Collection) r0
            r1.<init>(r0)
            java.util.Collection r7 = (java.util.Collection) r7
            r1.addAll(r7)
            return r1
        L6d:
            if (r0 != 0) goto L72
            if (r7 == 0) goto L72
            return r7
        L72:
            if (r0 == 0) goto L77
            if (r7 != 0) goto L77
            return r0
        L77:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib_google_billing.BillingClientWrap.z(kotlin.coroutines.e):java.lang.Object");
    }
}
