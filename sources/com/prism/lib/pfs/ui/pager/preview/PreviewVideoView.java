package com.prism.lib.pfs.ui.pager.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.h;
import com.prism.commons.utils.l0;
import com.prism.lib.media.ui.widget.photoview.AttachPhotoView;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import e.T;

/* JADX INFO: loaded from: classes7.dex */
public class PreviewVideoView extends PreviewItemView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f188931g = l0.b("PreviewVideoView");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AttachPhotoView f188932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f188933f;

    public PreviewVideoView(@NonNull Context context) {
        super(context);
    }

    @Override // com.prism.lib.pfs.ui.pager.preview.PreviewItemView
    public void f() {
        ExchangeFile item = getItem();
        Log.d(f188931g, "bind view on file: (" + item.getName() + ")" + item.getId());
        this.f188932e = (AttachPhotoView) findViewById(d.h.f186339C5);
        this.f188933f = (ImageView) findViewById(d.h.f186330B5);
        this.f188932e.c();
        this.f188932e.setOnClickListener(new View.OnClickListener() { // from class: ab.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84819a.g(3);
            }
        });
        this.f188933f.setOnClickListener(new View.OnClickListener() { // from class: ab.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84820a.n(view);
            }
        });
        PrivateFileSystem.getSeekableIconGlideRequest(item).d(new h().D()).v1(this.f188932e);
    }

    @Override // com.prism.lib.pfs.ui.pager.preview.PreviewItemView
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AttachPhotoView c() {
        return this.f188932e;
    }

    public final /* synthetic */ void m(View view) {
        g(3);
    }

    public final /* synthetic */ void n(View view) {
        g(10);
    }

    public PreviewVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @T(21)
    public PreviewVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
