package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f154172c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f154170a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154171b = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<e> f154173d = new ArrayList();

    public String a() {
        return this.f154171b;
    }

    public List<e> b() {
        return this.f154173d;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f154171b = str;
    }

    public void a(boolean z10) {
        this.f154172c = z10;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f154173d = list;
    }
}
