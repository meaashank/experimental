package com.prism.lib.pfs.ui.pager.preview;

import ab.C1465b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import e.T;
import y6.InterfaceC5838a;
import z6.InterfaceC5860b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PreviewItemView extends FrameLayout implements InterfaceC5838a<ExchangeFile> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1465b f188927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f188928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExchangeFile f188929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC5860b<ExchangeFile> f188930d;

    public PreviewItemView(@NonNull Context context) {
        super(context);
    }

    @Override // y6.InterfaceC5838a
    public View a() {
        return this;
    }

    public void b(C1465b c1465b, int i10, ExchangeFile exchangeFile) {
        this.f188927a = c1465b;
        this.f188928b = i10;
        this.f188929c = exchangeFile;
        f();
    }

    public ImageView c() {
        return null;
    }

    @Override // y6.InterfaceC5838a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ExchangeFile getItem() {
        return this.f188929c;
    }

    public int e() {
        return this.f188928b;
    }

    public abstract void f();

    public void g(int i10) {
        h(i10, new Object[0]);
    }

    public void h(int i10, Object[] objArr) {
        InterfaceC5860b<ExchangeFile> interfaceC5860b = this.f188930d;
        if (interfaceC5860b != null) {
            interfaceC5860b.R(this.f188928b, this.f188929c, i10, objArr);
        }
    }

    public void i(InterfaceC5860b<ExchangeFile> interfaceC5860b) {
        this.f188930d = interfaceC5860b;
    }

    public PreviewItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @T(21)
    public PreviewItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
