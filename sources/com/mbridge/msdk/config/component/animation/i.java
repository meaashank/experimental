package com.mbridge.msdk.config.component.animation;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f154174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f154175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f154176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f154177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f154178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f154179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f154180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f154181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f154182i;

    public static i a(View view) {
        i iVar = new i();
        if (view == null) {
            return iVar;
        }
        iVar.f154174a = view.getTranslationX();
        iVar.f154175b = view.getTranslationY();
        iVar.f154177d = view.getScaleX();
        iVar.f154178e = view.getScaleY();
        iVar.f154179f = view.getRotation();
        iVar.f154180g = view.getRotationX();
        iVar.f154181h = view.getRotationY();
        iVar.f154182i = view.getAlpha();
        iVar.f154176c = view.getTranslationZ();
        return iVar;
    }

    public void b(View view) {
        if (view == null) {
            return;
        }
        view.setTranslationX(this.f154174a);
        view.setTranslationY(this.f154175b);
        view.setScaleX(this.f154177d);
        view.setScaleY(this.f154178e);
        view.setRotation(this.f154179f);
        view.setRotationX(this.f154180g);
        view.setRotationY(this.f154181h);
        view.setAlpha(this.f154182i);
        view.setTranslationZ(this.f154176c);
    }
}
