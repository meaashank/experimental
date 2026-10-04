package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.ui.pager.preview.PreviewFileView;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final PreviewFileView f65649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f65650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f65651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f65652d;

    public k(@NonNull PreviewFileView previewFileView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f65649a = previewFileView;
        this.f65650b = textView;
        this.f65651c = imageView;
        this.f65652d = textView2;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = d.h.f186784x5;
        TextView textView = (TextView) D2.c.a(view, i10);
        if (textView != null) {
            i10 = d.h.f186793y5;
            ImageView imageView = (ImageView) D2.c.a(view, i10);
            if (imageView != null) {
                i10 = d.h.f186802z5;
                TextView textView2 = (TextView) D2.c.a(view, i10);
                if (textView2 != null) {
                    return new k((PreviewFileView) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f186995l0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public PreviewFileView b() {
        return this.f65649a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65649a;
    }
}
