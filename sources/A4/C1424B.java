package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1424B implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f84487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f84488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RadioButton f84489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RadioButton f84490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RadioButton f84491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RadioButton f84492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f84493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f84494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RadioButton f84495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f84498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RadioGroup f84499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RadioGroup f84500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ImageView f84501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final ImageView f84502r;

    public C1424B(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull View view, @NonNull ImageView imageView3, @NonNull RadioButton radioButton5, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull RadioGroup radioGroup, @NonNull RadioGroup radioGroup2, @NonNull ImageView imageView4, @NonNull ImageView imageView5) {
        this.f84485a = constraintLayout;
        this.f84486b = constraintLayout2;
        this.f84487c = imageView;
        this.f84488d = imageView2;
        this.f84489e = radioButton;
        this.f84490f = radioButton2;
        this.f84491g = radioButton3;
        this.f84492h = radioButton4;
        this.f84493i = view;
        this.f84494j = imageView3;
        this.f84495k = radioButton5;
        this.f84496l = linearLayout;
        this.f84497m = linearLayout2;
        this.f84498n = textView;
        this.f84499o = radioGroup;
        this.f84500p = radioGroup2;
        this.f84501q = imageView4;
        this.f84502r = imageView5;
    }

    @NonNull
    public static C1424B a(@NonNull View view) {
        View viewA;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = p.j.f144988z1;
        ImageView imageView = (ImageView) D2.c.a(view, i10);
        if (imageView != null) {
            i10 = p.j.f144250A1;
            ImageView imageView2 = (ImageView) D2.c.a(view, i10);
            if (imageView2 != null) {
                i10 = p.j.f144264B1;
                RadioButton radioButton = (RadioButton) D2.c.a(view, i10);
                if (radioButton != null) {
                    i10 = p.j.f144391K2;
                    RadioButton radioButton2 = (RadioButton) D2.c.a(view, i10);
                    if (radioButton2 != null) {
                        i10 = p.j.f144405L2;
                        RadioButton radioButton3 = (RadioButton) D2.c.a(view, i10);
                        if (radioButton3 != null) {
                            i10 = p.j.f144419M2;
                            RadioButton radioButton4 = (RadioButton) D2.c.a(view, i10);
                            if (radioButton4 != null && (viewA = D2.c.a(view, (i10 = p.j.f144676e3))) != null) {
                                i10 = p.j.f144252A3;
                                ImageView imageView3 = (ImageView) D2.c.a(view, i10);
                                if (imageView3 != null) {
                                    i10 = p.j.f144491R4;
                                    RadioButton radioButton5 = (RadioButton) D2.c.a(view, i10);
                                    if (radioButton5 != null) {
                                        i10 = p.j.f144604Z5;
                                        LinearLayout linearLayout = (LinearLayout) D2.c.a(view, i10);
                                        if (linearLayout != null) {
                                            i10 = p.j.f144619a6;
                                            LinearLayout linearLayout2 = (LinearLayout) D2.c.a(view, i10);
                                            if (linearLayout2 != null) {
                                                i10 = p.j.f144313E8;
                                                TextView textView = (TextView) D2.c.a(view, i10);
                                                if (textView != null) {
                                                    i10 = p.j.f144682e9;
                                                    RadioGroup radioGroup = (RadioGroup) D2.c.a(view, i10);
                                                    if (radioGroup != null) {
                                                        i10 = p.j.f144697f9;
                                                        RadioGroup radioGroup2 = (RadioGroup) D2.c.a(view, i10);
                                                        if (radioGroup2 != null) {
                                                            i10 = p.j.f144567Wa;
                                                            ImageView imageView4 = (ImageView) D2.c.a(view, i10);
                                                            if (imageView4 != null) {
                                                                i10 = p.j.f144850pc;
                                                                ImageView imageView5 = (ImageView) D2.c.a(view, i10);
                                                                if (imageView5 != null) {
                                                                    return new C1424B(constraintLayout, constraintLayout, imageView, imageView2, radioButton, radioButton2, radioButton3, radioButton4, viewA, imageView3, radioButton5, linearLayout, linearLayout2, textView, radioGroup, radioGroup2, imageView4, imageView5);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1424B c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1424B d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145297u2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f84485a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84485a;
    }
}
