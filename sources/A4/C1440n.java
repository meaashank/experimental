package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1440n implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f84676b;

    public C1440n(@NonNull LinearLayout linearLayout, @NonNull EditText editText) {
        this.f84675a = linearLayout;
        this.f84676b = editText;
    }

    @NonNull
    public static C1440n a(@NonNull View view) {
        int i10 = p.j.f144631b3;
        EditText editText = (EditText) D2.c.a(view, i10);
        if (editText != null) {
            return new C1440n((LinearLayout) view, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1440n c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1440n d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145270p0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84675a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84675a;
    }
}
