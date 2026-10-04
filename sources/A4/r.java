package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;
import com.github.ahmadaghazadeh.editor.widget.CodeEditor;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CodeEditor f84689b;

    public r(@NonNull LinearLayout linearLayout, @NonNull CodeEditor codeEditor) {
        this.f84688a = linearLayout;
        this.f84689b = codeEditor;
    }

    @NonNull
    public static r a(@NonNull View view) {
        int i10 = p.j.f144631b3;
        CodeEditor codeEditor = (CodeEditor) D2.c.a(view, i10);
        if (codeEditor != null) {
            return new r((LinearLayout) view, codeEditor);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static r d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145290t0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84688a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84688a;
    }
}
