package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1437k implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f84668b;

    public C1437k(@NonNull LinearLayout linearLayout, @NonNull EditText editText) {
        this.f84667a = linearLayout;
        this.f84668b = editText;
    }

    @NonNull
    public static C1437k a(@NonNull View view) {
        int i10 = p.j.f144601Z2;
        EditText editText = (EditText) D2.c.a(view, i10);
        if (editText != null) {
            return new C1437k((LinearLayout) view, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1437k c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1437k d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145255m0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84667a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84667a;
    }
}
