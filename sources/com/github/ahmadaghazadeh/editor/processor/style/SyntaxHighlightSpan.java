package com.github.ahmadaghazadeh.editor.processor.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.NonNull;
import java.io.Serializable;
import s5.C5575b;

/* JADX INFO: loaded from: classes3.dex */
public class SyntaxHighlightSpan extends CharacterStyle implements Serializable, Comparable<SyntaxHighlightSpan> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f150594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f150595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f150597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f150598e;

    public SyntaxHighlightSpan(C5575b c5575b, int i10, int i11) {
        this.f150596c = c5575b.a();
        this.f150594a = c5575b.b();
        this.f150595b = c5575b.c();
        this.f150598e = i10;
        this.f150597d = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull SyntaxHighlightSpan syntaxHighlightSpan) {
        return this.f150598e - syntaxHighlightSpan.f150598e;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f150596c);
        textPaint.setFakeBoldText(this.f150594a);
        if (this.f150595b) {
            textPaint.setTextSkewX(-0.1f);
        }
    }

    public SyntaxHighlightSpan(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f150596c = i10;
        this.f150598e = i11;
        this.f150597d = i12;
        this.f150594a = z10;
        this.f150595b = z11;
    }
}
