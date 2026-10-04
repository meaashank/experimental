package com.prism.lib.pfs.ui.pager.preview;

import Ha.d;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.l0;
import com.prism.lib.media.ui.widget.photoview.AttachPhotoView;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import e.T;

/* JADX INFO: loaded from: classes7.dex */
public class PreviewImageView extends PreviewItemView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f188924f = l0.b("PreviewImageView");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AttachPhotoView f188925e;

    public class a implements d.f {
        public a() {
        }

        @Override // Ha.d.f
        public void a(View view, float f10, float f11) {
            PreviewImageView.this.g(3);
        }

        @Override // Ha.d.f
        public void b() {
            PreviewImageView.this.g(3);
        }
    }

    public PreviewImageView(@NonNull Context context) {
        super(context);
    }

    @Override // com.prism.lib.pfs.ui.pager.preview.PreviewItemView
    public void f() {
        ExchangeFile item = getItem();
        Log.d(f188924f, "bind view on file: (" + item.getName() + ")" + item.getId());
        AttachPhotoView attachPhotoView = (AttachPhotoView) findViewById(d.h.f186321A5);
        this.f188925e = attachPhotoView;
        attachPhotoView.c();
        this.f188925e.d().w(new a());
        this.f188925e.d().o(new d.g() { // from class: ab.a
            @Override // Ha.d.g
            public final void a(float f10, float f11, float f12) {
                this.f84813a.g(2);
            }
        });
        this.f188925e.d().i0(0.0f);
        PrivateFileSystem.getSeekableIconGlideRequest(item).v1(this.f188925e);
    }

    @Override // com.prism.lib.pfs.ui.pager.preview.PreviewItemView
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AttachPhotoView c() {
        return this.f188925e;
    }

    public final /* synthetic */ void l(float f10, float f11, float f12) {
        g(2);
    }

    public PreviewImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @T(21)
    public PreviewImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
