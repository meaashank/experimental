package com.cookiegames.smartcookie.browser;

import C4.j;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.cookiegames.smartcookie.search.C3131a;
import com.cookiegames.smartcookie.view.C3230b;
import com.cookiegames.smartcookie.view.C3232d;
import com.cookiegames.smartcookie.view.C3233e;
import com.cookiegames.smartcookie.view.C3235g;
import com.cookiegames.smartcookie.view.C3237i;
import com.cookiegames.smartcookie.view.C3241m;
import com.cookiegames.smartcookie.view.SmartCookieView;
import com.cookiegames.smartcookie.view.r0;
import com.cookiegames.smartcookie.view.s0;
import ed.InterfaceC4376a;
import hc.H;
import hc.I;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.L0;
import kotlin.collections.C4858c0;
import kotlin.collections.C4860d0;
import kotlin.collections.C4862e0;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.U;
import kotlin.collections.z0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import kotlin.text.M;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p4.InterfaceC5390c;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nTabsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabsManager.kt\ncom/cookiegames/smartcookie/browser/TabsManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,469:1\n1855#2,2:470\n1855#2,2:473\n1855#2,2:475\n1855#2,2:477\n766#2:479\n857#2,2:480\n1855#2,2:482\n288#2,2:484\n766#2:486\n857#2,2:487\n1603#2,9:489\n1855#2:498\n1856#2:500\n1612#2:501\n1#3:472\n1#3:499\n*S KotlinDebug\n*F\n+ 1 TabsManager.kt\ncom/cookiegames/smartcookie/browser/TabsManager\n*L\n201#1:470,2\n279#1:473,2\n310#1:475,2\n359#1:477,2\n379#1:479\n379#1:480,2\n381#1:482,2\n436#1:484,2\n410#1:486\n410#1:487,2\n411#1:489,9\n411#1:498\n411#1:500\n411#1:501\n411#1:499\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final a f140738r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f140739s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f140740t = "TabsManager";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f140741u = "WEBVIEW_";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f140742v = "URL_KEY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f140743w = "SAVED_TABS.parcel";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f140744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3131a f140745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final H f140746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final H f140747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final H f140748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C3237i f140749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C3241m f140750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final C3230b f140751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C3235g f140752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C3233e f140753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final InterfaceC5390c f140754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final u4.e f140755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayList<SmartCookieView> f140756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public SmartCookieView f140757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public Set<? extends ed.l<? super Integer, L0>> f140758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f140759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public List<? extends InterfaceC4376a<L0>> f140760q;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public C(@NotNull Application application, @NotNull C3131a searchEngineProvider, @NotNull H databaseScheduler, @NotNull H diskScheduler, @NotNull H mainScheduler, @NotNull C3237i homePageInitializer, @NotNull C3241m incognitoPageInitializer, @NotNull C3230b bookmarkPageInitializer, @NotNull C3235g historyPageInitializer, @NotNull C3233e downloadPageInitializer, @NotNull InterfaceC5390c logger, @NotNull u4.e userPreferences) {
        G.p(application, "application");
        G.p(searchEngineProvider, "searchEngineProvider");
        G.p(databaseScheduler, "databaseScheduler");
        G.p(diskScheduler, "diskScheduler");
        G.p(mainScheduler, "mainScheduler");
        G.p(homePageInitializer, "homePageInitializer");
        G.p(incognitoPageInitializer, "incognitoPageInitializer");
        G.p(bookmarkPageInitializer, "bookmarkPageInitializer");
        G.p(historyPageInitializer, "historyPageInitializer");
        G.p(downloadPageInitializer, "downloadPageInitializer");
        G.p(logger, "logger");
        G.p(userPreferences, "userPreferences");
        this.f140744a = application;
        this.f140745b = searchEngineProvider;
        this.f140746c = databaseScheduler;
        this.f140747d = diskScheduler;
        this.f140748e = mainScheduler;
        this.f140749f = homePageInitializer;
        this.f140750g = incognitoPageInitializer;
        this.f140751h = bookmarkPageInitializer;
        this.f140752i = historyPageInitializer;
        this.f140753j = downloadPageInitializer;
        this.f140754k = logger;
        this.f140755l = userPreferences;
        this.f140756m = new ArrayList<>();
        this.f140758o = EmptySet.f217512a;
        this.f140760q = EmptyList.f217510a;
    }

    public static final r0 F(String str, C c10) {
        return str != null ? new s0(str) : c10.f140750g;
    }

    public static final r0 H(String str, Activity activity, C c10) {
        if (str != null) {
            return URLUtil.isFileUrl(str) ? new com.cookiegames.smartcookie.view.r(str, activity, c10.f140749f) : new s0(str);
        }
        return null;
    }

    public static final L0 J(C c10, C4.j jVar) {
        c10.k0();
        return L0.f217464a;
    }

    public static final void K(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final hc.E L(boolean z10, C c10, Activity activity, C4.j it) {
        G.p(it, "it");
        return z10 ? c10.E((String) C4.k.a(it)) : c10.G((String) C4.k.a(it), activity);
    }

    public static final hc.E M(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (hc.E) lVar.invoke(p02);
    }

    public static final SmartCookieView N(C c10, Activity activity, boolean z10, r0 it) {
        G.p(it, "it");
        return c10.U(activity, it, z10);
    }

    public static final SmartCookieView O(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (SmartCookieView) lVar.invoke(p02);
    }

    public static final L0 P(C c10, SmartCookieView smartCookieView) {
        c10.x();
        return L0.f217464a;
    }

    public static final void Q(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final Bundle Z(C c10) {
        return C4.e.g(c10.f140744a, f140743w);
    }

    public static final Iterable a0(Bundle bundle) {
        int i10;
        G.p(bundle, "bundle");
        Set<String> setKeySet = bundle.keySet();
        G.o(setKeySet, "keySet(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setKeySet.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            G.m(str);
            if (F.L2(str, f140741u, false, 2, null)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bundle bundle2 = bundle.getBundle((String) obj);
            if (bundle2 != null) {
                arrayList2.add(bundle2);
            }
        }
        return arrayList2;
    }

    public static final Iterable b0(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (Iterable) lVar.invoke(p02);
    }

    public static final L0 c0(C c10, Bundle bundle) {
        c10.f140754k.log(f140740t, "Restoring previous WebView state now");
        return L0.f217464a;
    }

    public static L0 d(C c10, SmartCookieView smartCookieView) {
        c10.x();
        return L0.f217464a;
    }

    public static final void d0(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final r0 g0(C c10, Bundle bundle) {
        G.p(bundle, "bundle");
        String string = bundle.getString(f140742v);
        if (string != null) {
            r0 r0Var = C4.s.a(string) ? c10.f140751h : C4.s.b(string) ? c10.f140753j : (!C4.s.e(string) && C4.s.c(string)) ? c10.f140752i : c10.f140749f;
            if (r0Var != null) {
                return r0Var;
            }
        }
        return new C3232d(bundle);
    }

    public static final r0 h0(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (r0) lVar.invoke(p02);
    }

    public static void k(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static void n(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static L0 p(C c10, C4.j jVar) {
        c10.k0();
        return L0.f217464a;
    }

    public static void q(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @Nullable
    public final SmartCookieView A(int i10) {
        if (i10 < 0 || i10 >= this.f140756m.size()) {
            return null;
        }
        return this.f140756m.get(i10);
    }

    @Nullable
    public final SmartCookieView B(int i10) {
        SmartCookieView smartCookieView;
        ArrayList<SmartCookieView> arrayList = this.f140756m;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                smartCookieView = null;
                break;
            }
            smartCookieView = arrayList.get(i11);
            i11++;
            WebView webView = smartCookieView.f148346k;
            if (webView != null && webView.hashCode() == i10) {
                break;
            }
        }
        return smartCookieView;
    }

    public final int C() {
        return U.i3(this.f140756m, this.f140757n);
    }

    public final int D(@NotNull SmartCookieView tab) {
        G.p(tab, "tab");
        return this.f140756m.indexOf(tab);
    }

    public final hc.z<r0> E(final String str) {
        hc.z<r0> zVarE2 = hc.z.E2(new Callable() { // from class: com.cookiegames.smartcookie.browser.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.F(str, this);
            }
        });
        G.o(zVarE2, "fromCallable(...)");
        return zVarE2;
    }

    public final hc.z<r0> G(final String str, final Activity activity) {
        hc.z<r0> zVarQ1 = f0().h1(hc.q.k0(new Callable() { // from class: com.cookiegames.smartcookie.browser.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.H(str, activity, this);
            }
        })).q1(this.f140749f);
        G.o(zVarQ1, "defaultIfEmpty(...)");
        return zVarQ1;
    }

    @NotNull
    public final I<SmartCookieView> I(@NotNull final Activity activity, @Nullable Intent intent, final boolean z10) {
        G.p(activity, "activity");
        j.a aVar = C4.j.f17556a;
        String dataString = null;
        if (G.g(intent != null ? intent.getAction() : null, "android.intent.action.WEB_SEARCH")) {
            dataString = w(intent);
        } else if (intent != null) {
            dataString = intent.getDataString();
        }
        I iO0 = I.o0(aVar.a(dataString));
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.browser.l
            @Override // ed.l
            public final Object invoke(Object obj) {
                this.f141033a.k0();
                return L0.f217464a;
            }
        };
        I iE0 = iO0.T(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.browser.t
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        }).Z0(this.f140748e).E0(this.f140746c);
        final ed.l lVar2 = new ed.l() { // from class: com.cookiegames.smartcookie.browser.u
            @Override // ed.l
            public final Object invoke(Object obj) {
                return C.L(z10, this, activity, (C4.j) obj);
            }
        };
        hc.z zVarV3 = iE0.b0(new nc.o() { // from class: com.cookiegames.smartcookie.browser.v
            @Override // nc.o
            public final Object apply(Object obj) {
                return C.M(lVar2, obj);
            }
        }).V3(this.f140748e);
        final ed.l lVar3 = new ed.l() { // from class: com.cookiegames.smartcookie.browser.w
            @Override // ed.l
            public final Object invoke(Object obj) {
                return C.N(this.f141067a, activity, z10, (r0) obj);
            }
        };
        I iS3 = zVarV3.u3(new nc.o() { // from class: com.cookiegames.smartcookie.browser.x
            @Override // nc.o
            public final Object apply(Object obj) {
                return C.O(lVar3, obj);
            }
        }).s3();
        final ed.l lVar4 = new ed.l() { // from class: com.cookiegames.smartcookie.browser.y
            @Override // ed.l
            public final Object invoke(Object obj) {
                this.f141071a.x();
                return L0.f217464a;
            }
        };
        I<SmartCookieView> iM = iS3.M(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.browser.z
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                lVar4.invoke(obj);
            }
        });
        G.o(iM, "doAfterSuccess(...)");
        return iM;
    }

    public final int R() {
        return this.f140756m.size() - 1;
    }

    @Nullable
    public final SmartCookieView S() {
        return (SmartCookieView) U.A3(this.f140756m);
    }

    public final void T(int i10, int i11) {
        SmartCookieView smartCookieView = this.f140756m.get(i10);
        G.o(smartCookieView, "get(...)");
        this.f140756m.remove(i10);
        this.f140756m.add(i11, smartCookieView);
    }

    @NotNull
    public final SmartCookieView U(@NotNull Activity activity, @NotNull r0 tabInitializer, boolean z10) {
        G.p(activity, "activity");
        G.p(tabInitializer, "tabInitializer");
        this.f140754k.log(f140740t, "New tab");
        SmartCookieView smartCookieView = new SmartCookieView(activity, tabInitializer, z10, this.f140749f, this.f140750g, this.f140751h, this.f140753j, this.f140752i, this.f140754k);
        this.f140756m.add(smartCookieView);
        Iterator<T> it = this.f140758o.iterator();
        while (it.hasNext()) {
            ((ed.l) it.next()).invoke(Integer.valueOf(this.f140756m.size()));
        }
        return smartCookieView;
    }

    @NotNull
    public final SmartCookieView V(@NotNull Activity activity, @NotNull r0 tabInitializer, boolean z10, int i10) {
        G.p(activity, "activity");
        G.p(tabInitializer, "tabInitializer");
        this.f140754k.log(f140740t, "New tab");
        SmartCookieView smartCookieView = new SmartCookieView(activity, tabInitializer, z10, this.f140749f, this.f140750g, this.f140751h, this.f140753j, this.f140752i, this.f140754k);
        this.f140756m.add(i10, smartCookieView);
        Iterator<T> it = this.f140758o.iterator();
        while (it.hasNext()) {
            ((ed.l) it.next()).invoke(Integer.valueOf(this.f140756m.size()));
        }
        return smartCookieView;
    }

    public final void W() {
        SmartCookieView smartCookieView = this.f140757n;
        if (smartCookieView != null) {
            smartCookieView.e0();
        }
        ArrayList<SmartCookieView> arrayList = this.f140756m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            SmartCookieView smartCookieView2 = arrayList.get(i10);
            i10++;
            smartCookieView2.c0();
        }
    }

    public final int X(@Nullable SmartCookieView smartCookieView) {
        return U.i3(this.f140756m, smartCookieView);
    }

    public final hc.z<Bundle> Y() {
        hc.q qVarK0 = hc.q.k0(new Callable() { // from class: com.cookiegames.smartcookie.browser.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.Z(this.f141034a);
            }
        });
        final n nVar = new n();
        hc.z zVarI0 = qVarK0.i0(new nc.o() { // from class: com.cookiegames.smartcookie.browser.o
            @Override // nc.o
            public final Object apply(Object obj) {
                return C.b0(nVar, obj);
            }
        });
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.browser.p
            @Override // ed.l
            public final Object invoke(Object obj) {
                return C.c0(this.f141036a, (Bundle) obj);
            }
        };
        InterfaceC5271g interfaceC5271g = new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.browser.q
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        };
        InterfaceC5271g<? super Throwable> interfaceC5271g2 = Functions.f202950d;
        InterfaceC5265a interfaceC5265a = Functions.f202949c;
        hc.z<Bundle> zVarP1 = zVarI0.P1(interfaceC5271g, interfaceC5271g2, interfaceC5265a, interfaceC5265a);
        G.o(zVarP1, "doOnNext(...)");
        return zVarP1;
    }

    public final void e0(int i10) {
        if (i10 >= this.f140756m.size()) {
            return;
        }
        SmartCookieView smartCookieViewRemove = this.f140756m.remove(i10);
        G.o(smartCookieViewRemove, "removeAt(...)");
        SmartCookieView smartCookieView = smartCookieViewRemove;
        if (G.g(this.f140757n, smartCookieView)) {
            this.f140757n = null;
        }
        smartCookieView.b0();
    }

    public final hc.z<r0> f0() {
        hc.z<Bundle> zVarY = Y();
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.browser.A
            @Override // ed.l
            public final Object invoke(Object obj) {
                return C.g0(this.f140719a, (Bundle) obj);
            }
        };
        hc.z zVarU3 = zVarY.u3(new nc.o() { // from class: com.cookiegames.smartcookie.browser.B
            @Override // nc.o
            public final Object apply(Object obj) {
                return C.h0(lVar, obj);
            }
        });
        G.o(zVarU3, "map(...)");
        return zVarU3;
    }

    public final void i0() {
        SmartCookieView smartCookieView = this.f140757n;
        if (smartCookieView != null) {
            smartCookieView.i0();
        }
        Iterator<SmartCookieView> it = this.f140756m.iterator();
        G.o(it, "iterator(...)");
        while (it.hasNext()) {
            SmartCookieView next = it.next();
            G.o(next, "next(...)");
            SmartCookieView smartCookieView2 = next;
            smartCookieView2.d0();
            smartCookieView2.N();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0() {
        Bundle bundle = new Bundle(ClassLoader.getSystemClassLoader());
        this.f140754k.log(f140740t, "Saving tab state");
        ArrayList<SmartCookieView> arrayList = this.f140756m;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            SmartCookieView smartCookieView = arrayList.get(i10);
            i10++;
            if (!M.Q3(smartCookieView.H())) {
                arrayList2.add(smartCookieView);
            }
        }
        Iterator it = ((C4860d0) U.m6(arrayList2)).iterator();
        while (true) {
            C4862e0 c4862e0 = (C4862e0) it;
            if (!c4862e0.f217613a.hasNext()) {
                C4.e.h(this.f140744a, bundle, f140743w).G0(this.f140747d).C0();
                return;
            }
            C4858c0 c4858c0B = c4862e0.next();
            int i11 = c4858c0B.f217601a;
            SmartCookieView smartCookieView2 = (SmartCookieView) c4858c0B.f217602b;
            if (C4.s.d(smartCookieView2.H())) {
                String strA = android.support.v4.media.c.a(f140741u, i11);
                Bundle bundle2 = new Bundle();
                bundle2.putString(f140742v, smartCookieView2.H());
                bundle.putBundle(strA, bundle2);
            } else {
                bundle.putBundle(android.support.v4.media.c.a(f140741u, i11), smartCookieView2.j0());
            }
        }
    }

    public final void k0() {
        int size = this.f140756m.size();
        for (int i10 = 0; i10 < size; i10++) {
            u(0);
        }
        this.f140759p = false;
        this.f140757n = null;
    }

    public final int l0() {
        return this.f140756m.size();
    }

    @Nullable
    public final SmartCookieView m0(int i10) {
        this.f140754k.log(f140740t, "switch to tab: " + i10);
        if (i10 < 0 || i10 >= this.f140756m.size()) {
            this.f140754k.log(f140740t, "Returning a null LightningView requested for position: " + i10);
            return null;
        }
        SmartCookieView smartCookieView = this.f140756m.get(i10);
        this.f140757n = smartCookieView;
        if (smartCookieView.f148345j.f148285a == null && smartCookieView.D() == null && !M.p3(smartCookieView.H(), ":///", false, 2, null) && !this.f140755l.b()) {
            smartCookieView.g0();
        }
        return smartCookieView;
    }

    public final void r(@NotNull ed.l<? super Integer, L0> listener) {
        G.p(listener, "listener");
        this.f140758o = z0.D(this.f140758o, listener);
    }

    public final void s() {
        this.f140760q = EmptyList.f217510a;
    }

    public final void t() {
        C4.e.c(this.f140744a, f140743w);
    }

    public final boolean u(int i10) {
        this.f140754k.log(f140740t, "Delete tab: " + i10);
        int iI3 = U.i3(this.f140756m, this.f140757n);
        if (iI3 == i10) {
            if (this.f140756m.size() == 1) {
                this.f140757n = null;
            } else if (iI3 < this.f140756m.size() - 1) {
                m0(iI3 + 1);
            } else {
                m0(iI3 - 1);
            }
        }
        e0(i10);
        Iterator<T> it = this.f140758o.iterator();
        while (it.hasNext()) {
            ((ed.l) it.next()).invoke(Integer.valueOf(this.f140756m.size()));
        }
        return iI3 == i10;
    }

    public final void v(@NotNull InterfaceC4376a<L0> runnable) {
        G.p(runnable, "runnable");
        if (this.f140759p) {
            runnable.invoke();
        } else {
            this.f140760q = U.J4(this.f140760q, runnable);
        }
    }

    @Nullable
    public final String w(@NotNull Intent intent) {
        G.p(intent, "intent");
        String stringExtra = intent.getStringExtra("query");
        String strA = androidx.compose.runtime.changelist.j.a(this.f140745b.c().f241094b, C4.s.f17585b);
        if (stringExtra == null || !(!M.Q3(stringExtra))) {
            return null;
        }
        return C4.s.f(stringExtra, true, strA);
    }

    public final void x() {
        this.f140759p = true;
        Iterator<SmartCookieView> it = this.f140756m.iterator();
        G.o(it, "iterator(...)");
        while (it.hasNext()) {
            SmartCookieView next = it.next();
            G.o(next, "next(...)");
            SmartCookieView smartCookieView = next;
            if (!smartCookieView.f148351p && !this.f140755l.b()) {
                smartCookieView.D0();
            }
        }
        Iterator<? extends InterfaceC4376a<L0>> it2 = this.f140760q.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
    }

    @NotNull
    public final List<SmartCookieView> y() {
        return this.f140756m;
    }

    @Nullable
    public final SmartCookieView z() {
        return this.f140757n;
    }
}
