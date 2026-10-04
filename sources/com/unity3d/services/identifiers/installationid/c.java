package com.unity3d.services.identifiers.installationid;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f194513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194515c;

    public c(Context context, String settingsFile, String key) {
        G.p(context, "context");
        G.p(settingsFile, "settingsFile");
        G.p(key, "key");
        this.f194513a = context;
        this.f194514b = settingsFile;
        this.f194515c = key;
    }

    @Override // com.unity3d.services.identifiers.installationid.a
    public final String a() {
        String string = this.f194513a.getSharedPreferences(this.f194514b, 0).getString(this.f194515c, "");
        return string == null ? "" : string;
    }

    @Override // com.unity3d.services.identifiers.installationid.a
    public final void a(String id2) {
        G.p(id2, "id");
        SharedPreferences.Editor editorEdit = this.f194513a.getSharedPreferences(this.f194514b, 0).edit();
        editorEdit.putString(this.f194515c, id2);
        editorEdit.apply();
    }
}
