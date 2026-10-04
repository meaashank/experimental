package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class N implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f84546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f84547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f84548c;

    public N(@NonNull View view, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView) {
        this.f84546a = view;
        this.f84547b = imageView;
        this.f84548c = recyclerView;
    }

    @NonNull
    public static N a(@NonNull View view) {
        int i10 = p.j.f144508S7;
        ImageView imageView = (ImageView) D2.c.a(view, i10);
        if (imageView != null) {
            i10 = p.j.f144789lb;
            RecyclerView recyclerView = (RecyclerView) D2.c.a(view, i10);
            if (recyclerView != null) {
                return new N(view, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static N b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException(androidx.constraintlayout.widget.d.f107893V1);
        }
        layoutInflater.inflate(p.m.f145283r3, viewGroup);
        return a(viewGroup);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84546a;
    }
}
