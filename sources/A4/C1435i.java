package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1435i implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f84660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f84661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f84662d;

    public C1435i(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull TextView textView, @NonNull EditText editText2) {
        this.f84659a = linearLayout;
        this.f84660b = editText;
        this.f84661c = textView;
        this.f84662d = editText2;
    }

    @NonNull
    public static C1435i a(@NonNull View view) {
        int i10 = p.j.f144659d1;
        EditText editText = (EditText) D2.c.a(view, i10);
        if (editText != null) {
            i10 = p.j.f144674e1;
            TextView textView = (TextView) D2.c.a(view, i10);
            if (textView != null) {
                i10 = p.j.f144689f1;
                EditText editText2 = (EditText) D2.c.a(view, i10);
                if (editText2 != null) {
                    return new C1435i((LinearLayout) view, editText, textView, editText2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1435i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1435i d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145245k0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84659a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84659a;
    }
}
