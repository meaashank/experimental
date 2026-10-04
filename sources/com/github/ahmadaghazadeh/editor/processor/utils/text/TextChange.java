package com.github.ahmadaghazadeh.editor.processor.utils.text;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TextChange implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f150599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f150600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150601c;

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public TextChange clone() {
        TextChange textChange = new TextChange();
        textChange.f150600b = this.f150600b;
        textChange.f150599a = this.f150599a;
        textChange.f150601c = this.f150601c;
        return textChange;
    }
}
