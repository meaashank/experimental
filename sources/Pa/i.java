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
import androidx.fragment.app.FragmentContainerView;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f65638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f65639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f65640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f65641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f65642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f65643f;

    public i(@NonNull ConstraintLayout constraintLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull Button button, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f65638a = constraintLayout;
        this.f65639b = fragmentContainerView;
        this.f65640c = button;
        this.f65641d = appCompatImageView;
        this.f65642e = imageView;
        this.f65643f = textView;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = d.h.f186779x0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) D2.c.a(view, i10);
        if (fragmentContainerView != null) {
            i10 = d.h.f186424M0;
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
                            return new i((ConstraintLayout) view, fragmentContainerView, button, appCompatImageView, imageView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f186986i0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f65638a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65638a;
    }
}
