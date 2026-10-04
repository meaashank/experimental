package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f65680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f65681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AspectRatioFrameLayout f65682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f65683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f65684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f65685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final SubtitleView f65686g;

    public r(@NonNull View view, @NonNull ImageView imageView, @NonNull AspectRatioFrameLayout aspectRatioFrameLayout, @NonNull View view2, @NonNull FrameLayout frameLayout, @NonNull View view3, @NonNull SubtitleView subtitleView) {
        this.f65680a = view;
        this.f65681b = imageView;
        this.f65682c = aspectRatioFrameLayout;
        this.f65683d = view2;
        this.f65684e = frameLayout;
        this.f65685f = view3;
        this.f65686g = subtitleView;
    }

    @NonNull
    public static r a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = d.h.f186533Y1;
        ImageView imageView = (ImageView) D2.c.a(view, i10);
        if (imageView != null) {
            i10 = d.h.f186552a2;
            AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) D2.c.a(view, i10);
            if (aspectRatioFrameLayout != null && (viewA = D2.c.a(view, (i10 = d.h.f186572c2))) != null) {
                i10 = d.h.f186622h2;
                FrameLayout frameLayout = (FrameLayout) D2.c.a(view, i10);
                if (frameLayout != null && (viewA2 = D2.c.a(view, (i10 = d.h.f186712q2))) != null) {
                    i10 = d.h.f186722r2;
                    SubtitleView subtitleView = (SubtitleView) D2.c.a(view, i10);
                    if (subtitleView != null) {
                        return new r(view, imageView, aspectRatioFrameLayout, viewA, frameLayout, viewA2, subtitleView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException(androidx.constraintlayout.widget.d.f107893V1);
        }
        layoutInflater.inflate(d.k.f187031x0, viewGroup);
        return a(viewGroup);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65680a;
    }
}
