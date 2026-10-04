package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154165a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f154166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Animator f154167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f154168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f154169e;

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f154165a = str;
    }

    public i b() {
        return this.f154169e;
    }

    public View c() {
        return this.f154168d;
    }

    public void a(g gVar) {
        this.f154166b = gVar;
    }

    public Animator a() {
        return this.f154167c;
    }

    public void a(Animator animator) {
        this.f154167c = animator;
    }

    public void a(View view) {
        this.f154168d = view;
    }

    public void a(i iVar) {
        this.f154169e = iVar;
    }
}
