package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface D0 {
    void a(@NotNull View view, @NotNull ViewGroup viewGroup);

    void b(@NotNull View view, @NotNull ViewGroup viewGroup);

    void c(@NotNull View view, @NotNull ViewGroup viewGroup);

    int getId();
}
