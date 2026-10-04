package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1433g implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageButton f84651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f84652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f84653d;

    public C1433g(@NonNull LinearLayout linearLayout, @NonNull ImageButton imageButton, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f84650a = linearLayout;
        this.f84651b = imageButton;
        this.f84652c = imageView;
        this.f84653d = textView;
    }

    @NonNull
    public static C1433g a(@NonNull View view) {
        int i10 = p.j.f144294D3;
        ImageButton imageButton = (ImageButton) D2.c.a(view, i10);
        if (imageButton != null) {
            i10 = p.j.f144932v4;
            ImageView imageView = (ImageView) D2.c.a(view, i10);
            if (imageView != null) {
                i10 = p.j.f144302Db;
                TextView textView = (TextView) D2.c.a(view, i10);
                if (textView != null) {
                    return new C1433g((LinearLayout) view, imageButton, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1433g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1433g d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145146O, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84650a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84650a;
    }
}
