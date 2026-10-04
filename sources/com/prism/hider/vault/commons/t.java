package com.prism.hider.vault.commons;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.prism.commons.utils.C3861z;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.u0;
import com.prism.commons.utils.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f173583e = "KEY_DISGUISE_COMPONET";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f173584f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f173585g = l0.b(t.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f173586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<q> f173587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M f173588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0<q, Context> f173589d = new u0<>(new a());

    public class a implements y0<q, Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C3861z<r6.j<String>, Void> f173590a = new C3861z<>(new s());

        public a() {
        }

        public static /* synthetic */ r6.j c(Void r42) {
            return new r6.j(D.f168597c.a(null), t.f173583e, "", (Class<String>) String.class);
        }

        public final q d(Context context) {
            String strH = this.f173590a.a(null).h(context);
            if ("".equals(strH)) {
                Iterator it = t.this.f173587b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    q qVar = (q) it.next();
                    if (qVar.g()) {
                        this.f173590a.a(null).n(context, qVar.a().getClassName());
                        break;
                    }
                }
                strH = this.f173590a.a(null).h(context);
            }
            if ("".equals(strH)) {
                return (q) t.this.f173587b.get(0);
            }
            for (q qVar2 : t.this.f173587b) {
                if (strH.equals(qVar2.a().getClassName())) {
                    return qVar2;
                }
            }
            return t.this.f173587b.get(0);
        }

        @Override // com.prism.commons.utils.w0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public q b(Context context) {
            return d(context);
        }

        @Override // com.prism.commons.utils.A0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(Context context, q qVar) {
            this.f173590a.a(null).n(context, qVar.a().getClassName());
        }
    }

    public t(Context context, q qVar, List<q> list, M m10) {
        this.f173586a = qVar;
        this.f173587b = list;
        this.f173588c = m10;
        if (j().g()) {
            return;
        }
        q qVarB = this.f173589d.b(context);
        PackageManager packageManager = context.getPackageManager();
        for (q qVar2 : list) {
            if (qVarB.equals(qVar2)) {
                if (!qVar2.g()) {
                    f(packageManager, qVar2);
                }
            } else if (qVar2.g()) {
                c(packageManager, qVar2);
            }
        }
    }

    public static t h(Context context, List<q> list, M m10) {
        ArrayList arrayList = new ArrayList();
        q qVar = null;
        for (q qVar2 : list) {
            if (qVar2.b() != 0) {
                arrayList.add(qVar2);
            } else {
                if (qVar != null) {
                    throw new IllegalStateException("only one origin entry is allowed");
                }
                qVar = qVar2;
            }
        }
        if (qVar == null) {
            throw new IllegalStateException("no origin entry found");
        }
        if (arrayList.size() == 0) {
            arrayList.add(qVar);
        }
        PackageManager packageManager = context.getPackageManager();
        Iterator<q> it = list.iterator();
        while (it.hasNext()) {
            n(packageManager, it.next());
        }
        Collections.sort(arrayList, new r());
        return new t(context, qVar, arrayList, m10);
    }

    public static void n(PackageManager packageManager, q qVar) {
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(qVar.a());
        boolean zF = componentEnabledSetting != 1 ? componentEnabledSetting == 0 ? qVar.f() : false : true;
        Log.d(f173585g, "updateEnableSetting vaultEntry:" + qVar.a() + " enable:" + zF + " state:" + componentEnabledSetting);
        qVar.j(zF);
    }

    public final void c(PackageManager packageManager, q qVar) {
        Log.d(f173585g, "disableVaultEntry:" + qVar.a());
        packageManager.setComponentEnabledSetting(qVar.a(), 2, 1);
        qVar.j(false);
    }

    public void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        q qVarG = g(context);
        c(packageManager, this.f173586a);
        Log.d(f173585g, "enableDisguiseEntry:" + qVarG.a());
        for (q qVar : this.f173587b) {
            if (!qVar.equals(qVarG)) {
                c(packageManager, qVar);
            }
        }
        f(packageManager, qVarG);
    }

    public void e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Iterator<q> it = this.f173587b.iterator();
        while (it.hasNext()) {
            c(packageManager, it.next());
        }
        f(packageManager, this.f173586a);
    }

    public final void f(PackageManager packageManager, q qVar) {
        Log.d(f173585g, "enableVaultEntry:" + qVar.a());
        packageManager.setComponentEnabledSetting(qVar.a(), 1, 1);
        qVar.j(true);
    }

    public q g(Context context) {
        return this.f173589d.b(context);
    }

    public List<q> i(Context context) {
        String id2 = this.f173588c.c(context).getMeta().getId();
        ArrayList arrayList = new ArrayList();
        for (q qVar : this.f173587b) {
            String strE = qVar.e();
            if (strE == null || strE.equals(id2)) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    public q j() {
        return this.f173586a;
    }

    public q k(Context context) {
        String id2 = this.f173588c.c(context).getMeta().getId();
        q qVarG = g(context);
        String strE = qVarG.e();
        if (strE == null || strE.equals(id2)) {
            return qVarG;
        }
        ArrayList arrayList = (ArrayList) i(context);
        if (arrayList.isEmpty()) {
            throw new IllegalStateException(w.y.a("no disguise entry for vault ui: ", id2));
        }
        q qVar = (q) arrayList.get(0);
        m(context, qVar);
        return qVar;
    }

    public void l(Context context) {
        m(context, this.f173587b.get(0));
    }

    public void m(Context context, q qVar) {
        Iterator<q> it = this.f173587b.iterator();
        while (it.hasNext()) {
            if (it.next().equals(qVar)) {
                this.f173589d.a(context, qVar);
                if (this.f173586a.g()) {
                    return;
                }
                d(context);
                return;
            }
        }
        throw new IllegalStateException("setDisguiseEntry entry is not in the list");
    }
}
