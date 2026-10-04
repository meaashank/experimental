package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1425C implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f84504b;

    public C1425C(@NonNull LinearLayout linearLayout, @NonNull EditText editText) {
        this.f84503a = linearLayout;
        this.f84504b = editText;
    }

    @NonNull
    public static C1425C a(@NonNull View view) {
        int i10 = p.j.f144876r8;
        EditText editText = (EditText) D2.c.a(view, i10);
        if (editText != null) {
            return new C1425C((LinearLayout) view, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1425C c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1425C d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145133K2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84503a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84503a;
    }
}
