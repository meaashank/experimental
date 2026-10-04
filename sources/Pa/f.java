package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f65629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RadioButton f65631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f65632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f65633f;

    public f(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout2, @NonNull RadioButton radioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f65628a = linearLayout;
        this.f65629b = appCompatImageView;
        this.f65630c = linearLayout2;
        this.f65631d = radioButton;
        this.f65632e = textView;
        this.f65633f = textView2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = d.h.f186711q1;
        AppCompatImageView appCompatImageView = (AppCompatImageView) D2.c.a(view, i10);
        if (appCompatImageView != null) {
            i10 = d.h.f186800z3;
            LinearLayout linearLayout = (LinearLayout) D2.c.a(view, i10);
            if (linearLayout != null) {
                i10 = d.h.f186375G5;
                RadioButton radioButton = (RadioButton) D2.c.a(view, i10);
                if (radioButton != null) {
                    i10 = d.h.f186717q7;
                    TextView textView = (TextView) D2.c.a(view, i10);
                    if (textView != null) {
                        i10 = d.h.f186727r7;
                        TextView textView2 = (TextView) D2.c.a(view, i10);
                        if (textView2 != null) {
                            return new f((LinearLayout) view, appCompatImageView, linearLayout, radioButton, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f186971d0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f65628a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65628a;
    }
}
