package o4;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.r;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class k extends RecyclerView.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f223286c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f223287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull View view) {
        super(view);
        G.p(view, "view");
        View viewFindViewById = view.findViewById(p.j.f144790lc);
        G.o(viewFindViewById, "findViewById(...)");
        this.f223287b = (TextView) viewFindViewById;
    }

    @NotNull
    public final TextView c() {
        return this.f223287b;
    }
}
