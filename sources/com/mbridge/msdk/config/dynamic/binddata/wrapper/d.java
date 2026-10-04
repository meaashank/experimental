package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class d implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f155120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f155121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f155122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicBoolean f155124e = new AtomicBoolean(false);

    public d(String str, String str2, View view, int i10) {
        this.f155122c = view;
        this.f155120a = str;
        this.f155121b = str2;
        this.f155123d = i10;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public View a() {
        return this.f155122c;
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
    public void a(String str, Object obj) {
        if (b(this.f155120a)) {
            a(String.valueOf(obj));
        } else {
            b(str, obj);
        }
    }

    private void b(String str, Object obj) {
        KeyEvent.Callback callback = this.f155122c;
        if (callback instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
            ((com.mbridge.msdk.config.dynamic.baseview.inter.a) callback).updateBindData(str, obj);
        }
    }

    private void a(String str) {
        View view;
        if (this.f155124e.get() || (view = this.f155122c) == null) {
            return;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.a.a(view, this.f155120a, this.f155121b, str);
        } catch (Exception e10) {
            q0.b("ViewObserverImpl", e10.getMessage());
        }
    }
}
