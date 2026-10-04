package com.prism.lib.pfs.ui.pager.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.I;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import e.T;

/* JADX INFO: loaded from: classes7.dex */
public class PreviewFileView extends PreviewItemView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f188920h = l0.b("PreviewFileView");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f188921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f188922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f188923g;

    public PreviewFileView(@NonNull Context context) {
        super(context);
    }

    @Override // com.prism.lib.pfs.ui.pager.preview.PreviewItemView
    public void f() {
        ExchangeFile item = getItem();
        Log.d(f188920h, "bind view on file: (" + item.getName() + ")" + item.getId());
        this.f188921e = (ImageView) findViewById(d.h.f186793y5);
        this.f188922f = (TextView) findViewById(d.h.f186802z5);
        this.f188923g = (TextView) findViewById(d.h.f186784x5);
        PrivateFileSystem.getSeekableIconGlideRequest(item).R0(new I(30)).v1(this.f188921e);
        this.f188922f.setText(item.getName());
        this.f188923g.setText((CharSequence) null);
    }

    public PreviewFileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewFileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @T(21)
    public PreviewFileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
