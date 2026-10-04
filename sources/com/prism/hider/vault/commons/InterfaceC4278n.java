package com.prism.hider.vault.commons;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.prism.hider.vault.commons.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4278n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f173567a = "com.prism.hider.vault.CATEGORY_VAULT_ENTRY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f173568b = "vault_entry_order";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f173569c = "vault_ui_id";

    boolean a(Activity activity, boolean z10);

    void b(Context context);

    VaultUI c(Context context);

    t d(Context context);

    boolean e(Context context);

    void f(Context context);

    void g(Context context);

    x getLifecycle();

    boolean h(Activity activity);

    M i(Context context);

    void j(p pVar);

    void k(Activity activity);
}
