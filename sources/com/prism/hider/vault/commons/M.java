package com.prism.hider.vault.commons;

import android.content.Context;
import com.prism.commons.utils.C3861z;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f168607e = "KEY_VAULT_UI_ID";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f168608f = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<VaultUI> f168610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VaultUI f168611c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3861z<r6.j<String>, Void> f168609a = new C3861z<>(new K());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3861z<Void, Context> f168612d = new C3861z<>(new C3861z.a() { // from class: com.prism.hider.vault.commons.L
        @Override // com.prism.commons.utils.C3861z.a
        public final Object a(Object obj) {
            this.f168606a.e((Context) obj);
            return null;
        }
    });

    public M(List<VaultUI> list) {
        this.f168610b = list;
    }

    public static /* synthetic */ r6.j a(Void r42) {
        return new r6.j(D.f168597c.a(null), f168607e, "", (Class<String>) String.class);
    }

    public static /* synthetic */ Void b(M m10, Context context) {
        m10.e(context);
        return null;
    }

    public VaultUI c(Context context) {
        this.f168612d.a(context);
        return this.f168611c;
    }

    public List<VaultUI> d() {
        return this.f168610b;
    }

    public final /* synthetic */ Void e(Context context) {
        if (this.f168610b.size() == 1) {
            this.f168611c = this.f168610b.get(0);
        } else if (this.f168610b.size() > 1) {
            String strH = this.f168609a.a(null).h(context);
            if (!"".equals(strH)) {
                Iterator<VaultUI> it = this.f168610b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    VaultUI next = it.next();
                    if (strH.equals(next.getMeta().getId())) {
                        this.f168611c = next;
                        break;
                    }
                }
            }
            if (this.f168611c == null) {
                this.f168611c = this.f168610b.get(0);
            }
        }
        return null;
    }

    public void f(Context context, VaultUI vaultUI) {
        if (this.f168610b.indexOf(vaultUI) >= 0) {
            this.f168611c = vaultUI;
            this.f168609a.a(null).n(context, vaultUI.getMeta().getId());
        } else {
            throw new IllegalStateException("vault ui is not in the vault ui list " + vaultUI);
        }
    }
}
