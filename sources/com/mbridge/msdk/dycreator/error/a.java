package com.mbridge.msdk.dycreator.error;

import androidx.activity.C1477d;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f155815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f155816b;

    public a(b bVar) {
        if (bVar != null) {
            this.f155815a = bVar.g();
            this.f155816b = bVar.h();
        }
    }

    public String toString() {
        return C1477d.a(new StringBuilder("DyError{errorCode="), this.f155815a, '}');
    }

    public a(int i10, String str) {
        this.f155815a = i10;
        this.f155816b = str;
    }
}
