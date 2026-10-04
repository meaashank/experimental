package com.cookiegames.smartcookie.adblock.allowlist;

import android.net.Uri;
import androidx.compose.runtime.internal.r;
import ed.l;
import hc.H;
import hc.I;
import hc.InterfaceC4527g;
import hc.q;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.L0;
import kotlin.collections.J;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import nc.o;
import org.jetbrains.annotations.NotNull;
import p4.InterfaceC5390c;
import uc.C5666a;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nSessionAllowListModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionAllowListModel.kt\ncom/cookiegames/smartcookie/adblock/allowlist/SessionAllowListModel\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n29#2:74\n29#2:76\n29#2:77\n1#3:75\n1549#4:78\n1620#4,3:79\n*S KotlinDebug\n*F\n+ 1 SessionAllowListModel.kt\ncom/cookiegames/smartcookie/adblock/allowlist/SessionAllowListModel\n*L\n34#1:74\n37#1:76\n58#1:77\n28#1:78\n28#1:79,3\n*E\n"})
@r(parameters = 0)
@Singleton
public final class SessionAllowListModel implements com.cookiegames.smartcookie.adblock.allowlist.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f140693e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f140694f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f140695g = "SessionAllowListModel";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final V3.h f140696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final H f140697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC5390c f140698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public HashSet<String> f140699d;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public SessionAllowListModel(@NotNull V3.h adBlockAllowListModel, @NotNull H ioScheduler, @NotNull InterfaceC5390c logger) {
        G.p(adBlockAllowListModel, "adBlockAllowListModel");
        G.p(ioScheduler, "ioScheduler");
        G.p(logger, "logger");
        this.f140696a = adBlockAllowListModel;
        this.f140697b = ioScheduler;
        this.f140698c = logger;
        this.f140699d = new HashSet<>();
        I<List<V3.i>> iD = adBlockAllowListModel.d();
        final d dVar = new d();
        I iZ0 = iD.q0(new o() { // from class: com.cookiegames.smartcookie.adblock.allowlist.e
            @Override // nc.o
            public final Object apply(Object obj) {
                return SessionAllowListModel.n(dVar, obj);
            }
        }).Z0(ioScheduler);
        final l lVar = new l() { // from class: com.cookiegames.smartcookie.adblock.allowlist.f
            @Override // ed.l
            public final Object invoke(Object obj) {
                return SessionAllowListModel.o(this.f140703a, (HashSet) obj);
            }
        };
        iZ0.X0(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.adblock.allowlist.g
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        }, Functions.f202952f);
    }

    public static void f(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final HashSet m(List it) {
        G.p(it, "it");
        List list = it;
        ArrayList arrayList = new ArrayList(J.d0(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((V3.i) it2.next()).f74613a);
        }
        return U.Y5(arrayList);
    }

    public static final HashSet n(l lVar, Object p02) {
        G.p(p02, "p0");
        return (HashSet) lVar.invoke(p02);
    }

    public static final L0 o(SessionAllowListModel sessionAllowListModel, HashSet hashSet) {
        G.m(hashSet);
        sessionAllowListModel.f140699d = hashSet;
        return L0.f217464a;
    }

    public static final void p(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final InterfaceC4527g q(SessionAllowListModel sessionAllowListModel, String str, Boolean it) {
        G.p(it, "it");
        return it.booleanValue() ? sessionAllowListModel.f140696a.e(new V3.i(str, System.currentTimeMillis())) : C5666a.O(io.reactivex.internal.operators.completable.f.f203136a);
    }

    public static final InterfaceC4527g r(l lVar, Object p02) {
        G.p(p02, "p0");
        return (InterfaceC4527g) lVar.invoke(p02);
    }

    public static final void s(SessionAllowListModel sessionAllowListModel) {
        sessionAllowListModel.f140698c.log(f140695g, "whitelist item added to database");
    }

    public static final void t(SessionAllowListModel sessionAllowListModel) {
        sessionAllowListModel.f140698c.log(f140695g, "whitelist item removed from database");
    }

    public static final InterfaceC4527g u(l lVar, Object p02) {
        G.p(p02, "p0");
        return (InterfaceC4527g) lVar.invoke(p02);
    }

    @Override // com.cookiegames.smartcookie.adblock.allowlist.a
    public void a(@NotNull String url) {
        G.p(url, "url");
        String host = Uri.parse(url).getHost();
        if (host != null) {
            q<V3.i> qVarB = this.f140696a.b(host);
            final SessionAllowListModel$removeUrlFromAllowList$1$1 sessionAllowListModel$removeUrlFromAllowList$1$1 = new SessionAllowListModel$removeUrlFromAllowList$1$1(this.f140696a);
            qVarB.c0(new o() { // from class: com.cookiegames.smartcookie.adblock.allowlist.b
                @Override // nc.o
                public final Object apply(Object obj) {
                    return SessionAllowListModel.u(sessionAllowListModel$removeUrlFromAllowList$1$1, obj);
                }
            }).G0(this.f140697b).D0(new InterfaceC5265a() { // from class: com.cookiegames.smartcookie.adblock.allowlist.c
                @Override // nc.InterfaceC5265a
                public final void run() {
                    SessionAllowListModel.t(this.f140701a);
                }
            });
            this.f140699d.remove(host);
        }
    }

    @Override // com.cookiegames.smartcookie.adblock.allowlist.a
    public void b(@NotNull String url) {
        G.p(url, "url");
        final String host = Uri.parse(url).getHost();
        if (host != null) {
            I<Boolean> iS0 = this.f140696a.b(host).s0();
            final l lVar = new l() { // from class: com.cookiegames.smartcookie.adblock.allowlist.h
                @Override // ed.l
                public final Object invoke(Object obj) {
                    return SessionAllowListModel.q(this.f140705a, host, (Boolean) obj);
                }
            };
            iS0.Z(new o() { // from class: com.cookiegames.smartcookie.adblock.allowlist.i
                @Override // nc.o
                public final Object apply(Object obj) {
                    return SessionAllowListModel.r(lVar, obj);
                }
            }).G0(this.f140697b).D0(new InterfaceC5265a() { // from class: com.cookiegames.smartcookie.adblock.allowlist.j
                @Override // nc.InterfaceC5265a
                public final void run() {
                    SessionAllowListModel.s(this.f140708a);
                }
            });
            this.f140699d.add(host);
        }
    }

    @Override // com.cookiegames.smartcookie.adblock.allowlist.a
    public boolean c(@NotNull String url) {
        G.p(url, "url");
        String host = Uri.parse(url).getHost();
        if (host != null) {
            return this.f140699d.contains(host);
        }
        return false;
    }
}
