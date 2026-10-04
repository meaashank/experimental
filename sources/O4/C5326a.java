package o4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.r;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class C5326a extends RecyclerView.C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f223224d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ImageView f223225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f223226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5326a(@NotNull View view) {
        super(view);
        G.p(view, "view");
        View viewFindViewById = view.findViewById(p.j.f144798m5);
        G.o(viewFindViewById, "findViewById(...)");
        this.f223225b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(p.j.f144790lc);
        G.o(viewFindViewById2, "findViewById(...)");
        this.f223226c = (TextView) viewFindViewById2;
    }

    @NotNull
    public final ImageView c() {
        return this.f223225b;
    }

    @NotNull
    public final TextView d() {
        return this.f223226c;
    }
}
