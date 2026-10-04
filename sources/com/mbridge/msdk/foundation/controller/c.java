package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;
import com.mbridge.msdk.foundation.controller.a;

/* JADX INFO: loaded from: classes5.dex */
public class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile c f155978t;

    private c() {
    }

    public static c n() {
        if (f155978t == null) {
            synchronized (c.class) {
                try {
                    if (f155978t == null) {
                        f155978t = new c();
                    }
                } finally {
                }
            }
        }
        return f155978t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }
}
