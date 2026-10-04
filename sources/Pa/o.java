package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.media.ui.widget.photoview.AttachPhotoView;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.ui.pager.preview.PreviewVideoView;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final PreviewVideoView f65666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f65667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AttachPhotoView f65668c;

    public o(@NonNull PreviewVideoView previewVideoView, @NonNull ImageView imageView, @NonNull AttachPhotoView attachPhotoView) {
        this.f65666a = previewVideoView;
        this.f65667b = imageView;
        this.f65668c = attachPhotoView;
    }

    @NonNull
    public static o a(@NonNull View view) {
        int i10 = d.h.f186330B5;
        ImageView imageView = (ImageView) D2.c.a(view, i10);
        if (imageView != null) {
            i10 = d.h.f186339C5;
            AttachPhotoView attachPhotoView = (AttachPhotoView) D2.c.a(view, i10);
            if (attachPhotoView != null) {
                return new o((PreviewVideoView) view, imageView, attachPhotoView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static o d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f187007p0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public PreviewVideoView b() {
        return this.f65666a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65666a;
    }
}
