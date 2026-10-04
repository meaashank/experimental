package com.prism.hider.vault.commons;

import android.content.Context;
import com.prism.commons.utils.C3861z;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f168598c = "KEY_VAULT_SKIN_ID";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f168599d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<I> f168600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3861z<r6.j<String>, Void> f168601b = new C3861z<>(new G());

    public H(List<I> list) {
        this.f168600a = list;
    }

    public static /* synthetic */ r6.j a(Void r42) {
        return new r6.j(D.f168597c.a(null), f168598c, "", (Class<String>) String.class);
    }

    public final int b(String str) {
        for (int i10 = 0; i10 < this.f168600a.size(); i10++) {
            if (this.f168600a.get(i10).b().equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public I c(Context context) {
        int iB = b(d(context));
        if (iB >= 0) {
            return this.f168600a.get(iB);
        }
        if (this.f168600a.isEmpty()) {
            return null;
        }
        return this.f168600a.get(0);
    }

    public String d(Context context) {
        String strH = this.f168601b.a(null).h(context);
        return ("".equals(strH) || b(strH) < 0) ? this.f168600a.isEmpty() ? "" : this.f168600a.get(0).b() : strH;
    }

    public List<I> e() {
        return this.f168600a;
    }

    public void f(Context context, String str) {
        this.f168601b.a(null).n(context, str);
    }
}
