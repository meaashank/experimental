package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1423A implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f84483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f84484c;

    public C1423A(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f84482a = linearLayout;
        this.f84483b = imageView;
        this.f84484c = textView;
    }

    @NonNull
    public static C1423A a(@NonNull View view) {
        int i10 = p.j.f144918u5;
        ImageView imageView = (ImageView) D2.c.a(view, i10);
        if (imageView != null) {
            i10 = p.j.f144471Pc;
            TextView textView = (TextView) D2.c.a(view, i10);
            if (textView != null) {
                return new C1423A((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1423A c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1423A d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145144N1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84482a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84482a;
    }
}
