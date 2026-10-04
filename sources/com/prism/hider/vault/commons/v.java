package com.prism.hider.vault.commons;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes6.dex */
@Singleton
public class v extends AbstractC4265a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f178650l = "BUILD_CONFIG_KEY_VAULT_UI";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M f178651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E f178652k;

    @Inject
    public v(Map<String, VaultUI> map, String[] strArr, E e10) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            VaultUI vaultUI = map.get(str);
            if (vaultUI != null) {
                arrayList.add(vaultUI);
            }
        }
        this.f178651j = new M(arrayList);
        this.f178652k = e10;
    }

    @Override // com.prism.hider.vault.commons.InterfaceC4278n
    public boolean a(Activity activity, boolean z10) {
        return this.f178652k.a(activity, z10);
    }

    @Override // com.prism.hider.vault.commons.InterfaceC4278n
    public VaultUI c(Context context) {
        return this.f178651j.c(context);
    }

    @Override // com.prism.hider.vault.commons.InterfaceC4278n
    public M i(Context context) {
        return this.f178651j;
    }
}
