package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f65644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f65645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f65646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f65647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f65648e;

    public j(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f65644a = constraintLayout;
        this.f65645b = button;
        this.f65646c = appCompatImageView;
        this.f65647d = imageView;
        this.f65648e = textView;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i10 = d.h.f186424M0;
        Button button = (Button) D2.c.a(view, i10);
        if (button != null) {
            i10 = d.h.f186433N0;
            AppCompatImageView appCompatImageView = (AppCompatImageView) D2.c.a(view, i10);
            if (appCompatImageView != null) {
                i10 = d.h.f186543Z2;
                ImageView imageView = (ImageView) D2.c.a(view, i10);
                if (imageView != null) {
                    i10 = d.h.f186737s7;
                    TextView textView = (TextView) D2.c.a(view, i10);
                    if (textView != null) {
                        return new j((ConstraintLayout) view, button, appCompatImageView, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static j c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f186989j0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f65644a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65644a;
    }
}
