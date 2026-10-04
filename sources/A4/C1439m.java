package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1439m implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f84673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditText f84674c;

    public C1439m(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull EditText editText2) {
        this.f84672a = linearLayout;
        this.f84673b = editText;
        this.f84674c = editText2;
    }

    @NonNull
    public static C1439m a(@NonNull View view) {
        int i10 = p.j.f144607Z8;
        EditText editText = (EditText) D2.c.a(view, i10);
        if (editText != null) {
            i10 = p.j.f144622a9;
            EditText editText2 = (EditText) D2.c.a(view, i10);
            if (editText2 != null) {
                return new C1439m((LinearLayout) view, editText, editText2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1439m c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1439m d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145265o0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84672a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84672a;
    }
}
