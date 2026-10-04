package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.media.ui.widget.photoview.AttachPhotoView;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.ui.pager.preview.PreviewImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final PreviewImageView f65658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AttachPhotoView f65659b;

    public m(@NonNull PreviewImageView previewImageView, @NonNull AttachPhotoView attachPhotoView) {
        this.f65658a = previewImageView;
        this.f65659b = attachPhotoView;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i10 = d.h.f186321A5;
        AttachPhotoView attachPhotoView = (AttachPhotoView) D2.c.a(view, i10);
        if (attachPhotoView != null) {
            return new m((PreviewImageView) view, attachPhotoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static m d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f187001n0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public PreviewImageView b() {
        return this.f65658a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65658a;
    }
}
