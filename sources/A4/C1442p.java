package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1442p implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ScrollView f84679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f84680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f84681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f84682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f84683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f84684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f84685g;

    public C1442p(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f84679a = scrollView;
        this.f84680b = textView;
        this.f84681c = textView2;
        this.f84682d = textView3;
        this.f84683e = textView4;
        this.f84684f = textView5;
        this.f84685g = textView6;
    }

    @NonNull
    public static C1442p a(@NonNull View view) {
        int i10 = p.j.f144487R0;
        TextView textView = (TextView) D2.c.a(view, i10);
        if (textView != null) {
            i10 = p.j.f144357Ha;
            TextView textView2 = (TextView) D2.c.a(view, i10);
            if (textView2 != null) {
                i10 = p.j.f144371Ia;
                TextView textView3 = (TextView) D2.c.a(view, i10);
                if (textView3 != null) {
                    i10 = p.j.f144385Ja;
                    TextView textView4 = (TextView) D2.c.a(view, i10);
                    if (textView4 != null) {
                        i10 = p.j.f144399Ka;
                        TextView textView5 = (TextView) D2.c.a(view, i10);
                        if (textView5 != null) {
                            i10 = p.j.f144413La;
                            TextView textView6 = (TextView) D2.c.a(view, i10);
                            if (textView6 != null) {
                                return new C1442p((ScrollView) view, textView, textView2, textView3, textView4, textView5, textView6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1442p c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1442p d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145280r0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ScrollView b() {
        return this.f84679a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84679a;
    }
}
