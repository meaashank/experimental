package com.android.launcher3.util;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListViewHighlighter f136988a;

    public /* synthetic */ c(ListViewHighlighter listViewHighlighter) {
        this.f136988a = listViewHighlighter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f136988a.tryHighlight();
    }
}
