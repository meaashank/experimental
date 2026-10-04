package com.android.launcher3;

import com.android.launcher3.dragndrop.DragLayer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DragLayer f136974a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f136974a.recreateControllers();
    }
}
