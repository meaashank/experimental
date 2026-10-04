package com.prism.hider.vault.commons;

import android.content.Context;
import android.util.Log;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.w0;

/* JADX INFO: loaded from: classes6.dex */
public class B implements z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f168592d = "KEY_VAULT_ENABLE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f168594a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r6.j<Boolean> f168595b = new r6.j<>(D.f168597c.a(null), f168592d, (w0) new A(), Boolean.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f168591c = l0.b(B.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B f168593e = new B();

    public static boolean g(Context context) {
        boolean zC = na.d.b(context).c();
        Log.d(f168591c, "PinCodeCertifier.instance(context).isPinCodeSetup:" + zC);
        return zC;
    }

    public static B h() {
        return f168593e;
    }

    @Override // com.prism.hider.vault.commons.z
    public void a() {
        Log.d(f168591c, VaultProvider.f168626f);
        this.f168594a = true;
    }

    @Override // com.prism.hider.vault.commons.z
    public void b(Context context, boolean z10) {
        this.f168595b.n(context, Boolean.valueOf(z10));
    }

    @Override // com.prism.hider.vault.commons.z
    public boolean c(Context context) {
        return this.f168595b.h(context).booleanValue();
    }

    @Override // com.prism.hider.vault.commons.z
    public void d() {
        Log.d(f168591c, VaultProvider.f168627g);
        this.f168594a = false;
    }

    @Override // com.prism.hider.vault.commons.z
    public boolean e(Context context) {
        return this.f168594a;
    }
}
