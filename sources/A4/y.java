package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f84720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f84721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f84722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f84723e;

    public y(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f84719a = constraintLayout;
        this.f84720b = view;
        this.f84721c = textView;
        this.f84722d = textView2;
        this.f84723e = textView3;
    }

    @NonNull
    public static y a(@NonNull View view) {
        int i10 = p.j.f144691f3;
        View viewA = D2.c.a(view, i10);
        if (viewA != null) {
            i10 = p.j.f144678e5;
            TextView textView = (TextView) D2.c.a(view, i10);
            if (textView != null) {
                i10 = p.j.f144693f5;
                TextView textView2 = (TextView) D2.c.a(view, i10);
                if (textView2 != null) {
                    i10 = p.j.f144708g5;
                    TextView textView3 = (TextView) D2.c.a(view, i10);
                    if (textView3 != null) {
                        return new y((ConstraintLayout) view, viewA, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static y c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static y d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145143N0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f84719a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84719a;
    }
}
