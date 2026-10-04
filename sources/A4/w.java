package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f84712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f84713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f84714e;

    public w(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f84710a = constraintLayout;
        this.f84711b = constraintLayout2;
        this.f84712c = textView;
        this.f84713d = imageView;
        this.f84714e = textView2;
    }

    @NonNull
    public static w a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = p.j.f144271B8;
        TextView textView = (TextView) D2.c.a(view, i10);
        if (textView != null) {
            i10 = p.j.f144285C8;
            ImageView imageView = (ImageView) D2.c.a(view, i10);
            if (imageView != null) {
                i10 = p.j.f144313E8;
                TextView textView2 = (TextView) D2.c.a(view, i10);
                if (textView2 != null) {
                    return new w(constraintLayout, constraintLayout, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static w c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static w d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145135L0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f84710a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84710a;
    }
}
