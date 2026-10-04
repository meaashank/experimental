package G2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.C2507z0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends RecyclerView.C {
    public b(@NonNull FrameLayout frameLayout) {
        super(frameLayout);
    }

    @NonNull
    public static b c(@NonNull ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C2507z0.D());
        frameLayout.setSaveEnabled(false);
        return new b((View) frameLayout);
    }

    @NonNull
    public FrameLayout d() {
        return (FrameLayout) this.itemView;
    }
}
