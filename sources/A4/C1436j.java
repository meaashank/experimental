package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1436j implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f84664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditText f84665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f84666d;

    public C1436j(@NonNull LinearLayout linearLayout, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull EditText editText, @NonNull EditText editText2) {
        this.f84663a = linearLayout;
        this.f84664b = autoCompleteTextView;
        this.f84665c = editText;
        this.f84666d = editText2;
    }

    @NonNull
    public static C1436j a(@NonNull View view) {
        int i10 = p.j.f144884s1;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) D2.c.a(view, i10);
        if (autoCompleteTextView != null) {
            i10 = p.j.f144929v1;
            EditText editText = (EditText) D2.c.a(view, i10);
            if (editText != null) {
                i10 = p.j.f144959x1;
                EditText editText2 = (EditText) D2.c.a(view, i10);
                if (editText2 != null) {
                    return new C1436j((LinearLayout) view, autoCompleteTextView, editText, editText2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1436j c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1436j d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145250l0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84663a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84663a;
    }
}
