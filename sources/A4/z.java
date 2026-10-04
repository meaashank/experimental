package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f84725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f84726c;

    public z(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f84724a = linearLayout;
        this.f84725b = recyclerView;
        this.f84726c = textView;
    }

    @NonNull
    public static z a(@NonNull View view) {
        int i10 = p.j.f144616a3;
        RecyclerView recyclerView = (RecyclerView) D2.c.a(view, i10);
        if (recyclerView != null) {
            i10 = p.j.f144646c3;
            TextView textView = (TextView) D2.c.a(view, i10);
            if (textView != null) {
                return new z((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static z c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static z d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145291t1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84724a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84724a;
    }
}
