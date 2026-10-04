package com.prism.fusionadsdkbase;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public interface e {
    void destroy();

    void load(Context context, AdRequest adRequest);

    void show(Activity activity, T6.b bVar);

    void show(ViewGroup viewGroup);

    void show(ViewGroup viewGroup, String str);
}
