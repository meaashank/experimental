package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final BillingResult f136518A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final BillingResult f136519B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final BillingResult f136520C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final BillingResult f136521D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final BillingResult f136522E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final BillingResult f136523F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final BillingResult f136524G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final BillingResult f136525H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final BillingResult f136526I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final BillingResult f136527J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final BillingResult f136528K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f136529L = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BillingResult f136530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BillingResult f136531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BillingResult f136532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BillingResult f136533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BillingResult f136534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BillingResult f136535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BillingResult f136536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BillingResult f136537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BillingResult f136538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BillingResult f136539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BillingResult f136540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BillingResult f136541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final BillingResult f136542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BillingResult f136543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final BillingResult f136544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final BillingResult f136545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BillingResult f136546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final BillingResult f136547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final BillingResult f136548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final BillingResult f136549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final BillingResult f136550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final BillingResult f136551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final BillingResult f136552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final BillingResult f136553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final BillingResult f136554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final BillingResult f136555z;

    static {
        BillingResult.Builder builderD = BillingResult.d();
        builderD.setResponseCode(3);
        builderD.setDebugMessage("Google Play In-app Billing API version is less than 3");
        builderD.build();
        BillingResult.Builder builderD2 = BillingResult.d();
        builderD2.setResponseCode(3);
        builderD2.setDebugMessage("Google Play In-app Billing API version is less than 9");
        f136530a = builderD2.build();
        f136531b = C3010j.a(3, "Billing service unavailable on device.");
        f136532c = C3010j.a(2, "Billing service unavailable on device.");
        f136533d = C3010j.a(5, "Client is already in the process of connecting to billing service.");
        BillingResult.Builder builderD3 = BillingResult.d();
        builderD3.setResponseCode(5);
        builderD3.setDebugMessage("The list of SKUs can't be empty.");
        builderD3.build();
        BillingResult.Builder builderD4 = BillingResult.d();
        builderD4.setResponseCode(5);
        builderD4.setDebugMessage("SKU type can't be empty.");
        builderD4.build();
        BillingResult.Builder builderD5 = BillingResult.d();
        builderD5.setResponseCode(5);
        builderD5.setDebugMessage("Product type can't be empty.");
        f136534e = builderD5.build();
        f136535f = C3010j.a(-2, "Client does not support extra params.");
        f136536g = C3010j.a(5, "Invalid purchase token.");
        f136537h = C3010j.a(6, "An internal error occurred.");
        BillingResult.Builder builderD6 = BillingResult.d();
        builderD6.setResponseCode(5);
        builderD6.setDebugMessage("SKU can't be null.");
        builderD6.build();
        BillingResult.Builder builderD7 = BillingResult.d();
        builderD7.setResponseCode(0);
        f136538i = builderD7.build();
        f136539j = C3010j.a(-1, "Service connection is disconnected.");
        f136540k = C3010j.a(2, "Timeout communicating with service.");
        f136541l = C3010j.a(-2, "Client does not support subscriptions.");
        f136542m = C3010j.a(-2, "Client does not support subscriptions update.");
        BillingResult.Builder builderD8 = BillingResult.d();
        builderD8.setResponseCode(-2);
        builderD8.setDebugMessage("Client does not support get purchase history.");
        builderD8.build();
        BillingResult.Builder builderD9 = BillingResult.d();
        builderD9.setResponseCode(-2);
        builderD9.setDebugMessage("Client does not support price change confirmation.");
        f136543n = builderD9.build();
        f136544o = C3010j.a(-2, "Play Store version installed does not support cross selling products.");
        f136545p = C3010j.a(-2, "Client does not support multi-item purchases.");
        f136546q = C3010j.a(-2, "Client does not support offer_id_token.");
        f136547r = C3010j.a(-2, "Play Store version installed does not support gift code purchase.");
        f136548s = C3010j.a(-2, "Client does not support ProductDetails.");
        BillingResult.Builder builderD10 = BillingResult.d();
        builderD10.setResponseCode(-2);
        builderD10.setDebugMessage("Client does not support launching subscription management action flow.");
        builderD10.build();
        BillingResult.Builder builderD11 = BillingResult.d();
        builderD11.setResponseCode(-2);
        builderD11.setDebugMessage("Client does not support in-app messages.");
        f136549t = builderD11.build();
        BillingResult.Builder builderD12 = BillingResult.d();
        builderD12.setResponseCode(-2);
        builderD12.setDebugMessage("Client does not support user choice billing.");
        builderD12.build();
        BillingResult.Builder builderD13 = BillingResult.d();
        builderD13.setResponseCode(-2);
        builderD13.setDebugMessage("Play Store version installed does not support external offer.");
        f136550u = builderD13.build();
        f136551v = C3010j.a(-2, "Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f136552w = C3010j.a(-2, "Play Store version installed does not support querying AutoPay plan purchase.");
        f136553x = C3010j.a(-2, "Play Store version installed does not support including suspended subscriptions.");
        f136554y = C3010j.a(5, "Unknown feature");
        f136555z = C3010j.a(-2, "Play Store version installed does not support get billing config.");
        f136518A = C3010j.a(-2, "Query product details with serialized docid is not supported.");
        BillingResult.Builder builderD14 = BillingResult.d();
        builderD14.setResponseCode(-2);
        builderD14.setDebugMessage("Play Store version installed does not support launching external offer flow.");
        builderD14.build();
        BillingResult.Builder builderD15 = BillingResult.d();
        builderD15.setResponseCode(4);
        builderD15.setDebugMessage("Item is unavailable for purchase.");
        f136519B = builderD15.build();
        f136520C = C3010j.a(-2, "Query product details with developer specified account is not supported.");
        f136521D = C3010j.a(-2, "Play Store version installed does not support alternative billing only.");
        f136522E = C3010j.a(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f136523F = C3010j.a(6, "An error occurred while retrieving billing override.");
        f136524G = C3010j.a(-2, "Play Store version installed does not support the provided billing program.");
        f136525H = C3010j.a(-2, "Play Store version installed does not support launching external links.");
        f136526I = C3010j.a(5, "A DeveloperProvidedBillingListener must be provided when initializing the BillingClient in order to use multiple payment options for this billing program.");
        BillingResult.Builder builderD16 = BillingResult.d();
        builderD16.setResponseCode(5);
        builderD16.setDebugMessage("A listener must be provided calling this method.");
        builderD16.build();
        BillingResult.Builder builderD17 = BillingResult.d();
        builderD17.setResponseCode(-2);
        builderD17.setDebugMessage("Play Store version installed does not support show billing program information dialog.");
        f136527J = builderD17.build();
        f136528K = C3010j.a(-2, "Play Store version installed does not support get billing choice info.");
    }

    public static BillingResult a(int i10, String str) {
        return C3010j.a(i10, str);
    }
}
