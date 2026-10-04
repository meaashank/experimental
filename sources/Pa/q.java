package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f65674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f65675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageButton f65676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageButton f65677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f65678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final DefaultTimeBar f65679f;

    public q(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull TextView textView2, @NonNull DefaultTimeBar defaultTimeBar) {
        this.f65674a = frameLayout;
        this.f65675b = textView;
        this.f65676c = imageButton;
        this.f65677d = imageButton2;
        this.f65678e = textView2;
        this.f65679f = defaultTimeBar;
    }

    @NonNull
    public static q a(@NonNull View view) {
        int i10 = d.h.f186582d2;
        TextView textView = (TextView) D2.c.a(view, i10);
        if (textView != null) {
            i10 = d.h.f186632i2;
            ImageButton imageButton = (ImageButton) D2.c.a(view, i10);
            if (imageButton != null) {
                i10 = d.h.f186642j2;
                ImageButton imageButton2 = (ImageButton) D2.c.a(view, i10);
                if (imageButton2 != null) {
                    i10 = d.h.f186652k2;
                    TextView textView2 = (TextView) D2.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = d.h.f186672m2;
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) D2.c.a(view, i10);
                        if (defaultTimeBar != null) {
                            return new q((FrameLayout) view, textView, imageButton, imageButton2, textView2, defaultTimeBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static q c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f187028w0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public FrameLayout b() {
        return this.f65674a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65674a;
    }
}
