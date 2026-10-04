package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.view.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SearchView f84510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f84512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f84513e;

    public E(@NonNull ConstraintLayout constraintLayout, @NonNull SearchView searchView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f84509a = constraintLayout;
        this.f84510b = searchView;
        this.f84511c = constraintLayout2;
        this.f84512d = imageView;
        this.f84513e = imageView2;
    }

    @NonNull
    public static E a(@NonNull View view) {
        int i10 = p.j.f144342G9;
        SearchView searchView = (SearchView) D2.c.a(view, i10);
        if (searchView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = p.j.f144496R9;
            ImageView imageView = (ImageView) D2.c.a(view, i10);
            if (imageView != null) {
                i10 = p.j.f144524T9;
                ImageView imageView2 = (ImageView) D2.c.a(view, i10);
                if (imageView2 != null) {
                    return new E(constraintLayout, searchView, constraintLayout, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static E c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static E d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145218e3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f84509a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84509a;
    }
}
