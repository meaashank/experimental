package S5;

import D2.c;
import Q5.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f68121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f68122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f68123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f68124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f68125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f68126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f68127g;

    public a(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull Button button2, @NonNull LinearLayout linearLayout4) {
        this.f68121a = linearLayout;
        this.f68122b = textView;
        this.f68123c = button;
        this.f68124d = linearLayout2;
        this.f68125e = linearLayout3;
        this.f68126f = button2;
        this.f68127g = linearLayout4;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = d.h.f66558G0;
        TextView textView = (TextView) c.a(view, i10);
        if (textView != null) {
            i10 = d.h.f66564I0;
            Button button = (Button) c.a(view, i10);
            if (button != null) {
                i10 = d.h.f66567J0;
                LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
                if (linearLayout != null) {
                    i10 = d.h.f66600U0;
                    LinearLayout linearLayout2 = (LinearLayout) c.a(view, i10);
                    if (linearLayout2 != null) {
                        i10 = d.h.f66603V0;
                        Button button2 = (Button) c.a(view, i10);
                        if (button2 != null) {
                            i10 = d.h.f66606W0;
                            LinearLayout linearLayout3 = (LinearLayout) c.a(view, i10);
                            if (linearLayout3 != null) {
                                return new a((LinearLayout) view, textView, button, linearLayout, linearLayout2, button2, linearLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f66722J, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f68121a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f68121a;
    }
}
