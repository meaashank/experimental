package com.mbridge.msdk.config.component.common.express;

import B0.C0922f;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.C3826a;
import com.mbridge.msdk.config.component.common.express.operator.C3827b;
import com.mbridge.msdk.config.component.common.express.operator.C3828c;
import com.mbridge.msdk.config.component.common.express.operator.h;
import com.mbridge.msdk.config.component.common.express.operator.i;
import com.mbridge.msdk.config.component.common.express.operator.j;
import com.mbridge.msdk.config.component.common.express.operator.k;
import com.mbridge.msdk.config.component.common.express.operator.l;
import com.mbridge.msdk.config.component.common.express.operator.m;
import com.mbridge.msdk.config.component.common.express.operator.n;
import com.mbridge.msdk.config.component.common.express.operator.o;
import com.mbridge.msdk.config.component.common.express.operator.p;
import com.mbridge.msdk.config.component.common.express.operator.q;
import com.mbridge.msdk.config.component.common.express.operator.r;
import com.mbridge.msdk.config.component.common.express.operator.s;
import com.mbridge.msdk.config.component.common.express.operator.t;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f154222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.d f154223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.e f154224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.g f154225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.f f154226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f154227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t f154228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f154229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f154230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f154231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C3827b f154232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j f154233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l f154234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C3828c f154235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final s f154236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k f154237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final q f154238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o f154239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i f154240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h f154241t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C3826a f154242u;

    public d() {
        com.mbridge.msdk.config.component.common.express.operator.parts.c cVar = new com.mbridge.msdk.config.component.common.express.operator.parts.c();
        this.f154222a = cVar;
        this.f154223b = new com.mbridge.msdk.config.component.common.express.operator.d(cVar);
        this.f154224c = new com.mbridge.msdk.config.component.common.express.operator.e(cVar);
        this.f154225d = new com.mbridge.msdk.config.component.common.express.operator.g(cVar);
        this.f154226e = new com.mbridge.msdk.config.component.common.express.operator.f(cVar);
        this.f154227f = new r(cVar);
        this.f154228g = new t(cVar);
        this.f154229h = new p(cVar);
        this.f154230i = new n(cVar);
        this.f154231j = new m(cVar);
        this.f154232k = new C3827b(cVar);
        this.f154233l = new j(cVar);
        this.f154234m = new l(cVar);
        this.f154235n = new C3828c(cVar);
        this.f154236o = new s(cVar);
        this.f154237p = new k();
        this.f154238q = new q(cVar);
        this.f154239r = new o(cVar);
        this.f154240s = new i(cVar);
        this.f154241t = new h(cVar);
        this.f154242u = new C3826a();
    }

    public Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
            return C0922f.a(str, 1, 1);
        }
        try {
            Object objA = new a().a(str).a(this, e.OTHER, aVar);
            return objA == null ? "" : objA;
        } catch (Exception e10) {
            q0.a("ExpressionOperator", "execute-e: " + e10.getMessage());
            return "";
        }
    }

    public Object a(Object obj, List<Object> list, String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        b bVar = new b();
        bVar.a(obj);
        bVar.a(list);
        bVar.a(str);
        return a(bVar, aVar);
    }

    private Object a(b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strB = bVar.b();
        Object objA = bVar.a();
        List<Object> listC = bVar.c();
        try {
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB = this.f154239r.b(strB, objA, listC, aVar);
            if (aVarB.b()) {
                return aVarB.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA = this.f154242u.a(strB, objA, listC, aVar);
            if (aVarA.b()) {
                return aVarA.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA2 = this.f154226e.a(strB, objA, listC);
            if (aVarA2.b()) {
                return aVarA2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA3 = this.f154225d.a(strB, objA, listC);
            if (aVarA3.b()) {
                return aVarA3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA4 = this.f154224c.a(strB, objA, listC);
            if (aVarA4.b()) {
                return aVarA4.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA5 = this.f154227f.a(strB, objA, listC);
            if (aVarA5.b()) {
                return aVarA5.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA6 = this.f154234m.a(strB, objA, listC);
            if (aVarA6.b()) {
                return aVarA6.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA7 = this.f154230i.a(strB, objA, listC);
            if (aVarA7.b()) {
                return aVarA7.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA8 = this.f154228g.a(strB, objA, listC);
            if (aVarA8.b()) {
                return aVarA8.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarI = this.f154229h.i(strB, objA, listC);
            if (aVarI.b()) {
                return aVarI.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB2 = this.f154231j.b(strB, objA, listC);
            if (aVarB2.b()) {
                return aVarB2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA9 = this.f154232k.a(strB, objA, listC);
            if (aVarA9.b()) {
                return aVarA9.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA10 = this.f154236o.a(strB, objA, listC);
            if (aVarA10.b()) {
                return aVarA10.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA11 = this.f154238q.a(strB, objA, listC);
            if (aVarA11.b()) {
                return aVarA11.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB3 = this.f154237p.b(strB, objA, listC);
            if (aVarB3.b()) {
                return aVarB3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA12 = this.f154223b.a(strB, objA, listC);
            if (aVarA12.b()) {
                return aVarA12.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA13 = this.f154240s.a(strB, objA, listC);
            if (aVarA13.b()) {
                return aVarA13.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA14 = this.f154241t.a(strB, objA, listC);
            if (aVarA14.b()) {
                return aVarA14.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA15 = this.f154233l.a(strB, objA, listC);
            return aVarA15.b() ? aVarA15.a() : strB;
        } catch (Exception e10) {
            q0.b("ExpressionOperator", e10.getMessage(), e10);
            return null;
        }
    }
}
